/**
 */
package hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Room#getName <em>Name</em>}</li>
 *   <li>{@link hal.Room#getHome <em>Home</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hal.HalPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hal.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(SmartHome)
	 * @see hal.HalPackage#getRoom_Home()
	 * @model containment="true"
	 * @generated
	 */
	SmartHome getHome();

	/**
	 * Sets the value of the '{@link hal.Room#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(SmartHome value);

} // Room
