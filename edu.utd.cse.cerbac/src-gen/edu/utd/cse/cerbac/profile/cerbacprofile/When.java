/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.When#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhen()
 * @model
 * @generated
 */
public interface When extends PolicyAttributes {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage#getWhen_Time()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link edu.utd.cse.cerbac.profile.cerbacprofile.When#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

} // When
