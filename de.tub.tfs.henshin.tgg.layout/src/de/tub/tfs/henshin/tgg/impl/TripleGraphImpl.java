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

import de.tub.tfs.henshin.tgg.TggPackage;
import de.tub.tfs.henshin.tgg.TripleGraph;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.model.Annotation;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.impl.GraphImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TripleGraphImpl#getDividerSC_X <em>Divider SC X</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TripleGraphImpl#getDividerCT_X <em>Divider CT X</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TripleGraphImpl#getDividerMaxY <em>Divider Max Y</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TripleGraphImpl#getDividerYOffset <em>Divider YOffset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripleGraphImpl extends GraphImpl implements TripleGraph {
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
	 * The default value of the '{@link #getDividerSC_X() <em>Divider SC X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerSC_X()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVIDER_SC_X_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDividerSC_X() <em>Divider SC X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerSC_X()
	 * @generated
	 * @ordered
	 */
	protected int dividerSC_X = DIVIDER_SC_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getDividerCT_X() <em>Divider CT X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerCT_X()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVIDER_CT_X_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDividerCT_X() <em>Divider CT X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerCT_X()
	 * @generated
	 * @ordered
	 */
	protected int dividerCT_X = DIVIDER_CT_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getDividerMaxY() <em>Divider Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerMaxY()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVIDER_MAX_Y_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDividerMaxY() <em>Divider Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerMaxY()
	 * @generated
	 * @ordered
	 */
	protected int dividerMaxY = DIVIDER_MAX_Y_EDEFAULT;
	/**
	 * The default value of the '{@link #getDividerYOffset() <em>Divider YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerYOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVIDER_YOFFSET_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDividerYOffset() <em>Divider YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerYOffset()
	 * @generated
	 * @ordered
	 */
	protected int dividerYOffset = DIVIDER_YOFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.TRIPLE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDividerSC_X() {
		return dividerSC_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDividerSC_X(int newDividerSC_X) {
		int oldDividerSC_X = dividerSC_X;
		dividerSC_X = newDividerSC_X;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TRIPLE_GRAPH__DIVIDER_SC_X, oldDividerSC_X, dividerSC_X));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDividerCT_X() {
		return dividerCT_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDividerCT_X(int newDividerCT_X) {
		int oldDividerCT_X = dividerCT_X;
		dividerCT_X = newDividerCT_X;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TRIPLE_GRAPH__DIVIDER_CT_X, oldDividerCT_X, dividerCT_X));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDividerMaxY() {
		return dividerMaxY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDividerMaxY(int newDividerMaxY) {
		int oldDividerMaxY = dividerMaxY;
		dividerMaxY = newDividerMaxY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TRIPLE_GRAPH__DIVIDER_MAX_Y, oldDividerMaxY, dividerMaxY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDividerYOffset() {
		return dividerYOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDividerYOffset(int newDividerYOffset) {
		int oldDividerYOffset = dividerYOffset;
		dividerYOffset = newDividerYOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TRIPLE_GRAPH__DIVIDER_YOFFSET, oldDividerYOffset, dividerYOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.TRIPLE_GRAPH__ANNOTATIONS:
				return getAnnotations();
			case TggPackage.TRIPLE_GRAPH__NAME:
				return getName();
			case TggPackage.TRIPLE_GRAPH__DESCRIPTION:
				return getDescription();
			case TggPackage.TRIPLE_GRAPH__NODES:
				return getNodes();
			case TggPackage.TRIPLE_GRAPH__EDGES:
				return getEdges();
			case TggPackage.TRIPLE_GRAPH__FORMULA:
				if (resolve) return getFormula();
				return basicGetFormula();
			case TggPackage.TRIPLE_GRAPH__DIVIDER_SC_X:
				return getDividerSC_X();
			case TggPackage.TRIPLE_GRAPH__DIVIDER_CT_X:
				return getDividerCT_X();
			case TggPackage.TRIPLE_GRAPH__DIVIDER_MAX_Y:
				return getDividerMaxY();
			case TggPackage.TRIPLE_GRAPH__DIVIDER_YOFFSET:
				return getDividerYOffset();
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
			case TggPackage.TRIPLE_GRAPH__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__NAME:
				setName((String)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__FORMULA:
				setFormula((Formula)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_SC_X:
				setDividerSC_X((Integer)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_CT_X:
				setDividerCT_X((Integer)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_MAX_Y:
				setDividerMaxY((Integer)newValue);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_YOFFSET:
				setDividerYOffset((Integer)newValue);
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
			case TggPackage.TRIPLE_GRAPH__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TggPackage.TRIPLE_GRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TggPackage.TRIPLE_GRAPH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TggPackage.TRIPLE_GRAPH__NODES:
				getNodes().clear();
				return;
			case TggPackage.TRIPLE_GRAPH__EDGES:
				getEdges().clear();
				return;
			case TggPackage.TRIPLE_GRAPH__FORMULA:
				setFormula((Formula)null);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_SC_X:
				setDividerSC_X(DIVIDER_SC_X_EDEFAULT);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_CT_X:
				setDividerCT_X(DIVIDER_CT_X_EDEFAULT);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_MAX_Y:
				setDividerMaxY(DIVIDER_MAX_Y_EDEFAULT);
				return;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_YOFFSET:
				setDividerYOffset(DIVIDER_YOFFSET_EDEFAULT);
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
			case TggPackage.TRIPLE_GRAPH__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TggPackage.TRIPLE_GRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TggPackage.TRIPLE_GRAPH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TggPackage.TRIPLE_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case TggPackage.TRIPLE_GRAPH__EDGES:
				return edges != null && !edges.isEmpty();
			case TggPackage.TRIPLE_GRAPH__FORMULA:
				return formula != null;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_SC_X:
				return dividerSC_X != DIVIDER_SC_X_EDEFAULT;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_CT_X:
				return dividerCT_X != DIVIDER_CT_X_EDEFAULT;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_MAX_Y:
				return dividerMaxY != DIVIDER_MAX_Y_EDEFAULT;
			case TggPackage.TRIPLE_GRAPH__DIVIDER_YOFFSET:
				return dividerYOffset != DIVIDER_YOFFSET_EDEFAULT;
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
		result.append(" (dividerSC_X: ");
		result.append(dividerSC_X);
		result.append(", dividerCT_X: ");
		result.append(dividerCT_X);
		result.append(", dividerMaxY: ");
		result.append(dividerMaxY);
		result.append(", dividerYOffset: ");
		result.append(dividerYOffset);
		result.append(')');
		return result.toString();
	}

} //TripleGraphImpl
