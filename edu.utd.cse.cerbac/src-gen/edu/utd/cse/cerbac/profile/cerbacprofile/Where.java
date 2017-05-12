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
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getOrigin <em>Origin</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends PolicyAttributes {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhere_Origin()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhere_Location()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.Where#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // Where
