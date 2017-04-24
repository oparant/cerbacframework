/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.Where;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereImpl#getAccessPoint <em>Access Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends PolicyAttributesImpl implements Where {
	/**
	 * The default value of the '{@link #getAccessPoint() <em>Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPoint() <em>Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoint()
	 * @generated
	 * @ordered
	 */
	protected String accessPoint = ACCESS_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacProfilePackage.Literals.WHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessPoint() {
		return accessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessPoint(String newAccessPoint) {
		String oldAccessPoint = accessPoint;
		accessPoint = newAccessPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.WHERE__ACCESS_POINT, oldAccessPoint, accessPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CerbacProfilePackage.WHERE__ACCESS_POINT:
				return getAccessPoint();
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
			case CerbacProfilePackage.WHERE__ACCESS_POINT:
				setAccessPoint((String)newValue);
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
			case CerbacProfilePackage.WHERE__ACCESS_POINT:
				setAccessPoint(ACCESS_POINT_EDEFAULT);
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
			case CerbacProfilePackage.WHERE__ACCESS_POINT:
				return ACCESS_POINT_EDEFAULT == null ? accessPoint != null : !ACCESS_POINT_EDEFAULT.equals(accessPoint);
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
		result.append(" (accessPoint: ");
		result.append(accessPoint);
		result.append(')');
		return result.toString();
	}

} //WhereImpl
