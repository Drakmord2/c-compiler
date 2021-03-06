/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.FuncCall#getDef <em>Def</em>}</li>
 *   <li>{@link com.poli.compilador.c.FuncCall#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getFuncCall()
 * @model
 * @generated
 */
public interface FuncCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(Expression)
   * @see com.poli.compilador.c.CPackage#getFuncCall_Def()
   * @model containment="true"
   * @generated
   */
  Expression getDef();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.FuncCall#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Expression value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Argument)
   * @see com.poli.compilador.c.CPackage#getFuncCall_Arg()
   * @model containment="true"
   * @generated
   */
  Argument getArg();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.FuncCall#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Argument value);

} // FuncCall
