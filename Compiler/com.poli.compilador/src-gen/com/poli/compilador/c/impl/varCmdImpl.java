/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c.impl;

import com.poli.compilador.c.Assignment;
import com.poli.compilador.c.CPackage;
import com.poli.compilador.c.Expression;
import com.poli.compilador.c.VarCmd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.impl.VarCmdImpl#getLval <em>Lval</em>}</li>
 *   <li>{@link com.poli.compilador.c.impl.VarCmdImpl#getAsg <em>Asg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarCmdImpl extends CommandImpl implements VarCmd
{
  /**
   * The cached value of the '{@link #getLval() <em>Lval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLval()
   * @generated
   * @ordered
   */
  protected Expression lval;

  /**
   * The cached value of the '{@link #getAsg() <em>Asg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsg()
   * @generated
   * @ordered
   */
  protected Assignment asg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarCmdImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CPackage.Literals.VAR_CMD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLval()
  {
    return lval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLval(Expression newLval, NotificationChain msgs)
  {
    Expression oldLval = lval;
    lval = newLval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.VAR_CMD__LVAL, oldLval, newLval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLval(Expression newLval)
  {
    if (newLval != lval)
    {
      NotificationChain msgs = null;
      if (lval != null)
        msgs = ((InternalEObject)lval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_CMD__LVAL, null, msgs);
      if (newLval != null)
        msgs = ((InternalEObject)newLval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_CMD__LVAL, null, msgs);
      msgs = basicSetLval(newLval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.VAR_CMD__LVAL, newLval, newLval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getAsg()
  {
    return asg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsg(Assignment newAsg, NotificationChain msgs)
  {
    Assignment oldAsg = asg;
    asg = newAsg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.VAR_CMD__ASG, oldAsg, newAsg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsg(Assignment newAsg)
  {
    if (newAsg != asg)
    {
      NotificationChain msgs = null;
      if (asg != null)
        msgs = ((InternalEObject)asg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_CMD__ASG, null, msgs);
      if (newAsg != null)
        msgs = ((InternalEObject)newAsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_CMD__ASG, null, msgs);
      msgs = basicSetAsg(newAsg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.VAR_CMD__ASG, newAsg, newAsg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CPackage.VAR_CMD__LVAL:
        return basicSetLval(null, msgs);
      case CPackage.VAR_CMD__ASG:
        return basicSetAsg(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CPackage.VAR_CMD__LVAL:
        return getLval();
      case CPackage.VAR_CMD__ASG:
        return getAsg();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CPackage.VAR_CMD__LVAL:
        setLval((Expression)newValue);
        return;
      case CPackage.VAR_CMD__ASG:
        setAsg((Assignment)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CPackage.VAR_CMD__LVAL:
        setLval((Expression)null);
        return;
      case CPackage.VAR_CMD__ASG:
        setAsg((Assignment)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CPackage.VAR_CMD__LVAL:
        return lval != null;
      case CPackage.VAR_CMD__ASG:
        return asg != null;
    }
    return super.eIsSet(featureID);
  }

} //VarCmdImpl
