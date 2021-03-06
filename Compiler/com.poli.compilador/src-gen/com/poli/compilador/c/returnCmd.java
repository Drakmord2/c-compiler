/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.ReturnCmd#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getReturnCmd()
 * @model
 * @generated
 */
public interface ReturnCmd extends Command
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see com.poli.compilador.c.CPackage#getReturnCmd_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.ReturnCmd#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // ReturnCmd
