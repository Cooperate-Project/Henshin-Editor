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

import de.tub.tfs.henshin.tgg.CritPair;
import de.tub.tfs.henshin.tgg.TggPackage;

import de.tub.tfs.henshin.tgg.TripleGraph;
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
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crit Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getOverlapping <em>Overlapping</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getRule2 <em>Rule2</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getMappingsOverToRule1 <em>Mappings Over To Rule1</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getMappingsOverToRule2 <em>Mappings Over To Rule2</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getMappingsRule1ToRule2 <em>Mappings Rule1 To Rule2</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CritPairImpl extends EObjectImpl implements CritPair {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "name";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CritPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.CRIT_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleGraph getOverlapping() {
		TripleGraph overlapping = (TripleGraph)eVirtualGet(TggPackage.CRIT_PAIR__OVERLAPPING);
		if (overlapping != null && overlapping.eIsProxy()) {
			InternalEObject oldOverlapping = (InternalEObject)overlapping;
			overlapping = (TripleGraph)eResolveProxy(oldOverlapping);
			if (overlapping != oldOverlapping) {
				eVirtualSet(TggPackage.CRIT_PAIR__OVERLAPPING, overlapping);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.CRIT_PAIR__OVERLAPPING, oldOverlapping, overlapping));
			}
		}
		return overlapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleGraph basicGetOverlapping() {
		return (TripleGraph)eVirtualGet(TggPackage.CRIT_PAIR__OVERLAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlapping(TripleGraph newOverlapping) {
		TripleGraph overlapping = newOverlapping;
		Object oldOverlapping = eVirtualSet(TggPackage.CRIT_PAIR__OVERLAPPING, overlapping);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.CRIT_PAIR__OVERLAPPING, oldOverlapping == EVIRTUAL_NO_VALUE ? null : oldOverlapping, overlapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule1() {
		Rule rule1 = (Rule)eVirtualGet(TggPackage.CRIT_PAIR__RULE1);
		if (rule1 != null && rule1.eIsProxy()) {
			InternalEObject oldRule1 = (InternalEObject)rule1;
			rule1 = (Rule)eResolveProxy(oldRule1);
			if (rule1 != oldRule1) {
				eVirtualSet(TggPackage.CRIT_PAIR__RULE1, rule1);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.CRIT_PAIR__RULE1, oldRule1, rule1));
			}
		}
		return rule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule1() {
		return (Rule)eVirtualGet(TggPackage.CRIT_PAIR__RULE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule1(Rule newRule1) {
		Rule rule1 = newRule1;
		Object oldRule1 = eVirtualSet(TggPackage.CRIT_PAIR__RULE1, rule1);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.CRIT_PAIR__RULE1, oldRule1 == EVIRTUAL_NO_VALUE ? null : oldRule1, rule1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule2() {
		Rule rule2 = (Rule)eVirtualGet(TggPackage.CRIT_PAIR__RULE2);
		if (rule2 != null && rule2.eIsProxy()) {
			InternalEObject oldRule2 = (InternalEObject)rule2;
			rule2 = (Rule)eResolveProxy(oldRule2);
			if (rule2 != oldRule2) {
				eVirtualSet(TggPackage.CRIT_PAIR__RULE2, rule2);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.CRIT_PAIR__RULE2, oldRule2, rule2));
			}
		}
		return rule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule2() {
		return (Rule)eVirtualGet(TggPackage.CRIT_PAIR__RULE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule2(Rule newRule2) {
		Rule rule2 = newRule2;
		Object oldRule2 = eVirtualSet(TggPackage.CRIT_PAIR__RULE2, rule2);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.CRIT_PAIR__RULE2, oldRule2 == EVIRTUAL_NO_VALUE ? null : oldRule2, rule2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Mapping> getMappingsOverToRule1() {
		EList<Mapping> mappingsOverToRule1 = (EList<Mapping>)eVirtualGet(TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1);
		if (mappingsOverToRule1 == null) {
			eVirtualSet(TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1, mappingsOverToRule1 = new EObjectContainmentEList<Mapping>(Mapping.class, this, TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1));
		}
		return mappingsOverToRule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Mapping> getMappingsOverToRule2() {
		EList<Mapping> mappingsOverToRule2 = (EList<Mapping>)eVirtualGet(TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2);
		if (mappingsOverToRule2 == null) {
			eVirtualSet(TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2, mappingsOverToRule2 = new EObjectContainmentEList<Mapping>(Mapping.class, this, TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2));
		}
		return mappingsOverToRule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Mapping> getMappingsRule1ToRule2() {
		EList<Mapping> mappingsRule1ToRule2 = (EList<Mapping>)eVirtualGet(TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2);
		if (mappingsRule1ToRule2 == null) {
			eVirtualSet(TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2, mappingsRule1ToRule2 = new EObjectContainmentEList<Mapping>(Mapping.class, this, TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2));
		}
		return mappingsRule1ToRule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eVirtualGet(TggPackage.CRIT_PAIR__NAME, NAME_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String name = newName;
		Object oldName = eVirtualSet(TggPackage.CRIT_PAIR__NAME, name);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.CRIT_PAIR__NAME, oldName == EVIRTUAL_NO_VALUE ? NAME_EDEFAULT : oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1:
				return ((InternalEList<?>)getMappingsOverToRule1()).basicRemove(otherEnd, msgs);
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2:
				return ((InternalEList<?>)getMappingsOverToRule2()).basicRemove(otherEnd, msgs);
			case TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2:
				return ((InternalEList<?>)getMappingsRule1ToRule2()).basicRemove(otherEnd, msgs);
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
			case TggPackage.CRIT_PAIR__OVERLAPPING:
				if (resolve) return getOverlapping();
				return basicGetOverlapping();
			case TggPackage.CRIT_PAIR__RULE1:
				if (resolve) return getRule1();
				return basicGetRule1();
			case TggPackage.CRIT_PAIR__RULE2:
				if (resolve) return getRule2();
				return basicGetRule2();
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1:
				return getMappingsOverToRule1();
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2:
				return getMappingsOverToRule2();
			case TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2:
				return getMappingsRule1ToRule2();
			case TggPackage.CRIT_PAIR__NAME:
				return getName();
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
			case TggPackage.CRIT_PAIR__OVERLAPPING:
				setOverlapping((TripleGraph)newValue);
				return;
			case TggPackage.CRIT_PAIR__RULE1:
				setRule1((Rule)newValue);
				return;
			case TggPackage.CRIT_PAIR__RULE2:
				setRule2((Rule)newValue);
				return;
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1:
				getMappingsOverToRule1().clear();
				getMappingsOverToRule1().addAll((Collection<? extends Mapping>)newValue);
				return;
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2:
				getMappingsOverToRule2().clear();
				getMappingsOverToRule2().addAll((Collection<? extends Mapping>)newValue);
				return;
			case TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2:
				getMappingsRule1ToRule2().clear();
				getMappingsRule1ToRule2().addAll((Collection<? extends Mapping>)newValue);
				return;
			case TggPackage.CRIT_PAIR__NAME:
				setName((String)newValue);
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
			case TggPackage.CRIT_PAIR__OVERLAPPING:
				setOverlapping((TripleGraph)null);
				return;
			case TggPackage.CRIT_PAIR__RULE1:
				setRule1((Rule)null);
				return;
			case TggPackage.CRIT_PAIR__RULE2:
				setRule2((Rule)null);
				return;
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1:
				getMappingsOverToRule1().clear();
				return;
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2:
				getMappingsOverToRule2().clear();
				return;
			case TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2:
				getMappingsRule1ToRule2().clear();
				return;
			case TggPackage.CRIT_PAIR__NAME:
				setName(NAME_EDEFAULT);
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
			case TggPackage.CRIT_PAIR__OVERLAPPING:
				return eVirtualGet(TggPackage.CRIT_PAIR__OVERLAPPING) != null;
			case TggPackage.CRIT_PAIR__RULE1:
				return eVirtualGet(TggPackage.CRIT_PAIR__RULE1) != null;
			case TggPackage.CRIT_PAIR__RULE2:
				return eVirtualGet(TggPackage.CRIT_PAIR__RULE2) != null;
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1:
				EList<Mapping> mappingsOverToRule1 = (EList<Mapping>)eVirtualGet(TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE1);
				return mappingsOverToRule1 != null && !mappingsOverToRule1.isEmpty();
			case TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2:
				EList<Mapping> mappingsOverToRule2 = (EList<Mapping>)eVirtualGet(TggPackage.CRIT_PAIR__MAPPINGS_OVER_TO_RULE2);
				return mappingsOverToRule2 != null && !mappingsOverToRule2.isEmpty();
			case TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2:
				EList<Mapping> mappingsRule1ToRule2 = (EList<Mapping>)eVirtualGet(TggPackage.CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2);
				return mappingsRule1ToRule2 != null && !mappingsRule1ToRule2.isEmpty();
			case TggPackage.CRIT_PAIR__NAME:
				String name = (String)eVirtualGet(TggPackage.CRIT_PAIR__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(eVirtualGet(TggPackage.CRIT_PAIR__NAME, NAME_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //CritPairImpl
