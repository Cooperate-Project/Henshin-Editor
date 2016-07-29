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

import de.tub.tfs.henshin.tgg.TGGRule;
import de.tub.tfs.henshin.tgg.TggPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.model.Annotation;
import org.eclipse.emf.henshin.model.AttributeCondition;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.impl.RuleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGG Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGRuleImpl#getIsMarked <em>Is Marked</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGRuleImpl#isManualMatchingOrder <em>Manual Matching Order</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGRuleImpl#getMarkerType <em>Marker Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGGRuleImpl extends RuleImpl implements TGGRule {
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
	 * The default value of the '{@link #getIsMarked() <em>Is Marked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMarked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MARKED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isManualMatchingOrder() <em>Manual Matching Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualMatchingOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_MATCHING_ORDER_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isManualMatchingOrder() <em>Manual Matching Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualMatchingOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean manualMatchingOrder = MANUAL_MATCHING_ORDER_EDEFAULT;
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
	protected TGGRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.TGG_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMarked() {
		return (Boolean)eVirtualGet(TggPackage.TGG_RULE__IS_MARKED, IS_MARKED_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMarked(Boolean newIsMarked) {
		Boolean isMarked = newIsMarked;
		Object oldIsMarked = eVirtualSet(TggPackage.TGG_RULE__IS_MARKED, isMarked);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG_RULE__IS_MARKED, oldIsMarked == EVIRTUAL_NO_VALUE ? IS_MARKED_EDEFAULT : oldIsMarked, isMarked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManualMatchingOrder() {
		return manualMatchingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualMatchingOrder(boolean newManualMatchingOrder) {
		boolean oldManualMatchingOrder = manualMatchingOrder;
		manualMatchingOrder = newManualMatchingOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG_RULE__MANUAL_MATCHING_ORDER, oldManualMatchingOrder, manualMatchingOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerType() {
		return (String)eVirtualGet(TggPackage.TGG_RULE__MARKER_TYPE, MARKER_TYPE_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerType(String newMarkerType) {
		String markerType = newMarkerType;
		Object oldMarkerType = eVirtualSet(TggPackage.TGG_RULE__MARKER_TYPE, markerType);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG_RULE__MARKER_TYPE, oldMarkerType == EVIRTUAL_NO_VALUE ? MARKER_TYPE_EDEFAULT : oldMarkerType, markerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.TGG_RULE__ANNOTATIONS:
				return getAnnotations();
			case TggPackage.TGG_RULE__NAME:
				return getName();
			case TggPackage.TGG_RULE__DESCRIPTION:
				return getDescription();
			case TggPackage.TGG_RULE__PARAMETERS:
				return getParameters();
			case TggPackage.TGG_RULE__PARAMETER_MAPPINGS:
				return getParameterMappings();
			case TggPackage.TGG_RULE__ACTIVATED:
				return isActivated();
			case TggPackage.TGG_RULE__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case TggPackage.TGG_RULE__RHS:
				if (resolve) return getRhs();
				return basicGetRhs();
			case TggPackage.TGG_RULE__ATTRIBUTE_CONDITIONS:
				return getAttributeConditions();
			case TggPackage.TGG_RULE__MAPPINGS:
				return getMappings();
			case TggPackage.TGG_RULE__CHECK_DANGLING:
				return isCheckDangling();
			case TggPackage.TGG_RULE__INJECTIVE_MATCHING:
				return isInjectiveMatching();
			case TggPackage.TGG_RULE__MULTI_RULES:
				return getMultiRules();
			case TggPackage.TGG_RULE__MULTI_MAPPINGS:
				return getMultiMappings();
			case TggPackage.TGG_RULE__JAVA_IMPORTS:
				return getJavaImports();
			case TggPackage.TGG_RULE__IS_MARKED:
				return getIsMarked();
			case TggPackage.TGG_RULE__MANUAL_MATCHING_ORDER:
				return isManualMatchingOrder();
			case TggPackage.TGG_RULE__MARKER_TYPE:
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
			case TggPackage.TGG_RULE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TggPackage.TGG_RULE__NAME:
				setName((String)newValue);
				return;
			case TggPackage.TGG_RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TggPackage.TGG_RULE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TggPackage.TGG_RULE__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				getParameterMappings().addAll((Collection<? extends ParameterMapping>)newValue);
				return;
			case TggPackage.TGG_RULE__ACTIVATED:
				setActivated((Boolean)newValue);
				return;
			case TggPackage.TGG_RULE__LHS:
				setLhs((Graph)newValue);
				return;
			case TggPackage.TGG_RULE__RHS:
				setRhs((Graph)newValue);
				return;
			case TggPackage.TGG_RULE__ATTRIBUTE_CONDITIONS:
				getAttributeConditions().clear();
				getAttributeConditions().addAll((Collection<? extends AttributeCondition>)newValue);
				return;
			case TggPackage.TGG_RULE__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case TggPackage.TGG_RULE__CHECK_DANGLING:
				setCheckDangling((Boolean)newValue);
				return;
			case TggPackage.TGG_RULE__INJECTIVE_MATCHING:
				setInjectiveMatching((Boolean)newValue);
				return;
			case TggPackage.TGG_RULE__MULTI_RULES:
				getMultiRules().clear();
				getMultiRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case TggPackage.TGG_RULE__MULTI_MAPPINGS:
				getMultiMappings().clear();
				getMultiMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case TggPackage.TGG_RULE__JAVA_IMPORTS:
				getJavaImports().clear();
				getJavaImports().addAll((Collection<? extends String>)newValue);
				return;
			case TggPackage.TGG_RULE__IS_MARKED:
				setIsMarked((Boolean)newValue);
				return;
			case TggPackage.TGG_RULE__MANUAL_MATCHING_ORDER:
				setManualMatchingOrder((Boolean)newValue);
				return;
			case TggPackage.TGG_RULE__MARKER_TYPE:
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
			case TggPackage.TGG_RULE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TggPackage.TGG_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__PARAMETERS:
				getParameters().clear();
				return;
			case TggPackage.TGG_RULE__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				return;
			case TggPackage.TGG_RULE__ACTIVATED:
				setActivated(ACTIVATED_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__LHS:
				setLhs((Graph)null);
				return;
			case TggPackage.TGG_RULE__RHS:
				setRhs((Graph)null);
				return;
			case TggPackage.TGG_RULE__ATTRIBUTE_CONDITIONS:
				getAttributeConditions().clear();
				return;
			case TggPackage.TGG_RULE__MAPPINGS:
				getMappings().clear();
				return;
			case TggPackage.TGG_RULE__CHECK_DANGLING:
				setCheckDangling(CHECK_DANGLING_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__INJECTIVE_MATCHING:
				setInjectiveMatching(INJECTIVE_MATCHING_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__MULTI_RULES:
				getMultiRules().clear();
				return;
			case TggPackage.TGG_RULE__MULTI_MAPPINGS:
				getMultiMappings().clear();
				return;
			case TggPackage.TGG_RULE__JAVA_IMPORTS:
				getJavaImports().clear();
				return;
			case TggPackage.TGG_RULE__IS_MARKED:
				setIsMarked(IS_MARKED_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__MANUAL_MATCHING_ORDER:
				setManualMatchingOrder(MANUAL_MATCHING_ORDER_EDEFAULT);
				return;
			case TggPackage.TGG_RULE__MARKER_TYPE:
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
			case TggPackage.TGG_RULE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TggPackage.TGG_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TggPackage.TGG_RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TggPackage.TGG_RULE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TggPackage.TGG_RULE__PARAMETER_MAPPINGS:
				return parameterMappings != null && !parameterMappings.isEmpty();
			case TggPackage.TGG_RULE__ACTIVATED:
				return activated != ACTIVATED_EDEFAULT;
			case TggPackage.TGG_RULE__LHS:
				return lhs != null;
			case TggPackage.TGG_RULE__RHS:
				return rhs != null;
			case TggPackage.TGG_RULE__ATTRIBUTE_CONDITIONS:
				return attributeConditions != null && !attributeConditions.isEmpty();
			case TggPackage.TGG_RULE__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case TggPackage.TGG_RULE__CHECK_DANGLING:
				return checkDangling != CHECK_DANGLING_EDEFAULT;
			case TggPackage.TGG_RULE__INJECTIVE_MATCHING:
				return injectiveMatching != INJECTIVE_MATCHING_EDEFAULT;
			case TggPackage.TGG_RULE__MULTI_RULES:
				return multiRules != null && !multiRules.isEmpty();
			case TggPackage.TGG_RULE__MULTI_MAPPINGS:
				return multiMappings != null && !multiMappings.isEmpty();
			case TggPackage.TGG_RULE__JAVA_IMPORTS:
				return javaImports != null && !javaImports.isEmpty();
			case TggPackage.TGG_RULE__IS_MARKED:
				Boolean isMarked = (Boolean)eVirtualGet(TggPackage.TGG_RULE__IS_MARKED, IS_MARKED_EDEFAULT);
				return IS_MARKED_EDEFAULT == null ? isMarked != null : !IS_MARKED_EDEFAULT.equals(isMarked);
			case TggPackage.TGG_RULE__MANUAL_MATCHING_ORDER:
				return manualMatchingOrder != MANUAL_MATCHING_ORDER_EDEFAULT;
			case TggPackage.TGG_RULE__MARKER_TYPE:
				String markerType = (String)eVirtualGet(TggPackage.TGG_RULE__MARKER_TYPE, MARKER_TYPE_EDEFAULT);
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
		result.append(" (isMarked: ");
		result.append(eVirtualGet(TggPackage.TGG_RULE__IS_MARKED, IS_MARKED_EDEFAULT));
		result.append(", manualMatchingOrder: ");
		result.append(manualMatchingOrder);
		result.append(", markerType: ");
		result.append(eVirtualGet(TggPackage.TGG_RULE__MARKER_TYPE, MARKER_TYPE_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //TGGRuleImpl
