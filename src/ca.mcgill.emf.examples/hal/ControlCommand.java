/**
 */
package hal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.ControlCommand#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hal.ControlCommand#getType <em>Type</em>}</li>
 *   <li>{@link hal.ControlCommand#getAction <em>Action</em>}</li>
 *   <li>{@link hal.ControlCommand#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getControlCommand()
 * @model
 * @generated
 */
public interface ControlCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see hal.HalPackage#getControlCommand_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link hal.ControlCommand#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.ControlCommandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hal.ControlCommandType
	 * @see #setType(ControlCommandType)
	 * @see hal.HalPackage#getControlCommand_Type()
	 * @model
	 * @generated
	 */
	ControlCommandType getType();

	/**
	 * Sets the value of the '{@link hal.ControlCommand#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hal.ControlCommandType
	 * @see #getType()
	 * @generated
	 */
	void setType(ControlCommandType value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.Action#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see hal.HalPackage#getControlCommand_Action()
	 * @see hal.Action#getControlcommand
	 * @model opposite="controlcommand" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link hal.ControlCommand#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.Actuator#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see hal.HalPackage#getControlCommand_Actuator()
	 * @see hal.Actuator#getControlcommand
	 * @model opposite="controlcommand" required="true"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link hal.ControlCommand#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // ControlCommand
