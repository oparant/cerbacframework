/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getAccessPoint <em>Access Point</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends PolicyAttributes {
	/**
	 * Returns the value of the '<em><b>Access Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Point</em>' attribute.
	 * @see #setAccessPoint(String)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhere_AccessPoint()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAccessPoint();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getAccessPoint <em>Access Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Point</em>' attribute.
	 * @see #getAccessPoint()
	 * @generated
	 */
	void setAccessPoint(String value);

} // Where
