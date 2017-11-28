/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.poli.compilador.c.CPackage
 * @generated
 */
public interface CFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CFactory eINSTANCE = com.poli.compilador.c.impl.CFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Struct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct</em>'.
   * @generated
   */
  Struct createStruct();

  /**
   * Returns a new object of class '<em>Id Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Def</em>'.
   * @generated
   */
  IdDef createIdDef();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Pointer Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointer Exp</em>'.
   * @generated
   */
  PointerExp createPointerExp();

  /**
   * Returns a new object of class '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  Case createCase();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  VarDecl createVarDecl();

  /**
   * Returns a new object of class '<em>Str Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str Decl</em>'.
   * @generated
   */
  StrDecl createStrDecl();

  /**
   * Returns a new object of class '<em>If Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Cmd</em>'.
   * @generated
   */
  IfCmd createIfCmd();

  /**
   * Returns a new object of class '<em>While Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Cmd</em>'.
   * @generated
   */
  WhileCmd createWhileCmd();

  /**
   * Returns a new object of class '<em>For Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Cmd</em>'.
   * @generated
   */
  ForCmd createForCmd();

  /**
   * Returns a new object of class '<em>Switch Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Cmd</em>'.
   * @generated
   */
  SwitchCmd createSwitchCmd();

  /**
   * Returns a new object of class '<em>Do While Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do While Cmd</em>'.
   * @generated
   */
  DoWhileCmd createDoWhileCmd();

  /**
   * Returns a new object of class '<em>Var Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Cmd</em>'.
   * @generated
   */
  VarCmd createVarCmd();

  /**
   * Returns a new object of class '<em>Break Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Cmd</em>'.
   * @generated
   */
  BreakCmd createBreakCmd();

  /**
   * Returns a new object of class '<em>Continue Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue Cmd</em>'.
   * @generated
   */
  ContinueCmd createContinueCmd();

  /**
   * Returns a new object of class '<em>Return Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Cmd</em>'.
   * @generated
   */
  ReturnCmd createReturnCmd();

  /**
   * Returns a new object of class '<em>Decl Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl Cmd</em>'.
   * @generated
   */
  DeclCmd createDeclCmd();

  /**
   * Returns a new object of class '<em>Print Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Print Cmd</em>'.
   * @generated
   */
  PrintCmd createPrintCmd();

  /**
   * Returns a new object of class '<em>Logic Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logic Exp</em>'.
   * @generated
   */
  LogicExp createLogicExp();

  /**
   * Returns a new object of class '<em>Rel Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Exp</em>'.
   * @generated
   */
  RelExp createRelExp();

  /**
   * Returns a new object of class '<em>Arith Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arith Exp</em>'.
   * @generated
   */
  ArithExp createArithExp();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Postfix Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Postfix Op</em>'.
   * @generated
   */
  PostfixOp createPostfixOp();

  /**
   * Returns a new object of class '<em>Prefix Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Op</em>'.
   * @generated
   */
  PrefixOp createPrefixOp();

  /**
   * Returns a new object of class '<em>Parenteses</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenteses</em>'.
   * @generated
   */
  Parenteses createParenteses();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Func Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Call</em>'.
   * @generated
   */
  FuncCall createFuncCall();

  /**
   * Returns a new object of class '<em>Field Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Access</em>'.
   * @generated
   */
  FieldAccess createFieldAccess();

  /**
   * Returns a new object of class '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Access</em>'.
   * @generated
   */
  ArrayAccess createArrayAccess();

  /**
   * Returns a new object of class '<em>Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Lit</em>'.
   * @generated
   */
  IntLit createIntLit();

  /**
   * Returns a new object of class '<em>True Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>True Lit</em>'.
   * @generated
   */
  TrueLit createTrueLit();

  /**
   * Returns a new object of class '<em>False Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>False Lit</em>'.
   * @generated
   */
  FalseLit createFalseLit();

  /**
   * Returns a new object of class '<em>Str Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str Lit</em>'.
   * @generated
   */
  StrLit createStrLit();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CPackage getCPackage();

} //CFactory
