/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tgg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tgg.TGG#getSrcroot <em>Srcroot</em>}</li>
 *   <li>{@link tgg.TGG#getTarroot <em>Tarroot</em>}</li>
 *   <li>{@link tgg.TGG#getSource <em>Source</em>}</li>
 *   <li>{@link tgg.TGG#getCorresp <em>Corresp</em>}</li>
 *   <li>{@link tgg.TGG#getTarget <em>Target</em>}</li>
 *   <li>{@link tgg.TGG#getNodelayouts <em>Nodelayouts</em>}</li>
 *   <li>{@link tgg.TGG#getEdgelayouts <em>Edgelayouts</em>}</li>
 *   <li>{@link tgg.TGG#getGraphlayouts <em>Graphlayouts</em>}</li>
 *   <li>{@link tgg.TGG#getTRules <em>TRules</em>}</li>
 * </ul>
 * </p>
 *
 * @see tgg.TGGPackage#getTGG()
 * @model
 * @generated
 */
public interface TGG extends EObject {
	/**
	 * Returns the value of the '<em><b>Srcroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srcroot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srcroot</em>' reference.
	 * @see #setSrcroot(EObject)
	 * @see tgg.TGGPackage#getTGG_Srcroot()
	 * @model
	 * @generated
	 */
	EObject getSrcroot();

	/**
	 * Sets the value of the '{@link tgg.TGG#getSrcroot <em>Srcroot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srcroot</em>' reference.
	 * @see #getSrcroot()
	 * @generated
	 */
	void setSrcroot(EObject value);

	/**
	 * Returns the value of the '<em><b>Tarroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarroot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarroot</em>' reference.
	 * @see #setTarroot(EObject)
	 * @see tgg.TGGPackage#getTGG_Tarroot()
	 * @model
	 * @generated
	 */
	EObject getTarroot();

	/**
	 * Sets the value of the '{@link tgg.TGG#getTarroot <em>Tarroot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarroot</em>' reference.
	 * @see #getTarroot()
	 * @generated
	 */
	void setTarroot(EObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EPackage)
	 * @see tgg.TGGPackage#getTGG_Source()
	 * @model
	 * @generated
	 */
	EPackage getSource();

	/**
	 * Sets the value of the '{@link tgg.TGG#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EPackage value);

	/**
	 * Returns the value of the '<em><b>Corresp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresp</em>' reference.
	 * @see #setCorresp(EPackage)
	 * @see tgg.TGGPackage#getTGG_Corresp()
	 * @model
	 * @generated
	 */
	EPackage getCorresp();

	/**
	 * Sets the value of the '{@link tgg.TGG#getCorresp <em>Corresp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresp</em>' reference.
	 * @see #getCorresp()
	 * @generated
	 */
	void setCorresp(EPackage value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EPackage)
	 * @see tgg.TGGPackage#getTGG_Target()
	 * @model
	 * @generated
	 */
	EPackage getTarget();

	/**
	 * Sets the value of the '{@link tgg.TGG#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EPackage value);

	/**
	 * Returns the value of the '<em><b>Nodelayouts</b></em>' containment reference list.
	 * The list contents are of type {@link tgg.NodeLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodelayouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodelayouts</em>' containment reference list.
	 * @see tgg.TGGPackage#getTGG_Nodelayouts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeLayout> getNodelayouts();

	/**
	 * Returns the value of the '<em><b>Edgelayouts</b></em>' containment reference list.
	 * The list contents are of type {@link tgg.EdgeLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edgelayouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edgelayouts</em>' containment reference list.
	 * @see tgg.TGGPackage#getTGG_Edgelayouts()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeLayout> getEdgelayouts();

	/**
	 * Returns the value of the '<em><b>Graphlayouts</b></em>' containment reference list.
	 * The list contents are of type {@link tgg.GraphLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphlayouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphlayouts</em>' containment reference list.
	 * @see tgg.TGGPackage#getTGG_Graphlayouts()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphLayout> getGraphlayouts();

	/**
	 * Returns the value of the '<em><b>TRules</b></em>' containment reference list.
	 * The list contents are of type {@link tgg.TRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TRules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TRules</em>' containment reference list.
	 * @see tgg.TGGPackage#getTGG_TRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRule> getTRules();

} // TGG