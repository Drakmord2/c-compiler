/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c.impl;

import com.poli.compilador.c.AccessExp;
import com.poli.compilador.c.CPackage;
import com.poli.compilador.c.lValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>lValue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.impl.lValueImpl#getAcc <em>Acc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class lValueImpl extends AtomImpl implements lValue
{
  /**
   * The cached value of the '{@link #getAcc() <em>Acc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcc()
   * @generated
   * @ordered
   */
  protected AccessExp acc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected lValueImpl()
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
    return CPackage.Literals.LVALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessExp getAcc()
  {
    return acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcc(AccessExp newAcc, NotificationChain msgs)
  {
    AccessExp oldAcc = acc;
    acc = newAcc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.LVALUE__ACC, oldAcc, newAcc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcc(AccessExp newAcc)
  {
    if (newAcc != acc)
    {
      NotificationChain msgs = null;
      if (acc != null)
        msgs = ((InternalEObject)acc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.LVALUE__ACC, null, msgs);
      if (newAcc != null)
        msgs = ((InternalEObject)newAcc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.LVALUE__ACC, null, msgs);
      msgs = basicSetAcc(newAcc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.LVALUE__ACC, newAcc, newAcc));
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
      case CPackage.LVALUE__ACC:
        return basicSetAcc(null, msgs);
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
      case CPackage.LVALUE__ACC:
        return getAcc();
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
      case CPackage.LVALUE__ACC:
        setAcc((AccessExp)newValue);
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
      case CPackage.LVALUE__ACC:
        setAcc((AccessExp)null);
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
      case CPackage.LVALUE__ACC:
        return acc != null;
    }
    return super.eIsSet(featureID);
  }

} //lValueImpl
