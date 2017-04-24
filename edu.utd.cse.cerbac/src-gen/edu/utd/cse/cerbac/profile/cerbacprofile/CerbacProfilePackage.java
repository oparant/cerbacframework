/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Cerbac'"
 * @generated
 */
public interface CerbacProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cerbacprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.utd.edu/cse/Cerbac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CerbacProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CerbacProfilePackage eINSTANCE = edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudSecurityAndPrivacyPolicyImpl <em>Cloud Security And Privacy Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudSecurityAndPrivacyPolicyImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCloudSecurityAndPrivacyPolicy()
	 * @generated
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Cloud Security And Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Security And Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SECURITY_AND_PRIVACY_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl <em>Cerbac Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCerbacPolicy()
	 * @generated
	 */
	int CERBAC_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__BASE_CLASS = CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHO = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHERE = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHY = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__HOW = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHEN = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__WHAT = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__ID = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY__ACTION = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Cerbac Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY_FEATURE_COUNT = CLOUD_SECURITY_AND_PRIVACY_POLICY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Cerbac Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERBAC_POLICY_OPERATION_COUNT = CLOUD_SECURITY_AND_PRIVACY_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributesImpl <em>Policy Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributesImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyAttributes()
	 * @generated
	 */
	int POLICY_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTES__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Policy Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoImpl <em>Who</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWho()
	 * @generated
	 */
	int WHO = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO__PRINCIPAL = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Who</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Who</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__ACCESS_POINT = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyImpl <em>Why</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhy()
	 * @generated
	 */
	int WHY = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY__PURPOSE = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Why</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Why</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowImpl <em>How</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getHow()
	 * @generated
	 */
	int HOW = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__DEVICE = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__TIME = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl <em>What</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhat()
	 * @generated
	 */
	int WHAT = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__BASE_CLASS = POLICY_ATTRIBUTES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__RESOURCE = POLICY_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__RESOURCE_DESCRIPTION = POLICY_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_FEATURE_COUNT = POLICY_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_OPERATION_COUNT = POLICY_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudResourceImpl <em>Cloud Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudResourceImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCloudResource()
	 * @generated
	 */
	int CLOUD_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__RESOURCE_ID = 1;

	/**
	 * The number of structural features of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.AuthorizationPolicyImpl <em>Authorization Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.AuthorizationPolicyImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getAuthorizationPolicy()
	 * @generated
	 */
	int AUTHORIZATION_POLICY = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__BASE_CLASS = CERBAC_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHO = CERBAC_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHERE = CERBAC_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHY = CERBAC_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__HOW = CERBAC_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHEN = CERBAC_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__WHAT = CERBAC_POLICY__WHAT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__ID = CERBAC_POLICY__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY__ACTION = CERBAC_POLICY__ACTION;

	/**
	 * The number of structural features of the '<em>Authorization Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_FEATURE_COUNT = CERBAC_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authorization Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_OPERATION_COUNT = CERBAC_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.ObligationPolicyImpl <em>Obligation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.ObligationPolicyImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getObligationPolicy()
	 * @generated
	 */
	int OBLIGATION_POLICY = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__BASE_CLASS = CERBAC_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHO = CERBAC_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHERE = CERBAC_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHY = CERBAC_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__HOW = CERBAC_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHEN = CERBAC_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__WHAT = CERBAC_POLICY__WHAT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__ID = CERBAC_POLICY__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY__ACTION = CERBAC_POLICY__ACTION;

	/**
	 * The number of structural features of the '<em>Obligation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY_FEATURE_COUNT = CERBAC_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Obligation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_POLICY_OPERATION_COUNT = CERBAC_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveAuthorizationImpl <em>Positive Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveAuthorizationImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPositiveAuthorization()
	 * @generated
	 */
	int POSITIVE_AUTHORIZATION = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__BASE_CLASS = AUTHORIZATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHO = AUTHORIZATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHERE = AUTHORIZATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHY = AUTHORIZATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__HOW = AUTHORIZATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHEN = AUTHORIZATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__WHAT = AUTHORIZATION_POLICY__WHAT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__ID = AUTHORIZATION_POLICY__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION__ACTION = AUTHORIZATION_POLICY__ACTION;

	/**
	 * The number of structural features of the '<em>Positive Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION_FEATURE_COUNT = AUTHORIZATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTHORIZATION_OPERATION_COUNT = AUTHORIZATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeAuthorizationImpl <em>Negative Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeAuthorizationImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getNegativeAuthorization()
	 * @generated
	 */
	int NEGATIVE_AUTHORIZATION = 13;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__BASE_CLASS = AUTHORIZATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHO = AUTHORIZATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHERE = AUTHORIZATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHY = AUTHORIZATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__HOW = AUTHORIZATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHEN = AUTHORIZATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__WHAT = AUTHORIZATION_POLICY__WHAT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__ID = AUTHORIZATION_POLICY__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION__ACTION = AUTHORIZATION_POLICY__ACTION;

	/**
	 * The number of structural features of the '<em>Negative Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION_FEATURE_COUNT = AUTHORIZATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTHORIZATION_OPERATION_COUNT = AUTHORIZATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveObligationImpl <em>Positive Obligation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveObligationImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPositiveObligation()
	 * @generated
	 */
	int POSITIVE_OBLIGATION = 14;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__BASE_CLASS = OBLIGATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHO = OBLIGATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHERE = OBLIGATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHY = OBLIGATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__HOW = OBLIGATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHEN = OBLIGATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__WHAT = OBLIGATION_POLICY__WHAT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__ID = OBLIGATION_POLICY__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION__ACTION = OBLIGATION_POLICY__ACTION;

	/**
	 * The number of structural features of the '<em>Positive Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION_FEATURE_COUNT = OBLIGATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_OBLIGATION_OPERATION_COUNT = OBLIGATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeObligationImpl <em>Negative Obligation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeObligationImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getNegativeObligation()
	 * @generated
	 */
	int NEGATIVE_OBLIGATION = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__BASE_CLASS = OBLIGATION_POLICY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHO = OBLIGATION_POLICY__WHO;

	/**
	 * The feature id for the '<em><b>Where</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHERE = OBLIGATION_POLICY__WHERE;

	/**
	 * The feature id for the '<em><b>Why</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHY = OBLIGATION_POLICY__WHY;

	/**
	 * The feature id for the '<em><b>How</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__HOW = OBLIGATION_POLICY__HOW;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHEN = OBLIGATION_POLICY__WHEN;

	/**
	 * The feature id for the '<em><b>What</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__WHAT = OBLIGATION_POLICY__WHAT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__ID = OBLIGATION_POLICY__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION__ACTION = OBLIGATION_POLICY__ACTION;

	/**
	 * The number of structural features of the '<em>Negative Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION_FEATURE_COUNT = OBLIGATION_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBLIGATION_OPERATION_COUNT = OBLIGATION_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyPackageImpl <em>Policy Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyPackageImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyPackage()
	 * @generated
	 */
	int POLICY_PACKAGE = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PACKAGE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PACKAGE__BASE_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Policy Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudServiceImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCloudService()
	 * @generated
	 */
	int CLOUD_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__RESOURCE_ID = CLOUD_RESOURCE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.HardwareImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 18;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__RESOURCE_ID = CLOUD_RESOURCE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.DataImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getData()
	 * @generated
	 */
	int DATA = 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__RESOURCE_ID = CLOUD_RESOURCE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.ComputeServiceImpl <em>Compute Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.ComputeServiceImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getComputeService()
	 * @generated
	 */
	int COMPUTE_SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE__BASE_CLASS = CLOUD_SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE__RESOURCE_ID = CLOUD_SERVICE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Compute Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compute Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.NetworkingServiceImpl <em>Networking Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.NetworkingServiceImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getNetworkingService()
	 * @generated
	 */
	int NETWORKING_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE__BASE_CLASS = CLOUD_SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE__RESOURCE_ID = CLOUD_SERVICE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Networking Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Networking Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageServiceImpl <em>Storage Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageServiceImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getStorageService()
	 * @generated
	 */
	int STORAGE_SERVICE = 22;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__BASE_CLASS = CLOUD_SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__RESOURCE_ID = CLOUD_SERVICE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE_OPERATION_COUNT = CLOUD_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 23;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__BASE_CLASS = CLOUD_RESOURCE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__RESOURCE_ID = CLOUD_RESOURCE__RESOURCE_ID;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = CLOUD_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.ActionLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 24;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowLinkImpl <em>How Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getHowLink()
	 * @generated
	 */
	int HOW_LINK = 25;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>How Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>How Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatLinkImpl <em>What Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhatLink()
	 * @generated
	 */
	int WHAT_LINK = 26;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>What Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>What Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereLinkImpl <em>Where Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhereLink()
	 * @generated
	 */
	int WHERE_LINK = 27;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Where Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Where Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoLinkImpl <em>Who Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhoLink()
	 * @generated
	 */
	int WHO_LINK = 28;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Who Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Who Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenLinkImpl <em>When Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhenLink()
	 * @generated
	 */
	int WHEN_LINK = 29;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>When Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>When Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyLinkImpl <em>Why Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhyLink()
	 * @generated
	 */
	int WHY_LINK = 30;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Why Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Why Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeExtendImpl <em>Policy Attribute Extend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeExtendImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyAttributeExtend()
	 * @generated
	 */
	int POLICY_ATTRIBUTE_EXTEND = 31;

	/**
	 * The feature id for the '<em><b>Base Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION = 1;

	/**
	 * The number of structural features of the '<em>Policy Attribute Extend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Attribute Extend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_EXTEND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeLinkImpl <em>Policy Attribute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyAttributeLink()
	 * @generated
	 */
	int POLICY_ATTRIBUTE_LINK = 32;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Policy Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ATTRIBUTE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupImpl <em>Policy Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyGroup()
	 * @generated
	 */
	int POLICY_GROUP = 33;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Cerbacpolicy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP__CERBACPOLICY = 1;

	/**
	 * The number of structural features of the '<em>Policy Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupLinkImpl <em>Policy Group Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupLinkImpl
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyGroupLink()
	 * @generated
	 */
	int POLICY_GROUP_LINK = 34;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP_LINK__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Policy Group Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP_LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policy Group Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_GROUP_LINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy <em>Cloud Security And Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Security And Privacy Policy</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy
	 * @generated
	 */
	EClass getCloudSecurityAndPrivacyPolicy();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy#getBase_Class()
	 * @see #getCloudSecurityAndPrivacyPolicy()
	 * @generated
	 */
	EReference getCloudSecurityAndPrivacyPolicy_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy <em>Cerbac Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cerbac Policy</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy
	 * @generated
	 */
	EClass getCerbacPolicy();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWho()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Who();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Where</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhere()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Where();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhy <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Why</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhy()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_Why();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getHow <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>How</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getHow()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_How();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhen()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_When();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>What</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getWhat()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EReference getCerbacPolicy_What();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getId()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EAttribute getCerbacPolicy_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy#getAction()
	 * @see #getCerbacPolicy()
	 * @generated
	 */
	EAttribute getCerbacPolicy_Action();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Who <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Who</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Who
	 * @generated
	 */
	EClass getWho();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Who#getPrincipal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principal</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Who#getPrincipal()
	 * @see #getWho()
	 * @generated
	 */
	EAttribute getWho_Principal();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes <em>Policy Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Attributes</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes
	 * @generated
	 */
	EClass getPolicyAttributes();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes#getBase_Class()
	 * @see #getPolicyAttributes()
	 * @generated
	 */
	EReference getPolicyAttributes_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getAccessPoint <em>Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Point</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Where#getAccessPoint()
	 * @see #getWhere()
	 * @generated
	 */
	EAttribute getWhere_AccessPoint();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Why <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Why</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Why
	 * @generated
	 */
	EClass getWhy();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Why#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Why#getPurpose()
	 * @see #getWhy()
	 * @generated
	 */
	EAttribute getWhy_Purpose();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.How
	 * @generated
	 */
	EClass getHow();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.How#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.How#getDevice()
	 * @see #getHow()
	 * @generated
	 */
	EAttribute getHow_Device();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.When#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.When#getTime()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Time();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.What
	 * @generated
	 */
	EClass getWhat();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.What#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.What#getResource()
	 * @see #getWhat()
	 * @generated
	 */
	EReference getWhat_Resource();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.What#getResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Description</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.What#getResourceDescription()
	 * @see #getWhat()
	 * @generated
	 */
	EAttribute getWhat_ResourceDescription();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Resource</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource
	 * @generated
	 */
	EClass getCloudResource();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource#getBase_Class()
	 * @see #getCloudResource()
	 * @generated
	 */
	EReference getCloudResource_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource#getResourceId <em>Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Id</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource#getResourceId()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_ResourceId();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.AuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Policy</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.AuthorizationPolicy
	 * @generated
	 */
	EClass getAuthorizationPolicy();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ObligationPolicy <em>Obligation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligation Policy</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ObligationPolicy
	 * @generated
	 */
	EClass getObligationPolicy();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization <em>Positive Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Authorization</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization
	 * @generated
	 */
	EClass getPositiveAuthorization();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.NegativeAuthorization <em>Negative Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Authorization</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.NegativeAuthorization
	 * @generated
	 */
	EClass getNegativeAuthorization();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PositiveObligation <em>Positive Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Obligation</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PositiveObligation
	 * @generated
	 */
	EClass getPositiveObligation();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.NegativeObligation <em>Negative Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Obligation</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.NegativeObligation
	 * @generated
	 */
	EClass getNegativeObligation();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage <em>Policy Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Package</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage
	 * @generated
	 */
	EClass getPolicyPackage();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage#getBase_Class()
	 * @see #getPolicyPackage()
	 * @generated
	 */
	EReference getPolicyPackage_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage#getBase_Package()
	 * @see #getPolicyPackage()
	 * @generated
	 */
	EReference getPolicyPackage_Base_Package();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Service</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudService
	 * @generated
	 */
	EClass getCloudService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ComputeService <em>Compute Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Service</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ComputeService
	 * @generated
	 */
	EClass getComputeService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.NetworkingService <em>Networking Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Service</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.NetworkingService
	 * @generated
	 */
	EClass getNetworkingService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.StorageService <em>Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Service</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.StorageService
	 * @generated
	 */
	EClass getStorageService();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink#getBase_Association()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.HowLink <em>How Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.HowLink
	 * @generated
	 */
	EClass getHowLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.HowLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.HowLink#getBase_Association()
	 * @see #getHowLink()
	 * @generated
	 */
	EReference getHowLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink <em>What Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink
	 * @generated
	 */
	EClass getWhatLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink#getBase_Association()
	 * @see #getWhatLink()
	 * @generated
	 */
	EReference getWhatLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink <em>Where Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink
	 * @generated
	 */
	EClass getWhereLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink#getBase_Association()
	 * @see #getWhereLink()
	 * @generated
	 */
	EReference getWhereLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink <em>Who Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Who Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink
	 * @generated
	 */
	EClass getWhoLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink#getBase_Association()
	 * @see #getWhoLink()
	 * @generated
	 */
	EReference getWhoLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink <em>When Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink
	 * @generated
	 */
	EClass getWhenLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink#getBase_Association()
	 * @see #getWhenLink()
	 * @generated
	 */
	EReference getWhenLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink <em>Why Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Why Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink
	 * @generated
	 */
	EClass getWhyLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink#getBase_Association()
	 * @see #getWhyLink()
	 * @generated
	 */
	EReference getWhyLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend <em>Policy Attribute Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Attribute Extend</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend
	 * @generated
	 */
	EClass getPolicyAttributeExtend();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Extension <em>Base Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Extension</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Extension()
	 * @see #getPolicyAttributeExtend()
	 * @generated
	 */
	EReference getPolicyAttributeExtend_Base_Extension();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Generalization()
	 * @see #getPolicyAttributeExtend()
	 * @generated
	 */
	EReference getPolicyAttributeExtend_Base_Generalization();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink <em>Policy Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Attribute Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink
	 * @generated
	 */
	EClass getPolicyAttributeLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink#getBase_Association()
	 * @see #getPolicyAttributeLink()
	 * @generated
	 */
	EReference getPolicyAttributeLink_Base_Association();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup <em>Policy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Group</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup
	 * @generated
	 */
	EClass getPolicyGroup();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getBase_Class()
	 * @see #getPolicyGroup()
	 * @generated
	 */
	EReference getPolicyGroup_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getCerbacpolicy <em>Cerbacpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cerbacpolicy</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getCerbacpolicy()
	 * @see #getPolicyGroup()
	 * @generated
	 */
	EReference getPolicyGroup_Cerbacpolicy();

	/**
	 * Returns the meta object for class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink <em>Policy Group Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Group Link</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink
	 * @generated
	 */
	EClass getPolicyGroupLink();

	/**
	 * Returns the meta object for the reference '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink#getBase_Association()
	 * @see #getPolicyGroupLink()
	 * @generated
	 */
	EReference getPolicyGroupLink_Base_Association();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CerbacProfileFactory getCerbacProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudSecurityAndPrivacyPolicyImpl <em>Cloud Security And Privacy Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudSecurityAndPrivacyPolicyImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCloudSecurityAndPrivacyPolicy()
		 * @generated
		 */
		EClass CLOUD_SECURITY_AND_PRIVACY_POLICY = eINSTANCE.getCloudSecurityAndPrivacyPolicy();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS = eINSTANCE.getCloudSecurityAndPrivacyPolicy_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl <em>Cerbac Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCerbacPolicy()
		 * @generated
		 */
		EClass CERBAC_POLICY = eINSTANCE.getCerbacPolicy();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHO = eINSTANCE.getCerbacPolicy_Who();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHERE = eINSTANCE.getCerbacPolicy_Where();

		/**
		 * The meta object literal for the '<em><b>Why</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHY = eINSTANCE.getCerbacPolicy_Why();

		/**
		 * The meta object literal for the '<em><b>How</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__HOW = eINSTANCE.getCerbacPolicy_How();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHEN = eINSTANCE.getCerbacPolicy_When();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERBAC_POLICY__WHAT = eINSTANCE.getCerbacPolicy_What();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERBAC_POLICY__ID = eINSTANCE.getCerbacPolicy_Id();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERBAC_POLICY__ACTION = eINSTANCE.getCerbacPolicy_Action();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoImpl <em>Who</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWho()
		 * @generated
		 */
		EClass WHO = eINSTANCE.getWho();

		/**
		 * The meta object literal for the '<em><b>Principal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHO__PRINCIPAL = eINSTANCE.getWho_Principal();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributesImpl <em>Policy Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributesImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyAttributes()
		 * @generated
		 */
		EClass POLICY_ATTRIBUTES = eINSTANCE.getPolicyAttributes();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTES__BASE_CLASS = eINSTANCE.getPolicyAttributes_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '<em><b>Access Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHERE__ACCESS_POINT = eINSTANCE.getWhere_AccessPoint();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyImpl <em>Why</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhy()
		 * @generated
		 */
		EClass WHY = eINSTANCE.getWhy();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHY__PURPOSE = eINSTANCE.getWhy_Purpose();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowImpl <em>How</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getHow()
		 * @generated
		 */
		EClass HOW = eINSTANCE.getHow();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOW__DEVICE = eINSTANCE.getHow_Device();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__TIME = eINSTANCE.getWhen_Time();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl <em>What</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhat()
		 * @generated
		 */
		EClass WHAT = eINSTANCE.getWhat();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT__RESOURCE = eINSTANCE.getWhat_Resource();

		/**
		 * The meta object literal for the '<em><b>Resource Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHAT__RESOURCE_DESCRIPTION = eINSTANCE.getWhat_ResourceDescription();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudResourceImpl <em>Cloud Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudResourceImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCloudResource()
		 * @generated
		 */
		EClass CLOUD_RESOURCE = eINSTANCE.getCloudResource();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_RESOURCE__BASE_CLASS = eINSTANCE.getCloudResource_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__RESOURCE_ID = eINSTANCE.getCloudResource_ResourceId();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.AuthorizationPolicyImpl <em>Authorization Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.AuthorizationPolicyImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getAuthorizationPolicy()
		 * @generated
		 */
		EClass AUTHORIZATION_POLICY = eINSTANCE.getAuthorizationPolicy();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.ObligationPolicyImpl <em>Obligation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.ObligationPolicyImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getObligationPolicy()
		 * @generated
		 */
		EClass OBLIGATION_POLICY = eINSTANCE.getObligationPolicy();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveAuthorizationImpl <em>Positive Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveAuthorizationImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPositiveAuthorization()
		 * @generated
		 */
		EClass POSITIVE_AUTHORIZATION = eINSTANCE.getPositiveAuthorization();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeAuthorizationImpl <em>Negative Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeAuthorizationImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getNegativeAuthorization()
		 * @generated
		 */
		EClass NEGATIVE_AUTHORIZATION = eINSTANCE.getNegativeAuthorization();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveObligationImpl <em>Positive Obligation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveObligationImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPositiveObligation()
		 * @generated
		 */
		EClass POSITIVE_OBLIGATION = eINSTANCE.getPositiveObligation();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeObligationImpl <em>Negative Obligation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeObligationImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getNegativeObligation()
		 * @generated
		 */
		EClass NEGATIVE_OBLIGATION = eINSTANCE.getNegativeObligation();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyPackageImpl <em>Policy Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyPackageImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyPackage()
		 * @generated
		 */
		EClass POLICY_PACKAGE = eINSTANCE.getPolicyPackage();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_PACKAGE__BASE_CLASS = eINSTANCE.getPolicyPackage_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_PACKAGE__BASE_PACKAGE = eINSTANCE.getPolicyPackage_Base_Package();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CloudServiceImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getCloudService()
		 * @generated
		 */
		EClass CLOUD_SERVICE = eINSTANCE.getCloudService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.HardwareImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.DataImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.ComputeServiceImpl <em>Compute Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.ComputeServiceImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getComputeService()
		 * @generated
		 */
		EClass COMPUTE_SERVICE = eINSTANCE.getComputeService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.NetworkingServiceImpl <em>Networking Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.NetworkingServiceImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getNetworkingService()
		 * @generated
		 */
		EClass NETWORKING_SERVICE = eINSTANCE.getNetworkingService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageServiceImpl <em>Storage Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageServiceImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getStorageService()
		 * @generated
		 */
		EClass STORAGE_SERVICE = eINSTANCE.getStorageService();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.StorageImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.ActionLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACTION_LINK = eINSTANCE.getActionLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__BASE_ASSOCIATION = eINSTANCE.getActionLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowLinkImpl <em>How Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getHowLink()
		 * @generated
		 */
		EClass HOW_LINK = eINSTANCE.getHowLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOW_LINK__BASE_ASSOCIATION = eINSTANCE.getHowLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatLinkImpl <em>What Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhatLink()
		 * @generated
		 */
		EClass WHAT_LINK = eINSTANCE.getWhatLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT_LINK__BASE_ASSOCIATION = eINSTANCE.getWhatLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereLinkImpl <em>Where Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhereLink()
		 * @generated
		 */
		EClass WHERE_LINK = eINSTANCE.getWhereLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE_LINK__BASE_ASSOCIATION = eINSTANCE.getWhereLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoLinkImpl <em>Who Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhoLink()
		 * @generated
		 */
		EClass WHO_LINK = eINSTANCE.getWhoLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHO_LINK__BASE_ASSOCIATION = eINSTANCE.getWhoLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenLinkImpl <em>When Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhenLink()
		 * @generated
		 */
		EClass WHEN_LINK = eINSTANCE.getWhenLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_LINK__BASE_ASSOCIATION = eINSTANCE.getWhenLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyLinkImpl <em>Why Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getWhyLink()
		 * @generated
		 */
		EClass WHY_LINK = eINSTANCE.getWhyLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHY_LINK__BASE_ASSOCIATION = eINSTANCE.getWhyLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeExtendImpl <em>Policy Attribute Extend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeExtendImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyAttributeExtend()
		 * @generated
		 */
		EClass POLICY_ATTRIBUTE_EXTEND = eINSTANCE.getPolicyAttributeExtend();

		/**
		 * The meta object literal for the '<em><b>Base Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION = eINSTANCE.getPolicyAttributeExtend_Base_Extension();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION = eINSTANCE.getPolicyAttributeExtend_Base_Generalization();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeLinkImpl <em>Policy Attribute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyAttributeLink()
		 * @generated
		 */
		EClass POLICY_ATTRIBUTE_LINK = eINSTANCE.getPolicyAttributeLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_ATTRIBUTE_LINK__BASE_ASSOCIATION = eINSTANCE.getPolicyAttributeLink_Base_Association();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupImpl <em>Policy Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyGroup()
		 * @generated
		 */
		EClass POLICY_GROUP = eINSTANCE.getPolicyGroup();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_GROUP__BASE_CLASS = eINSTANCE.getPolicyGroup_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Cerbacpolicy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_GROUP__CERBACPOLICY = eINSTANCE.getPolicyGroup_Cerbacpolicy();

		/**
		 * The meta object literal for the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupLinkImpl <em>Policy Group Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupLinkImpl
		 * @see edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacProfilePackageImpl#getPolicyGroupLink()
		 * @generated
		 */
		EClass POLICY_GROUP_LINK = eINSTANCE.getPolicyGroupLink();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_GROUP_LINK__BASE_ASSOCIATION = eINSTANCE.getPolicyGroupLink_Base_Association();

	}

} //CerbacProfilePackage
