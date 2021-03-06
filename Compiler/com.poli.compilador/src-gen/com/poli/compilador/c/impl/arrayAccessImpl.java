/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c.impl;

import com.poli.compilador.c.ArrayAccess;
import com.poli.compilador.c.CPackage;
import com.poli.compilador.c.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.impl.ArrayAccessImpl#getArr <em>Arr</em>}</li>
 *   <li>{@link com.poli.compilador.c.impl.ArrayAccessImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAccessImpl extends ExpressionImpl implements ArrayAccess
{
  /**
   * The cached value of the '{@link #getArr() <em>Arr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArr()
   * @generated
   * @ordered
   */
  protected Expression arr;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Expression index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayAccessImpl()
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
    return CPackage.Literals.ARRAY_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArr()
  {
    return arr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArr(Expression newArr, NotificationChain msgs)
  {
    Expression oldArr = arr;
    arr = newArr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.ARRAY_ACCESS__ARR, oldArr, newArr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArr(Expression newArr)
  {
    if (newArr != arr)
    {
      NotificationChain msgs = null;
      if (arr != null)
        msgs = ((InternalEObject)arr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.ARRAY_ACCESS__ARR, null, msgs);
      if (newArr != null)
        msgs = ((InternalEObject)newArr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.ARRAY_ACCESS__ARR, null, msgs);
      msgs = basicSetArr(newArr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.ARRAY_ACCESS__ARR, newArr, newArr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs)
  {
    Expression oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.ARRAY_ACCESS__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Expression newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.ARRAY_ACCESS__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.ARRAY_ACCESS__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.ARRAY_ACCESS__INDEX, newIndex, newIndex));
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
      case CPackage.ARRAY_ACCESS__ARR:
        return basicSetArr(null, msgs);
      case CPackage.ARRAY_ACCESS__INDEX:
        return basicSetIndex(null, msgs);
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
      case CPackage.ARRAY_ACCESS__ARR:
        return getArr();
      case CPackage.ARRAY_ACCESS__INDEX:
        return getIndex();
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
      case CPackage.ARRAY_ACCESS__ARR:
        setArr((Expression)newValue);
        return;
      case CPackage.ARRAY_ACCESS__INDEX:
        setIndex((Expression)newValue);
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
      case CPackage.ARRAY_ACCESS__ARR:
        setArr((Expression)null);
        return;
      case CPackage.ARRAY_ACCESS__INDEX:
        setIndex((Expression)null);
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
      case CPackage.ARRAY_ACCESS__ARR:
        return arr != null;
      case CPackage.ARRAY_ACCESS__INDEX:
        return index != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayAccessImpl
