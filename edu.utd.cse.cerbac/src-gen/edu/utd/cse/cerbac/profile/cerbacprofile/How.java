/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>How</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.How#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getHow()
 * @model
 * @generated
 */
public interface How extends PolicyAttributes {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getHow_Device()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.How#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

} // How
