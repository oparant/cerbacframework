/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Attribute Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Extension <em>Base Extension</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Generalization <em>Base Generalization</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getPolicyAttributeExtend()
 * @model
 * @generated
 */
public interface PolicyAttributeExtend extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Extension</em>' reference.
	 * @see #setBase_Extension(Extension)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getPolicyAttributeExtend_Base_Extension()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Extension getBase_Extension();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Extension <em>Base Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Extension</em>' reference.
	 * @see #getBase_Extension()
	 * @generated
	 */
	void setBase_Extension(Extension value);

	/**
	 * Returns the value of the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Generalization</em>' reference.
	 * @see #setBase_Generalization(Generalization)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getPolicyAttributeExtend_Base_Generalization()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Generalization getBase_Generalization();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyAttributeExtend#getBase_Generalization <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Generalization</em>' reference.
	 * @see #getBase_Generalization()
	 * @generated
	 */
	void setBase_Generalization(Generalization value);

} // PolicyAttributeExtend
