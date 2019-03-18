/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Attribute Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeExtendImpl#getBase_Extension <em>Base Extension</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.PolicyAttributeExtendImpl#getBase_Generalization <em>Base Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyAttributeExtendImpl extends MinimalEObjectImpl.Container implements PolicyAttributeExtend {
	/**
	 * The cached value of the '{@link #getBase_Extension() <em>Base Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Extension()
	 * @generated
	 * @ordered
	 */
	protected Extension base_Extension;

	/**
	 * The cached value of the '{@link #getBase_Generalization() <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization base_Generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyAttributeExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacProfilePackage.Literals.POLICY_ATTRIBUTE_EXTEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getBase_Extension() {
		if (base_Extension != null && base_Extension.eIsProxy()) {
			InternalEObject oldBase_Extension = (InternalEObject)base_Extension;
			base_Extension = (Extension)eResolveProxy(oldBase_Extension);
			if (base_Extension != oldBase_Extension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION, oldBase_Extension, base_Extension));
			}
		}
		return base_Extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension basicGetBase_Extension() {
		return base_Extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Extension(Extension newBase_Extension) {
		Extension oldBase_Extension = base_Extension;
		base_Extension = newBase_Extension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION, oldBase_Extension, base_Extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getBase_Generalization() {
		if (base_Generalization != null && base_Generalization.eIsProxy()) {
			InternalEObject oldBase_Generalization = (InternalEObject)base_Generalization;
			base_Generalization = (Generalization)eResolveProxy(oldBase_Generalization);
			if (base_Generalization != oldBase_Generalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION, oldBase_Generalization, base_Generalization));
			}
		}
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetBase_Generalization() {
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Generalization(Generalization newBase_Generalization) {
		Generalization oldBase_Generalization = base_Generalization;
		base_Generalization = newBase_Generalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION, oldBase_Generalization, base_Generalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION:
				if (resolve) return getBase_Extension();
				return basicGetBase_Extension();
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION:
				if (resolve) return getBase_Generalization();
				return basicGetBase_Generalization();
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
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION:
				setBase_Extension((Extension)newValue);
				return;
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION:
				setBase_Generalization((Generalization)newValue);
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
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION:
				setBase_Extension((Extension)null);
				return;
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION:
				setBase_Generalization((Generalization)null);
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
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_EXTENSION:
				return base_Extension != null;
			case CerbacProfilePackage.POLICY_ATTRIBUTE_EXTEND__BASE_GENERALIZATION:
				return base_Generalization != null;
		}
		return super.eIsSet(featureID);
	}

} //PolicyAttributeExtendImpl
