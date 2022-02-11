/**
 */
package hal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hal.HalPackage
 * @generated
 */
public interface HalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalFactory eINSTANCE = hal.impl.HalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Smart Home</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Home</em>'.
	 * @generated
	 */
	SmartHome createSmartHome();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Sensor Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Device</em>'.
	 * @generated
	 */
	SensorDevice createSensorDevice();

	/**
	 * Returns a new object of class '<em>Sensor Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Reading</em>'.
	 * @generated
	 */
	SensorReading createSensorReading();

	/**
	 * Returns a new object of class '<em>Activity Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Log</em>'.
	 * @generated
	 */
	ActivityLog createActivityLog();

	/**
	 * Returns a new object of class '<em>Automation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automation Rule</em>'.
	 * @generated
	 */
	AutomationRule createAutomationRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HalPackage getHalPackage();

} //HalFactory
