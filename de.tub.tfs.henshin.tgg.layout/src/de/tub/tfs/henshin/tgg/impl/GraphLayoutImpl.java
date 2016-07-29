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

import de.tub.tfs.henshin.tgg.GraphLayout;
import de.tub.tfs.henshin.tgg.TggPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.henshin.model.Graph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl#getDividerX <em>Divider X</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl#isIsSC <em>Is SC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphLayoutImpl extends EObjectImpl implements GraphLayout {
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
	 * The default value of the '{@link #getDividerX() <em>Divider X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerX()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVIDER_X_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDividerX() <em>Divider X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividerX()
	 * @generated
	 * @ordered
	 */
	protected int dividerX = DIVIDER_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_Y_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected int maxY = MAX_Y_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsSC() <em>Is SC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SC_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSC() <em>Is SC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSC()
	 * @generated
	 * @ordered
	 */
	protected boolean isSC = IS_SC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.GRAPH_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDividerX() {
		return dividerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDividerX(int newDividerX) {
		int oldDividerX = dividerX;
		dividerX = newDividerX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.GRAPH_LAYOUT__DIVIDER_X, oldDividerX, dividerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxY() {
		return maxY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxY(int newMaxY) {
		int oldMaxY = maxY;
		maxY = newMaxY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.GRAPH_LAYOUT__MAX_Y, oldMaxY, maxY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		Graph graph = (Graph)eVirtualGet(TggPackage.GRAPH_LAYOUT__GRAPH);
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject)graph;
			graph = (Graph)eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				eVirtualSet(TggPackage.GRAPH_LAYOUT__GRAPH, graph);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.GRAPH_LAYOUT__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraph() {
		return (Graph)eVirtualGet(TggPackage.GRAPH_LAYOUT__GRAPH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		Graph graph = newGraph;
		Object oldGraph = eVirtualSet(TggPackage.GRAPH_LAYOUT__GRAPH, graph);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.GRAPH_LAYOUT__GRAPH, oldGraph == EVIRTUAL_NO_VALUE ? null : oldGraph, graph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSC() {
		return isSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSC(boolean newIsSC) {
		boolean oldIsSC = isSC;
		isSC = newIsSC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.GRAPH_LAYOUT__IS_SC, oldIsSC, isSC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.GRAPH_LAYOUT__DIVIDER_X:
				return getDividerX();
			case TggPackage.GRAPH_LAYOUT__MAX_Y:
				return getMaxY();
			case TggPackage.GRAPH_LAYOUT__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
			case TggPackage.GRAPH_LAYOUT__IS_SC:
				return isIsSC();
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
			case TggPackage.GRAPH_LAYOUT__DIVIDER_X:
				setDividerX((Integer)newValue);
				return;
			case TggPackage.GRAPH_LAYOUT__MAX_Y:
				setMaxY((Integer)newValue);
				return;
			case TggPackage.GRAPH_LAYOUT__GRAPH:
				setGraph((Graph)newValue);
				return;
			case TggPackage.GRAPH_LAYOUT__IS_SC:
				setIsSC((Boolean)newValue);
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
			case TggPackage.GRAPH_LAYOUT__DIVIDER_X:
				setDividerX(DIVIDER_X_EDEFAULT);
				return;
			case TggPackage.GRAPH_LAYOUT__MAX_Y:
				setMaxY(MAX_Y_EDEFAULT);
				return;
			case TggPackage.GRAPH_LAYOUT__GRAPH:
				setGraph((Graph)null);
				return;
			case TggPackage.GRAPH_LAYOUT__IS_SC:
				setIsSC(IS_SC_EDEFAULT);
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
			case TggPackage.GRAPH_LAYOUT__DIVIDER_X:
				return dividerX != DIVIDER_X_EDEFAULT;
			case TggPackage.GRAPH_LAYOUT__MAX_Y:
				return maxY != MAX_Y_EDEFAULT;
			case TggPackage.GRAPH_LAYOUT__GRAPH:
				return eVirtualGet(TggPackage.GRAPH_LAYOUT__GRAPH) != null;
			case TggPackage.GRAPH_LAYOUT__IS_SC:
				return isSC != IS_SC_EDEFAULT;
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
		result.append(" (dividerX: ");
		result.append(dividerX);
		result.append(", maxY: ");
		result.append(maxY);
		result.append(", isSC: ");
		result.append(isSC);
		result.append(')');
		return result.toString();
	}

} //GraphLayoutImpl
