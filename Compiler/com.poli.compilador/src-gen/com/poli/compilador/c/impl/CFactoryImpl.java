/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c.impl;

import com.poli.compilador.c.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CFactoryImpl extends EFactoryImpl implements CFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CFactory init()
  {
    try
    {
      CFactory theCFactory = (CFactory)EPackage.Registry.INSTANCE.getEFactory(CPackage.eNS_URI);
      if (theCFactory != null)
      {
        return theCFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CPackage.PROGRAM: return createProgram();
      case CPackage.DEFINITION: return createDefinition();
      case CPackage.FUNCTION: return createFunction();
      case CPackage.DECLARATION: return createDeclaration();
      case CPackage.STRUCT: return createStruct();
      case CPackage.ID_DEF: return createIdDef();
      case CPackage.VARIABLE: return createVariable();
      case CPackage.COMMAND: return createCommand();
      case CPackage.ARGUMENT: return createArgument();
      case CPackage.ASSIGNMENT: return createAssignment();
      case CPackage.EXPRESSION: return createExpression();
      case CPackage.REL_EXP: return createRelExp();
      case CPackage.ARITH_EXP: return createArithExp();
      case CPackage.TERM: return createTerm();
      case CPackage.FACTOR: return createFactor();
      case CPackage.ATOM: return createAtom();
      case CPackage.LVALUE: return createlValue();
      case CPackage.POINTER_EXP: return createPointerExp();
      case CPackage.ACCESS_EXP: return createAccessExp();
      case CPackage.CASE: return createCase();
      case CPackage.TYPE: return createType();
      case CPackage.LITERAL: return createLiteral();
      case CPackage.IF_CMD: return createifCmd();
      case CPackage.WHILE_CMD: return createwhileCmd();
      case CPackage.FOR_CMD: return createforCmd();
      case CPackage.SWITCH_CMD: return createswitchCmd();
      case CPackage.DO_WHILE_CMD: return createdoWhileCmd();
      case CPackage.VAR_CMD: return createvarCmd();
      case CPackage.BREAK_CMD: return createbreakCmd();
      case CPackage.CONTINUE_CMD: return createcontinueCmd();
      case CPackage.RETURN_CMD: return createreturnCmd();
      case CPackage.LOGIC_EXP: return createLogicExp();
      case CPackage.ARITM_EXP: return createAritmExp();
      case CPackage.UNARY_EXP: return createUnaryExp();
      case CPackage.ARRAY_ACCESS: return createarrayAccess();
      case CPackage.FIELD_ACCESS: return createfieldAccess();
      case CPackage.INT_LIT: return createIntLit();
      case CPackage.TRUE_LIT: return createTrueLit();
      case CPackage.FALSE_LIT: return createFalseLit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct createStruct()
  {
    StructImpl struct = new StructImpl();
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdDef createIdDef()
  {
    IdDefImpl idDef = new IdDefImpl();
    return idDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelExp createRelExp()
  {
    RelExpImpl relExp = new RelExpImpl();
    return relExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithExp createArithExp()
  {
    ArithExpImpl arithExp = new ArithExpImpl();
    return arithExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lValue createlValue()
  {
    lValueImpl lValue = new lValueImpl();
    return lValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerExp createPointerExp()
  {
    PointerExpImpl pointerExp = new PointerExpImpl();
    return pointerExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessExp createAccessExp()
  {
    AccessExpImpl accessExp = new AccessExpImpl();
    return accessExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifCmd createifCmd()
  {
    ifCmdImpl ifCmd = new ifCmdImpl();
    return ifCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public whileCmd createwhileCmd()
  {
    whileCmdImpl whileCmd = new whileCmdImpl();
    return whileCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forCmd createforCmd()
  {
    forCmdImpl forCmd = new forCmdImpl();
    return forCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchCmd createswitchCmd()
  {
    switchCmdImpl switchCmd = new switchCmdImpl();
    return switchCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public doWhileCmd createdoWhileCmd()
  {
    doWhileCmdImpl doWhileCmd = new doWhileCmdImpl();
    return doWhileCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varCmd createvarCmd()
  {
    varCmdImpl varCmd = new varCmdImpl();
    return varCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public breakCmd createbreakCmd()
  {
    breakCmdImpl breakCmd = new breakCmdImpl();
    return breakCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public continueCmd createcontinueCmd()
  {
    continueCmdImpl continueCmd = new continueCmdImpl();
    return continueCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public returnCmd createreturnCmd()
  {
    returnCmdImpl returnCmd = new returnCmdImpl();
    return returnCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExp createLogicExp()
  {
    LogicExpImpl logicExp = new LogicExpImpl();
    return logicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AritmExp createAritmExp()
  {
    AritmExpImpl aritmExp = new AritmExpImpl();
    return aritmExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExp createUnaryExp()
  {
    UnaryExpImpl unaryExp = new UnaryExpImpl();
    return unaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arrayAccess createarrayAccess()
  {
    arrayAccessImpl arrayAccess = new arrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldAccess createfieldAccess()
  {
    fieldAccessImpl fieldAccess = new fieldAccessImpl();
    return fieldAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLit createIntLit()
  {
    IntLitImpl intLit = new IntLitImpl();
    return intLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrueLit createTrueLit()
  {
    TrueLitImpl trueLit = new TrueLitImpl();
    return trueLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FalseLit createFalseLit()
  {
    FalseLitImpl falseLit = new FalseLitImpl();
    return falseLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CPackage getCPackage()
  {
    return (CPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CPackage getPackage()
  {
    return CPackage.eINSTANCE;
  }

} //CFactoryImpl
