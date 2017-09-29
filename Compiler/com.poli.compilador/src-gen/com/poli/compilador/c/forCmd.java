/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.forCmd#getVal <em>Val</em>}</li>
 *   <li>{@link com.poli.compilador.c.forCmd#getExp <em>Exp</em>}</li>
 *   <li>{@link com.poli.compilador.c.forCmd#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getforCmd()
 * @model
 * @generated
 */
public interface forCmd extends Command
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference list.
   * @see com.poli.compilador.c.CPackage#getforCmd_Val()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getVal();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link com.poli.compilador.c.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see com.poli.compilador.c.CPackage#getforCmd_Exp()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExp();

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
   * @see com.poli.compilador.c.CPackage#getforCmd_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // forCmd
