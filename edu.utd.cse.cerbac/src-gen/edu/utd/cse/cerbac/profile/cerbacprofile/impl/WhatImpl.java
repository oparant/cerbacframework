/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource;
import edu.utd.cse.cerbac.profile.cerbacprofile.What;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl#getResourceDescription <em>Resource Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhatImpl extends PolicyAttributesImpl implements What {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected CloudResource resource;

	/**
	 * The default value of the '{@link #getResourceDescription() <em>Resource Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceDescription() <em>Resource Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDescription()
	 * @generated
	 * @ordered
	 */
	protected String resourceDescription = RESOURCE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacProfilePackage.Literals.WHAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (CloudResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.WHAT__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(CloudResource newResource) {
		CloudResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.WHAT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceDescription() {
		return resourceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDescription(String newResourceDescription) {
		String oldResourceDescription = resourceDescription;
		resourceDescription = newResourceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.WHAT__RESOURCE_DESCRIPTION, oldResourceDescription, resourceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CerbacProfilePackage.WHAT__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case CerbacProfilePackage.WHAT__RESOURCE_DESCRIPTION:
				return getResourceDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CerbacProfilePackage.WHAT__RESOURCE:
				setResource((CloudResource)newValue);
				return;
			case CerbacProfilePackage.WHAT__RESOURCE_DESCRIPTION:
				setResourceDescription((String)newValue);
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
			case CerbacProfilePackage.WHAT__RESOURCE:
				setResource((CloudResource)null);
				return;
			case CerbacProfilePackage.WHAT__RESOURCE_DESCRIPTION:
				setResourceDescription(RESOURCE_DESCRIPTION_EDEFAULT);
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
			case CerbacProfilePackage.WHAT__RESOURCE:
				return resource != null;
			case CerbacProfilePackage.WHAT__RESOURCE_DESCRIPTION:
				return RESOURCE_DESCRIPTION_EDEFAULT == null ? resourceDescription != null : !RESOURCE_DESCRIPTION_EDEFAULT.equals(resourceDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resourceDescription: ");
		result.append(resourceDescription);
		result.append(')');
		return result.toString();
	}

} //WhatImpl
