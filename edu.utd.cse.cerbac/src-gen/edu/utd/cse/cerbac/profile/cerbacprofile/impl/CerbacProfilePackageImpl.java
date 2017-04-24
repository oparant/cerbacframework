/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.AuthorizationPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfileFactory;
import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource;
import edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.CloudService;
import edu.utd.cse.cerbac.profile.cerbacprofile.ComputeService;
import edu.utd.cse.cerbac.profile.cerbacprofile.Data;
import edu.utd.cse.cerbac.profile.cerbacprofile.Hardware;
import edu.utd.cse.cerbac.profile.cerbacprofile.How;
import edu.utd.cse.cerbac.profile.cerbacprofile.HowLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.NegativeAuthorization;
import edu.utd.cse.cerbac.profile.cerbacprofile.NegativeObligation;
import edu.utd.cse.cerbac.profile.cerbacprofile.NetworkingService;
import edu.utd.cse.cerbac.profile.cerbacprofile.ObligationPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization;
import edu.utd.cse.cerbac.profile.cerbacprofile.PositiveObligation;
import edu.utd.cse.cerbac.profile.cerbacprofile.Storage;
import edu.utd.cse.cerbac.profile.cerbacprofile.StorageService;
import edu.utd.cse.cerbac.profile.cerbacprofile.What;
import edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.When;
import edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.Where;
import edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.Who;
import edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink;
import edu.utd.cse.cerbac.profile.cerbacprofile.Why;
import edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CerbacProfilePackageImpl extends EPackageImpl implements CerbacProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudSecurityAndPrivacyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cerbacPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass howEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveAuthorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeAuthorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveObligationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeObligationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass howLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whatLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whereLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whoLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whyLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyAttributeExtendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyAttributeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyGroupLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CerbacProfilePackageImpl() {
		super(eNS_URI, CerbacProfileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CerbacProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CerbacProfilePackage init() {
		if (isInited) return (CerbacProfilePackage)EPackage.Registry.INSTANCE.getEPackage(CerbacProfilePackage.eNS_URI);

		// Obtain or create and register package
		CerbacProfilePackageImpl theCerbacProfilePackage = (CerbacProfilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CerbacProfilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CerbacProfilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCerbacProfilePackage.createPackageContents();

		// Initialize created meta-data
		theCerbacProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCerbacProfilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CerbacProfilePackage.eNS_URI, theCerbacProfilePackage);
		return theCerbacProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudSecurityAndPrivacyPolicy() {
		return cloudSecurityAndPrivacyPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudSecurityAndPrivacyPolicy_Base_Class() {
		return (EReference)cloudSecurityAndPrivacyPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCerbacPolicy() {
		return cerbacPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCerbacPolicy_Who() {
		return (EReference)cerbacPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCerbacPolicy_Where() {
		return (EReference)cerbacPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCerbacPolicy_Why() {
		return (EReference)cerbacPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCerbacPolicy_How() {
		return (EReference)cerbacPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCerbacPolicy_When() {
		return (EReference)cerbacPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCerbacPolicy_What() {
		return (EReference)cerbacPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCerbacPolicy_Id() {
		return (EAttribute)cerbacPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCerbacPolicy_Action() {
		return (EAttribute)cerbacPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWho() {
		return whoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWho_Principal() {
		return (EAttribute)whoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyAttributes() {
		return policyAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttributes_Base_Class() {
		return (EReference)policyAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhere() {
		return whereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhere_AccessPoint() {
		return (EAttribute)whereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhy() {
		return whyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhy_Purpose() {
		return (EAttribute)whyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHow() {
		return howEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHow_Device() {
		return (EAttribute)howEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhen_Time() {
		return (EAttribute)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhat() {
		return whatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhat_Resource() {
		return (EReference)whatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhat_ResourceDescription() {
		return (EAttribute)whatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudResource() {
		return cloudResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudResource_Base_Class() {
		return (EReference)cloudResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudResource_ResourceId() {
		return (EAttribute)cloudResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationPolicy() {
		return authorizationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligationPolicy() {
		return obligationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveAuthorization() {
		return positiveAuthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeAuthorization() {
		return negativeAuthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveObligation() {
		return positiveObligationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeObligation() {
		return negativeObligationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyPackage() {
		return policyPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyPackage_Base_Class() {
		return (EReference)policyPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyPackage_Base_Package() {
		return (EReference)policyPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudService() {
		return cloudServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardware() {
		return hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputeService() {
		return computeServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkingService() {
		return networkingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageService() {
		return storageServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionLink() {
		return actionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_Base_Association() {
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHowLink() {
		return howLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHowLink_Base_Association() {
		return (EReference)howLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhatLink() {
		return whatLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhatLink_Base_Association() {
		return (EReference)whatLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhereLink() {
		return whereLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhereLink_Base_Association() {
		return (EReference)whereLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhoLink() {
		return whoLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhoLink_Base_Association() {
		return (EReference)whoLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenLink() {
		return whenLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhenLink_Base_Association() {
		return (EReference)whenLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhyLink() {
		return whyLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhyLink_Base_Association() {
		return (EReference)whyLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyAttributeExtend() {
		return policyAttributeExtendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttributeExtend_Base_Extension() {
		return (EReference)policyAttributeExtendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttributeExtend_Base_Generalization() {
		return (EReference)policyAttributeExtendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyAttributeLink() {
		return policyAttributeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyAttributeLink_Base_Association() {
		return (EReference)policyAttributeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyGroup() {
		return policyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyGroup_Base_Class() {
		return (EReference)policyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyGroup_Cerbacpolicy() {
		return (EReference)policyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyGroupLink() {
		return policyGroupLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyGroupLink_Base_Association() {
		return (EReference)policyGroupLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacProfileFactory getCerbacProfileFactory() {
		return (CerbacProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudSecurityAndPrivacyPolicyEClass = createEClass(CLOUD_SECURITY_AND_PRIVACY_POLICY);
		createEReference(cloudSecurityAndPrivacyPolicyEClass, CLOUD_SECURITY_AND_PRIVACY_POLICY__BASE_CLASS);

		cerbacPolicyEClass = createEClass(CERBAC_POLICY);
		createEReference(cerbacPolicyEClass, CERBAC_POLICY__WHO);
		createEReference(cerbacPolicyEClass, CERBAC_POLICY__WHERE);
		createEReference(cerbacPolicyEClass, CERBAC_POLICY__WHY);
		createEReference(cerbacPolicyEClass, CERBAC_POLICY__HOW);
		createEReference(cerbacPolicyEClass, CERBAC_POLICY__WHEN);
		createEReference(cerbacPolicyEClass, CERBAC_POLICY__WHAT);
		createEAttribute(cerbacPolicyEClass, CERBAC_POLICY__ID);
		createEAttribute(cerbacPolicyEClass, CERBAC_POLICY__ACTION);

		whoEClass = createEClass(WHO);
		createEAttribute(whoEClass, WHO__PRINCIPAL);

		policyAttributesEClass = createEClass(POLICY_ATTRIBUTES);
		createEReference(policyAttributesEClass, POLICY_ATTRIBUTES__BASE_CLASS);

		whereEClass = createEClass(WHERE);
		createEAttribute(whereEClass, WHERE__ACCESS_POINT);

		whyEClass = createEClass(WHY);
		createEAttribute(whyEClass, WHY__PURPOSE);

		howEClass = createEClass(HOW);
		createEAttribute(howEClass, HOW__DEVICE);

		whenEClass = createEClass(WHEN);
		createEAttribute(whenEClass, WHEN__TIME);

		whatEClass = createEClass(WHAT);
		createEReference(whatEClass, WHAT__RESOURCE);
		createEAttribute(whatEClass, WHAT__RESOURCE_DESCRIPTION);

		cloudResourceEClass = createEClass(CLOUD_RESOURCE);
		createEReference(cloudResourceEClass, CLOUD_RESOURCE__BASE_CLASS);
		createEAttribute(cloudResourceEClass, CLOUD_RESOURCE__RESOURCE_ID);

		authorizationPolicyEClass = createEClass(AUTHORIZATION_POLICY);

		obligationPolicyEClass = createEClass(OBLIGATION_POLICY);

		positiveAuthorizationEClass = createEClass(POSITIVE_AUTHORIZATION);

		negativeAuthorizationEClass = createEClass(NEGATIVE_AUTHORIZATION);

		positiveObligationEClass = createEClass(POSITIVE_OBLIGATION);

		negativeObligationEClass = createEClass(NEGATIVE_OBLIGATION);

		policyPackageEClass = createEClass(POLICY_PACKAGE);
		createEReference(policyPackageEClass, POLICY_PACKAGE__BASE_CLASS);
		createEReference(policyPackageEClass, POLICY_PACKAGE__BASE_PACKAGE);

		cloudServiceEClass = createEClass(CLOUD_SERVICE);

		hardwareEClass = createEClass(HARDWARE);

		dataEClass = createEClass(DATA);

		computeServiceEClass = createEClass(COMPUTE_SERVICE);

		networkingServiceEClass = createEClass(NETWORKING_SERVICE);

		storageServiceEClass = createEClass(STORAGE_SERVICE);

		storageEClass = createEClass(STORAGE);

		actionLinkEClass = createEClass(ACTION_LINK);
		createEReference(actionLinkEClass, ACTION_LINK__BASE_ASSOCIATION);

		howLinkEClass = createEClass(HOW_LINK);
		createEReference(howLinkEClass, HOW_LINK__BASE_ASSOCIATION);

		whatLinkEClass = createEClass(WHAT_LINK);
		createEReference(whatLinkEClass, WHAT_LINK__BASE_ASSOCIATION);

		whereLinkEClass = createEClass(WHERE_LINK);
		createEReference(whereLinkEClass, WHERE_LINK__BASE_ASSOCIATION);

		whoLinkEClass = createEClass(WHO_LINK);
		createEReference(whoLinkEClass, WHO_LINK__BASE_ASSOCIATION);

		whenLinkEClass = createEClass(WHEN_LINK);
		createEReference(whenLinkEClass, WHEN_LINK__BASE_ASSOCIATION);

		whyLinkEClass = createEClass(WHY_LINK);
		createEReference(whyLinkEClass, WHY_LINK__BASE_ASSOCIATION);

		policyAttributeExtendEClass = createEClass(POLICY_ATTRIBUTE_EXTEND);
		createEReference(policyAttributeExtendEClass, POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION);
		createEReference(policyAttributeExtendEClass, POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION);

		policyAttributeLinkEClass = createEClass(POLICY_ATTRIBUTE_LINK);
		createEReference(policyAttributeLinkEClass, POLICY_ATTRIBUTE_LINK__BASE_ASSOCIATION);

		policyGroupEClass = createEClass(POLICY_GROUP);
		createEReference(policyGroupEClass, POLICY_GROUP__BASE_CLASS);
		createEReference(policyGroupEClass, POLICY_GROUP__CERBACPOLICY);

		policyGroupLinkEClass = createEClass(POLICY_GROUP_LINK);
		createEReference(policyGroupLinkEClass, POLICY_GROUP_LINK__BASE_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cerbacPolicyEClass.getESuperTypes().add(this.getCloudSecurityAndPrivacyPolicy());
		whoEClass.getESuperTypes().add(this.getPolicyAttributes());
		whereEClass.getESuperTypes().add(this.getPolicyAttributes());
		whyEClass.getESuperTypes().add(this.getPolicyAttributes());
		howEClass.getESuperTypes().add(this.getPolicyAttributes());
		whenEClass.getESuperTypes().add(this.getPolicyAttributes());
		whatEClass.getESuperTypes().add(this.getPolicyAttributes());
		authorizationPolicyEClass.getESuperTypes().add(this.getCerbacPolicy());
		obligationPolicyEClass.getESuperTypes().add(this.getCerbacPolicy());
		positiveAuthorizationEClass.getESuperTypes().add(this.getAuthorizationPolicy());
		negativeAuthorizationEClass.getESuperTypes().add(this.getAuthorizationPolicy());
		positiveObligationEClass.getESuperTypes().add(this.getObligationPolicy());
		negativeObligationEClass.getESuperTypes().add(this.getObligationPolicy());
		cloudServiceEClass.getESuperTypes().add(this.getCloudResource());
		hardwareEClass.getESuperTypes().add(this.getCloudResource());
		dataEClass.getESuperTypes().add(this.getCloudResource());
		computeServiceEClass.getESuperTypes().add(this.getCloudService());
		networkingServiceEClass.getESuperTypes().add(this.getCloudService());
		storageServiceEClass.getESuperTypes().add(this.getCloudService());
		storageEClass.getESuperTypes().add(this.getCloudResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudSecurityAndPrivacyPolicyEClass, CloudSecurityAndPrivacyPolicy.class, "CloudSecurityAndPrivacyPolicy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudSecurityAndPrivacyPolicy_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, CloudSecurityAndPrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cerbacPolicyEClass, CerbacPolicy.class, "CerbacPolicy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCerbacPolicy_Who(), this.getWho(), null, "who", null, 1, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCerbacPolicy_Where(), this.getWhere(), null, "where", null, 0, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCerbacPolicy_Why(), this.getWhy(), null, "why", null, 0, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCerbacPolicy_How(), this.getHow(), null, "how", null, 0, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCerbacPolicy_When(), this.getWhen(), null, "when", null, 0, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCerbacPolicy_What(), this.getWhat(), null, "what", null, 1, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCerbacPolicy_Id(), theTypesPackage.getString(), "id", null, 1, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCerbacPolicy_Action(), theTypesPackage.getString(), "action", null, 1, 1, CerbacPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whoEClass, Who.class, "Who", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWho_Principal(), theTypesPackage.getString(), "principal", null, 1, 1, Who.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(policyAttributesEClass, PolicyAttributes.class, "PolicyAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyAttributes_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, PolicyAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whereEClass, Where.class, "Where", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhere_AccessPoint(), theTypesPackage.getString(), "accessPoint", null, 1, 1, Where.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whyEClass, Why.class, "Why", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhy_Purpose(), theTypesPackage.getString(), "purpose", null, 1, 1, Why.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(howEClass, How.class, "How", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHow_Device(), theTypesPackage.getString(), "device", null, 1, 1, How.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhen_Time(), theTypesPackage.getString(), "time", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whatEClass, What.class, "What", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhat_Resource(), this.getCloudResource(), null, "resource", null, 1, 1, What.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWhat_ResourceDescription(), theTypesPackage.getString(), "resourceDescription", null, 1, 1, What.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cloudResourceEClass, CloudResource.class, "CloudResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudResource_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCloudResource_ResourceId(), theTypesPackage.getString(), "resourceId", null, 1, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(authorizationPolicyEClass, AuthorizationPolicy.class, "AuthorizationPolicy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obligationPolicyEClass, ObligationPolicy.class, "ObligationPolicy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveAuthorizationEClass, PositiveAuthorization.class, "PositiveAuthorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeAuthorizationEClass, NegativeAuthorization.class, "NegativeAuthorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveObligationEClass, PositiveObligation.class, "PositiveObligation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeObligationEClass, NegativeObligation.class, "NegativeObligation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyPackageEClass, PolicyPackage.class, "PolicyPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyPackage_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, PolicyPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPolicyPackage_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, PolicyPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cloudServiceEClass, CloudService.class, "CloudService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareEClass, Hardware.class, "Hardware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computeServiceEClass, ComputeService.class, "ComputeService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkingServiceEClass, NetworkingService.class, "NetworkingService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageServiceEClass, StorageService.class, "StorageService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(howLinkEClass, HowLink.class, "HowLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHowLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, HowLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whatLinkEClass, WhatLink.class, "WhatLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhatLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, WhatLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whereLinkEClass, WhereLink.class, "WhereLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhereLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, WhereLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whoLinkEClass, WhoLink.class, "WhoLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhoLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, WhoLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whenLinkEClass, WhenLink.class, "WhenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhenLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, WhenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whyLinkEClass, WhyLink.class, "WhyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhyLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, WhyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(policyAttributeExtendEClass, PolicyAttributeExtend.class, "PolicyAttributeExtend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyAttributeExtend_Base_Extension(), theUMLPackage.getExtension(), null, "base_Extension", null, 1, 1, PolicyAttributeExtend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPolicyAttributeExtend_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 1, 1, PolicyAttributeExtend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(policyAttributeLinkEClass, PolicyAttributeLink.class, "PolicyAttributeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyAttributeLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, PolicyAttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(policyGroupEClass, PolicyGroup.class, "PolicyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyGroup_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, PolicyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPolicyGroup_Cerbacpolicy(), this.getCerbacPolicy(), null, "cerbacpolicy", null, 1, -1, PolicyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(policyGroupLinkEClass, PolicyGroupLink.class, "PolicyGroupLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyGroupLink_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, PolicyGroupLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Cerbac"
		   });
	}

} //CerbacProfilePackageImpl
