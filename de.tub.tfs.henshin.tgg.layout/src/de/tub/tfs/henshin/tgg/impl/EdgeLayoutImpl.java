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

import de.tub.tfs.henshin.tgg.EdgeLayout;
import de.tub.tfs.henshin.tgg.TggPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.henshin.model.Edge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl#isNew <em>New</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl#getLhsedge <em>Lhsedge</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl#getRhsedge <em>Rhsedge</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl#getRhsTranslated <em>Rhs Translated</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl#getLhsTranslated <em>Lhs Translated</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl#isCritical <em>Critical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeLayoutImpl extends EObjectImpl implements EdgeLayout {
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
	 * The default value of the '{@link #getRhsTranslated() <em>Rhs Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhsTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RHS_TRANSLATED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLhsTranslated() <em>Lhs Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhsTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LHS_TRANSLATED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.EDGE_LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.EDGE_LAYOUT__NEW, oldNew, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getLhsedge() {
		Edge lhsedge = (Edge)eVirtualGet(TggPackage.EDGE_LAYOUT__LHSEDGE);
		if (lhsedge != null && lhsedge.eIsProxy()) {
			InternalEObject oldLhsedge = (InternalEObject)lhsedge;
			lhsedge = (Edge)eResolveProxy(oldLhsedge);
			if (lhsedge != oldLhsedge) {
				eVirtualSet(TggPackage.EDGE_LAYOUT__LHSEDGE, lhsedge);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.EDGE_LAYOUT__LHSEDGE, oldLhsedge, lhsedge));
			}
		}
		return lhsedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetLhsedge() {
		return (Edge)eVirtualGet(TggPackage.EDGE_LAYOUT__LHSEDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhsedge(Edge newLhsedge) {
		Edge lhsedge = newLhsedge;
		Object oldLhsedge = eVirtualSet(TggPackage.EDGE_LAYOUT__LHSEDGE, lhsedge);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.EDGE_LAYOUT__LHSEDGE, oldLhsedge == EVIRTUAL_NO_VALUE ? null : oldLhsedge, lhsedge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getRhsedge() {
		Edge rhsedge = (Edge)eVirtualGet(TggPackage.EDGE_LAYOUT__RHSEDGE);
		if (rhsedge != null && rhsedge.eIsProxy()) {
			InternalEObject oldRhsedge = (InternalEObject)rhsedge;
			rhsedge = (Edge)eResolveProxy(oldRhsedge);
			if (rhsedge != oldRhsedge) {
				eVirtualSet(TggPackage.EDGE_LAYOUT__RHSEDGE, rhsedge);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.EDGE_LAYOUT__RHSEDGE, oldRhsedge, rhsedge));
			}
		}
		return rhsedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetRhsedge() {
		return (Edge)eVirtualGet(TggPackage.EDGE_LAYOUT__RHSEDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhsedge(Edge newRhsedge) {
		Edge rhsedge = newRhsedge;
		Object oldRhsedge = eVirtualSet(TggPackage.EDGE_LAYOUT__RHSEDGE, rhsedge);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.EDGE_LAYOUT__RHSEDGE, oldRhsedge == EVIRTUAL_NO_VALUE ? null : oldRhsedge, rhsedge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRhsTranslated() {
		return (Boolean)eVirtualGet(TggPackage.EDGE_LAYOUT__RHS_TRANSLATED, RHS_TRANSLATED_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhsTranslated(Boolean newRhsTranslated) {
		Boolean rhsTranslated = newRhsTranslated;
		Object oldRhsTranslated = eVirtualSet(TggPackage.EDGE_LAYOUT__RHS_TRANSLATED, rhsTranslated);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.EDGE_LAYOUT__RHS_TRANSLATED, oldRhsTranslated == EVIRTUAL_NO_VALUE ? RHS_TRANSLATED_EDEFAULT : oldRhsTranslated, rhsTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLhsTranslated() {
		return (Boolean)eVirtualGet(TggPackage.EDGE_LAYOUT__LHS_TRANSLATED, LHS_TRANSLATED_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhsTranslated(Boolean newLhsTranslated) {
		Boolean lhsTranslated = newLhsTranslated;
		Object oldLhsTranslated = eVirtualSet(TggPackage.EDGE_LAYOUT__LHS_TRANSLATED, lhsTranslated);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.EDGE_LAYOUT__LHS_TRANSLATED, oldLhsTranslated == EVIRTUAL_NO_VALUE ? LHS_TRANSLATED_EDEFAULT : oldLhsTranslated, lhsTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.EDGE_LAYOUT__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.EDGE_LAYOUT__NEW:
				return isNew();
			case TggPackage.EDGE_LAYOUT__LHSEDGE:
				if (resolve) return getLhsedge();
				return basicGetLhsedge();
			case TggPackage.EDGE_LAYOUT__RHSEDGE:
				if (resolve) return getRhsedge();
				return basicGetRhsedge();
			case TggPackage.EDGE_LAYOUT__RHS_TRANSLATED:
				return getRhsTranslated();
			case TggPackage.EDGE_LAYOUT__LHS_TRANSLATED:
				return getLhsTranslated();
			case TggPackage.EDGE_LAYOUT__CRITICAL:
				return isCritical();
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
			case TggPackage.EDGE_LAYOUT__NEW:
				setNew((Boolean)newValue);
				return;
			case TggPackage.EDGE_LAYOUT__LHSEDGE:
				setLhsedge((Edge)newValue);
				return;
			case TggPackage.EDGE_LAYOUT__RHSEDGE:
				setRhsedge((Edge)newValue);
				return;
			case TggPackage.EDGE_LAYOUT__RHS_TRANSLATED:
				setRhsTranslated((Boolean)newValue);
				return;
			case TggPackage.EDGE_LAYOUT__LHS_TRANSLATED:
				setLhsTranslated((Boolean)newValue);
				return;
			case TggPackage.EDGE_LAYOUT__CRITICAL:
				setCritical((Boolean)newValue);
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
			case TggPackage.EDGE_LAYOUT__NEW:
				setNew(NEW_EDEFAULT);
				return;
			case TggPackage.EDGE_LAYOUT__LHSEDGE:
				setLhsedge((Edge)null);
				return;
			case TggPackage.EDGE_LAYOUT__RHSEDGE:
				setRhsedge((Edge)null);
				return;
			case TggPackage.EDGE_LAYOUT__RHS_TRANSLATED:
				setRhsTranslated(RHS_TRANSLATED_EDEFAULT);
				return;
			case TggPackage.EDGE_LAYOUT__LHS_TRANSLATED:
				setLhsTranslated(LHS_TRANSLATED_EDEFAULT);
				return;
			case TggPackage.EDGE_LAYOUT__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
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
			case TggPackage.EDGE_LAYOUT__NEW:
				return new_ != NEW_EDEFAULT;
			case TggPackage.EDGE_LAYOUT__LHSEDGE:
				return eVirtualGet(TggPackage.EDGE_LAYOUT__LHSEDGE) != null;
			case TggPackage.EDGE_LAYOUT__RHSEDGE:
				return eVirtualGet(TggPackage.EDGE_LAYOUT__RHSEDGE) != null;
			case TggPackage.EDGE_LAYOUT__RHS_TRANSLATED:
				Boolean rhsTranslated = (Boolean)eVirtualGet(TggPackage.EDGE_LAYOUT__RHS_TRANSLATED, RHS_TRANSLATED_EDEFAULT);
				return RHS_TRANSLATED_EDEFAULT == null ? rhsTranslated != null : !RHS_TRANSLATED_EDEFAULT.equals(rhsTranslated);
			case TggPackage.EDGE_LAYOUT__LHS_TRANSLATED:
				Boolean lhsTranslated = (Boolean)eVirtualGet(TggPackage.EDGE_LAYOUT__LHS_TRANSLATED, LHS_TRANSLATED_EDEFAULT);
				return LHS_TRANSLATED_EDEFAULT == null ? lhsTranslated != null : !LHS_TRANSLATED_EDEFAULT.equals(lhsTranslated);
			case TggPackage.EDGE_LAYOUT__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
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
		result.append(", rhsTranslated: ");
		result.append(eVirtualGet(TggPackage.EDGE_LAYOUT__RHS_TRANSLATED, RHS_TRANSLATED_EDEFAULT));
		result.append(", lhsTranslated: ");
		result.append(eVirtualGet(TggPackage.EDGE_LAYOUT__LHS_TRANSLATED, LHS_TRANSLATED_EDEFAULT));
		result.append(", critical: ");
		result.append(critical);
		result.append(')');
		return result.toString();
	}

} //EdgeLayoutImpl
