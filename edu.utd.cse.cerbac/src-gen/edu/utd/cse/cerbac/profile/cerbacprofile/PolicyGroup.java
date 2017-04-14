/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getCerbacpolicy <em>Cerbacpolicy</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getPolicyGroup()
 * @model
 * @generated
 */
public interface PolicyGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getPolicyGroup_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Cerbacpolicy</b></em>' reference list.
	 * The list contents are of type {@link edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cerbacpolicy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cerbacpolicy</em>' reference list.
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getPolicyGroup_Cerbacpolicy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CerbacPolicy> getCerbacpolicy();

} // PolicyGroup
