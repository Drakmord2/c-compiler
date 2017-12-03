/*
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.generator

import com.poli.compilador.c.ArithExp
import com.poli.compilador.c.ArrayAccess
import com.poli.compilador.c.BreakCmd
import com.poli.compilador.c.Command
import com.poli.compilador.c.ContinueCmd
import com.poli.compilador.c.DeclCmd
import com.poli.compilador.c.Declaration
import com.poli.compilador.c.Definition
import com.poli.compilador.c.DoWhileCmd
import com.poli.compilador.c.FalseLit
import com.poli.compilador.c.FieldAccess
import com.poli.compilador.c.ForCmd
import com.poli.compilador.c.FuncCall
import com.poli.compilador.c.Function
import com.poli.compilador.c.IfCmd
import com.poli.compilador.c.IntLit
import com.poli.compilador.c.LogicExp
import com.poli.compilador.c.Parenteses
import com.poli.compilador.c.PointerExp
import com.poli.compilador.c.PostfixOp
import com.poli.compilador.c.PrefixOp
import com.poli.compilador.c.Program
import com.poli.compilador.c.RelExp
import com.poli.compilador.c.ReturnCmd
import com.poli.compilador.c.Struct
import com.poli.compilador.c.SwitchCmd
import com.poli.compilador.c.Term
import com.poli.compilador.c.TrueLit
import com.poli.compilador.c.Var
import com.poli.compilador.c.VarCmd
import com.poli.compilador.c.WhileCmd
import com.poli.compilador.c.Argument
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.poli.compilador.c.PrintCmd
import com.poli.compilador.validation.Validator
import com.poli.compilador.c.StrLit
import java.util.Stack
import com.poli.compilador.c.Expression
import com.poli.compilador.c.Assignment
import com.poli.compilador.c.VarDecl
import java.util.Hashtable

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CGenerator extends AbstractGenerator {
	
	public int label 						= 0;
	public int stackIdx						= 0;
	public Stack<String> globals				= new Stack();
	public Stack<String> locals 				= new Stack();
	public Stack<String> fName				= new Stack();
	public Hashtable<String, String> strings	= new Hashtable();

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var Program p	= resource.allContents.filter(Program).head
		var filename 	= resource.URI.lastSegment.split("\\.").get(0)
		
		if (p === null) {
			return
		}
		
	    fsa.generateFile(filename+".asm", p.compile)
	}

	def compile(Program P) 
	'''
		«FOR D : P.definition»
		    «definition(D)»
		«ENDFOR»
		exit:
			li $v0, 10
			syscall
	'''
	
	def definition(Definition D) {
		
		switch D {
			case (D instanceof Function): 	function(D as Function)
			case (D instanceof Declaration):	declaration(D as Declaration)
			case (D instanceof Struct): 		struct(D as Struct)
		}
		
	}
	
	def struct(Struct S) {
		
	}
	
	def declaration(Declaration D) {
		
		if (D instanceof VarDecl) {
			var mips 	= ''''''
			val vName	= D.name
			val size 	= 4
			globals.add(vName)
			
			if (D.tipo.tipo == 'string') {
				var content = if (D.^val === null) "" else (D.^val.exp as StrLit).^val
				strings.put(vName, vName)
				
				mips = 
				'''
				.data
				_«vName»: .asciiz "«content»"
				
				''' 
				
				return mips
			}
			
			mips =
			'''
				.data
				.align 2
				_«vName»: .space «size»
				
			'''
			
			if (D.^val !== null) {
				mips +=
					'''
					.text
					'''
				mips += assign(D.^val)
			}
			
			return mips
		}

	}
	
	def function(Function F) {
		fName.push(F.name)
		globals.add(F.name)
		
		var mips = 
		'''
		.text
		.align 2
		«IF F.name.equals('main')»
		.globl main
		«F.name»:
		«ELSE»
		_«F.name»:
		«ENDIF»
			«functionEntry(0, 0)»
			«FOR C : F.commands»
				«command(C)»
		    «ENDFOR»
		    «functionExit(0)»
		
		'''
		return mips
	}
	
	def command(Command C) {
		
		switch C {
			case C instanceof PrintCmd: 		printCommand(C as PrintCmd)
			case C instanceof IfCmd: 		ifCommand(C as IfCmd)
//			case C instanceof WhileCmd: 		'whileCommand(C as WhileCmd)'
//			case C instanceof ForCmd: 		'forCommand(C as ForCmd)'
//			case C instanceof SwitchCmd: 	'switchCommand(C as SwitchCmd)'
//			case C instanceof DoWhileCmd: 	'doWhileCommand(C as DoWhileCmd)'
			case C instanceof VarCmd:		varCommand(C as VarCmd)
//			case C instanceof BreakCmd: 		'breakCommand(C as BreakCmd)'
//			case C instanceof ContinueCmd:	'continueCommand(C as ContinueCmd)'
			case C instanceof ReturnCmd: 	returnCommand(C as ReturnCmd)
//			case C instanceof DeclCmd: 		'declCommand(C as DeclCmd)'
		}
	}
	
	def CharSequence printCommand(PrintCmd C) {
	    var mips		= ''''''
	    val tipo 	= Validator.tipode(C.exp, null)
	    
	    mips += expression(C.exp)
	    
		mips += pop('a0')
	    
	    if ( tipo == Validator.Tipo.INT || tipo == Validator.Tipo.BOOL ) {
	        mips +=
	        '''
	        li		$v0, 1
	        '''
	    }
	    else if (tipo == Validator.Tipo.STR) {
	        mips +=
	        '''
	        li		$v0, 4
	        '''
	    }
	    
	    mips +=
	    '''
	    syscall
	    
	    '''
	    
	    return mips
	}
	
	def CharSequence ifCommand(IfCmd C) {
		var mips 	= ''''''
		val label	= nextLabel
		val falsel 	= label+'_FALSE'
		val truel 	= label+'_TRUE'
	   	
	   	mips +=
	   	'''
	   	«expression(C.exp)»
	   	
	   	'''
	    mips += pop('t0')
	    
	    mips +=
	    '''
	    beq		$t0, $0, «falsel»
        «FOR tc : C.trueCommands»
    			«command(tc)»
        «ENDFOR»	   
        '''
        	   	
	   	mips +=
	   	'''
	   	j «truel»
	   	
	   	'''

		mips +=
		'''
   	  		«falsel»:
   	  	'''
   	  		
		if (C.falseCommands !== null) {
			for (fc : C.falseCommands) {
	   	 	mips += '''
	   	 	«command(fc)»
	   	 	'''
   	  		}
		}
		
		mips +=
		'''
		«truel»:
		'''	  
	   return mips
	}
	
	def returnCommand(ReturnCmd C) {
		var mips = ''''''
		
		if (C.exp !== null) {
			mips += expression(C.exp)
			
			mips += pop('v0')
		}
		
		mips += 
			'''
			j «fName.peek»_return
			
			'''
		return mips
	}
	
	def varCommand(VarCmd V) {
		var mips = ''''''
		
		if (V.asg !== null) {
			mips +=
				'''
				«assign(V.asg)»
				«store(V.lval)»
				'''
			return mips
		}

		mips +=
		'''
		«expression(V.lval)»
		«pop('v0')»
		
		'''
		
		return mips
	}

	
	def CharSequence assign(Assignment A)
	'''
		«expression(A.exp)»
	'''
	
	// TODO Refatorar
	def CharSequence expression(Expression E) {
		var mips = ''''''
		
		if (E instanceof ArithExp) {
			if (E.op.equalsIgnoreCase('+')) {
				mips += arithExp(E, 'add')
			}
				
			if (E.op.equalsIgnoreCase('-')){
				mips += arithExp(E, 'sub')
			}
			
			return mips
		}
		
		if (E instanceof Term) {
			if (E.op.equalsIgnoreCase('*')){
				mips += termExp(E, 'mul')
			}
			
			if (E.op.equalsIgnoreCase('/')){
				mips += termExp(E, 'div')
			}
			
			return mips
		}
		
		if (E instanceof RelExp) {
			if (E.op.equalsIgnoreCase('>')){
				mips += relExp(E, 'sgt')
			}
			
			if (E.op.equalsIgnoreCase('>=')){
				mips += relExp(E, 'sge')
			}
			
			if (E.op.equalsIgnoreCase('<')){
				mips += relExp(E, 'slt')
			}
			
			if (E.op.equalsIgnoreCase('<=')){
				mips += relExp(E, 'sle')
			}
			
			if (E.op.equalsIgnoreCase('==')){
				mips += relExp(E, 'seq')
			}
			
			if (E.op.equalsIgnoreCase('!=')){
				mips += relExp(E, 'sne')
			}
			
			return mips
		}
		
		if (E instanceof LogicExp) {
			if (E.op.equalsIgnoreCase('&&')){
				mips += logicExp(E, 'and')
			}
			
			if (E.op.equalsIgnoreCase('||')){
				mips += logicExp(E, 'or')
			}
		}
		
		if (E instanceof PostfixOp) {
			val op = E.uo
			
			if (E.arg instanceof Var) {
			    val vName = (E.arg as Var).valor.name

				if (op == "++") {
					mips +=
					'''
					lw $t9, _«vName»
					«push('t9')»
					addiu $t9, $t9, 1
					sw $t9, _«vName»
					
					'''
					
				}
				
				if (op == "--") {
					mips +=
					'''
					lw $t9, _«vName»
					«push('t9')»
					addiu $t9, $t9, -1
					sw $t9, _«vName»
					
					'''
				}
			}
			
			return mips
		}
		
		if (E instanceof PrefixOp) {
			val op = E.uo
			
			if (E.arg instanceof Var) {
			    val vName = (E.arg as Var).valor.name

				if (op == "++") {
					mips +=
					'''
					lw $t9, _«vName»
					addiu $t9, $t9, 1
					sw $t9, _«vName»
					«push('t9')»
					
					'''
					
				}
				
				if (op == "--") {
					mips +=
					'''
					lw $t9, _«vName»
					addiu $t9, $t9, -1
					sw $t9, _«vName»
					«push('t9')»
					
					'''
				}
			}
			
			return mips
		}
		
		if (E instanceof Parenteses) {
			return expression(E.exp)
		}
		
		if (E instanceof FuncCall) {
			
			if (E.arg !== null) {
				for(arg : E.arg.exp) {
					mips += expression(arg)
				}
			}

			val func 		= E.def as Var
			val funcName 	= if (func.valor.name == "main") func.valor.name else "_"+func.valor.name
			
			mips += 
			'''
			«jumpLink(funcName)»
			«push('v0')»
			
			'''
			
			return mips
		}
		
		if (E instanceof FieldAccess) {
			
		}
		
		if (E instanceof ArrayAccess) {
			
		}
		
		if (E instanceof PointerExp) {
			
		}
		
		if (E instanceof Var) {
			val varname	= E.valor.name
			val decl 	= E.valor as VarDecl
			val tipo 	= decl.tipo.tipo
			
			val opCode = if (tipo == 'string') 'la' else 'lw'
			
			mips += evalExp(opCode, '_'+varname)
			
			return mips
		}
		
		if (E instanceof IntLit) {
			val valor = E.^val
			
			mips += evalExp('li', valor.toString)
			
			return mips
		}
		
		if (E instanceof TrueLit) {
			mips += evalExp('li', '1')
			
			return mips
		}
		
		if (E instanceof FalseLit) {
			mips += evalExp('li', '0')
			
			return mips
		}
		
		if (E instanceof StrLit) {
			val strLabel = 'S'+nextLabel
			
			mips += storeString(E, strLabel)
			
			return mips
		}
		
		return mips
	}
	
	def arithExp(ArithExp E, String opCode){
		var mips = 
		'''
		«expression(E.args.get(0))»
		«expression(E.args.get(1))»
		«pop('t1')»
		«pop('t0')»
		«opCode»		$t0, $t0, $t1
		«push('t0')»
		
	 	'''
	 	return mips
	}
	
	def logicExp(LogicExp E, String opCode){
		var mips = 
		'''
		«expression(E.args.get(0))»
		«expression(E.args.get(1))»
		«pop('t1')»
		«pop('t0')»
		«opCode»		$t0, $t0, $t1
		«push('t0')»
		
	 	'''
	 	return mips
	}
	
	def termExp(Term E, String opCode){
		var mips = 
		'''
		«expression(E.args.get(0))»
		«expression(E.args.get(1))»
		«pop('t1')»
		«pop('t0')»
		«opCode»		$t0, $t0, $t1
		«push('t0')»
		
	 	'''
	 	return mips
	}
	
	def relExp(RelExp E, String opCode) {
		var mips = 
		'''
		«expression(E.args.get(0))»
		«expression(E.args.get(1))»
		«pop('t1')»
		«pop('t0')»
		«opCode»		$t0, $t0, $t1
		«push('t0')»
		
	 	'''
	 	return mips
	}
	
	def storeString(StrLit E, String strLabel) {
			var mips = 
			'''
			.data
			_«strLabel»: .asciiz "«E.^val»"
			.text
			«evalExp('la', strLabel)»
			
			''' 
			
			return mips
	}
	
	def CharSequence evalExp(String opCode, String value) {
			var mips =
			'''
			«opCode»		$t8, «value»
			'''
			mips += push('t8')
			mips +=
			'''

			'''
			
			return mips
	}
	
	def argument(Argument A)
	'''
	# arg
	'''
		
//------------------------------------------------------------------------------------------
// AUX
//------------------------------------------------------------------------------------------
		
	def functionEntry(int paramSize, int localSize)
	'''
		sw	 	$ra, 0($sp)
		addiu 	$sp, $sp, -4
		sw   	$fp, 0($sp)
		addiu	$sp, $sp, -4
		addiu 	$fp, $sp, «paramSize + 8»
		addiu 	$sp, $sp, -«localSize»
		
	'''
	
	def functionExit(int paramSize)
	'''
	«fName.pop»_return:
	  lw   $ra, -«paramSize»($fp)
	  move $t0, $fp
	  lw   $fp, -«paramSize + 4»($fp)
	  move $sp, $t0
	  jr   $ra
	'''
	
	def CharSequence jumpLink(String func)
	'''
		jal «func»
	'''
	
	def CharSequence store(Expression E) {
		val varexp 	= E as Var
		val varname	= varexp.valor.name
		var mips 	= ''''''
		
		if (globals.contains(varname)) {
			mips += pop('t9')
			mips +=
			'''
			sw		$t9, _«varname»
			
			'''
			return mips
		}
		
		if (locals.contains(varname)) {
//			mips += pop('t9')
//			mips += indexed('sw', 't9', 'sp', 0)
			mips += 
			'''

			'''
			
			return mips
		}
		
		return mips
	}
	
	def CharSequence push(String reg)
	'''
		addiu	$sp, $sp, -4
		sw		$«reg», ($sp)
	'''
	
	def CharSequence pop(String reg)
	'''
		lw 		$«reg», ($sp)
		addiu	$sp, $sp, 4
	'''

	def CharSequence indexed(String opCode, String reg1, String reg2, int offset)
	'''
		«opCode»		$«reg1», «offset»($«reg2»)
	'''

	def nextLabel() {
		this.label++
		
		return 'L'+this.label
	}
	
}
