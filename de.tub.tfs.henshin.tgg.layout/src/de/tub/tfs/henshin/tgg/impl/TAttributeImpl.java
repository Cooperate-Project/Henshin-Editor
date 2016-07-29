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

import de.tub.tfs.henshin.tgg.TAttribute;
import de.tub.tfs.henshin.tgg.TggPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.model.impl.AttributeImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Annotation;
import org.eclipse.emf.henshin.model.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TAttributeImpl#getMarkerType <em>Marker Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAttributeImpl extends AttributeImpl implements TAttribute {
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
	 * The default value of the '{@link #getMarkerType() <em>Marker Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerType()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.TATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerType() {
		return (String)eVirtualGet(TggPackage.TATTRIBUTE__MARKER_TYPE, MARKER_TYPE_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerType(String newMarkerType) {
		String markerType = newMarkerType;
		Object oldMarkerType = eVirtualSet(TggPackage.TATTRIBUTE__MARKER_TYPE, markerType);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TATTRIBUTE__MARKER_TYPE, oldMarkerType == EVIRTUAL_NO_VALUE ? MARKER_TYPE_EDEFAULT : oldMarkerType, markerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.TATTRIBUTE__ANNOTATIONS:
				return getAnnotations();
			case TggPackage.TATTRIBUTE__ACTION:
				return getAction();
			case TggPackage.TATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TggPackage.TATTRIBUTE__VALUE:
				return getValue();
			case TggPackage.TATTRIBUTE__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case TggPackage.TATTRIBUTE__CONSTANT:
				return getConstant();
			case TggPackage.TATTRIBUTE__NULL:
				return isNull();
			case TggPackage.TATTRIBUTE__MARKER_TYPE:
				return getMarkerType();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TggPackage.TATTRIBUTE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TggPackage.TATTRIBUTE__ACTION:
				setAction((Action)newValue);
				return;
			case TggPackage.TATTRIBUTE__TYPE:
				setType((EAttribute)newValue);
				return;
			case TggPackage.TATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case TggPackage.TATTRIBUTE__NODE:
				setNode((Node)newValue);
				return;
			case TggPackage.TATTRIBUTE__MARKER_TYPE:
				setMarkerType((String)newValue);
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
			case TggPackage.TATTRIBUTE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TggPackage.TATTRIBUTE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case TggPackage.TATTRIBUTE__TYPE:
				setType((EAttribute)null);
				return;
			case TggPackage.TATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TggPackage.TATTRIBUTE__NODE:
				setNode((Node)null);
				return;
			case TggPackage.TATTRIBUTE__MARKER_TYPE:
				setMarkerType(MARKER_TYPE_EDEFAULT);
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
			case TggPackage.TATTRIBUTE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TggPackage.TATTRIBUTE__ACTION:
				return ACTION_EDEFAULT == null ? getAction() != null : !ACTION_EDEFAULT.equals(getAction());
			case TggPackage.TATTRIBUTE__TYPE:
				return type != null;
			case TggPackage.TATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TggPackage.TATTRIBUTE__NODE:
				return basicGetNode() != null;
			case TggPackage.TATTRIBUTE__CONSTANT:
				return CONSTANT_EDEFAULT == null ? constant != null : !CONSTANT_EDEFAULT.equals(constant);
			case TggPackage.TATTRIBUTE__NULL:
				return null_ != NULL_EDEFAULT;
			case TggPackage.TATTRIBUTE__MARKER_TYPE:
				String markerType = (String)eVirtualGet(TggPackage.TATTRIBUTE__MARKER_TYPE, MARKER_TYPE_EDEFAULT);
				return MARKER_TYPE_EDEFAULT == null ? markerType != null : !MARKER_TYPE_EDEFAULT.equals(markerType);
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
		result.append(" (markerType: ");
		result.append(eVirtualGet(TggPackage.TATTRIBUTE__MARKER_TYPE, MARKER_TYPE_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //TAttributeImpl
