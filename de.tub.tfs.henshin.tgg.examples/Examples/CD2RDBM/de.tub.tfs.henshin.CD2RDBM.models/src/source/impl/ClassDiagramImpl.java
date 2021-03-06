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
/**
 */
package source.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import source.Association;
import source.ClassDiagram;
import source.PrimitiveDataType;
import source.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link source.impl.ClassDiagramImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link source.impl.ClassDiagramImpl#getAss <em>Ass</em>}</li>
 *   <li>{@link source.impl.ClassDiagramImpl#getPtypes <em>Ptypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDiagramImpl extends MinimalEObjectImpl.Container implements ClassDiagram {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<source.Class> class_;

	/**
	 * The cached value of the '{@link #getAss() <em>Ass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAss()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> ass;

	/**
	 * The cached value of the '{@link #getPtypes() <em>Ptypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveDataType> ptypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<source.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<source.Class>(source.Class.class, this, SourcePackage.CLASS_DIAGRAM__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAss() {
		if (ass == null) {
			ass = new EObjectContainmentEList<Association>(Association.class, this, SourcePackage.CLASS_DIAGRAM__ASS);
		}
		return ass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveDataType> getPtypes() {
		if (ptypes == null) {
			ptypes = new EObjectContainmentEList<PrimitiveDataType>(PrimitiveDataType.class, this, SourcePackage.CLASS_DIAGRAM__PTYPES);
		}
		return ptypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.CLASS_DIAGRAM__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case SourcePackage.CLASS_DIAGRAM__ASS:
				return ((InternalEList<?>)getAss()).basicRemove(otherEnd, msgs);
			case SourcePackage.CLASS_DIAGRAM__PTYPES:
				return ((InternalEList<?>)getPtypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourcePackage.CLASS_DIAGRAM__CLASS:
				return getClass_();
			case SourcePackage.CLASS_DIAGRAM__ASS:
				return getAss();
			case SourcePackage.CLASS_DIAGRAM__PTYPES:
				return getPtypes();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case SourcePackage.CLASS_DIAGRAM__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends source.Class>)newValue);
				return;
			case SourcePackage.CLASS_DIAGRAM__ASS:
				getAss().clear();
				getAss().addAll((Collection<? extends Association>)newValue);
				return;
			case SourcePackage.CLASS_DIAGRAM__PTYPES:
				getPtypes().clear();
				getPtypes().addAll((Collection<? extends PrimitiveDataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SourcePackage.CLASS_DIAGRAM__CLASS:
				getClass_().clear();
				return;
			case SourcePackage.CLASS_DIAGRAM__ASS:
				getAss().clear();
				return;
			case SourcePackage.CLASS_DIAGRAM__PTYPES:
				getPtypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SourcePackage.CLASS_DIAGRAM__CLASS:
				return class_ != null && !class_.isEmpty();
			case SourcePackage.CLASS_DIAGRAM__ASS:
				return ass != null && !ass.isEmpty();
			case SourcePackage.CLASS_DIAGRAM__PTYPES:
				return ptypes != null && !ptypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassDiagramImpl
