/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package correspondece;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see correspondece.CorrespondeceFactory
 * @model kind="package"
 * @generated
 */
public interface CorrespondecePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "correspondece";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorrespondecePackage eINSTANCE = correspondece.impl.CorrespondecePackageImpl.init();

	/**
	 * The meta object id for the '{@link correspondece.impl.CTImpl <em>CT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondece.impl.CTImpl
	 * @see correspondece.impl.CorrespondecePackageImpl#getCT()
	 * @generated
	 */
	int CT = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT__TABLE = 1;

	/**
	 * The number of structural features of the '<em>CT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link correspondece.impl.AFKImpl <em>AFK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondece.impl.AFKImpl
	 * @see correspondece.impl.CorrespondecePackageImpl#getAFK()
	 * @generated
	 */
	int AFK = 1;

	/**
	 * The feature id for the '<em><b>Ass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFK__ASS = 0;

	/**
	 * The feature id for the '<em><b>Fkey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFK__FKEY = 1;

	/**
	 * The number of structural features of the '<em>AFK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link correspondece.impl.ACImpl <em>AC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see correspondece.impl.ACImpl
	 * @see correspondece.impl.CorrespondecePackageImpl#getAC()
	 * @generated
	 */
	int AC = 2;

	/**
	 * The feature id for the '<em><b>Atr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC__ATR = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC__COL = 1;

	/**
	 * The number of structural features of the '<em>AC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AC_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link correspondece.CT <em>CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CT</em>'.
	 * @see correspondece.CT
	 * @generated
	 */
	EClass getCT();

	/**
	 * Returns the meta object for the reference '{@link correspondece.CT#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see correspondece.CT#getClass_()
	 * @see #getCT()
	 * @generated
	 */
	EReference getCT_Class();

	/**
	 * Returns the meta object for the reference '{@link correspondece.CT#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see correspondece.CT#getTable()
	 * @see #getCT()
	 * @generated
	 */
	EReference getCT_Table();

	/**
	 * Returns the meta object for class '{@link correspondece.AFK <em>AFK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFK</em>'.
	 * @see correspondece.AFK
	 * @generated
	 */
	EClass getAFK();

	/**
	 * Returns the meta object for the reference '{@link correspondece.AFK#getAss <em>Ass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ass</em>'.
	 * @see correspondece.AFK#getAss()
	 * @see #getAFK()
	 * @generated
	 */
	EReference getAFK_Ass();

	/**
	 * Returns the meta object for the reference '{@link correspondece.AFK#getFkey <em>Fkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fkey</em>'.
	 * @see correspondece.AFK#getFkey()
	 * @see #getAFK()
	 * @generated
	 */
	EReference getAFK_Fkey();

	/**
	 * Returns the meta object for class '{@link correspondece.AC <em>AC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AC</em>'.
	 * @see correspondece.AC
	 * @generated
	 */
	EClass getAC();

	/**
	 * Returns the meta object for the reference '{@link correspondece.AC#getAtr <em>Atr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atr</em>'.
	 * @see correspondece.AC#getAtr()
	 * @see #getAC()
	 * @generated
	 */
	EReference getAC_Atr();

	/**
	 * Returns the meta object for the reference '{@link correspondece.AC#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col</em>'.
	 * @see correspondece.AC#getCol()
	 * @see #getAC()
	 * @generated
	 */
	EReference getAC_Col();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CorrespondeceFactory getCorrespondeceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link correspondece.impl.CTImpl <em>CT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondece.impl.CTImpl
		 * @see correspondece.impl.CorrespondecePackageImpl#getCT()
		 * @generated
		 */
		EClass CT = eINSTANCE.getCT();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT__CLASS = eINSTANCE.getCT_Class();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT__TABLE = eINSTANCE.getCT_Table();

		/**
		 * The meta object literal for the '{@link correspondece.impl.AFKImpl <em>AFK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondece.impl.AFKImpl
		 * @see correspondece.impl.CorrespondecePackageImpl#getAFK()
		 * @generated
		 */
		EClass AFK = eINSTANCE.getAFK();

		/**
		 * The meta object literal for the '<em><b>Ass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFK__ASS = eINSTANCE.getAFK_Ass();

		/**
		 * The meta object literal for the '<em><b>Fkey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFK__FKEY = eINSTANCE.getAFK_Fkey();

		/**
		 * The meta object literal for the '{@link correspondece.impl.ACImpl <em>AC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see correspondece.impl.ACImpl
		 * @see correspondece.impl.CorrespondecePackageImpl#getAC()
		 * @generated
		 */
		EClass AC = eINSTANCE.getAC();

		/**
		 * The meta object literal for the '<em><b>Atr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AC__ATR = eINSTANCE.getAC_Atr();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AC__COL = eINSTANCE.getAC_Col();

	}

} //CorrespondecePackage