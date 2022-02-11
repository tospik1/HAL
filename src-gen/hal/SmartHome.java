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
 *   <li>{@link hal.SmartHome#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link hal.SmartHome#isIsOperational <em>Is Operational</em>}</li>
 *   <li>{@link hal.SmartHome#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see #setNewAttribute(String)
	 * @see hal.HalPackage#getSmartHome_NewAttribute()
	 * @model
	 * @generated
	 */
	String getNewAttribute();

	/**
	 * Sets the value of the '{@link hal.SmartHome#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(String value);

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
	 * Returns the value of the '<em><b>Actuator</b></em>' reference list.
	 * The list contents are of type {@link hal.Actuator}.
	 * It is bidirectional and its opposite is '{@link hal.Actuator#getSmarthome <em>Smarthome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference list.
	 * @see hal.HalPackage#getSmartHome_Actuator()
	 * @see hal.Actuator#getSmarthome
	 * @model opposite="smarthome"
	 * @generated
	 */
	EList<Actuator> getActuator();

} // SmartHome
