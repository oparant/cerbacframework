/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CerbacProfileFactoryImpl extends EFactoryImpl implements CerbacProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CerbacProfileFactory init() {
		try {
			CerbacProfileFactory theCerbacProfileFactory = (CerbacProfileFactory)EPackage.Registry.INSTANCE.getEFactory(CerbacProfilePackage.eNS_URI);
			if (theCerbacProfileFactory != null) {
				return theCerbacProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CerbacProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CerbacProfilePackage.WHO: return createWho();
			case CerbacProfilePackage.WHERE: return createWhere();
			case CerbacProfilePackage.WHY: return createWhy();
			case CerbacProfilePackage.HOW: return createHow();
			case CerbacProfilePackage.WHEN: return createWhen();
			case CerbacProfilePackage.WHAT: return createWhat();
			case CerbacProfilePackage.POSITIVE_AUTHORIZATION: return createPositiveAuthorization();
			case CerbacProfilePackage.NEGATIVE_AUTHORIZATION: return createNegativeAuthorization();
			case CerbacProfilePackage.POSITIVE_OBLIGATION: return createPositiveObligation();
			case CerbacProfilePackage.NEGATIVE_OBLIGATION: return createNegativeObligation();
			case CerbacProfilePackage.POLICY_PACKAGE: return createPolicyPackage();
			case CerbacProfilePackage.HARDWARE: return createHardware();
			case CerbacProfilePackage.DATA: return createData();
			case CerbacProfilePackage.COMPUTE_SERVICE: return createComputeService();
			case CerbacProfilePackage.NETWORKING_SERVICE: return createNetworkingService();
			case CerbacProfilePackage.STORAGE_SERVICE: return createStorageService();
			case CerbacProfilePackage.STORAGE: return createStorage();
			case CerbacProfilePackage.ACTION_LINK: return createActionLink();
			case CerbacProfilePackage.HOW_LINK: return createHowLink();
			case CerbacProfilePackage.WHAT_LINK: return createWhatLink();
			case CerbacProfilePackage.WHERE_LINK: return createWhereLink();
			case CerbacProfilePackage.WHO_LINK: return createWhoLink();
			case CerbacProfilePackage.WHEN_LINK: return createWhenLink();
			case CerbacProfilePackage.WHY_LINK: return createWhyLink();
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND: return createPolicyAttributeExtend();
			case CerbacProfilePackage.POLICY_ATTRIBUTE_LINK: return createPolicyAttributeLink();
			case CerbacProfilePackage.POLICY_GROUP: return createPolicyGroup();
			case CerbacProfilePackage.POLICY_GROUP_LINK: return createPolicyGroupLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Who createWho() {
		WhoImpl who = new WhoImpl();
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Why createWhy() {
		WhyImpl why = new WhyImpl();
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How createHow() {
		HowImpl how = new HowImpl();
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What createWhat() {
		WhatImpl what = new WhatImpl();
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveAuthorization createPositiveAuthorization() {
		PositiveAuthorizationImpl positiveAuthorization = new PositiveAuthorizationImpl();
		return positiveAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeAuthorization createNegativeAuthorization() {
		NegativeAuthorizationImpl negativeAuthorization = new NegativeAuthorizationImpl();
		return negativeAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveObligation createPositiveObligation() {
		PositiveObligationImpl positiveObligation = new PositiveObligationImpl();
		return positiveObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeObligation createNegativeObligation() {
		NegativeObligationImpl negativeObligation = new NegativeObligationImpl();
		return negativeObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyPackage createPolicyPackage() {
		PolicyPackageImpl policyPackage = new PolicyPackageImpl();
		return policyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeService createComputeService() {
		ComputeServiceImpl computeService = new ComputeServiceImpl();
		return computeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingService createNetworkingService() {
		NetworkingServiceImpl networkingService = new NetworkingServiceImpl();
		return networkingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageService createStorageService() {
		StorageServiceImpl storageService = new StorageServiceImpl();
		return storageService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLink createActionLink() {
		ActionLinkImpl actionLink = new ActionLinkImpl();
		return actionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HowLink createHowLink() {
		HowLinkImpl howLink = new HowLinkImpl();
		return howLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhatLink createWhatLink() {
		WhatLinkImpl whatLink = new WhatLinkImpl();
		return whatLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereLink createWhereLink() {
		WhereLinkImpl whereLink = new WhereLinkImpl();
		return whereLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhoLink createWhoLink() {
		WhoLinkImpl whoLink = new WhoLinkImpl();
		return whoLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenLink createWhenLink() {
		WhenLinkImpl whenLink = new WhenLinkImpl();
		return whenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhyLink createWhyLink() {
		WhyLinkImpl whyLink = new WhyLinkImpl();
		return whyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAttributeExtend createPolicyAttributeExtend() {
		PolicyAttributeExtendImpl policyAttributeExtend = new PolicyAttributeExtendImpl();
		return policyAttributeExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyAttributeLink createPolicyAttributeLink() {
		PolicyAttributeLinkImpl policyAttributeLink = new PolicyAttributeLinkImpl();
		return policyAttributeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyGroup createPolicyGroup() {
		PolicyGroupImpl policyGroup = new PolicyGroupImpl();
		return policyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyGroupLink createPolicyGroupLink() {
		PolicyGroupLinkImpl policyGroupLink = new PolicyGroupLinkImpl();
		return policyGroupLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacProfilePackage getCerbacProfilePackage() {
		return (CerbacProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CerbacProfilePackage getPackage() {
		return CerbacProfilePackage.eINSTANCE;
	}

} //CerbacProfileFactoryImpl
