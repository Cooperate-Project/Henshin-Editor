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

import de.tub.tfs.henshin.tgg.TNode;
import de.tub.tfs.henshin.tgg.TggPackage;
import de.tub.tfs.henshin.tgg.TripleComponent;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Annotation;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TNodeImpl#getX <em>X</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TNodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TNodeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TNodeImpl#getMarkerType <em>Marker Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TNodeImpl extends NodeImpl implements TNode {
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
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;
	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;
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
	protected TNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.TNODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TNODE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TNODE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleComponent getComponent() {
		return (TripleComponent)eVirtualGet(TggPackage.TNODE__COMPONENT, COMPONENT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(TripleComponent newComponent) {
		TripleComponent component = newComponent == null ? COMPONENT_EDEFAULT : newComponent;
		Object oldComponent = eVirtualSet(TggPackage.TNODE__COMPONENT, component);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TNODE__COMPONENT, oldComponent == EVIRTUAL_NO_VALUE ? COMPONENT_EDEFAULT : oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerType() {
		return (String)eVirtualGet(TggPackage.TNODE__MARKER_TYPE, MARKER_TYPE_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerType(String newMarkerType) {
		String markerType = newMarkerType;
		Object oldMarkerType = eVirtualSet(TggPackage.TNODE__MARKER_TYPE, markerType);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TNODE__MARKER_TYPE, oldMarkerType == EVIRTUAL_NO_VALUE ? MARKER_TYPE_EDEFAULT : oldMarkerType, markerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.TNODE__ANNOTATIONS:
				return getAnnotations();
			case TggPackage.TNODE__NAME:
				return getName();
			case TggPackage.TNODE__DESCRIPTION:
				return getDescription();
			case TggPackage.TNODE__ACTION:
				return getAction();
			case TggPackage.TNODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TggPackage.TNODE__ATTRIBUTES:
				return getAttributes();
			case TggPackage.TNODE__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
			case TggPackage.TNODE__INCOMING:
				return getIncoming();
			case TggPackage.TNODE__OUTGOING:
				return getOutgoing();
			case TggPackage.TNODE__X:
				return getX();
			case TggPackage.TNODE__Y:
				return getY();
			case TggPackage.TNODE__COMPONENT:
				return getComponent();
			case TggPackage.TNODE__MARKER_TYPE:
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
			case TggPackage.TNODE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TggPackage.TNODE__NAME:
				setName((String)newValue);
				return;
			case TggPackage.TNODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TggPackage.TNODE__ACTION:
				setAction((Action)newValue);
				return;
			case TggPackage.TNODE__TYPE:
				setType((EClass)newValue);
				return;
			case TggPackage.TNODE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case TggPackage.TNODE__GRAPH:
				setGraph((Graph)newValue);
				return;
			case TggPackage.TNODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Edge>)newValue);
				return;
			case TggPackage.TNODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Edge>)newValue);
				return;
			case TggPackage.TNODE__X:
				setX((Integer)newValue);
				return;
			case TggPackage.TNODE__Y:
				setY((Integer)newValue);
				return;
			case TggPackage.TNODE__COMPONENT:
				setComponent((TripleComponent)newValue);
				return;
			case TggPackage.TNODE__MARKER_TYPE:
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
			case TggPackage.TNODE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TggPackage.TNODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TggPackage.TNODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TggPackage.TNODE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case TggPackage.TNODE__TYPE:
				setType((EClass)null);
				return;
			case TggPackage.TNODE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TggPackage.TNODE__GRAPH:
				setGraph((Graph)null);
				return;
			case TggPackage.TNODE__INCOMING:
				getIncoming().clear();
				return;
			case TggPackage.TNODE__OUTGOING:
				getOutgoing().clear();
				return;
			case TggPackage.TNODE__X:
				setX(X_EDEFAULT);
				return;
			case TggPackage.TNODE__Y:
				setY(Y_EDEFAULT);
				return;
			case TggPackage.TNODE__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
				return;
			case TggPackage.TNODE__MARKER_TYPE:
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
			case TggPackage.TNODE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TggPackage.TNODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TggPackage.TNODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TggPackage.TNODE__ACTION:
				return ACTION_EDEFAULT == null ? getAction() != null : !ACTION_EDEFAULT.equals(getAction());
			case TggPackage.TNODE__TYPE:
				return type != null;
			case TggPackage.TNODE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TggPackage.TNODE__GRAPH:
				return basicGetGraph() != null;
			case TggPackage.TNODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case TggPackage.TNODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case TggPackage.TNODE__X:
				return x != X_EDEFAULT;
			case TggPackage.TNODE__Y:
				return y != Y_EDEFAULT;
			case TggPackage.TNODE__COMPONENT:
				return eVirtualGet(TggPackage.TNODE__COMPONENT, COMPONENT_EDEFAULT) != COMPONENT_EDEFAULT;
			case TggPackage.TNODE__MARKER_TYPE:
				String markerType = (String)eVirtualGet(TggPackage.TNODE__MARKER_TYPE, MARKER_TYPE_EDEFAULT);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", component: ");
		result.append(eVirtualGet(TggPackage.TNODE__COMPONENT, COMPONENT_EDEFAULT));
		result.append(", markerType: ");
		result.append(eVirtualGet(TggPackage.TNODE__MARKER_TYPE, MARKER_TYPE_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //TNodeImpl
