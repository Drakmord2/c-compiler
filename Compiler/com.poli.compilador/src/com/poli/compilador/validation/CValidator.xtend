/*
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.validation

import com.poli.compilador.c.ArrayAccess
import com.poli.compilador.c.CPackage
import com.poli.compilador.c.DoWhileCmd
import com.poli.compilador.c.Expression
import com.poli.compilador.c.FieldAccess
import com.poli.compilador.c.ForCmd
import com.poli.compilador.c.IfCmd
import com.poli.compilador.c.StrDecl
import com.poli.compilador.c.SwitchCmd
import com.poli.compilador.c.Var
import com.poli.compilador.c.WhileCmd
import org.eclipse.xtext.validation.Check
import com.poli.compilador.c.Declaration
import com.poli.compilador.c.VarDecl
import com.poli.compilador.c.IntLit
import com.poli.compilador.c.Literal
import com.poli.compilador.c.Function
import com.poli.compilador.c.FuncCall
import com.poli.compilador.c.VarCmd
import com.poli.compilador.c.Command
import com.poli.compilador.c.ReturnCmd

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CValidator extends AbstractCValidator {
	
	@Check	
	def checkFunction(Function F) {
		if ( F.params.size > 4 ) {
			error('Maximum number of parameters exceeded.', F, CPackage.Literals.FUNCTION__PARAMS)
			return
		}
		
		val commands = F.eAllContents.filter(Command).toList;
		
		for(c : commands) {
			if (c instanceof ReturnCmd) {
				if (c.exp === null && F.tipo.tipo != "void") {
					error('Invalid return type.', c, CPackage.Literals.RETURN_CMD__EXP)
				}
				
				val tipo = Validator.tipode(c.exp, null)
				if (tipo == Validator.Tipo.INT && F.tipo.tipo != "int") {
					error('Invalid return type.', c, CPackage.Literals.RETURN_CMD__EXP)
				}
				
				if (tipo == Validator.Tipo.BOOL && F.tipo.tipo != "bool") {
					error('Invalid return type.', c, CPackage.Literals.RETURN_CMD__EXP)
				}
				
				if (tipo == Validator.Tipo.STR && F.tipo.tipo != "string") {
					error('Invalid return type.', c, CPackage.Literals.RETURN_CMD__EXP)
				}
			}
		}
	}
	
	@Check
	def checkIf (IfCmd c) {
		val tipo = Validator.tipode(c.exp, null)
		
		if ( tipo != Validator.Tipo.BOOL) {
			error('Condition must be a Bool. '+tipo+' given.', c, CPackage.Literals.IF_CMD__EXP)
		}  
	} 
	
	@Check
	def checkWhile (WhileCmd c) {
		val tipo = Validator.tipode(c.exp, null)
		
		if ( tipo != Validator.Tipo.BOOL) {
			error('Condition must be a Bool. '+tipo+' given.', c, CPackage.Literals.WHILE_CMD__EXP)
		}  
	}
	
	@Check
	def checkDoWhile (DoWhileCmd c) {
		val tipo = Validator.tipode(c.exp, null)
		
		if ( tipo != Validator.Tipo.BOOL) {
			error('Condition must be a Bool. '+tipo+' given.', c, CPackage.Literals.DO_WHILE_CMD__EXP)
		}  
	}
	
	@Check
	def checkSwitch (SwitchCmd c) {
		val tipo = Validator.tipode(c.exp, null)
		
		if ( tipo === null) {
			error('Invalid switch expression. ', c, CPackage.Literals.SWITCH_CMD__EXP)
		}  
		
		for(cs: c.cases) {
			var tipoCase = Validator.tipode(cs.^val, null)
			
			if (tipoCase != tipo) {
				error('Invalid case type. ', c, CPackage.Literals.SWITCH_CMD__CASES)
			}
			
			if (cs.^val instanceof Literal != true) {
				error('Invalid case. ', c, CPackage.Literals.SWITCH_CMD__CASES)
			}
		}
		
	}
	
	@Check
	def checkFor (ForCmd c) {
		val tipo = Validator.tipode(c.exp, null)
		
		if ( tipo != Validator.Tipo.BOOL) {
			error('Condition must be a Bool. '+tipo+' given.', c, CPackage.Literals.FOR_CMD__EXP)
		} 
	}
	
	@Check
	def checkVarCmd (VarCmd C) {
		if (C.asg !== null) {
			val lval	= C.lval
			val asg 	= C.asg.exp
			
			var tipoVar = Validator.tipode(lval, null)
			var tipoAsg = Validator.tipode(asg, null)
			
			if (Validator.tipode(lval, null) != Validator.tipode(asg, null)) {
				error('Incompatible assignment types. Expected: '+tipoVar+' Got: '+tipoAsg, C, CPackage.Literals.VAR_CMD__ASG)
			}
		}

	}
	
	@Check
	def checkLValue (Expression v) {
		if (v instanceof FieldAccess ) {
			checkFieldAccess(v)
		}
		
		if (v instanceof ArrayAccess) {
			checkArrayAccess(v)
		}
		
		if (v instanceof FuncCall) {
			checkFunctionCall(v)
		}
	}
	
	def checkFieldAccess(FieldAccess v) {
		val lvalue 	= v.obj as Var
		
		if (lvalue.valor instanceof StrDecl != true) {
			error('Illegal access. Not a Struct.', v, CPackage.Literals.FIELD_ACCESS__OBJ)
			return
		}
		
		val strDecl	= lvalue.valor as StrDecl
		val struct 	= strDecl.str
		val decls	= struct.decl
		val campo 	= v.field
		
		for (d : decls) {
			if (d.name == campo) {
				return
			}
		}
		
		error('Struct field not defined.', v, CPackage.Literals.FIELD_ACCESS__FIELD)
	}
	
	def checkArrayAccess(ArrayAccess v) {
		val lvalue 	= v.arr as Var
		
		if (lvalue.valor instanceof Declaration != true) {
			return
		}
		
		val decl = lvalue.valor as Declaration
		
		if (decl instanceof VarDecl != true) {
			error('Illegal access. Not a variable.', v, CPackage.Literals.ARRAY_ACCESS__ARR)
			return
		}
		
		val tipo = (decl as VarDecl).tipo
		if (tipo.exp === null) {
			error('Illegal access. Not an Array.', v, CPackage.Literals.ARRAY_ACCESS__INDEX)
			return
		}
		
		val index = v.index
		if (Validator.tipode(index, null) != Validator.Tipo.INT) {
			error('Illegal access. Non integer index.', v, CPackage.Literals.ARRAY_ACCESS__INDEX)
			return
		}
		
		if (index instanceof Var) {
			return
		}
		
		if ( (tipo.exp as IntLit).^val < ((index as IntLit).^val + 1) || (index as IntLit).^val < 0) {
			error('Array out of bounds.', v, CPackage.Literals.ARRAY_ACCESS__INDEX)
			return
		}
	}
	
	def checkFunctionCall(FuncCall F) {
		val def 		= (F.def as Var).valor
		val params 	= if(def instanceof Function) (def as Function).params else return
		val args 	= F.arg.exp
		
		if (params.size != args.size) {
			error('Wrong number of arguments.', F, CPackage.Literals.FUNC_CALL__ARG)
			return
		}
		
		for(var i = 0; i < params.size; i++) {
			val tipoA = Validator.tipode(args.get(i), null)
			val tipoP = (params.get(i) as VarDecl).tipo
			
			if (tipoP.tipo == "int" && tipoA != Validator.Tipo.INT ) {
				error('Invalid argument type.', F, CPackage.Literals.FUNC_CALL__ARG)
				return
			} else if(tipoP.tipo == "bool" && tipoA != Validator.Tipo.BOOL) {
				error('Invalid argument type.', F, CPackage.Literals.FUNC_CALL__ARG)
				return
			} else if(tipoP.tipo == "string" && tipoA != Validator.Tipo.STR) {
				error('Invalid argument type.', F, CPackage.Literals.FUNC_CALL__ARG)
				return
			}
			
		}
	}
	
}
