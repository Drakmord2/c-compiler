/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.PointerExp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getPointerExp()
 * @model
 * @generated
 */
public interface PointerExp extends Variable, Expression
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
   * @see com.poli.compilador.c.CPackage#getPointerExp_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.PointerExp#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // PointerExp
