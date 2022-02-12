/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Actuator#getType <em>Type</em>}</li>
 *   <li>{@link hal.Actuator#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hal.ActuatorType
	 * @see #setType(ActuatorType)
	 * @see hal.HalPackage#getActuator_Type()
	 * @model
	 * @generated
	 */
	ActuatorType getType();

	/**
	 * Sets the value of the '{@link hal.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hal.ActuatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link hal.ControlCommand}.
	 * It is bidirectional and its opposite is '{@link hal.ControlCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see hal.HalPackage#getActuator_Controlcommand()
	 * @see hal.ControlCommand#getActuator
	 * @model opposite="actuator"
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

} // Actuator
