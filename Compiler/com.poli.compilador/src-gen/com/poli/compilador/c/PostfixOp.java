/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.PostfixOp#getArg <em>Arg</em>}</li>
 *   <li>{@link com.poli.compilador.c.PostfixOp#getUo <em>Uo</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getPostfixOp()
 * @model
 * @generated
 */
public interface PostfixOp extends Expression
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Expression)
   * @see com.poli.compilador.c.CPackage#getPostfixOp_Arg()
   * @model containment="true"
   * @generated
   */
  Expression getArg();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.PostfixOp#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Expression value);

  /**
   * Returns the value of the '<em><b>Uo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uo</em>' attribute.
   * @see #setUo(String)
   * @see com.poli.compilador.c.CPackage#getPostfixOp_Uo()
   * @model
   * @generated
   */
  String getUo();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.PostfixOp#getUo <em>Uo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uo</em>' attribute.
   * @see #getUo()
   * @generated
   */
  void setUo(String value);

} // PostfixOp
