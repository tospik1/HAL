/**
 */
package hal;

import java.util.Date;

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
 *   <li>{@link hal.Actuator#getControlCommand <em>Control Command</em>}</li>
 *   <li>{@link hal.Actuator#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link hal.Actuator#getSmarthome <em>Smarthome</em>}</li>
 *   <li>{@link hal.Actuator#getActuatorLog <em>Actuator Log</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Control Command</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.ControlCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Command</em>' attribute.
	 * @see hal.ControlCommand
	 * @see #setControlCommand(ControlCommand)
	 * @see hal.HalPackage#getActuator_ControlCommand()
	 * @model
	 * @generated
	 */
	ControlCommand getControlCommand();

	/**
	 * Sets the value of the '{@link hal.Actuator#getControlCommand <em>Control Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Command</em>' attribute.
	 * @see hal.ControlCommand
	 * @see #getControlCommand()
	 * @generated
	 */
	void setControlCommand(ControlCommand value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see hal.HalPackage#getActuator_TimeStamp()
	 * @model
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link hal.Actuator#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Smarthome</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.SmartHome#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smarthome</em>' reference.
	 * @see #setSmarthome(SmartHome)
	 * @see hal.HalPackage#getActuator_Smarthome()
	 * @see hal.SmartHome#getActuator
	 * @model opposite="actuator"
	 * @generated
	 */
	SmartHome getSmarthome();

	/**
	 * Sets the value of the '{@link hal.Actuator#getSmarthome <em>Smarthome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smarthome</em>' reference.
	 * @see #getSmarthome()
	 * @generated
	 */
	void setSmarthome(SmartHome value);

	/**
	 * Returns the value of the '<em><b>Actuator Log</b></em>' reference list.
	 * The list contents are of type {@link hal.ActivityLog}.
	 * It is bidirectional and its opposite is '{@link hal.ActivityLog#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Log</em>' reference list.
	 * @see hal.HalPackage#getActuator_ActuatorLog()
	 * @see hal.ActivityLog#getActuator
	 * @model opposite="actuator"
	 * @generated
	 */
	EList<ActivityLog> getActuatorLog();

} // Actuator
