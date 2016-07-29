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
import de.tub.tfs.henshin.tgg.EdgeLayout;
import de.tub.tfs.henshin.tgg.GraphLayout;
import de.tub.tfs.henshin.tgg.ImportedPackage;
import de.tub.tfs.henshin.tgg.NodeLayout;
import de.tub.tfs.henshin.tgg.TGG;
import de.tub.tfs.henshin.tgg.TRule;
import de.tub.tfs.henshin.tgg.TggPackage;

import de.tub.tfs.henshin.tgg.TripleGraph;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.model.Annotation;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.impl.ModuleImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getSrcroot <em>Srcroot</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getTarroot <em>Tarroot</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getCorresp <em>Corresp</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getNodelayouts <em>Nodelayouts</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getEdgelayouts <em>Edgelayouts</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getGraphlayouts <em>Graphlayouts</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getTRules <em>TRules</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getCritPairs <em>Crit Pairs</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getSourcePkgs <em>Source Pkgs</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getCorrespondencePkgs <em>Correspondence Pkgs</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getTargetPkgs <em>Target Pkgs</em>}</li>
 *   <li>{@link de.tub.tfs.henshin.tgg.impl.TGGImpl#getImportedPkgs <em>Imported Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGGImpl extends ModuleImpl implements TGG {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TggPackage.Literals.TGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSrcroot() {
		EObject srcroot = (EObject)eVirtualGet(TggPackage.TGG__SRCROOT);
		if (srcroot != null && srcroot.eIsProxy()) {
			InternalEObject oldSrcroot = (InternalEObject)srcroot;
			srcroot = eResolveProxy(oldSrcroot);
			if (srcroot != oldSrcroot) {
				eVirtualSet(TggPackage.TGG__SRCROOT, srcroot);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.TGG__SRCROOT, oldSrcroot, srcroot));
			}
		}
		return srcroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSrcroot() {
		return (EObject)eVirtualGet(TggPackage.TGG__SRCROOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcroot(EObject newSrcroot) {
		EObject srcroot = newSrcroot;
		Object oldSrcroot = eVirtualSet(TggPackage.TGG__SRCROOT, srcroot);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG__SRCROOT, oldSrcroot == EVIRTUAL_NO_VALUE ? null : oldSrcroot, srcroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarroot() {
		EObject tarroot = (EObject)eVirtualGet(TggPackage.TGG__TARROOT);
		if (tarroot != null && tarroot.eIsProxy()) {
			InternalEObject oldTarroot = (InternalEObject)tarroot;
			tarroot = eResolveProxy(oldTarroot);
			if (tarroot != oldTarroot) {
				eVirtualSet(TggPackage.TGG__TARROOT, tarroot);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.TGG__TARROOT, oldTarroot, tarroot));
			}
		}
		return tarroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarroot() {
		return (EObject)eVirtualGet(TggPackage.TGG__TARROOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarroot(EObject newTarroot) {
		EObject tarroot = newTarroot;
		Object oldTarroot = eVirtualSet(TggPackage.TGG__TARROOT, tarroot);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG__TARROOT, oldTarroot == EVIRTUAL_NO_VALUE ? null : oldTarroot, tarroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getSource() {
		EPackage source = (EPackage)eVirtualGet(TggPackage.TGG__SOURCE);
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EPackage)eResolveProxy(oldSource);
			if (source != oldSource) {
				eVirtualSet(TggPackage.TGG__SOURCE, source);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.TGG__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetSource() {
		return (EPackage)eVirtualGet(TggPackage.TGG__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EPackage newSource) {
		EPackage source = newSource;
		Object oldSource = eVirtualSet(TggPackage.TGG__SOURCE, source);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG__SOURCE, oldSource == EVIRTUAL_NO_VALUE ? null : oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getCorresp() {
		EPackage corresp = (EPackage)eVirtualGet(TggPackage.TGG__CORRESP);
		if (corresp != null && corresp.eIsProxy()) {
			InternalEObject oldCorresp = (InternalEObject)corresp;
			corresp = (EPackage)eResolveProxy(oldCorresp);
			if (corresp != oldCorresp) {
				eVirtualSet(TggPackage.TGG__CORRESP, corresp);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.TGG__CORRESP, oldCorresp, corresp));
			}
		}
		return corresp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetCorresp() {
		return (EPackage)eVirtualGet(TggPackage.TGG__CORRESP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorresp(EPackage newCorresp) {
		EPackage corresp = newCorresp;
		Object oldCorresp = eVirtualSet(TggPackage.TGG__CORRESP, corresp);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG__CORRESP, oldCorresp == EVIRTUAL_NO_VALUE ? null : oldCorresp, corresp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getTarget() {
		EPackage target = (EPackage)eVirtualGet(TggPackage.TGG__TARGET);
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EPackage)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				eVirtualSet(TggPackage.TGG__TARGET, target);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TggPackage.TGG__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetTarget() {
		return (EPackage)eVirtualGet(TggPackage.TGG__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EPackage newTarget) {
		EPackage target = newTarget;
		Object oldTarget = eVirtualSet(TggPackage.TGG__TARGET, target);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TggPackage.TGG__TARGET, oldTarget == EVIRTUAL_NO_VALUE ? null : oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NodeLayout> getNodelayouts() {
		EList<NodeLayout> nodelayouts = (EList<NodeLayout>)eVirtualGet(TggPackage.TGG__NODELAYOUTS);
		if (nodelayouts == null) {
			eVirtualSet(TggPackage.TGG__NODELAYOUTS, nodelayouts = new EObjectContainmentEList<NodeLayout>(NodeLayout.class, this, TggPackage.TGG__NODELAYOUTS));
		}
		return nodelayouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EdgeLayout> getEdgelayouts() {
		EList<EdgeLayout> edgelayouts = (EList<EdgeLayout>)eVirtualGet(TggPackage.TGG__EDGELAYOUTS);
		if (edgelayouts == null) {
			eVirtualSet(TggPackage.TGG__EDGELAYOUTS, edgelayouts = new EObjectContainmentEList<EdgeLayout>(EdgeLayout.class, this, TggPackage.TGG__EDGELAYOUTS));
		}
		return edgelayouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GraphLayout> getGraphlayouts() {
		EList<GraphLayout> graphlayouts = (EList<GraphLayout>)eVirtualGet(TggPackage.TGG__GRAPHLAYOUTS);
		if (graphlayouts == null) {
			eVirtualSet(TggPackage.TGG__GRAPHLAYOUTS, graphlayouts = new EObjectContainmentEList<GraphLayout>(GraphLayout.class, this, TggPackage.TGG__GRAPHLAYOUTS));
		}
		return graphlayouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TRule> getTRules() {
		EList<TRule> tRules = (EList<TRule>)eVirtualGet(TggPackage.TGG__TRULES);
		if (tRules == null) {
			eVirtualSet(TggPackage.TGG__TRULES, tRules = new EObjectContainmentEList<TRule>(TRule.class, this, TggPackage.TGG__TRULES));
		}
		return tRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CritPair> getCritPairs() {
		EList<CritPair> critPairs = (EList<CritPair>)eVirtualGet(TggPackage.TGG__CRIT_PAIRS);
		if (critPairs == null) {
			eVirtualSet(TggPackage.TGG__CRIT_PAIRS, critPairs = new EObjectContainmentEList<CritPair>(CritPair.class, this, TggPackage.TGG__CRIT_PAIRS));
		}
		return critPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EPackage> getSourcePkgs() {
		EList<EPackage> sourcePkgs = (EList<EPackage>)eVirtualGet(TggPackage.TGG__SOURCE_PKGS);
		if (sourcePkgs == null) {
			eVirtualSet(TggPackage.TGG__SOURCE_PKGS, sourcePkgs = new EObjectResolvingEList<EPackage>(EPackage.class, this, TggPackage.TGG__SOURCE_PKGS));
		}
		return sourcePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EPackage> getCorrespondencePkgs() {
		EList<EPackage> correspondencePkgs = (EList<EPackage>)eVirtualGet(TggPackage.TGG__CORRESPONDENCE_PKGS);
		if (correspondencePkgs == null) {
			eVirtualSet(TggPackage.TGG__CORRESPONDENCE_PKGS, correspondencePkgs = new EObjectResolvingEList<EPackage>(EPackage.class, this, TggPackage.TGG__CORRESPONDENCE_PKGS));
		}
		return correspondencePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EPackage> getTargetPkgs() {
		EList<EPackage> targetPkgs = (EList<EPackage>)eVirtualGet(TggPackage.TGG__TARGET_PKGS);
		if (targetPkgs == null) {
			eVirtualSet(TggPackage.TGG__TARGET_PKGS, targetPkgs = new EObjectResolvingEList<EPackage>(EPackage.class, this, TggPackage.TGG__TARGET_PKGS));
		}
		return targetPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImportedPackage> getImportedPkgs() {
		EList<ImportedPackage> importedPkgs = (EList<ImportedPackage>)eVirtualGet(TggPackage.TGG__IMPORTED_PKGS);
		if (importedPkgs == null) {
			eVirtualSet(TggPackage.TGG__IMPORTED_PKGS, importedPkgs = new EObjectContainmentEList<ImportedPackage>(ImportedPackage.class, this, TggPackage.TGG__IMPORTED_PKGS));
		}
		return importedPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TggPackage.TGG__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__SUB_MODULES:
				return ((InternalEList<?>)getSubModules()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__SUPER_MODULE:
				return basicSetSuperModule(null, msgs);
			case TggPackage.TGG__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__NODELAYOUTS:
				return ((InternalEList<?>)getNodelayouts()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__EDGELAYOUTS:
				return ((InternalEList<?>)getEdgelayouts()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__GRAPHLAYOUTS:
				return ((InternalEList<?>)getGraphlayouts()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__TRULES:
				return ((InternalEList<?>)getTRules()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__CRIT_PAIRS:
				return ((InternalEList<?>)getCritPairs()).basicRemove(otherEnd, msgs);
			case TggPackage.TGG__IMPORTED_PKGS:
				return ((InternalEList<?>)getImportedPkgs()).basicRemove(otherEnd, msgs);
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
			case TggPackage.TGG__ANNOTATIONS:
				return getAnnotations();
			case TggPackage.TGG__NAME:
				return getName();
			case TggPackage.TGG__DESCRIPTION:
				return getDescription();
			case TggPackage.TGG__SUB_MODULES:
				return getSubModules();
			case TggPackage.TGG__SUPER_MODULE:
				if (resolve) return getSuperModule();
				return basicGetSuperModule();
			case TggPackage.TGG__IMPORTS:
				return getImports();
			case TggPackage.TGG__UNITS:
				return getUnits();
			case TggPackage.TGG__INSTANCES:
				return getInstances();
			case TggPackage.TGG__SRCROOT:
				if (resolve) return getSrcroot();
				return basicGetSrcroot();
			case TggPackage.TGG__TARROOT:
				if (resolve) return getTarroot();
				return basicGetTarroot();
			case TggPackage.TGG__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TggPackage.TGG__CORRESP:
				if (resolve) return getCorresp();
				return basicGetCorresp();
			case TggPackage.TGG__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TggPackage.TGG__NODELAYOUTS:
				return getNodelayouts();
			case TggPackage.TGG__EDGELAYOUTS:
				return getEdgelayouts();
			case TggPackage.TGG__GRAPHLAYOUTS:
				return getGraphlayouts();
			case TggPackage.TGG__TRULES:
				return getTRules();
			case TggPackage.TGG__CRIT_PAIRS:
				return getCritPairs();
			case TggPackage.TGG__SOURCE_PKGS:
				return getSourcePkgs();
			case TggPackage.TGG__CORRESPONDENCE_PKGS:
				return getCorrespondencePkgs();
			case TggPackage.TGG__TARGET_PKGS:
				return getTargetPkgs();
			case TggPackage.TGG__IMPORTED_PKGS:
				return getImportedPkgs();
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
			case TggPackage.TGG__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TggPackage.TGG__NAME:
				setName((String)newValue);
				return;
			case TggPackage.TGG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TggPackage.TGG__SUB_MODULES:
				getSubModules().clear();
				getSubModules().addAll((Collection<? extends Module>)newValue);
				return;
			case TggPackage.TGG__SUPER_MODULE:
				setSuperModule((Module)newValue);
				return;
			case TggPackage.TGG__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends EPackage>)newValue);
				return;
			case TggPackage.TGG__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case TggPackage.TGG__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Graph>)newValue);
				return;
			case TggPackage.TGG__SRCROOT:
				setSrcroot((EObject)newValue);
				return;
			case TggPackage.TGG__TARROOT:
				setTarroot((EObject)newValue);
				return;
			case TggPackage.TGG__SOURCE:
				setSource((EPackage)newValue);
				return;
			case TggPackage.TGG__CORRESP:
				setCorresp((EPackage)newValue);
				return;
			case TggPackage.TGG__TARGET:
				setTarget((EPackage)newValue);
				return;
			case TggPackage.TGG__NODELAYOUTS:
				getNodelayouts().clear();
				getNodelayouts().addAll((Collection<? extends NodeLayout>)newValue);
				return;
			case TggPackage.TGG__EDGELAYOUTS:
				getEdgelayouts().clear();
				getEdgelayouts().addAll((Collection<? extends EdgeLayout>)newValue);
				return;
			case TggPackage.TGG__GRAPHLAYOUTS:
				getGraphlayouts().clear();
				getGraphlayouts().addAll((Collection<? extends GraphLayout>)newValue);
				return;
			case TggPackage.TGG__TRULES:
				getTRules().clear();
				getTRules().addAll((Collection<? extends TRule>)newValue);
				return;
			case TggPackage.TGG__CRIT_PAIRS:
				getCritPairs().clear();
				getCritPairs().addAll((Collection<? extends CritPair>)newValue);
				return;
			case TggPackage.TGG__SOURCE_PKGS:
				getSourcePkgs().clear();
				getSourcePkgs().addAll((Collection<? extends EPackage>)newValue);
				return;
			case TggPackage.TGG__CORRESPONDENCE_PKGS:
				getCorrespondencePkgs().clear();
				getCorrespondencePkgs().addAll((Collection<? extends EPackage>)newValue);
				return;
			case TggPackage.TGG__TARGET_PKGS:
				getTargetPkgs().clear();
				getTargetPkgs().addAll((Collection<? extends EPackage>)newValue);
				return;
			case TggPackage.TGG__IMPORTED_PKGS:
				getImportedPkgs().clear();
				getImportedPkgs().addAll((Collection<? extends ImportedPackage>)newValue);
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
			case TggPackage.TGG__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TggPackage.TGG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TggPackage.TGG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TggPackage.TGG__SUB_MODULES:
				getSubModules().clear();
				return;
			case TggPackage.TGG__SUPER_MODULE:
				setSuperModule((Module)null);
				return;
			case TggPackage.TGG__IMPORTS:
				getImports().clear();
				return;
			case TggPackage.TGG__UNITS:
				getUnits().clear();
				return;
			case TggPackage.TGG__INSTANCES:
				getInstances().clear();
				return;
			case TggPackage.TGG__SRCROOT:
				setSrcroot((EObject)null);
				return;
			case TggPackage.TGG__TARROOT:
				setTarroot((EObject)null);
				return;
			case TggPackage.TGG__SOURCE:
				setSource((EPackage)null);
				return;
			case TggPackage.TGG__CORRESP:
				setCorresp((EPackage)null);
				return;
			case TggPackage.TGG__TARGET:
				setTarget((EPackage)null);
				return;
			case TggPackage.TGG__NODELAYOUTS:
				getNodelayouts().clear();
				return;
			case TggPackage.TGG__EDGELAYOUTS:
				getEdgelayouts().clear();
				return;
			case TggPackage.TGG__GRAPHLAYOUTS:
				getGraphlayouts().clear();
				return;
			case TggPackage.TGG__TRULES:
				getTRules().clear();
				return;
			case TggPackage.TGG__CRIT_PAIRS:
				getCritPairs().clear();
				return;
			case TggPackage.TGG__SOURCE_PKGS:
				getSourcePkgs().clear();
				return;
			case TggPackage.TGG__CORRESPONDENCE_PKGS:
				getCorrespondencePkgs().clear();
				return;
			case TggPackage.TGG__TARGET_PKGS:
				getTargetPkgs().clear();
				return;
			case TggPackage.TGG__IMPORTED_PKGS:
				getImportedPkgs().clear();
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
			case TggPackage.TGG__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TggPackage.TGG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TggPackage.TGG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TggPackage.TGG__SUB_MODULES:
				return subModules != null && !subModules.isEmpty();
			case TggPackage.TGG__SUPER_MODULE:
				return basicGetSuperModule() != null;
			case TggPackage.TGG__IMPORTS:
				return imports != null && !imports.isEmpty();
			case TggPackage.TGG__UNITS:
				return units != null && !units.isEmpty();
			case TggPackage.TGG__INSTANCES:
				return instances != null && !instances.isEmpty();
			case TggPackage.TGG__SRCROOT:
				return eVirtualGet(TggPackage.TGG__SRCROOT) != null;
			case TggPackage.TGG__TARROOT:
				return eVirtualGet(TggPackage.TGG__TARROOT) != null;
			case TggPackage.TGG__SOURCE:
				return eVirtualGet(TggPackage.TGG__SOURCE) != null;
			case TggPackage.TGG__CORRESP:
				return eVirtualGet(TggPackage.TGG__CORRESP) != null;
			case TggPackage.TGG__TARGET:
				return eVirtualGet(TggPackage.TGG__TARGET) != null;
			case TggPackage.TGG__NODELAYOUTS:
				EList<NodeLayout> nodelayouts = (EList<NodeLayout>)eVirtualGet(TggPackage.TGG__NODELAYOUTS);
				return nodelayouts != null && !nodelayouts.isEmpty();
			case TggPackage.TGG__EDGELAYOUTS:
				EList<EdgeLayout> edgelayouts = (EList<EdgeLayout>)eVirtualGet(TggPackage.TGG__EDGELAYOUTS);
				return edgelayouts != null && !edgelayouts.isEmpty();
			case TggPackage.TGG__GRAPHLAYOUTS:
				EList<GraphLayout> graphlayouts = (EList<GraphLayout>)eVirtualGet(TggPackage.TGG__GRAPHLAYOUTS);
				return graphlayouts != null && !graphlayouts.isEmpty();
			case TggPackage.TGG__TRULES:
				EList<TRule> tRules = (EList<TRule>)eVirtualGet(TggPackage.TGG__TRULES);
				return tRules != null && !tRules.isEmpty();
			case TggPackage.TGG__CRIT_PAIRS:
				EList<CritPair> critPairs = (EList<CritPair>)eVirtualGet(TggPackage.TGG__CRIT_PAIRS);
				return critPairs != null && !critPairs.isEmpty();
			case TggPackage.TGG__SOURCE_PKGS:
				EList<EPackage> sourcePkgs = (EList<EPackage>)eVirtualGet(TggPackage.TGG__SOURCE_PKGS);
				return sourcePkgs != null && !sourcePkgs.isEmpty();
			case TggPackage.TGG__CORRESPONDENCE_PKGS:
				EList<EPackage> correspondencePkgs = (EList<EPackage>)eVirtualGet(TggPackage.TGG__CORRESPONDENCE_PKGS);
				return correspondencePkgs != null && !correspondencePkgs.isEmpty();
			case TggPackage.TGG__TARGET_PKGS:
				EList<EPackage> targetPkgs = (EList<EPackage>)eVirtualGet(TggPackage.TGG__TARGET_PKGS);
				return targetPkgs != null && !targetPkgs.isEmpty();
			case TggPackage.TGG__IMPORTED_PKGS:
				EList<ImportedPackage> importedPkgs = (EList<ImportedPackage>)eVirtualGet(TggPackage.TGG__IMPORTED_PKGS);
				return importedPkgs != null && !importedPkgs.isEmpty();
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

} //TGGImpl
