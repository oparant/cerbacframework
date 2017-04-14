/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyGroupImpl#getCerbacpolicy <em>Cerbacpolicy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyGroupImpl extends MinimalEObjectImpl.Container implements PolicyGroup {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getCerbacpolicy() <em>Cerbacpolicy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCerbacpolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<CerbacPolicy> cerbacpolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacProfilePackage.Literals.POLICY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.POLICY_GROUP__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.POLICY_GROUP__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CerbacPolicy> getCerbacpolicy() {
		if (cerbacpolicy == null) {
			cerbacpolicy = new EObjectResolvingEList<CerbacPolicy>(CerbacPolicy.class, this, CerbacProfilePackage.POLICY_GROUP__CERBACPOLICY);
		}
		return cerbacpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CerbacProfilePackage.POLICY_GROUP__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case CerbacProfilePackage.POLICY_GROUP__CERBACPOLICY:
				return getCerbacpolicy();
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
			case CerbacProfilePackage.POLICY_GROUP__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case CerbacProfilePackage.POLICY_GROUP__CERBACPOLICY:
				getCerbacpolicy().clear();
				getCerbacpolicy().addAll((Collection<? extends CerbacPolicy>)newValue);
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
			case CerbacProfilePackage.POLICY_GROUP__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case CerbacProfilePackage.POLICY_GROUP__CERBACPOLICY:
				getCerbacpolicy().clear();
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
			case CerbacProfilePackage.POLICY_GROUP__BASE_CLASS:
				return base_Class != null;
			case CerbacProfilePackage.POLICY_GROUP__CERBACPOLICY:
				return cerbacpolicy != null && !cerbacpolicy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolicyGroupImpl
