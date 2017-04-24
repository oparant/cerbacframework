/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.util;

import edu.utd.cse.cerbac.profile.cerbacprofile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage
 * @generated
 */
public class CerbacProfileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CerbacProfilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacProfileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CerbacProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CerbacProfileSwitch<Adapter> modelSwitch =
		new CerbacProfileSwitch<Adapter>() {
			@Override
			public Adapter caseCloudSecurityAndPrivacyPolicy(CloudSecurityAndPrivacyPolicy object) {
				return createCloudSecurityAndPrivacyPolicyAdapter();
			}
			@Override
			public Adapter caseCerbacPolicy(CerbacPolicy object) {
				return createCerbacPolicyAdapter();
			}
			@Override
			public Adapter caseWho(Who object) {
				return createWhoAdapter();
			}
			@Override
			public Adapter casePolicyAttributes(PolicyAttributes object) {
				return createPolicyAttributesAdapter();
			}
			@Override
			public Adapter caseWhere(Where object) {
				return createWhereAdapter();
			}
			@Override
			public Adapter caseWhy(Why object) {
				return createWhyAdapter();
			}
			@Override
			public Adapter caseHow(How object) {
				return createHowAdapter();
			}
			@Override
			public Adapter caseWhen(When object) {
				return createWhenAdapter();
			}
			@Override
			public Adapter caseWhat(What object) {
				return createWhatAdapter();
			}
			@Override
			public Adapter caseCloudResource(CloudResource object) {
				return createCloudResourceAdapter();
			}
			@Override
			public Adapter caseAuthorizationPolicy(AuthorizationPolicy object) {
				return createAuthorizationPolicyAdapter();
			}
			@Override
			public Adapter caseObligationPolicy(ObligationPolicy object) {
				return createObligationPolicyAdapter();
			}
			@Override
			public Adapter casePositiveAuthorization(PositiveAuthorization object) {
				return createPositiveAuthorizationAdapter();
			}
			@Override
			public Adapter caseNegativeAuthorization(NegativeAuthorization object) {
				return createNegativeAuthorizationAdapter();
			}
			@Override
			public Adapter casePositiveObligation(PositiveObligation object) {
				return createPositiveObligationAdapter();
			}
			@Override
			public Adapter caseNegativeObligation(NegativeObligation object) {
				return createNegativeObligationAdapter();
			}
			@Override
			public Adapter casePolicyPackage(PolicyPackage object) {
				return createPolicyPackageAdapter();
			}
			@Override
			public Adapter caseCloudService(CloudService object) {
				return createCloudServiceAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseComputeService(ComputeService object) {
				return createComputeServiceAdapter();
			}
			@Override
			public Adapter caseNetworkingService(NetworkingService object) {
				return createNetworkingServiceAdapter();
			}
			@Override
			public Adapter caseStorageService(StorageService object) {
				return createStorageServiceAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseActionLink(ActionLink object) {
				return createActionLinkAdapter();
			}
			@Override
			public Adapter caseHowLink(HowLink object) {
				return createHowLinkAdapter();
			}
			@Override
			public Adapter caseWhatLink(WhatLink object) {
				return createWhatLinkAdapter();
			}
			@Override
			public Adapter caseWhereLink(WhereLink object) {
				return createWhereLinkAdapter();
			}
			@Override
			public Adapter caseWhoLink(WhoLink object) {
				return createWhoLinkAdapter();
			}
			@Override
			public Adapter caseWhenLink(WhenLink object) {
				return createWhenLinkAdapter();
			}
			@Override
			public Adapter caseWhyLink(WhyLink object) {
				return createWhyLinkAdapter();
			}
			@Override
			public Adapter casePolicyAttributeExtend(PolicyAttributeExtend object) {
				return createPolicyAttributeExtendAdapter();
			}
			@Override
			public Adapter casePolicyAttributeLink(PolicyAttributeLink object) {
				return createPolicyAttributeLinkAdapter();
			}
			@Override
			public Adapter casePolicyGroup(PolicyGroup object) {
				return createPolicyGroupAdapter();
			}
			@Override
			public Adapter casePolicyGroupLink(PolicyGroupLink object) {
				return createPolicyGroupLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy <em>Cloud Security And Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudSecurityAndPrivacyPolicy
	 * @generated
	 */
	public Adapter createCloudSecurityAndPrivacyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy <em>Cerbac Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy
	 * @generated
	 */
	public Adapter createCerbacPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Who <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Who
	 * @generated
	 */
	public Adapter createWhoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes <em>Policy Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributes
	 * @generated
	 */
	public Adapter createPolicyAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Where
	 * @generated
	 */
	public Adapter createWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Why <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Why
	 * @generated
	 */
	public Adapter createWhyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.How
	 * @generated
	 */
	public Adapter createHowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.When
	 * @generated
	 */
	public Adapter createWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.What
	 * @generated
	 */
	public Adapter createWhatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource
	 * @generated
	 */
	public Adapter createCloudResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.AuthorizationPolicy <em>Authorization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.AuthorizationPolicy
	 * @generated
	 */
	public Adapter createAuthorizationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ObligationPolicy <em>Obligation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ObligationPolicy
	 * @generated
	 */
	public Adapter createObligationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization <em>Positive Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization
	 * @generated
	 */
	public Adapter createPositiveAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.NegativeAuthorization <em>Negative Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.NegativeAuthorization
	 * @generated
	 */
	public Adapter createNegativeAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PositiveObligation <em>Positive Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PositiveObligation
	 * @generated
	 */
	public Adapter createPositiveObligationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.NegativeObligation <em>Negative Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.NegativeObligation
	 * @generated
	 */
	public Adapter createNegativeObligationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage <em>Policy Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyPackage
	 * @generated
	 */
	public Adapter createPolicyPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CloudService
	 * @generated
	 */
	public Adapter createCloudServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ComputeService <em>Compute Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ComputeService
	 * @generated
	 */
	public Adapter createComputeServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.NetworkingService <em>Networking Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.NetworkingService
	 * @generated
	 */
	public Adapter createNetworkingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.StorageService <em>Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.StorageService
	 * @generated
	 */
	public Adapter createStorageServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.ActionLink
	 * @generated
	 */
	public Adapter createActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.HowLink <em>How Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.HowLink
	 * @generated
	 */
	public Adapter createHowLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink <em>What Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhatLink
	 * @generated
	 */
	public Adapter createWhatLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink <em>Where Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhereLink
	 * @generated
	 */
	public Adapter createWhereLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink <em>Who Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhoLink
	 * @generated
	 */
	public Adapter createWhoLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink <em>When Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhenLink
	 * @generated
	 */
	public Adapter createWhenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink <em>Why Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.WhyLink
	 * @generated
	 */
	public Adapter createWhyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend <em>Policy Attribute Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend
	 * @generated
	 */
	public Adapter createPolicyAttributeExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink <em>Policy Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeLink
	 * @generated
	 */
	public Adapter createPolicyAttributeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup <em>Policy Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup
	 * @generated
	 */
	public Adapter createPolicyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink <em>Policy Group Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroupLink
	 * @generated
	 */
	public Adapter createPolicyGroupLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CerbacProfileAdapterFactory
