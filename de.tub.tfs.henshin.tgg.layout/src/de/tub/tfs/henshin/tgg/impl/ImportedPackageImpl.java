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

import de.tub.tfs.henshin.tgg.ImportedPackage;
import de.tub.tfs.henshin.tgg.TggPackage;
import de.tub.tfs.henshin.tgg.TripleComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl#isLoadWithDefaultValues <em>Load With Default Values</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportedPackageImpl extends EObjectImpl implements ImportedPackage {
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
	 * The default value of the '{@link #isLoadWithDefaultValues() <em>Load With Default Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadWithDefaultValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_WITH_DEFAULT_VALUES_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isLoadWithDefaultValues() <em>Load With Default Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadWithDefaultValues()
	 * @generated
	 * @ordered
	 */
	protected boolean loadWithDefaultValues = LOAD_WITH_DEFAULT_VALUES_EDEFAULT;
	/**
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final TripleComponent COMPONENT_EDEFAULT = TripleComponent.SOURCE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportedPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.IMPORTED_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoadWithDefaultValues() {
		return loadWithDefaultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadWithDefaultValues(boolean newLoadWithDefaultValues) {
		boolean oldLoadWithDefaultValues = loadWithDefaultValues;
		loadWithDefaultValues = newLoadWithDefaultValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES, oldLoadWithDefaultValues, loadWithDefaultValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getPackage() {
		EPackage package_ = (EPackage)eVirtualGet(TggPackage.IMPORTED_PACKAGE__PACKAGE);
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (EPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				eVirtualSet(TggPackage.IMPORTED_PACKAGE__PACKAGE, package_);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.IMPORTED_PACKAGE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetPackage() {
		return (EPackage)eVirtualGet(TggPackage.IMPORTED_PACKAGE__PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(EPackage newPackage) {
		EPackage package_ = newPackage;
		Object oldPackage = eVirtualSet(TggPackage.IMPORTED_PACKAGE__PACKAGE, package_);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.IMPORTED_PACKAGE__PACKAGE, oldPackage == EVIRTUAL_NO_VALUE ? null : oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleComponent getComponent() {
		return (TripleComponent)eVirtualGet(TggPackage.IMPORTED_PACKAGE__COMPONENT, COMPONENT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(TripleComponent newComponent) {
		TripleComponent component = newComponent == null ? COMPONENT_EDEFAULT : newComponent;
		Object oldComponent = eVirtualSet(TggPackage.IMPORTED_PACKAGE__COMPONENT, component);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.IMPORTED_PACKAGE__COMPONENT, oldComponent == EVIRTUAL_NO_VALUE ? COMPONENT_EDEFAULT : oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES:
				return isLoadWithDefaultValues();
			case TggPackage.IMPORTED_PACKAGE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case TggPackage.IMPORTED_PACKAGE__COMPONENT:
				return getComponent();
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
			case TggPackage.IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES:
				setLoadWithDefaultValues((Boolean)newValue);
				return;
			case TggPackage.IMPORTED_PACKAGE__PACKAGE:
				setPackage((EPackage)newValue);
				return;
			case TggPackage.IMPORTED_PACKAGE__COMPONENT:
				setComponent((TripleComponent)newValue);
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
			case TggPackage.IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES:
				setLoadWithDefaultValues(LOAD_WITH_DEFAULT_VALUES_EDEFAULT);
				return;
			case TggPackage.IMPORTED_PACKAGE__PACKAGE:
				setPackage((EPackage)null);
				return;
			case TggPackage.IMPORTED_PACKAGE__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
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
			case TggPackage.IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES:
				return loadWithDefaultValues != LOAD_WITH_DEFAULT_VALUES_EDEFAULT;
			case TggPackage.IMPORTED_PACKAGE__PACKAGE:
				return eVirtualGet(TggPackage.IMPORTED_PACKAGE__PACKAGE) != null;
			case TggPackage.IMPORTED_PACKAGE__COMPONENT:
				return eVirtualGet(TggPackage.IMPORTED_PACKAGE__COMPONENT, COMPONENT_EDEFAULT) != COMPONENT_EDEFAULT;
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
		result.append(" (loadWithDefaultValues: ");
		result.append(loadWithDefaultValues);
		result.append(", component: ");
		result.append(eVirtualGet(TggPackage.IMPORTED_PACKAGE__COMPONENT, COMPONENT_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //ImportedPackageImpl
