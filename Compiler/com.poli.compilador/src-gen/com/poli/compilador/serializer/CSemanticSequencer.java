/*
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.serializer;

import com.google.inject.Inject;
import com.poli.compilador.c.Argument;
import com.poli.compilador.c.ArithExp;
import com.poli.compilador.c.ArrayAccess;
import com.poli.compilador.c.Assignment;
import com.poli.compilador.c.BreakCmd;
import com.poli.compilador.c.CPackage;
import com.poli.compilador.c.Case;
import com.poli.compilador.c.ContinueCmd;
import com.poli.compilador.c.DeclCmd;
import com.poli.compilador.c.Declaration;
import com.poli.compilador.c.DoWhileCmd;
import com.poli.compilador.c.FalseLit;
import com.poli.compilador.c.FieldAccess;
import com.poli.compilador.c.ForCmd;
import com.poli.compilador.c.FuncCall;
import com.poli.compilador.c.Function;
import com.poli.compilador.c.IdDef;
import com.poli.compilador.c.IfCmd;
import com.poli.compilador.c.IntLit;
import com.poli.compilador.c.LogicExp;
import com.poli.compilador.c.Parenteses;
import com.poli.compilador.c.PointerExp;
import com.poli.compilador.c.PostfixOp;
import com.poli.compilador.c.PrefixOp;
import com.poli.compilador.c.PrintCmd;
import com.poli.compilador.c.Program;
import com.poli.compilador.c.RelExp;
import com.poli.compilador.c.ReturnCmd;
import com.poli.compilador.c.StrDecl;
import com.poli.compilador.c.StrLit;
import com.poli.compilador.c.Struct;
import com.poli.compilador.c.SwitchCmd;
import com.poli.compilador.c.Term;
import com.poli.compilador.c.TrueLit;
import com.poli.compilador.c.Type;
import com.poli.compilador.c.Var;
import com.poli.compilador.c.VarCmd;
import com.poli.compilador.c.VarDecl;
import com.poli.compilador.c.Variable;
import com.poli.compilador.c.WhileCmd;
import com.poli.compilador.services.CGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case CPackage.ARITH_EXP:
				sequence_ArithExp(context, (ArithExp) semanticObject); 
				return; 
			case CPackage.ARRAY_ACCESS:
				sequence_lValue(context, (ArrayAccess) semanticObject); 
				return; 
			case CPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case CPackage.BREAK_CMD:
				sequence_Command(context, (BreakCmd) semanticObject); 
				return; 
			case CPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case CPackage.CONTINUE_CMD:
				sequence_Command(context, (ContinueCmd) semanticObject); 
				return; 
			case CPackage.DECL_CMD:
				sequence_Command(context, (DeclCmd) semanticObject); 
				return; 
			case CPackage.DECLARATION:
				sequence_Declaration_StrDecl_1_1_0_VarDecl_1_0_0(context, (Declaration) semanticObject); 
				return; 
			case CPackage.DO_WHILE_CMD:
				sequence_Command(context, (DoWhileCmd) semanticObject); 
				return; 
			case CPackage.FALSE_LIT:
				sequence_Literal(context, (FalseLit) semanticObject); 
				return; 
			case CPackage.FIELD_ACCESS:
				sequence_lValue(context, (FieldAccess) semanticObject); 
				return; 
			case CPackage.FOR_CMD:
				sequence_Command(context, (ForCmd) semanticObject); 
				return; 
			case CPackage.FUNC_CALL:
				sequence_lValue(context, (FuncCall) semanticObject); 
				return; 
			case CPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case CPackage.ID_DEF:
				sequence_IdDef(context, (IdDef) semanticObject); 
				return; 
			case CPackage.IF_CMD:
				sequence_Command(context, (IfCmd) semanticObject); 
				return; 
			case CPackage.INT_LIT:
				sequence_Literal(context, (IntLit) semanticObject); 
				return; 
			case CPackage.LOGIC_EXP:
				sequence_Expression(context, (LogicExp) semanticObject); 
				return; 
			case CPackage.PARENTESES:
				sequence_Atom(context, (Parenteses) semanticObject); 
				return; 
			case CPackage.POINTER_EXP:
				sequence_PointerExp(context, (PointerExp) semanticObject); 
				return; 
			case CPackage.POSTFIX_OP:
				sequence_Factor(context, (PostfixOp) semanticObject); 
				return; 
			case CPackage.PREFIX_OP:
				sequence_Factor(context, (PrefixOp) semanticObject); 
				return; 
			case CPackage.PRINT_CMD:
				sequence_Command(context, (PrintCmd) semanticObject); 
				return; 
			case CPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case CPackage.REL_EXP:
				sequence_RelExp(context, (RelExp) semanticObject); 
				return; 
			case CPackage.RETURN_CMD:
				sequence_Command(context, (ReturnCmd) semanticObject); 
				return; 
			case CPackage.STR_DECL:
				sequence_Declaration(context, (StrDecl) semanticObject); 
				return; 
			case CPackage.STR_LIT:
				sequence_Literal(context, (StrLit) semanticObject); 
				return; 
			case CPackage.STRUCT:
				sequence_Struct(context, (Struct) semanticObject); 
				return; 
			case CPackage.SWITCH_CMD:
				sequence_Command(context, (SwitchCmd) semanticObject); 
				return; 
			case CPackage.TERM:
				sequence_Term(context, (Term) semanticObject); 
				return; 
			case CPackage.TRUE_LIT:
				sequence_Literal(context, (TrueLit) semanticObject); 
				return; 
			case CPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case CPackage.VAR:
				sequence_lValue(context, (Var) semanticObject); 
				return; 
			case CPackage.VAR_CMD:
				sequence_Command(context, (VarCmd) semanticObject); 
				return; 
			case CPackage.VAR_DECL:
				sequence_Declaration(context, (VarDecl) semanticObject); 
				return; 
			case CPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case CPackage.WHILE_CMD:
				sequence_Command(context, (WhileCmd) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     (exp+=Expression exp+=Expression*)
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ArithExp
	 *     Expression.LogicExp_1_0 returns ArithExp
	 *     RelExp returns ArithExp
	 *     RelExp.RelExp_1_0 returns ArithExp
	 *     ArithExp returns ArithExp
	 *     ArithExp.ArithExp_1_0 returns ArithExp
	 *
	 * Constraint:
	 *     (args+=ArithExp_ArithExp_1_0 op=AO1 args+=Term)
	 */
	protected void sequence_ArithExp(ISerializationContext context, ArithExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.ASSIGNMENT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.ASSIGNMENT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getExpExpressionParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Parenteses
	 *     Expression.LogicExp_1_0 returns Parenteses
	 *     RelExp returns Parenteses
	 *     RelExp.RelExp_1_0 returns Parenteses
	 *     ArithExp returns Parenteses
	 *     ArithExp.ArithExp_1_0 returns Parenteses
	 *     Term returns Parenteses
	 *     Term.Term_1_0 returns Parenteses
	 *     Factor returns Parenteses
	 *     Factor.PostfixOp_0_1_0 returns Parenteses
	 *     Atom returns Parenteses
	 *
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_Atom(ISerializationContext context, Parenteses semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.PARENTESES__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.PARENTESES__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getExpExpressionParserRuleCall_1_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Case returns Case
	 *
	 * Constraint:
	 *     (val=Atom commands+=Command*)
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns BreakCmd
	 *
	 * Constraint:
	 *     {BreakCmd}
	 */
	protected void sequence_Command(ISerializationContext context, BreakCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns ContinueCmd
	 *
	 * Constraint:
	 *     {ContinueCmd}
	 */
	protected void sequence_Command(ISerializationContext context, ContinueCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns DeclCmd
	 *
	 * Constraint:
	 *     val=Declaration
	 */
	protected void sequence_Command(ISerializationContext context, DeclCmd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.DECL_CMD__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.DECL_CMD__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommandAccess().getValDeclarationParserRuleCall_9_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns DoWhileCmd
	 *
	 * Constraint:
	 *     (commands+=Command* exp=Expression)
	 */
	protected void sequence_Command(ISerializationContext context, DoWhileCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns ForCmd
	 *
	 * Constraint:
	 *     (
	 *         init+=lValue 
	 *         init+=Assignment 
	 *         exp=Expression 
	 *         inc+=Factor 
	 *         inc+=Assignment? 
	 *         commands+=Command*
	 *     )
	 */
	protected void sequence_Command(ISerializationContext context, ForCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns IfCmd
	 *
	 * Constraint:
	 *     (exp=Expression trueCommands+=Command* falseCommands+=Command*)
	 */
	protected void sequence_Command(ISerializationContext context, IfCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns PrintCmd
	 *
	 * Constraint:
	 *     exp=Expression?
	 */
	protected void sequence_Command(ISerializationContext context, PrintCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns ReturnCmd
	 *
	 * Constraint:
	 *     exp=Expression?
	 */
	protected void sequence_Command(ISerializationContext context, ReturnCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns SwitchCmd
	 *
	 * Constraint:
	 *     (exp=Expression cases+=Case* commands+=Command*)
	 */
	protected void sequence_Command(ISerializationContext context, SwitchCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns VarCmd
	 *
	 * Constraint:
	 *     (val+=Factor val+=Assignment?)
	 */
	protected void sequence_Command(ISerializationContext context, VarCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns WhileCmd
	 *
	 * Constraint:
	 *     (exp=Expression commands+=Command*)
	 */
	protected void sequence_Command(ISerializationContext context, WhileCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns StrDecl
	 *     Declaration returns StrDecl
	 *
	 * Constraint:
	 *     (obj=Declaration_StrDecl_1_1_0 str=[Struct|ID] name=ID)
	 */
	protected void sequence_Declaration(ISerializationContext context, StrDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.DECLARATION__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.DECLARATION__OBJ));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.STR_DECL__STR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.STR_DECL__STR));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationAccess().getStrDeclObjAction_1_1_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getDeclarationAccess().getStrStructIDTerminalRuleCall_1_1_1_1_0_1(), semanticObject.eGet(CPackage.Literals.STR_DECL__STR, false));
		feeder.accept(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_1_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration.VarDecl_1_0_0 returns Declaration
	 *     Declaration.StrDecl_1_1_0 returns Declaration
	 *
	 * Constraint:
	 *     {Declaration}
	 */
	protected void sequence_Declaration_StrDecl_1_1_0_VarDecl_1_0_0(ISerializationContext context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns VarDecl
	 *     Declaration returns VarDecl
	 *
	 * Constraint:
	 *     (obj=Declaration_VarDecl_1_0_0 tipo=Type name=ID val=Assignment?)
	 */
	protected void sequence_Declaration(ISerializationContext context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns LogicExp
	 *     Expression.LogicExp_1_0 returns LogicExp
	 *
	 * Constraint:
	 *     (args+=Expression_LogicExp_1_0 op=LO args+=RelExp)
	 */
	protected void sequence_Expression(ISerializationContext context, LogicExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns PostfixOp
	 *     Expression.LogicExp_1_0 returns PostfixOp
	 *     RelExp returns PostfixOp
	 *     RelExp.RelExp_1_0 returns PostfixOp
	 *     ArithExp returns PostfixOp
	 *     ArithExp.ArithExp_1_0 returns PostfixOp
	 *     Term returns PostfixOp
	 *     Term.Term_1_0 returns PostfixOp
	 *     Factor returns PostfixOp
	 *
	 * Constraint:
	 *     (arg=Factor_PostfixOp_0_1_0 uo=UO)
	 */
	protected void sequence_Factor(ISerializationContext context, PostfixOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.POSTFIX_OP__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.POSTFIX_OP__ARG));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.POSTFIX_OP__UO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.POSTFIX_OP__UO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getPostfixOpArgAction_0_1_0(), semanticObject.getArg());
		feeder.accept(grammarAccess.getFactorAccess().getUoUOTerminalRuleCall_0_1_1_0(), semanticObject.getUo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns PrefixOp
	 *     Expression.LogicExp_1_0 returns PrefixOp
	 *     RelExp returns PrefixOp
	 *     RelExp.RelExp_1_0 returns PrefixOp
	 *     ArithExp returns PrefixOp
	 *     ArithExp.ArithExp_1_0 returns PrefixOp
	 *     Term returns PrefixOp
	 *     Term.Term_1_0 returns PrefixOp
	 *     Factor returns PrefixOp
	 *
	 * Constraint:
	 *     (uo=UO arg=Atom)
	 */
	protected void sequence_Factor(ISerializationContext context, PrefixOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.PREFIX_OP__UO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.PREFIX_OP__UO));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.PREFIX_OP__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.PREFIX_OP__ARG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getUoUOTerminalRuleCall_1_1_0(), semanticObject.getUo());
		feeder.accept(grammarAccess.getFactorAccess().getArgAtomParserRuleCall_1_2_0(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (tipo=Type name=ID (params+=IdDef params+=IdDef*)? commands+=Command*)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IdDef returns IdDef
	 *
	 * Constraint:
	 *     (tipo=Type name=Variable)
	 */
	protected void sequence_IdDef(ISerializationContext context, IdDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.ID_DEF__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.ID_DEF__TIPO));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.ID_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.ID_DEF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdDefAccess().getTipoTypeParserRuleCall_0_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getIdDefAccess().getNameVariableParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FalseLit
	 *     Expression.LogicExp_1_0 returns FalseLit
	 *     RelExp returns FalseLit
	 *     RelExp.RelExp_1_0 returns FalseLit
	 *     ArithExp returns FalseLit
	 *     ArithExp.ArithExp_1_0 returns FalseLit
	 *     Term returns FalseLit
	 *     Term.Term_1_0 returns FalseLit
	 *     Factor returns FalseLit
	 *     Factor.PostfixOp_0_1_0 returns FalseLit
	 *     Atom returns FalseLit
	 *     Literal returns FalseLit
	 *
	 * Constraint:
	 *     {FalseLit}
	 */
	protected void sequence_Literal(ISerializationContext context, FalseLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntLit
	 *     Expression.LogicExp_1_0 returns IntLit
	 *     RelExp returns IntLit
	 *     RelExp.RelExp_1_0 returns IntLit
	 *     ArithExp returns IntLit
	 *     ArithExp.ArithExp_1_0 returns IntLit
	 *     Term returns IntLit
	 *     Term.Term_1_0 returns IntLit
	 *     Factor returns IntLit
	 *     Factor.PostfixOp_0_1_0 returns IntLit
	 *     Atom returns IntLit
	 *     Literal returns IntLit
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Literal(ISerializationContext context, IntLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.INT_LIT__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.INT_LIT__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValINTTerminalRuleCall_0_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StrLit
	 *     Expression.LogicExp_1_0 returns StrLit
	 *     RelExp returns StrLit
	 *     RelExp.RelExp_1_0 returns StrLit
	 *     ArithExp returns StrLit
	 *     ArithExp.ArithExp_1_0 returns StrLit
	 *     Term returns StrLit
	 *     Term.Term_1_0 returns StrLit
	 *     Factor returns StrLit
	 *     Factor.PostfixOp_0_1_0 returns StrLit
	 *     Atom returns StrLit
	 *     Literal returns StrLit
	 *
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_Literal(ISerializationContext context, StrLit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.STR_LIT__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.STR_LIT__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValSTRINGTerminalRuleCall_3_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns TrueLit
	 *     Expression.LogicExp_1_0 returns TrueLit
	 *     RelExp returns TrueLit
	 *     RelExp.RelExp_1_0 returns TrueLit
	 *     ArithExp returns TrueLit
	 *     ArithExp.ArithExp_1_0 returns TrueLit
	 *     Term returns TrueLit
	 *     Term.Term_1_0 returns TrueLit
	 *     Factor returns TrueLit
	 *     Factor.PostfixOp_0_1_0 returns TrueLit
	 *     Atom returns TrueLit
	 *     Literal returns TrueLit
	 *
	 * Constraint:
	 *     {TrueLit}
	 */
	protected void sequence_Literal(ISerializationContext context, TrueLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns PointerExp
	 *     Expression returns PointerExp
	 *     Expression.LogicExp_1_0 returns PointerExp
	 *     RelExp returns PointerExp
	 *     RelExp.RelExp_1_0 returns PointerExp
	 *     ArithExp returns PointerExp
	 *     ArithExp.ArithExp_1_0 returns PointerExp
	 *     Term returns PointerExp
	 *     Term.Term_1_0 returns PointerExp
	 *     Factor returns PointerExp
	 *     Factor.PostfixOp_0_1_0 returns PointerExp
	 *     Atom returns PointerExp
	 *     lValue returns PointerExp
	 *     PointerExp returns PointerExp
	 *
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_PointerExp(ISerializationContext context, PointerExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.POINTER_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.POINTER_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPointerExpAccess().getExpExpressionParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     definition+=Definition+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns RelExp
	 *     Expression.LogicExp_1_0 returns RelExp
	 *     RelExp returns RelExp
	 *     RelExp.RelExp_1_0 returns RelExp
	 *
	 * Constraint:
	 *     (args+=RelExp_RelExp_1_0 op=RO args+=ArithExp)
	 */
	protected void sequence_RelExp(ISerializationContext context, RelExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Struct
	 *     Struct returns Struct
	 *
	 * Constraint:
	 *     (name=ID decl+=Declaration*)
	 */
	protected void sequence_Struct(ISerializationContext context, Struct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Term
	 *     Expression.LogicExp_1_0 returns Term
	 *     RelExp returns Term
	 *     RelExp.RelExp_1_0 returns Term
	 *     ArithExp returns Term
	 *     ArithExp.ArithExp_1_0 returns Term
	 *     Term returns Term
	 *     Term.Term_1_0 returns Term
	 *
	 * Constraint:
	 *     (args+=Term_Term_1_0 op=AO2 args+=Factor)
	 */
	protected void sequence_Term(ISerializationContext context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (tipo=TYPELIT exp=Expression?)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     {Variable}
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ArrayAccess
	 *     Expression.LogicExp_1_0 returns ArrayAccess
	 *     RelExp returns ArrayAccess
	 *     RelExp.RelExp_1_0 returns ArrayAccess
	 *     ArithExp returns ArrayAccess
	 *     ArithExp.ArithExp_1_0 returns ArrayAccess
	 *     Term returns ArrayAccess
	 *     Term.Term_1_0 returns ArrayAccess
	 *     Factor returns ArrayAccess
	 *     Factor.PostfixOp_0_1_0 returns ArrayAccess
	 *     Atom returns ArrayAccess
	 *     lValue returns ArrayAccess
	 *     lValue.FuncCall_0_2_0_0 returns ArrayAccess
	 *     lValue.FieldAccess_0_2_1_0 returns ArrayAccess
	 *     lValue.ArrayAccess_0_2_2_0 returns ArrayAccess
	 *
	 * Constraint:
	 *     (arr=lValue_ArrayAccess_0_2_2_0 index=Expression)
	 */
	protected void sequence_lValue(ISerializationContext context, ArrayAccess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.ARRAY_ACCESS__ARR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.ARRAY_ACCESS__ARR));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.ARRAY_ACCESS__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.ARRAY_ACCESS__INDEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLValueAccess().getArrayAccessArrAction_0_2_2_0(), semanticObject.getArr());
		feeder.accept(grammarAccess.getLValueAccess().getIndexExpressionParserRuleCall_0_2_2_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FieldAccess
	 *     Expression.LogicExp_1_0 returns FieldAccess
	 *     RelExp returns FieldAccess
	 *     RelExp.RelExp_1_0 returns FieldAccess
	 *     ArithExp returns FieldAccess
	 *     ArithExp.ArithExp_1_0 returns FieldAccess
	 *     Term returns FieldAccess
	 *     Term.Term_1_0 returns FieldAccess
	 *     Factor returns FieldAccess
	 *     Factor.PostfixOp_0_1_0 returns FieldAccess
	 *     Atom returns FieldAccess
	 *     lValue returns FieldAccess
	 *     lValue.FuncCall_0_2_0_0 returns FieldAccess
	 *     lValue.FieldAccess_0_2_1_0 returns FieldAccess
	 *     lValue.ArrayAccess_0_2_2_0 returns FieldAccess
	 *
	 * Constraint:
	 *     (obj=lValue_FieldAccess_0_2_1_0 field=ID)
	 */
	protected void sequence_lValue(ISerializationContext context, FieldAccess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.FIELD_ACCESS__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.FIELD_ACCESS__OBJ));
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.FIELD_ACCESS__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.FIELD_ACCESS__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLValueAccess().getFieldAccessObjAction_0_2_1_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getLValueAccess().getFieldIDTerminalRuleCall_0_2_1_2_0(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FuncCall
	 *     Expression.LogicExp_1_0 returns FuncCall
	 *     RelExp returns FuncCall
	 *     RelExp.RelExp_1_0 returns FuncCall
	 *     ArithExp returns FuncCall
	 *     ArithExp.ArithExp_1_0 returns FuncCall
	 *     Term returns FuncCall
	 *     Term.Term_1_0 returns FuncCall
	 *     Factor returns FuncCall
	 *     Factor.PostfixOp_0_1_0 returns FuncCall
	 *     Atom returns FuncCall
	 *     lValue returns FuncCall
	 *     lValue.FuncCall_0_2_0_0 returns FuncCall
	 *     lValue.FieldAccess_0_2_1_0 returns FuncCall
	 *     lValue.ArrayAccess_0_2_2_0 returns FuncCall
	 *
	 * Constraint:
	 *     (def=lValue_FuncCall_0_2_0_0 arg=Argument?)
	 */
	protected void sequence_lValue(ISerializationContext context, FuncCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Var
	 *     Expression.LogicExp_1_0 returns Var
	 *     RelExp returns Var
	 *     RelExp.RelExp_1_0 returns Var
	 *     ArithExp returns Var
	 *     ArithExp.ArithExp_1_0 returns Var
	 *     Term returns Var
	 *     Term.Term_1_0 returns Var
	 *     Factor returns Var
	 *     Factor.PostfixOp_0_1_0 returns Var
	 *     Atom returns Var
	 *     lValue returns Var
	 *     lValue.FuncCall_0_2_0_0 returns Var
	 *     lValue.FieldAccess_0_2_1_0 returns Var
	 *     lValue.ArrayAccess_0_2_2_0 returns Var
	 *
	 * Constraint:
	 *     valor=[Definition|ID]
	 */
	protected void sequence_lValue(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPackage.Literals.VAR__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPackage.Literals.VAR__VALOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLValueAccess().getValorDefinitionIDTerminalRuleCall_0_1_0_1(), semanticObject.eGet(CPackage.Literals.VAR__VALOR, false));
		feeder.finish();
	}
	
	
}
