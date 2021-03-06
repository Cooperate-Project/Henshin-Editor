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
package de.tub.tfs.henshin.tgg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.henshin.model.HenshinPackage;

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
 * @see de.tub.tfs.henshin.tgg.TggFactory
 * @model kind="package"
 * @generated
 */
public interface TggPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tgg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tgg.tu-berlin.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tgg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TggPackage eINSTANCE = de.tub.tfs.henshin.tgg.impl.TggPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TGGImpl <em>TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TGGImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTGG()
	 * @generated
	 */
	int TGG = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__ANNOTATIONS = HenshinPackage.MODULE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__NAME = HenshinPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__DESCRIPTION = HenshinPackage.MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sub Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__SUB_MODULES = HenshinPackage.MODULE__SUB_MODULES;

	/**
	 * The feature id for the '<em><b>Super Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__SUPER_MODULE = HenshinPackage.MODULE__SUPER_MODULE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__IMPORTS = HenshinPackage.MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__UNITS = HenshinPackage.MODULE__UNITS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__INSTANCES = HenshinPackage.MODULE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Null Value Matching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TGG__NULL_VALUE_MATCHING = HenshinPackage.MODULE__NULL_VALUE_MATCHING;

	/**
	 * The feature id for the '<em><b>Srcroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__SRCROOT = HenshinPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tarroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__TARROOT = HenshinPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__SOURCE = HenshinPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Corresp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__CORRESP = HenshinPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__TARGET = HenshinPackage.MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nodelayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__NODELAYOUTS = HenshinPackage.MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Edgelayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__EDGELAYOUTS = HenshinPackage.MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Graphlayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__GRAPHLAYOUTS = HenshinPackage.MODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>TRules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__TRULES = HenshinPackage.MODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Crit Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__CRIT_PAIRS = HenshinPackage.MODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Source Pkgs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__SOURCE_PKGS = HenshinPackage.MODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Correspondence Pkgs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__CORRESPONDENCE_PKGS = HenshinPackage.MODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Pkgs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__TARGET_PKGS = HenshinPackage.MODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Imported Pkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG__IMPORTED_PKGS = HenshinPackage.MODULE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_FEATURE_COUNT = HenshinPackage.MODULE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl <em>Node Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getNodeLayout()
	 * @generated
	 */
	int NODE_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__Y = 1;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__HIDE = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__NODE = 3;

	/**
	 * The feature id for the '<em><b>Lhsnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__LHSNODE = 4;

	/**
	 * The feature id for the '<em><b>Attribute Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__ATTRIBUTE_LAYOUTS = 5;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__NEW = 6;

	/**
	 * The feature id for the '<em><b>Rhs Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__RHS_TRANSLATED = 7;

	/**
	 * The feature id for the '<em><b>Lhs Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__LHS_TRANSLATED = 8;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT__CRITICAL = 9;

	/**
	 * The number of structural features of the '<em>Node Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LAYOUT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl <em>Attribute Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getAttributeLayout()
	 * @generated
	 */
	int ATTRIBUTE_LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT__NEW = 0;

	/**
	 * The feature id for the '<em><b>Lhsattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT__LHSATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Rhsattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT__RHSATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl <em>Edge Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getEdgeLayout()
	 * @generated
	 */
	int EDGE_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT__NEW = 0;

	/**
	 * The feature id for the '<em><b>Lhsedge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT__LHSEDGE = 1;

	/**
	 * The feature id for the '<em><b>Rhsedge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT__RHSEDGE = 2;

	/**
	 * The feature id for the '<em><b>Rhs Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT__RHS_TRANSLATED = 3;

	/**
	 * The feature id for the '<em><b>Lhs Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT__LHS_TRANSLATED = 4;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT__CRITICAL = 5;

	/**
	 * The number of structural features of the '<em>Edge Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_LAYOUT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl <em>Graph Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getGraphLayout()
	 * @generated
	 */
	int GRAPH_LAYOUT = 4;

	/**
	 * The feature id for the '<em><b>Divider X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_LAYOUT__DIVIDER_X = 0;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_LAYOUT__MAX_Y = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_LAYOUT__GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Is SC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_LAYOUT__IS_SC = 3;

	/**
	 * The number of structural features of the '<em>Graph Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TRuleImpl <em>TRule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TRuleImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTRule()
	 * @generated
	 */
	int TRULE = 5;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE__RULE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>TRule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl <em>Crit Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.CritPairImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getCritPair()
	 * @generated
	 */
	int CRIT_PAIR = 6;

	/**
	 * The feature id for the '<em><b>Overlapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__OVERLAPPING = 0;

	/**
	 * The feature id for the '<em><b>Rule1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__RULE1 = 1;

	/**
	 * The feature id for the '<em><b>Rule2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__RULE2 = 2;

	/**
	 * The feature id for the '<em><b>Mappings Over To Rule1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__MAPPINGS_OVER_TO_RULE1 = 3;

	/**
	 * The feature id for the '<em><b>Mappings Over To Rule2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__MAPPINGS_OVER_TO_RULE2 = 4;

	/**
	 * The feature id for the '<em><b>Mappings Rule1 To Rule2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2 = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR__NAME = 6;

	/**
	 * The number of structural features of the '<em>Crit Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIT_PAIR_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getImportedPackage()
	 * @generated
	 */
	int IMPORTED_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Load With Default Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TripleGraphImpl <em>Triple Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TripleGraphImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTripleGraph()
	 * @generated
	 */
	int TRIPLE_GRAPH = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__ANNOTATIONS = HenshinPackage.GRAPH__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__NAME = HenshinPackage.GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__DESCRIPTION = HenshinPackage.GRAPH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__NODES = HenshinPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__EDGES = HenshinPackage.GRAPH__EDGES;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__FORMULA = HenshinPackage.GRAPH__FORMULA;

	/**
	 * The feature id for the '<em><b>Divider SC X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__DIVIDER_SC_X = HenshinPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Divider CT X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__DIVIDER_CT_X = HenshinPackage.GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Divider Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__DIVIDER_MAX_Y = HenshinPackage.GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Divider YOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__DIVIDER_YOFFSET = HenshinPackage.GRAPH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Triple Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH_FEATURE_COUNT = HenshinPackage.GRAPH_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TNodeImpl <em>TNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TNodeImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTNode()
	 * @generated
	 */
	int TNODE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__ANNOTATIONS = HenshinPackage.NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__NAME = HenshinPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__DESCRIPTION = HenshinPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__ACTION = HenshinPackage.NODE__ACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__TYPE = HenshinPackage.NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__ATTRIBUTES = HenshinPackage.NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__GRAPH = HenshinPackage.NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__INCOMING = HenshinPackage.NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__OUTGOING = HenshinPackage.NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__X = HenshinPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__Y = HenshinPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__COMPONENT = HenshinPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Marker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE__MARKER_TYPE = HenshinPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_FEATURE_COUNT = HenshinPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TGGRuleImpl <em>TGG Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TGGRuleImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTGGRule()
	 * @generated
	 */
	int TGG_RULE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__ANNOTATIONS = HenshinPackage.RULE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__NAME = HenshinPackage.RULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__DESCRIPTION = HenshinPackage.RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__PARAMETERS = HenshinPackage.RULE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__PARAMETER_MAPPINGS = HenshinPackage.RULE__PARAMETER_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__ACTIVATED = HenshinPackage.RULE__ACTIVATED;

	/**
	 * The feature id for the '<em><b>Is Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
//	int TGG_RULE__IS_USED = HenshinPackage.RULE__IS_USED;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__LHS = HenshinPackage.RULE__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__RHS = HenshinPackage.RULE__RHS;

	/**
	 * The feature id for the '<em><b>Attribute Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__ATTRIBUTE_CONDITIONS = HenshinPackage.RULE__ATTRIBUTE_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__MAPPINGS = HenshinPackage.RULE__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Check Dangling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__CHECK_DANGLING = HenshinPackage.RULE__CHECK_DANGLING;

	/**
	 * The feature id for the '<em><b>Injective Matching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__INJECTIVE_MATCHING = HenshinPackage.RULE__INJECTIVE_MATCHING;

	/**
	 * The feature id for the '<em><b>Multi Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__MULTI_RULES = HenshinPackage.RULE__MULTI_RULES;

	/**
	 * The feature id for the '<em><b>Multi Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__MULTI_MAPPINGS = HenshinPackage.RULE__MULTI_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Java Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__JAVA_IMPORTS = HenshinPackage.RULE__JAVA_IMPORTS;

	/**
	 * The feature id for the '<em><b>Is Marked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__IS_MARKED = HenshinPackage.RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manual Matching Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__MANUAL_MATCHING_ORDER = HenshinPackage.RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Marker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE__MARKER_TYPE = HenshinPackage.RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TGG Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_RULE_FEATURE_COUNT = HenshinPackage.RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TEdgeImpl <em>TEdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TEdgeImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTEdge()
	 * @generated
	 */
	int TEDGE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__ANNOTATIONS = HenshinPackage.EDGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__ACTION = HenshinPackage.EDGE__ACTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__SOURCE = HenshinPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__TARGET = HenshinPackage.EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__TYPE = HenshinPackage.EDGE__TYPE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__GRAPH = HenshinPackage.EDGE__GRAPH;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__INDEX = HenshinPackage.EDGE__INDEX;

	/**
	 * The feature id for the '<em><b>Index Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__INDEX_CONSTANT = HenshinPackage.EDGE__INDEX_CONSTANT;

	/**
	 * The feature id for the '<em><b>Marker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE__MARKER_TYPE = HenshinPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDGE_FEATURE_COUNT = HenshinPackage.EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.impl.TAttributeImpl <em>TAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.impl.TAttributeImpl
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTAttribute()
	 * @generated
	 */
	int TATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__ANNOTATIONS = HenshinPackage.ATTRIBUTE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__ACTION = HenshinPackage.ATTRIBUTE__ACTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__TYPE = HenshinPackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__VALUE = HenshinPackage.ATTRIBUTE__VALUE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__NODE = HenshinPackage.ATTRIBUTE__NODE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__CONSTANT = HenshinPackage.ATTRIBUTE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__NULL = HenshinPackage.ATTRIBUTE__NULL;

	/**
	 * The feature id for the '<em><b>Marker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE__MARKER_TYPE = HenshinPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_FEATURE_COUNT = HenshinPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.tub.tfs.henshin.tgg.TripleComponent <em>Triple Component</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tub.tfs.henshin.tgg.TripleComponent
	 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTripleComponent()
	 * @generated
	 */
	int TRIPLE_COMPONENT = 13;


	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TGG <em>TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGG</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG
	 * @generated
	 */
	EClass getTGG();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.TGG#getSrcroot <em>Srcroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srcroot</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getSrcroot()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Srcroot();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.TGG#getTarroot <em>Tarroot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tarroot</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getTarroot()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Tarroot();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.TGG#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getSource()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Source();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.TGG#getCorresp <em>Corresp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresp</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getCorresp()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Corresp();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.TGG#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getTarget()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.TGG#getNodelayouts <em>Nodelayouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodelayouts</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getNodelayouts()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Nodelayouts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.TGG#getEdgelayouts <em>Edgelayouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edgelayouts</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getEdgelayouts()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Edgelayouts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.TGG#getGraphlayouts <em>Graphlayouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphlayouts</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getGraphlayouts()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_Graphlayouts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.TGG#getTRules <em>TRules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TRules</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getTRules()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_TRules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.TGG#getCritPairs <em>Crit Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crit Pairs</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getCritPairs()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_CritPairs();

	/**
	 * Returns the meta object for the reference list '{@link de.tub.tfs.henshin.tgg.TGG#getSourcePkgs <em>Source Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Pkgs</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getSourcePkgs()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_SourcePkgs();

	/**
	 * Returns the meta object for the reference list '{@link de.tub.tfs.henshin.tgg.TGG#getCorrespondencePkgs <em>Correspondence Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correspondence Pkgs</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getCorrespondencePkgs()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_CorrespondencePkgs();

	/**
	 * Returns the meta object for the reference list '{@link de.tub.tfs.henshin.tgg.TGG#getTargetPkgs <em>Target Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Pkgs</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getTargetPkgs()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_TargetPkgs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.TGG#getImportedPkgs <em>Imported Pkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Pkgs</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGG#getImportedPkgs()
	 * @see #getTGG()
	 * @generated
	 */
	EReference getTGG_ImportedPkgs();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.NodeLayout <em>Node Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Layout</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout
	 * @generated
	 */
	EClass getNodeLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getX()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_X();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getY()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#isHide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#isHide()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_Hide();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.NodeLayout#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getNode()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EReference getNodeLayout_Node();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.NodeLayout#getLhsnode <em>Lhsnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhsnode</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getLhsnode()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EReference getNodeLayout_Lhsnode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.NodeLayout#getAttributeLayouts <em>Attribute Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Layouts</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getAttributeLayouts()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EReference getNodeLayout_AttributeLayouts();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#isNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#isNew()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_New();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#getRhsTranslated <em>Rhs Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs Translated</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getRhsTranslated()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_RhsTranslated();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#getLhsTranslated <em>Lhs Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lhs Translated</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#getLhsTranslated()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_LhsTranslated();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.NodeLayout#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see de.tub.tfs.henshin.tgg.NodeLayout#isCritical()
	 * @see #getNodeLayout()
	 * @generated
	 */
	EAttribute getNodeLayout_Critical();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.AttributeLayout <em>Attribute Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Layout</em>'.
	 * @see de.tub.tfs.henshin.tgg.AttributeLayout
	 * @generated
	 */
	EClass getAttributeLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.AttributeLayout#isNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see de.tub.tfs.henshin.tgg.AttributeLayout#isNew()
	 * @see #getAttributeLayout()
	 * @generated
	 */
	EAttribute getAttributeLayout_New();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.AttributeLayout#getLhsattribute <em>Lhsattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhsattribute</em>'.
	 * @see de.tub.tfs.henshin.tgg.AttributeLayout#getLhsattribute()
	 * @see #getAttributeLayout()
	 * @generated
	 */
	EReference getAttributeLayout_Lhsattribute();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.AttributeLayout#getRhsattribute <em>Rhsattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhsattribute</em>'.
	 * @see de.tub.tfs.henshin.tgg.AttributeLayout#getRhsattribute()
	 * @see #getAttributeLayout()
	 * @generated
	 */
	EReference getAttributeLayout_Rhsattribute();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.EdgeLayout <em>Edge Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Layout</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout
	 * @generated
	 */
	EClass getEdgeLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.EdgeLayout#isNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout#isNew()
	 * @see #getEdgeLayout()
	 * @generated
	 */
	EAttribute getEdgeLayout_New();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.EdgeLayout#getLhsedge <em>Lhsedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhsedge</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout#getLhsedge()
	 * @see #getEdgeLayout()
	 * @generated
	 */
	EReference getEdgeLayout_Lhsedge();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.EdgeLayout#getRhsedge <em>Rhsedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhsedge</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout#getRhsedge()
	 * @see #getEdgeLayout()
	 * @generated
	 */
	EReference getEdgeLayout_Rhsedge();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.EdgeLayout#getRhsTranslated <em>Rhs Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs Translated</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout#getRhsTranslated()
	 * @see #getEdgeLayout()
	 * @generated
	 */
	EAttribute getEdgeLayout_RhsTranslated();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.EdgeLayout#getLhsTranslated <em>Lhs Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lhs Translated</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout#getLhsTranslated()
	 * @see #getEdgeLayout()
	 * @generated
	 */
	EAttribute getEdgeLayout_LhsTranslated();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.EdgeLayout#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see de.tub.tfs.henshin.tgg.EdgeLayout#isCritical()
	 * @see #getEdgeLayout()
	 * @generated
	 */
	EAttribute getEdgeLayout_Critical();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.GraphLayout <em>Graph Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Layout</em>'.
	 * @see de.tub.tfs.henshin.tgg.GraphLayout
	 * @generated
	 */
	EClass getGraphLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.GraphLayout#getDividerX <em>Divider X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divider X</em>'.
	 * @see de.tub.tfs.henshin.tgg.GraphLayout#getDividerX()
	 * @see #getGraphLayout()
	 * @generated
	 */
	EAttribute getGraphLayout_DividerX();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.GraphLayout#getMaxY <em>Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Y</em>'.
	 * @see de.tub.tfs.henshin.tgg.GraphLayout#getMaxY()
	 * @see #getGraphLayout()
	 * @generated
	 */
	EAttribute getGraphLayout_MaxY();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.GraphLayout#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see de.tub.tfs.henshin.tgg.GraphLayout#getGraph()
	 * @see #getGraphLayout()
	 * @generated
	 */
	EReference getGraphLayout_Graph();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.GraphLayout#isIsSC <em>Is SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is SC</em>'.
	 * @see de.tub.tfs.henshin.tgg.GraphLayout#isIsSC()
	 * @see #getGraphLayout()
	 * @generated
	 */
	EAttribute getGraphLayout_IsSC();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TRule <em>TRule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRule</em>'.
	 * @see de.tub.tfs.henshin.tgg.TRule
	 * @generated
	 */
	EClass getTRule();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.TRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see de.tub.tfs.henshin.tgg.TRule#getRule()
	 * @see #getTRule()
	 * @generated
	 */
	EReference getTRule_Rule();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tub.tfs.henshin.tgg.TRule#getType()
	 * @see #getTRule()
	 * @generated
	 */
	EAttribute getTRule_Type();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.CritPair <em>Crit Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crit Pair</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair
	 * @generated
	 */
	EClass getCritPair();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.CritPair#getOverlapping <em>Overlapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overlapping</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getOverlapping()
	 * @see #getCritPair()
	 * @generated
	 */
	EReference getCritPair_Overlapping();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.CritPair#getRule1 <em>Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule1</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getRule1()
	 * @see #getCritPair()
	 * @generated
	 */
	EReference getCritPair_Rule1();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.CritPair#getRule2 <em>Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule2</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getRule2()
	 * @see #getCritPair()
	 * @generated
	 */
	EReference getCritPair_Rule2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.CritPair#getMappingsOverToRule1 <em>Mappings Over To Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings Over To Rule1</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getMappingsOverToRule1()
	 * @see #getCritPair()
	 * @generated
	 */
	EReference getCritPair_MappingsOverToRule1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.CritPair#getMappingsOverToRule2 <em>Mappings Over To Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings Over To Rule2</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getMappingsOverToRule2()
	 * @see #getCritPair()
	 * @generated
	 */
	EReference getCritPair_MappingsOverToRule2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tub.tfs.henshin.tgg.CritPair#getMappingsRule1ToRule2 <em>Mappings Rule1 To Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings Rule1 To Rule2</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getMappingsRule1ToRule2()
	 * @see #getCritPair()
	 * @generated
	 */
	EReference getCritPair_MappingsRule1ToRule2();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.CritPair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tub.tfs.henshin.tgg.CritPair#getName()
	 * @see #getCritPair()
	 * @generated
	 */
	EAttribute getCritPair_Name();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.ImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Package</em>'.
	 * @see de.tub.tfs.henshin.tgg.ImportedPackage
	 * @generated
	 */
	EClass getImportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.ImportedPackage#isLoadWithDefaultValues <em>Load With Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load With Default Values</em>'.
	 * @see de.tub.tfs.henshin.tgg.ImportedPackage#isLoadWithDefaultValues()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_LoadWithDefaultValues();

	/**
	 * Returns the meta object for the reference '{@link de.tub.tfs.henshin.tgg.ImportedPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see de.tub.tfs.henshin.tgg.ImportedPackage#getPackage()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EReference getImportedPackage_Package();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.ImportedPackage#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see de.tub.tfs.henshin.tgg.ImportedPackage#getComponent()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_Component();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TripleGraph <em>Triple Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triple Graph</em>'.
	 * @see de.tub.tfs.henshin.tgg.TripleGraph
	 * @generated
	 */
	EClass getTripleGraph();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TripleGraph#getDividerSC_X <em>Divider SC X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divider SC X</em>'.
	 * @see de.tub.tfs.henshin.tgg.TripleGraph#getDividerSC_X()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EAttribute getTripleGraph_DividerSC_X();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TripleGraph#getDividerCT_X <em>Divider CT X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divider CT X</em>'.
	 * @see de.tub.tfs.henshin.tgg.TripleGraph#getDividerCT_X()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EAttribute getTripleGraph_DividerCT_X();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TripleGraph#getDividerMaxY <em>Divider Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divider Max Y</em>'.
	 * @see de.tub.tfs.henshin.tgg.TripleGraph#getDividerMaxY()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EAttribute getTripleGraph_DividerMaxY();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TripleGraph#getDividerYOffset <em>Divider YOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Divider YOffset</em>'.
	 * @see de.tub.tfs.henshin.tgg.TripleGraph#getDividerYOffset()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EAttribute getTripleGraph_DividerYOffset();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TNode <em>TNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode</em>'.
	 * @see de.tub.tfs.henshin.tgg.TNode
	 * @generated
	 */
	EClass getTNode();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TNode#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.tub.tfs.henshin.tgg.TNode#getX()
	 * @see #getTNode()
	 * @generated
	 */
	EAttribute getTNode_X();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TNode#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.tub.tfs.henshin.tgg.TNode#getY()
	 * @see #getTNode()
	 * @generated
	 */
	EAttribute getTNode_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TNode#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see de.tub.tfs.henshin.tgg.TNode#getComponent()
	 * @see #getTNode()
	 * @generated
	 */
	EAttribute getTNode_Component();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TNode#getMarkerType <em>Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Type</em>'.
	 * @see de.tub.tfs.henshin.tgg.TNode#getMarkerType()
	 * @see #getTNode()
	 * @generated
	 */
	EAttribute getTNode_MarkerType();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TGGRule <em>TGG Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGG Rule</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGGRule
	 * @generated
	 */
	EClass getTGGRule();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TGGRule#getIsMarked <em>Is Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Marked</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGGRule#getIsMarked()
	 * @see #getTGGRule()
	 * @generated
	 */
	EAttribute getTGGRule_IsMarked();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TGGRule#isManualMatchingOrder <em>Manual Matching Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Matching Order</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGGRule#isManualMatchingOrder()
	 * @see #getTGGRule()
	 * @generated
	 */
	EAttribute getTGGRule_ManualMatchingOrder();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TGGRule#getMarkerType <em>Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Type</em>'.
	 * @see de.tub.tfs.henshin.tgg.TGGRule#getMarkerType()
	 * @see #getTGGRule()
	 * @generated
	 */
	EAttribute getTGGRule_MarkerType();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TEdge <em>TEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEdge</em>'.
	 * @see de.tub.tfs.henshin.tgg.TEdge
	 * @generated
	 */
	EClass getTEdge();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TEdge#getMarkerType <em>Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Type</em>'.
	 * @see de.tub.tfs.henshin.tgg.TEdge#getMarkerType()
	 * @see #getTEdge()
	 * @generated
	 */
	EAttribute getTEdge_MarkerType();

	/**
	 * Returns the meta object for class '{@link de.tub.tfs.henshin.tgg.TAttribute <em>TAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAttribute</em>'.
	 * @see de.tub.tfs.henshin.tgg.TAttribute
	 * @generated
	 */
	EClass getTAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.tub.tfs.henshin.tgg.TAttribute#getMarkerType <em>Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker Type</em>'.
	 * @see de.tub.tfs.henshin.tgg.TAttribute#getMarkerType()
	 * @see #getTAttribute()
	 * @generated
	 */
	EAttribute getTAttribute_MarkerType();

	/**
	 * Returns the meta object for enum '{@link de.tub.tfs.henshin.tgg.TripleComponent <em>Triple Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Triple Component</em>'.
	 * @see de.tub.tfs.henshin.tgg.TripleComponent
	 * @generated
	 */
	EEnum getTripleComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TggFactory getTggFactory();

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
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TGGImpl <em>TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TGGImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTGG()
		 * @generated
		 */
		EClass TGG = eINSTANCE.getTGG();

		/**
		 * The meta object literal for the '<em><b>Srcroot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__SRCROOT = eINSTANCE.getTGG_Srcroot();

		/**
		 * The meta object literal for the '<em><b>Tarroot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__TARROOT = eINSTANCE.getTGG_Tarroot();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__SOURCE = eINSTANCE.getTGG_Source();

		/**
		 * The meta object literal for the '<em><b>Corresp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__CORRESP = eINSTANCE.getTGG_Corresp();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__TARGET = eINSTANCE.getTGG_Target();

		/**
		 * The meta object literal for the '<em><b>Nodelayouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__NODELAYOUTS = eINSTANCE.getTGG_Nodelayouts();

		/**
		 * The meta object literal for the '<em><b>Edgelayouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__EDGELAYOUTS = eINSTANCE.getTGG_Edgelayouts();

		/**
		 * The meta object literal for the '<em><b>Graphlayouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__GRAPHLAYOUTS = eINSTANCE.getTGG_Graphlayouts();

		/**
		 * The meta object literal for the '<em><b>TRules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__TRULES = eINSTANCE.getTGG_TRules();

		/**
		 * The meta object literal for the '<em><b>Crit Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__CRIT_PAIRS = eINSTANCE.getTGG_CritPairs();

		/**
		 * The meta object literal for the '<em><b>Source Pkgs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__SOURCE_PKGS = eINSTANCE.getTGG_SourcePkgs();

		/**
		 * The meta object literal for the '<em><b>Correspondence Pkgs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__CORRESPONDENCE_PKGS = eINSTANCE.getTGG_CorrespondencePkgs();

		/**
		 * The meta object literal for the '<em><b>Target Pkgs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__TARGET_PKGS = eINSTANCE.getTGG_TargetPkgs();

		/**
		 * The meta object literal for the '<em><b>Imported Pkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGG__IMPORTED_PKGS = eINSTANCE.getTGG_ImportedPkgs();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl <em>Node Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.NodeLayoutImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getNodeLayout()
		 * @generated
		 */
		EClass NODE_LAYOUT = eINSTANCE.getNodeLayout();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__X = eINSTANCE.getNodeLayout_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__Y = eINSTANCE.getNodeLayout_Y();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__HIDE = eINSTANCE.getNodeLayout_Hide();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LAYOUT__NODE = eINSTANCE.getNodeLayout_Node();

		/**
		 * The meta object literal for the '<em><b>Lhsnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LAYOUT__LHSNODE = eINSTANCE.getNodeLayout_Lhsnode();

		/**
		 * The meta object literal for the '<em><b>Attribute Layouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LAYOUT__ATTRIBUTE_LAYOUTS = eINSTANCE.getNodeLayout_AttributeLayouts();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__NEW = eINSTANCE.getNodeLayout_New();

		/**
		 * The meta object literal for the '<em><b>Rhs Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__RHS_TRANSLATED = eINSTANCE.getNodeLayout_RhsTranslated();

		/**
		 * The meta object literal for the '<em><b>Lhs Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__LHS_TRANSLATED = eINSTANCE.getNodeLayout_LhsTranslated();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LAYOUT__CRITICAL = eINSTANCE.getNodeLayout_Critical();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl <em>Attribute Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.AttributeLayoutImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getAttributeLayout()
		 * @generated
		 */
		EClass ATTRIBUTE_LAYOUT = eINSTANCE.getAttributeLayout();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_LAYOUT__NEW = eINSTANCE.getAttributeLayout_New();

		/**
		 * The meta object literal for the '<em><b>Lhsattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LAYOUT__LHSATTRIBUTE = eINSTANCE.getAttributeLayout_Lhsattribute();

		/**
		 * The meta object literal for the '<em><b>Rhsattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LAYOUT__RHSATTRIBUTE = eINSTANCE.getAttributeLayout_Rhsattribute();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl <em>Edge Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.EdgeLayoutImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getEdgeLayout()
		 * @generated
		 */
		EClass EDGE_LAYOUT = eINSTANCE.getEdgeLayout();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_LAYOUT__NEW = eINSTANCE.getEdgeLayout_New();

		/**
		 * The meta object literal for the '<em><b>Lhsedge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_LAYOUT__LHSEDGE = eINSTANCE.getEdgeLayout_Lhsedge();

		/**
		 * The meta object literal for the '<em><b>Rhsedge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_LAYOUT__RHSEDGE = eINSTANCE.getEdgeLayout_Rhsedge();

		/**
		 * The meta object literal for the '<em><b>Rhs Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_LAYOUT__RHS_TRANSLATED = eINSTANCE.getEdgeLayout_RhsTranslated();

		/**
		 * The meta object literal for the '<em><b>Lhs Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_LAYOUT__LHS_TRANSLATED = eINSTANCE.getEdgeLayout_LhsTranslated();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_LAYOUT__CRITICAL = eINSTANCE.getEdgeLayout_Critical();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl <em>Graph Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.GraphLayoutImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getGraphLayout()
		 * @generated
		 */
		EClass GRAPH_LAYOUT = eINSTANCE.getGraphLayout();

		/**
		 * The meta object literal for the '<em><b>Divider X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_LAYOUT__DIVIDER_X = eINSTANCE.getGraphLayout_DividerX();

		/**
		 * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_LAYOUT__MAX_Y = eINSTANCE.getGraphLayout_MaxY();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_LAYOUT__GRAPH = eINSTANCE.getGraphLayout_Graph();

		/**
		 * The meta object literal for the '<em><b>Is SC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_LAYOUT__IS_SC = eINSTANCE.getGraphLayout_IsSC();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TRuleImpl <em>TRule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TRuleImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTRule()
		 * @generated
		 */
		EClass TRULE = eINSTANCE.getTRule();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRULE__RULE = eINSTANCE.getTRule_Rule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRULE__TYPE = eINSTANCE.getTRule_Type();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.CritPairImpl <em>Crit Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.CritPairImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getCritPair()
		 * @generated
		 */
		EClass CRIT_PAIR = eINSTANCE.getCritPair();

		/**
		 * The meta object literal for the '<em><b>Overlapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIT_PAIR__OVERLAPPING = eINSTANCE.getCritPair_Overlapping();

		/**
		 * The meta object literal for the '<em><b>Rule1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIT_PAIR__RULE1 = eINSTANCE.getCritPair_Rule1();

		/**
		 * The meta object literal for the '<em><b>Rule2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIT_PAIR__RULE2 = eINSTANCE.getCritPair_Rule2();

		/**
		 * The meta object literal for the '<em><b>Mappings Over To Rule1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIT_PAIR__MAPPINGS_OVER_TO_RULE1 = eINSTANCE.getCritPair_MappingsOverToRule1();

		/**
		 * The meta object literal for the '<em><b>Mappings Over To Rule2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIT_PAIR__MAPPINGS_OVER_TO_RULE2 = eINSTANCE.getCritPair_MappingsOverToRule2();

		/**
		 * The meta object literal for the '<em><b>Mappings Rule1 To Rule2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIT_PAIR__MAPPINGS_RULE1_TO_RULE2 = eINSTANCE.getCritPair_MappingsRule1ToRule2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRIT_PAIR__NAME = eINSTANCE.getCritPair_Name();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.ImportedPackageImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getImportedPackage()
		 * @generated
		 */
		EClass IMPORTED_PACKAGE = eINSTANCE.getImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Load With Default Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__LOAD_WITH_DEFAULT_VALUES = eINSTANCE.getImportedPackage_LoadWithDefaultValues();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PACKAGE__PACKAGE = eINSTANCE.getImportedPackage_Package();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__COMPONENT = eINSTANCE.getImportedPackage_Component();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TripleGraphImpl <em>Triple Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TripleGraphImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTripleGraph()
		 * @generated
		 */
		EClass TRIPLE_GRAPH = eINSTANCE.getTripleGraph();

		/**
		 * The meta object literal for the '<em><b>Divider SC X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLE_GRAPH__DIVIDER_SC_X = eINSTANCE.getTripleGraph_DividerSC_X();

		/**
		 * The meta object literal for the '<em><b>Divider CT X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLE_GRAPH__DIVIDER_CT_X = eINSTANCE.getTripleGraph_DividerCT_X();

		/**
		 * The meta object literal for the '<em><b>Divider Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLE_GRAPH__DIVIDER_MAX_Y = eINSTANCE.getTripleGraph_DividerMaxY();

		/**
		 * The meta object literal for the '<em><b>Divider YOffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLE_GRAPH__DIVIDER_YOFFSET = eINSTANCE.getTripleGraph_DividerYOffset();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TNodeImpl <em>TNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TNodeImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTNode()
		 * @generated
		 */
		EClass TNODE = eINSTANCE.getTNode();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE__X = eINSTANCE.getTNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE__Y = eINSTANCE.getTNode_Y();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE__COMPONENT = eINSTANCE.getTNode_Component();

		/**
		 * The meta object literal for the '<em><b>Marker Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE__MARKER_TYPE = eINSTANCE.getTNode_MarkerType();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TGGRuleImpl <em>TGG Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TGGRuleImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTGGRule()
		 * @generated
		 */
		EClass TGG_RULE = eINSTANCE.getTGGRule();

		/**
		 * The meta object literal for the '<em><b>Is Marked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGG_RULE__IS_MARKED = eINSTANCE.getTGGRule_IsMarked();

		/**
		 * The meta object literal for the '<em><b>Manual Matching Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGG_RULE__MANUAL_MATCHING_ORDER = eINSTANCE.getTGGRule_ManualMatchingOrder();

		/**
		 * The meta object literal for the '<em><b>Marker Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGG_RULE__MARKER_TYPE = eINSTANCE.getTGGRule_MarkerType();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TEdgeImpl <em>TEdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TEdgeImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTEdge()
		 * @generated
		 */
		EClass TEDGE = eINSTANCE.getTEdge();

		/**
		 * The meta object literal for the '<em><b>Marker Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEDGE__MARKER_TYPE = eINSTANCE.getTEdge_MarkerType();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.impl.TAttributeImpl <em>TAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.impl.TAttributeImpl
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTAttribute()
		 * @generated
		 */
		EClass TATTRIBUTE = eINSTANCE.getTAttribute();

		/**
		 * The meta object literal for the '<em><b>Marker Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATTRIBUTE__MARKER_TYPE = eINSTANCE.getTAttribute_MarkerType();

		/**
		 * The meta object literal for the '{@link de.tub.tfs.henshin.tgg.TripleComponent <em>Triple Component</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tub.tfs.henshin.tgg.TripleComponent
		 * @see de.tub.tfs.henshin.tgg.impl.TggPackageImpl#getTripleComponent()
		 * @generated
		 */
		EEnum TRIPLE_COMPONENT = eINSTANCE.getTripleComponent();

	}

} //TggPackage
