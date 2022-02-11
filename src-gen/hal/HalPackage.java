/**
 */
package hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link hal.impl.SmartHomeImpl <em>Smart Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SmartHomeImpl
	 * @see hal.impl.HalPackageImpl#getSmartHome()
	 * @generated
	 */
	int SMART_HOME = 0;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__NEW_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__IS_OPERATIONAL = 1;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ACTUATOR = 2;

	/**
	 * The number of structural features of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.RoomImpl
	 * @see hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HOME = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.DeviceImpl
	 * @see hal.impl.HalPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IS_ACTIVATED = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ROOM = 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActuatorImpl
	 * @see hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IS_ACTIVATED = DEVICE__IS_ACTIVATED;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ROOM = DEVICE__ROOM;

	/**
	 * The feature id for the '<em><b>Control Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONTROL_COMMAND = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TIME_STAMP = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Smarthome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SMARTHOME = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actuator Log</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATOR_LOG = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorDeviceImpl <em>Sensor Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorDeviceImpl
	 * @see hal.impl.HalPackageImpl#getSensorDevice()
	 * @generated
	 */
	int SENSOR_DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__TYPE = DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__IS_ACTIVATED = DEVICE__IS_ACTIVATED;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE__ROOM = DEVICE__ROOM;

	/**
	 * The number of structural features of the '<em>Sensor Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DEVICE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorReadingImpl
	 * @see hal.impl.HalPackageImpl#getSensorReading()
	 * @generated
	 */
	int SENSOR_READING = 5;

	/**
	 * The feature id for the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__MEASURED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Sensordevice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__SENSORDEVICE = 2;

	/**
	 * The feature id for the '<em><b>Activity Log</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__ACTIVITY_LOG = 3;

	/**
	 * The number of structural features of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActivityLogImpl
	 * @see hal.impl.HalPackageImpl#getActivityLog()
	 * @generated
	 */
	int ACTIVITY_LOG = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.AutomationRuleImpl
	 * @see hal.impl.HalPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PASSWORD = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.ControlCommand <em>Control Command</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.ControlCommand
	 * @see hal.impl.HalPackageImpl#getControlCommand()
	 * @generated
	 */
	int CONTROL_COMMAND = 8;

	/**
	 * The meta object id for the '{@link hal.DeviceType <em>Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.DeviceType
	 * @see hal.impl.HalPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link hal.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Home</em>'.
	 * @see hal.SmartHome
	 * @generated
	 */
	EClass getSmartHome();

	/**
	 * Returns the meta object for the attribute '{@link hal.SmartHome#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see hal.SmartHome#getNewAttribute()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_NewAttribute();

	/**
	 * Returns the meta object for the attribute '{@link hal.SmartHome#isIsOperational <em>Is Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Operational</em>'.
	 * @see hal.SmartHome#isIsOperational()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_IsOperational();

	/**
	 * Returns the meta object for the reference list '{@link hal.SmartHome#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator</em>'.
	 * @see hal.SmartHome#getActuator()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Actuator();

	/**
	 * Returns the meta object for class '{@link hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link hal.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hal.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hal.Room#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home</em>'.
	 * @see hal.Room#getHome()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Home();

	/**
	 * Returns the meta object for class '{@link hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see hal.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link hal.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hal.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Type();

	/**
	 * Returns the meta object for the attribute '{@link hal.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hal.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link hal.Device#isIsActivated <em>Is Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Activated</em>'.
	 * @see hal.Device#isIsActivated()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_IsActivated();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.Device#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see hal.Device#getRoom()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Room();

	/**
	 * Returns the meta object for class '{@link hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link hal.Actuator#getControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Command</em>'.
	 * @see hal.Actuator#getControlCommand()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_ControlCommand();

	/**
	 * Returns the meta object for the attribute '{@link hal.Actuator#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see hal.Actuator#getTimeStamp()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_TimeStamp();

	/**
	 * Returns the meta object for the reference '{@link hal.Actuator#getSmarthome <em>Smarthome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Smarthome</em>'.
	 * @see hal.Actuator#getSmarthome()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Smarthome();

	/**
	 * Returns the meta object for the reference list '{@link hal.Actuator#getActuatorLog <em>Actuator Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator Log</em>'.
	 * @see hal.Actuator#getActuatorLog()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_ActuatorLog();

	/**
	 * Returns the meta object for class '{@link hal.SensorDevice <em>Sensor Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Device</em>'.
	 * @see hal.SensorDevice
	 * @generated
	 */
	EClass getSensorDevice();

	/**
	 * Returns the meta object for class '{@link hal.SensorReading <em>Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Reading</em>'.
	 * @see hal.SensorReading
	 * @generated
	 */
	EClass getSensorReading();

	/**
	 * Returns the meta object for the attribute '{@link hal.SensorReading#getMeasuredValue <em>Measured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Value</em>'.
	 * @see hal.SensorReading#getMeasuredValue()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_MeasuredValue();

	/**
	 * Returns the meta object for the attribute '{@link hal.SensorReading#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see hal.SensorReading#getTimeStamp()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_TimeStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.SensorReading#getSensordevice <em>Sensordevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensordevice</em>'.
	 * @see hal.SensorReading#getSensordevice()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_Sensordevice();

	/**
	 * Returns the meta object for the reference list '{@link hal.SensorReading#getActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Log</em>'.
	 * @see hal.SensorReading#getActivityLog()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_ActivityLog();

	/**
	 * Returns the meta object for class '{@link hal.ActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Log</em>'.
	 * @see hal.ActivityLog
	 * @generated
	 */
	EClass getActivityLog();

	/**
	 * Returns the meta object for the reference list '{@link hal.ActivityLog#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see hal.ActivityLog#getActivity()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Activity();

	/**
	 * Returns the meta object for the reference list '{@link hal.ActivityLog#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator</em>'.
	 * @see hal.ActivityLog#getActuator()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Actuator();

	/**
	 * Returns the meta object for class '{@link hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see hal.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the attribute '{@link hal.AutomationRule#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see hal.AutomationRule#getPassword()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Password();

	/**
	 * Returns the meta object for the attribute '{@link hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see hal.AutomationRule#getPrecondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link hal.AutomationRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see hal.AutomationRule#getAction()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Action();

	/**
	 * Returns the meta object for enum '{@link hal.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Command</em>'.
	 * @see hal.ControlCommand
	 * @generated
	 */
	EEnum getControlCommand();

	/**
	 * Returns the meta object for enum '{@link hal.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Type</em>'.
	 * @see hal.DeviceType
	 * @generated
	 */
	EEnum getDeviceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hal.impl.SmartHomeImpl <em>Smart Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SmartHomeImpl
		 * @see hal.impl.HalPackageImpl#getSmartHome()
		 * @generated
		 */
		EClass SMART_HOME = eINSTANCE.getSmartHome();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__NEW_ATTRIBUTE = eINSTANCE.getSmartHome_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__IS_OPERATIONAL = eINSTANCE.getSmartHome_IsOperational();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__ACTUATOR = eINSTANCE.getSmartHome_Actuator();

		/**
		 * The meta object literal for the '{@link hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.RoomImpl
		 * @see hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HOME = eINSTANCE.getRoom_Home();

		/**
		 * The meta object literal for the '{@link hal.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.DeviceImpl
		 * @see hal.impl.HalPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Is Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__IS_ACTIVATED = eINSTANCE.getDevice_IsActivated();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ROOM = eINSTANCE.getDevice_Room();

		/**
		 * The meta object literal for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActuatorImpl
		 * @see hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Control Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__CONTROL_COMMAND = eINSTANCE.getActuator_ControlCommand();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TIME_STAMP = eINSTANCE.getActuator_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Smarthome</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__SMARTHOME = eINSTANCE.getActuator_Smarthome();

		/**
		 * The meta object literal for the '<em><b>Actuator Log</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTUATOR_LOG = eINSTANCE.getActuator_ActuatorLog();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorDeviceImpl <em>Sensor Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorDeviceImpl
		 * @see hal.impl.HalPackageImpl#getSensorDevice()
		 * @generated
		 */
		EClass SENSOR_DEVICE = eINSTANCE.getSensorDevice();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorReadingImpl
		 * @see hal.impl.HalPackageImpl#getSensorReading()
		 * @generated
		 */
		EClass SENSOR_READING = eINSTANCE.getSensorReading();

		/**
		 * The meta object literal for the '<em><b>Measured Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__MEASURED_VALUE = eINSTANCE.getSensorReading_MeasuredValue();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__TIME_STAMP = eINSTANCE.getSensorReading_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Sensordevice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__SENSORDEVICE = eINSTANCE.getSensorReading_Sensordevice();

		/**
		 * The meta object literal for the '<em><b>Activity Log</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__ACTIVITY_LOG = eINSTANCE.getSensorReading_ActivityLog();

		/**
		 * The meta object literal for the '{@link hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActivityLogImpl
		 * @see hal.impl.HalPackageImpl#getActivityLog()
		 * @generated
		 */
		EClass ACTIVITY_LOG = eINSTANCE.getActivityLog();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__ACTIVITY = eINSTANCE.getActivityLog_Activity();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__ACTUATOR = eINSTANCE.getActivityLog_Actuator();

		/**
		 * The meta object literal for the '{@link hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.AutomationRuleImpl
		 * @see hal.impl.HalPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__PASSWORD = eINSTANCE.getAutomationRule_Password();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__PRECONDITION = eINSTANCE.getAutomationRule_Precondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__ACTION = eINSTANCE.getAutomationRule_Action();

		/**
		 * The meta object literal for the '{@link hal.ControlCommand <em>Control Command</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.ControlCommand
		 * @see hal.impl.HalPackageImpl#getControlCommand()
		 * @generated
		 */
		EEnum CONTROL_COMMAND = eINSTANCE.getControlCommand();

		/**
		 * The meta object literal for the '{@link hal.DeviceType <em>Device Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.DeviceType
		 * @see hal.impl.HalPackageImpl#getDeviceType()
		 * @generated
		 */
		EEnum DEVICE_TYPE = eINSTANCE.getDeviceType();

	}

} //HalPackage
