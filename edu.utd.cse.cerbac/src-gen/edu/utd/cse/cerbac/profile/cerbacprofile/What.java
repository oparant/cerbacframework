/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.What#getResource <em>Resource</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.What#getResourceDescription <em>Resource Description</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhat()
 * @model
 * @generated
 */
public interface What extends PolicyAttributes {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(CloudResource)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhat_Resource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CloudResource getResource();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.What#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(CloudResource value);

	/**
	 * Returns the value of the '<em><b>Resource Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Description</em>' attribute.
	 * @see #setResourceDescription(String)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhat_ResourceDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResourceDescription();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.What#getResourceDescription <em>Resource Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Description</em>' attribute.
	 * @see #getResourceDescription()
	 * @generated
	 */
	void setResourceDescription(String value);

} // What
