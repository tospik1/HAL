/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.SmartHome#isIsOperational <em>Is Operational</em>}</li>
 *   <li>{@link hal.SmartHome#getAddress <em>Address</em>}</li>
 *   <li>{@link hal.SmartHome#getRoom <em>Room</em>}</li>
 *   <li>{@link hal.SmartHome#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Operational</em>' attribute.
	 * @see #setIsOperational(boolean)
	 * @see hal.HalPackage#getSmartHome_IsOperational()
	 * @model
	 * @generated
	 */
	boolean isIsOperational();

	/**
	 * Sets the value of the '{@link hal.SmartHome#isIsOperational <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Operational</em>' attribute.
	 * @see #isIsOperational()
	 * @generated
	 */
	void setIsOperational(boolean value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see hal.HalPackage#getSmartHome_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link hal.SmartHome#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see hal.HalPackage#getSmartHome_Room()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' containment reference list.
	 * The list contents are of type {@link hal.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' containment reference list.
	 * @see hal.HalPackage#getSmartHome_Automationrule()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRule> getAutomationrule();

} // SmartHome
