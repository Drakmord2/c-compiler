/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.LogicExp#getArgs <em>Args</em>}</li>
 *   <li>{@link com.poli.compilador.c.LogicExp#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getLogicExp()
 * @model
 * @generated
 */
public interface LogicExp extends Expression
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link com.poli.compilador.c.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see com.poli.compilador.c.CPackage#getLogicExp_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.poli.compilador.c.CPackage#getLogicExp_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.LogicExp#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // LogicExp
