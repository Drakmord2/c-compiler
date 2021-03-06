/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.Function#getTipo <em>Tipo</em>}</li>
 *   <li>{@link com.poli.compilador.c.Function#getParams <em>Params</em>}</li>
 *   <li>{@link com.poli.compilador.c.Function#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Definition
{
  /**
   * Returns the value of the '<em><b>Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' containment reference.
   * @see #setTipo(Type)
   * @see com.poli.compilador.c.CPackage#getFunction_Tipo()
   * @model containment="true"
   * @generated
   */
  Type getTipo();

  /**
   * Sets the value of the '{@link com.poli.compilador.c.Function#getTipo <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' containment reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(Type value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.poli.compilador.c.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.poli.compilador.c.CPackage#getFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getParams();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link com.poli.compilador.c.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see com.poli.compilador.c.CPackage#getFunction_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Function
