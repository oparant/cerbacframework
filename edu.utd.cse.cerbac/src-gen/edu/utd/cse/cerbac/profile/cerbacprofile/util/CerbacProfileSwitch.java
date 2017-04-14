/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.util;

import edu.utd.cse.cerbac.profile.cerbacprofile.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage
 * @generated
 */
public class CerbacProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CerbacProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerbacProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = CerbacProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CerbacProfilePackage.CLOUD_SECURITY_AND_PRIVACY_POLICY: {
				CloudSecurityAndPrivacyPolicy cloudSecurityAndPrivacyPolicy = (CloudSecurityAndPrivacyPolicy)theEObject;
				T result = caseCloudSecurityAndPrivacyPolicy(cloudSecurityAndPrivacyPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.CERBAC_POLICY: {
				CerbacPolicy cerbacPolicy = (CerbacPolicy)theEObject;
				T result = caseCerbacPolicy(cerbacPolicy);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(cerbacPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHO: {
				Who who = (Who)theEObject;
				T result = caseWho(who);
				if (result == null) result = casePolicyAttributes(who);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POLICY_ATTRIBUTES: {
				PolicyAttributes policyAttributes = (PolicyAttributes)theEObject;
				T result = casePolicyAttributes(policyAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHERE: {
				Where where = (Where)theEObject;
				T result = caseWhere(where);
				if (result == null) result = casePolicyAttributes(where);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHY: {
				Why why = (Why)theEObject;
				T result = caseWhy(why);
				if (result == null) result = casePolicyAttributes(why);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.HOW: {
				How how = (How)theEObject;
				T result = caseHow(how);
				if (result == null) result = casePolicyAttributes(how);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHEN: {
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = casePolicyAttributes(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHAT: {
				What what = (What)theEObject;
				T result = caseWhat(what);
				if (result == null) result = casePolicyAttributes(what);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.AUTHORIZATION_POLICY: {
				AuthorizationPolicy authorizationPolicy = (AuthorizationPolicy)theEObject;
				T result = caseAuthorizationPolicy(authorizationPolicy);
				if (result == null) result = caseCerbacPolicy(authorizationPolicy);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(authorizationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.OBLIGATION_POLICY: {
				ObligationPolicy obligationPolicy = (ObligationPolicy)theEObject;
				T result = caseObligationPolicy(obligationPolicy);
				if (result == null) result = caseCerbacPolicy(obligationPolicy);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(obligationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POSITIVE_AUTHORIZATION: {
				PositiveAuthorization positiveAuthorization = (PositiveAuthorization)theEObject;
				T result = casePositiveAuthorization(positiveAuthorization);
				if (result == null) result = caseAuthorizationPolicy(positiveAuthorization);
				if (result == null) result = caseCerbacPolicy(positiveAuthorization);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(positiveAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.NEGATIVE_AUTHORIZATION: {
				NegativeAuthorization negativeAuthorization = (NegativeAuthorization)theEObject;
				T result = caseNegativeAuthorization(negativeAuthorization);
				if (result == null) result = caseAuthorizationPolicy(negativeAuthorization);
				if (result == null) result = caseCerbacPolicy(negativeAuthorization);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(negativeAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POSITIVE_OBLIGATION: {
				PositiveObligation positiveObligation = (PositiveObligation)theEObject;
				T result = casePositiveObligation(positiveObligation);
				if (result == null) result = caseObligationPolicy(positiveObligation);
				if (result == null) result = caseCerbacPolicy(positiveObligation);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(positiveObligation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.NEGATIVE_OBLIGATION: {
				NegativeObligation negativeObligation = (NegativeObligation)theEObject;
				T result = caseNegativeObligation(negativeObligation);
				if (result == null) result = caseObligationPolicy(negativeObligation);
				if (result == null) result = caseCerbacPolicy(negativeObligation);
				if (result == null) result = caseCloudSecurityAndPrivacyPolicy(negativeObligation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POLICY_PACKAGE: {
				PolicyPackage policyPackage = (PolicyPackage)theEObject;
				T result = casePolicyPackage(policyPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.CLOUD_RESOURCE: {
				CloudResource cloudResource = (CloudResource)theEObject;
				T result = caseCloudResource(cloudResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.CLOUD_SERVICE: {
				CloudService cloudService = (CloudService)theEObject;
				T result = caseCloudService(cloudService);
				if (result == null) result = caseCloudResource(cloudService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.HARDWARE: {
				Hardware hardware = (Hardware)theEObject;
				T result = caseHardware(hardware);
				if (result == null) result = caseCloudResource(hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseCloudResource(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.COMPUTE_SERVICE: {
				ComputeService computeService = (ComputeService)theEObject;
				T result = caseComputeService(computeService);
				if (result == null) result = caseCloudService(computeService);
				if (result == null) result = caseCloudResource(computeService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.NETWORKING_SERVICE: {
				NetworkingService networkingService = (NetworkingService)theEObject;
				T result = caseNetworkingService(networkingService);
				if (result == null) result = caseCloudService(networkingService);
				if (result == null) result = caseCloudResource(networkingService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.STORAGE_SERVICE: {
				StorageService storageService = (StorageService)theEObject;
				T result = caseStorageService(storageService);
				if (result == null) result = caseCloudService(storageService);
				if (result == null) result = caseCloudResource(storageService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseCloudResource(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.ACTION_LINK: {
				ActionLink actionLink = (ActionLink)theEObject;
				T result = caseActionLink(actionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.HOW_LINK: {
				HowLink howLink = (HowLink)theEObject;
				T result = caseHowLink(howLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHAT_LINK: {
				WhatLink whatLink = (WhatLink)theEObject;
				T result = caseWhatLink(whatLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHERE_LINK: {
				WhereLink whereLink = (WhereLink)theEObject;
				T result = caseWhereLink(whereLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHO_LINK: {
				WhoLink whoLink = (WhoLink)theEObject;
				T result = caseWhoLink(whoLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHEN_LINK: {
				WhenLink whenLink = (WhenLink)theEObject;
				T result = caseWhenLink(whenLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.WHY_LINK: {
				WhyLink whyLink = (WhyLink)theEObject;
				T result = caseWhyLink(whyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND: {
				PolicyAttributeExtend policyAttributeExtend = (PolicyAttributeExtend)theEObject;
				T result = casePolicyAttributeExtend(policyAttributeExtend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POLICY_ATTRIBUTE_LINK: {
				PolicyAttributeLink policyAttributeLink = (PolicyAttributeLink)theEObject;
				T result = casePolicyAttributeLink(policyAttributeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POLICY_GROUP: {
				PolicyGroup policyGroup = (PolicyGroup)theEObject;
				T result = casePolicyGroup(policyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CerbacProfilePackage.POLICY_GROUP_LINK: {
				PolicyGroupLink policyGroupLink = (PolicyGroupLink)theEObject;
				T result = casePolicyGroupLink(policyGroupLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Security And Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Security And Privacy Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudSecurityAndPrivacyPolicy(CloudSecurityAndPrivacyPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cerbac Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cerbac Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCerbacPolicy(CerbacPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Who</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Who</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWho(Who object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyAttributes(PolicyAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhere(Where object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Why</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Why</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhy(Why object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>How</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>How</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHow(How object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhat(What object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationPolicy(AuthorizationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationPolicy(ObligationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveAuthorization(PositiveAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeAuthorization(NegativeAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Obligation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Obligation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveObligation(PositiveObligation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Obligation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Obligation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeObligation(NegativeObligation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyPackage(PolicyPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudResource(CloudResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudService(CloudService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardware(Hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputeService(ComputeService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networking Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networking Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkingService(NetworkingService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageService(StorageService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLink(ActionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>How Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>How Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHowLink(HowLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhatLink(WhatLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhereLink(WhereLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Who Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Who Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhoLink(WhoLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenLink(WhenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Why Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Why Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhyLink(WhyLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Attribute Extend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Attribute Extend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyAttributeExtend(PolicyAttributeExtend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Attribute Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Attribute Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyAttributeLink(PolicyAttributeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyGroup(PolicyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Group Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Group Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyGroupLink(PolicyGroupLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CerbacProfileSwitch
