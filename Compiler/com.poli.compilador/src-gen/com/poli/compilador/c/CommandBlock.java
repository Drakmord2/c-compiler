/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.CommandBlock#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see com.poli.compilador.c.CPackage#getCommandBlock()
 * @model
 * @generated
 */
public interface CommandBlock extends EObject
{
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
   * @see com.poli.compilador.c.CPackage#getCommandBlock_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // CommandBlock
