/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.c.impl;

import com.poli.compilador.c.Assignment;
import com.poli.compilador.c.CPackage;
import com.poli.compilador.c.Type;
import com.poli.compilador.c.VarDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.poli.compilador.c.impl.VarDeclImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link com.poli.compilador.c.impl.VarDeclImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDeclImpl extends DeclarationImpl implements VarDecl
{
  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected Type tipo;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Assignment val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
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
    return CPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTipo(Type newTipo, NotificationChain msgs)
  {
    Type oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.VAR_DECL__TIPO, oldTipo, newTipo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(Type newTipo)
  {
    if (newTipo != tipo)
    {
      NotificationChain msgs = null;
      if (tipo != null)
        msgs = ((InternalEObject)tipo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_DECL__TIPO, null, msgs);
      if (newTipo != null)
        msgs = ((InternalEObject)newTipo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_DECL__TIPO, null, msgs);
      msgs = basicSetTipo(newTipo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.VAR_DECL__TIPO, newTipo, newTipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(Assignment newVal, NotificationChain msgs)
  {
    Assignment oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPackage.VAR_DECL__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Assignment newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_DECL__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPackage.VAR_DECL__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPackage.VAR_DECL__VAL, newVal, newVal));
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
      case CPackage.VAR_DECL__TIPO:
        return basicSetTipo(null, msgs);
      case CPackage.VAR_DECL__VAL:
        return basicSetVal(null, msgs);
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
      case CPackage.VAR_DECL__TIPO:
        return getTipo();
      case CPackage.VAR_DECL__VAL:
        return getVal();
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
      case CPackage.VAR_DECL__TIPO:
        setTipo((Type)newValue);
        return;
      case CPackage.VAR_DECL__VAL:
        setVal((Assignment)newValue);
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
      case CPackage.VAR_DECL__TIPO:
        setTipo((Type)null);
        return;
      case CPackage.VAR_DECL__VAL:
        setVal((Assignment)null);
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
      case CPackage.VAR_DECL__TIPO:
        return tipo != null;
      case CPackage.VAR_DECL__VAL:
        return val != null;
    }
    return super.eIsSet(featureID);
  }

} //VarDeclImpl
