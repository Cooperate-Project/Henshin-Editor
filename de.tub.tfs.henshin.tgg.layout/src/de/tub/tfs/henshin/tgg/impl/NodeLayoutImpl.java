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
import de.tub.tfs.henshin.tgg.NodeLayout;
import de.tub.tfs.henshin.tgg.TggPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.model.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getX <em>X</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getY <em>Y</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#isHide <em>Hide</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getNode <em>Node</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getLhsnode <em>Lhsnode</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getAttributeLayouts <em>Attribute Layouts</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#isNew <em>New</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getRhsTranslated <em>Rhs Translated</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#getLhsTranslated <em>Lhs Translated</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl#isCritical <em>Critical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeLayoutImpl extends EObjectImpl implements NodeLayout {
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
	 * The default value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected boolean hide = HIDE_EDEFAULT;
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
	protected NodeLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.NODE_LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHide() {
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHide(boolean newHide) {
		boolean oldHide = hide;
		hide = newHide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__HIDE, oldHide, hide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		Node node = (Node)eVirtualGet(TggPackage.NODE_LAYOUT__NODE);
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (Node)eResolveProxy(oldNode);
			if (node != oldNode) {
				eVirtualSet(TggPackage.NODE_LAYOUT__NODE, node);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.NODE_LAYOUT__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return (Node)eVirtualGet(TggPackage.NODE_LAYOUT__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		Node node = newNode;
		Object oldNode = eVirtualSet(TggPackage.NODE_LAYOUT__NODE, node);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__NODE, oldNode == EVIRTUAL_NO_VALUE ? null : oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getLhsnode() {
		Node lhsnode = (Node)eVirtualGet(TggPackage.NODE_LAYOUT__LHSNODE);
		if (lhsnode != null && lhsnode.eIsProxy()) {
			InternalEObject oldLhsnode = (InternalEObject)lhsnode;
			lhsnode = (Node)eResolveProxy(oldLhsnode);
			if (lhsnode != oldLhsnode) {
				eVirtualSet(TggPackage.NODE_LAYOUT__LHSNODE, lhsnode);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.NODE_LAYOUT__LHSNODE, oldLhsnode, lhsnode));
			}
		}
		return lhsnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetLhsnode() {
		return (Node)eVirtualGet(TggPackage.NODE_LAYOUT__LHSNODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhsnode(Node newLhsnode) {
		Node lhsnode = newLhsnode;
		Object oldLhsnode = eVirtualSet(TggPackage.NODE_LAYOUT__LHSNODE, lhsnode);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__LHSNODE, oldLhsnode == EVIRTUAL_NO_VALUE ? null : oldLhsnode, lhsnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AttributeLayout> getAttributeLayouts() {
		EList<AttributeLayout> attributeLayouts = (EList<AttributeLayout>)eVirtualGet(TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS);
		if (attributeLayouts == null) {
			eVirtualSet(TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS, attributeLayouts = new EObjectContainmentEList<AttributeLayout>(AttributeLayout.class, this, TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS));
		}
		return attributeLayouts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__NEW, oldNew, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRhsTranslated() {
		return (Boolean)eVirtualGet(TggPackage.NODE_LAYOUT__RHS_TRANSLATED, RHS_TRANSLATED_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhsTranslated(Boolean newRhsTranslated) {
		Boolean rhsTranslated = newRhsTranslated;
		Object oldRhsTranslated = eVirtualSet(TggPackage.NODE_LAYOUT__RHS_TRANSLATED, rhsTranslated);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__RHS_TRANSLATED, oldRhsTranslated == EVIRTUAL_NO_VALUE ? RHS_TRANSLATED_EDEFAULT : oldRhsTranslated, rhsTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLhsTranslated() {
		return (Boolean)eVirtualGet(TggPackage.NODE_LAYOUT__LHS_TRANSLATED, LHS_TRANSLATED_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhsTranslated(Boolean newLhsTranslated) {
		Boolean lhsTranslated = newLhsTranslated;
		Object oldLhsTranslated = eVirtualSet(TggPackage.NODE_LAYOUT__LHS_TRANSLATED, lhsTranslated);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__LHS_TRANSLATED, oldLhsTranslated == EVIRTUAL_NO_VALUE ? LHS_TRANSLATED_EDEFAULT : oldLhsTranslated, lhsTranslated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.NODE_LAYOUT__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS:
				return ((InternalEList<?>)getAttributeLayouts()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TggPackage.NODE_LAYOUT__X:
				return getX();
			case TggPackage.NODE_LAYOUT__Y:
				return getY();
			case TggPackage.NODE_LAYOUT__HIDE:
				return isHide();
			case TggPackage.NODE_LAYOUT__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case TggPackage.NODE_LAYOUT__LHSNODE:
				if (resolve) return getLhsnode();
				return basicGetLhsnode();
			case TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS:
				return getAttributeLayouts();
			case TggPackage.NODE_LAYOUT__NEW:
				return isNew();
			case TggPackage.NODE_LAYOUT__RHS_TRANSLATED:
				return getRhsTranslated();
			case TggPackage.NODE_LAYOUT__LHS_TRANSLATED:
				return getLhsTranslated();
			case TggPackage.NODE_LAYOUT__CRITICAL:
				return isCritical();
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
			case TggPackage.NODE_LAYOUT__X:
				setX((Integer)newValue);
				return;
			case TggPackage.NODE_LAYOUT__Y:
				setY((Integer)newValue);
				return;
			case TggPackage.NODE_LAYOUT__HIDE:
				setHide((Boolean)newValue);
				return;
			case TggPackage.NODE_LAYOUT__NODE:
				setNode((Node)newValue);
				return;
			case TggPackage.NODE_LAYOUT__LHSNODE:
				setLhsnode((Node)newValue);
				return;
			case TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS:
				getAttributeLayouts().clear();
				getAttributeLayouts().addAll((Collection<? extends AttributeLayout>)newValue);
				return;
			case TggPackage.NODE_LAYOUT__NEW:
				setNew((Boolean)newValue);
				return;
			case TggPackage.NODE_LAYOUT__RHS_TRANSLATED:
				setRhsTranslated((Boolean)newValue);
				return;
			case TggPackage.NODE_LAYOUT__LHS_TRANSLATED:
				setLhsTranslated((Boolean)newValue);
				return;
			case TggPackage.NODE_LAYOUT__CRITICAL:
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
			case TggPackage.NODE_LAYOUT__X:
				setX(X_EDEFAULT);
				return;
			case TggPackage.NODE_LAYOUT__Y:
				setY(Y_EDEFAULT);
				return;
			case TggPackage.NODE_LAYOUT__HIDE:
				setHide(HIDE_EDEFAULT);
				return;
			case TggPackage.NODE_LAYOUT__NODE:
				setNode((Node)null);
				return;
			case TggPackage.NODE_LAYOUT__LHSNODE:
				setLhsnode((Node)null);
				return;
			case TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS:
				getAttributeLayouts().clear();
				return;
			case TggPackage.NODE_LAYOUT__NEW:
				setNew(NEW_EDEFAULT);
				return;
			case TggPackage.NODE_LAYOUT__RHS_TRANSLATED:
				setRhsTranslated(RHS_TRANSLATED_EDEFAULT);
				return;
			case TggPackage.NODE_LAYOUT__LHS_TRANSLATED:
				setLhsTranslated(LHS_TRANSLATED_EDEFAULT);
				return;
			case TggPackage.NODE_LAYOUT__CRITICAL:
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
	@SuppressWarnings("unchecked")
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TggPackage.NODE_LAYOUT__X:
				return x != X_EDEFAULT;
			case TggPackage.NODE_LAYOUT__Y:
				return y != Y_EDEFAULT;
			case TggPackage.NODE_LAYOUT__HIDE:
				return hide != HIDE_EDEFAULT;
			case TggPackage.NODE_LAYOUT__NODE:
				return eVirtualGet(TggPackage.NODE_LAYOUT__NODE) != null;
			case TggPackage.NODE_LAYOUT__LHSNODE:
				return eVirtualGet(TggPackage.NODE_LAYOUT__LHSNODE) != null;
			case TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS:
				EList<AttributeLayout> attributeLayouts = (EList<AttributeLayout>)eVirtualGet(TggPackage.NODE_LAYOUT__ATTRIBUTE_LAYOUTS);
				return attributeLayouts != null && !attributeLayouts.isEmpty();
			case TggPackage.NODE_LAYOUT__NEW:
				return new_ != NEW_EDEFAULT;
			case TggPackage.NODE_LAYOUT__RHS_TRANSLATED:
				Boolean rhsTranslated = (Boolean)eVirtualGet(TggPackage.NODE_LAYOUT__RHS_TRANSLATED, RHS_TRANSLATED_EDEFAULT);
				return RHS_TRANSLATED_EDEFAULT == null ? rhsTranslated != null : !RHS_TRANSLATED_EDEFAULT.equals(rhsTranslated);
			case TggPackage.NODE_LAYOUT__LHS_TRANSLATED:
				Boolean lhsTranslated = (Boolean)eVirtualGet(TggPackage.NODE_LAYOUT__LHS_TRANSLATED, LHS_TRANSLATED_EDEFAULT);
				return LHS_TRANSLATED_EDEFAULT == null ? lhsTranslated != null : !LHS_TRANSLATED_EDEFAULT.equals(lhsTranslated);
			case TggPackage.NODE_LAYOUT__CRITICAL:
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", hide: ");
		result.append(hide);
		result.append(", new: ");
		result.append(new_);
		result.append(", rhsTranslated: ");
		result.append(eVirtualGet(TggPackage.NODE_LAYOUT__RHS_TRANSLATED, RHS_TRANSLATED_EDEFAULT));
		result.append(", lhsTranslated: ");
		result.append(eVirtualGet(TggPackage.NODE_LAYOUT__LHS_TRANSLATED, LHS_TRANSLATED_EDEFAULT));
		result.append(", critical: ");
		result.append(critical);
		result.append(')');
		return result.toString();
	}

} //NodeLayoutImpl
