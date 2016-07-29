/*******************************************************************************
 * Copyright (c) 2010-2015 Henshin developers. All rights reserved. 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TU Berlin, University of Luxembourg, SES S.A.
 *******************************************************************************/
package de.tub.tfs.henshin.tgg.impl;

import de.tub.tfs.henshin.tgg.AttributeLayout;
import de.tub.tfs.henshin.tgg.TggPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.henshin.model.Attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl#isNew <em>New</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl#getLhsattribute <em>Lhsattribute</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl#getRhsattribute <em>Rhsattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeLayoutImpl extends EObjectImpl implements AttributeLayout {
	/**
	 * An array of objects representing the values of non-primitive features.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Object[] eVirtualValues;
	/**
	 * A bit field representing the indices of non-primitive feature values.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eVirtualIndexBits0;
	/**
	 * The default value of the '{@link #isNew() <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNew() <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew()
	 * @generated
	 * @ordered
	 */
	protected boolean new_ = NEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.ATTRIBUTE_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNew() {
		return new_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew(boolean newNew) {
		boolean oldNew = new_;
		new_ = newNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.ATTRIBUTE_LAYOUT__NEW, oldNew, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getLhsattribute() {
		Attribute lhsattribute = (Attribute)eVirtualGet(TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE);
		if (lhsattribute != null && lhsattribute.eIsProxy()) {
			InternalEObject oldLhsattribute = (InternalEObject)lhsattribute;
			lhsattribute = (Attribute)eResolveProxy(oldLhsattribute);
			if (lhsattribute != oldLhsattribute) {
				eVirtualSet(TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE, lhsattribute);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE, oldLhsattribute, lhsattribute));
			}
		}
		return lhsattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetLhsattribute() {
		return (Attribute)eVirtualGet(TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhsattribute(Attribute newLhsattribute) {
		Attribute lhsattribute = newLhsattribute;
		Object oldLhsattribute = eVirtualSet(TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE, lhsattribute);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE, oldLhsattribute == EVIRTUAL_NO_VALUE ? null : oldLhsattribute, lhsattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRhsattribute() {
		Attribute rhsattribute = (Attribute)eVirtualGet(TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE);
		if (rhsattribute != null && rhsattribute.eIsProxy()) {
			InternalEObject oldRhsattribute = (InternalEObject)rhsattribute;
			rhsattribute = (Attribute)eResolveProxy(oldRhsattribute);
			if (rhsattribute != oldRhsattribute) {
				eVirtualSet(TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE, rhsattribute);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE, oldRhsattribute, rhsattribute));
			}
		}
		return rhsattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRhsattribute() {
		return (Attribute)eVirtualGet(TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhsattribute(Attribute newRhsattribute) {
		Attribute rhsattribute = newRhsattribute;
		Object oldRhsattribute = eVirtualSet(TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE, rhsattribute);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE, oldRhsattribute == EVIRTUAL_NO_VALUE ? null : oldRhsattribute, rhsattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.ATTRIBUTE_LAYOUT__NEW:
				return isNew();
			case TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE:
				if (resolve) return getLhsattribute();
				return basicGetLhsattribute();
			case TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE:
				if (resolve) return getRhsattribute();
				return basicGetRhsattribute();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TggPackage.ATTRIBUTE_LAYOUT__NEW:
				setNew((Boolean)newValue);
				return;
			case TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE:
				setLhsattribute((Attribute)newValue);
				return;
			case TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE:
				setRhsattribute((Attribute)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TggPackage.ATTRIBUTE_LAYOUT__NEW:
				setNew(NEW_EDEFAULT);
				return;
			case TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE:
				setLhsattribute((Attribute)null);
				return;
			case TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE:
				setRhsattribute((Attribute)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TggPackage.ATTRIBUTE_LAYOUT__NEW:
				return new_ != NEW_EDEFAULT;
			case TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE:
				return eVirtualGet(TggPackage.ATTRIBUTE_LAYOUT__LHSATTRIBUTE) != null;
			case TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE:
				return eVirtualGet(TggPackage.ATTRIBUTE_LAYOUT__RHSATTRIBUTE) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Object[] eVirtualValues() {
		return eVirtualValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void eSetVirtualValues(Object[] newValues) {
		eVirtualValues = newValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eVirtualIndexBits(int offset) {
		switch (offset) {
			case 0 :
				return eVirtualIndexBits0;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void eSetVirtualIndexBits(int offset, int newIndexBits) {
		switch (offset) {
			case 0 :
				eVirtualIndexBits0 = newIndexBits;
				break;
			default :
				throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (new: ");
		result.append(new_);
		result.append(')');
		return result.toString();
	}

} //AttributeLayoutImpl
