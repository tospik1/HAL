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
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__IS_OPERATIONAL = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ROOM = 2;

	/**
	 * The feature id for the '<em><b>Automationrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__AUTOMATIONRULE = 3;

	/**
	 * The number of structural features of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICE = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IS_ACTIVATED = 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONTROLCOMMAND = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorImpl
	 * @see hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IS_ACTIVATED = DEVICE__IS_ACTIVATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensorreading</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSORREADING = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Activity Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__ACTIVITY_LOG = 2;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__SENSOR = 3;

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
	 * The feature id for the '<em><b>Automationrule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__AUTOMATIONRULE = 1;

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
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__IS_ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTIVITYLOG = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__TIMESTAMP = 5;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.HomeAutomationSystemImpl <em>Home Automation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.HomeAutomationSystemImpl
	 * @see hal.impl.HalPackageImpl#getHomeAutomationSystem()
	 * @generated
	 */
	int HOME_AUTOMATION_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Smarthome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM__SMARTHOME = 0;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM__ACTIVITYLOG = 1;

	/**
	 * The number of structural features of the '<em>Home Automation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Home Automation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_AUTOMATION_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.PreconditionImpl
	 * @see hal.impl.HalPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 9;

	/**
	 * The feature id for the '<em><b>Relationalterms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__RELATIONALTERMS = 0;

	/**
	 * The feature id for the '<em><b>Booleanoperators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__BOOLEANOPERATORS = 1;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActionImpl
	 * @see hal.impl.HalPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The feature id for the '<em><b>Controlcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTROLCOMMAND = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.ControlCommandImpl <em>Control Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ControlCommandImpl
	 * @see hal.impl.HalPackageImpl#getControlCommand()
	 * @generated
	 */
	int CONTROL_COMMAND = 13;

	/**
	 * The meta object id for the '{@link hal.impl.RelationalTermsImpl <em>Relational Terms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.RelationalTermsImpl
	 * @see hal.impl.HalPackageImpl#getRelationalTerms()
	 * @generated
	 */
	int RELATIONAL_TERMS = 11;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TERMS__TERM = 0;

	/**
	 * The number of structural features of the '<em>Relational Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TERMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relational Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TERMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.BooleanOperatorsImpl <em>Boolean Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.BooleanOperatorsImpl
	 * @see hal.impl.HalPackageImpl#getBooleanOperators()
	 * @generated
	 */
	int BOOLEAN_OPERATORS = 12;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS__OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Boolean Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND__ACTUATOR = 3;

	/**
	 * The number of structural features of the '<em>Control Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Control Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.ControlCommandType <em>Control Command Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.ControlCommandType
	 * @see hal.impl.HalPackageImpl#getControlCommandType()
	 * @generated
	 */
	int CONTROL_COMMAND_TYPE = 14;

	/**
	 * The meta object id for the '{@link hal.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.ActuatorType
	 * @see hal.impl.HalPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link hal.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.SensorType
	 * @see hal.impl.HalPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 16;


	/**
	 * The meta object id for the '{@link hal.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.Operator
	 * @see hal.impl.HalPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 17;


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
	 * Returns the meta object for the attribute '{@link hal.SmartHome#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hal.SmartHome#getAddress()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.SmartHome#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see hal.SmartHome#getRoom()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Room();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.SmartHome#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Automationrule</em>'.
	 * @see hal.SmartHome#getAutomationrule()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Automationrule();

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
	 * Returns the meta object for the containment reference list '{@link hal.Room#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see hal.Room#getDevice()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Device();

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
	 * Returns the meta object for class '{@link hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link hal.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hal.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for the reference list '{@link hal.Actuator#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see hal.Actuator#getControlcommand()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Controlcommand();

	/**
	 * Returns the meta object for class '{@link hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link hal.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hal.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the reference list '{@link hal.Sensor#getSensorreading <em>Sensorreading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensorreading</em>'.
	 * @see hal.Sensor#getSensorreading()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Sensorreading();

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
	 * Returns the meta object for the attribute '{@link hal.SensorReading#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see hal.SensorReading#getTimestamp()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link hal.SensorReading#getActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Log</em>'.
	 * @see hal.SensorReading#getActivityLog()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_ActivityLog();

	/**
	 * Returns the meta object for the reference '{@link hal.SensorReading#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see hal.SensorReading#getSensor()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_Sensor();

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
	 * Returns the meta object for the reference list '{@link hal.ActivityLog#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Automationrule</em>'.
	 * @see hal.ActivityLog#getAutomationrule()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Automationrule();

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
	 * Returns the meta object for the containment reference list '{@link hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see hal.AutomationRule#getPrecondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.AutomationRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see hal.AutomationRule#getAction()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Action();

	/**
	 * Returns the meta object for the attribute '{@link hal.AutomationRule#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see hal.AutomationRule#isIsActive()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_IsActive();

	/**
	 * Returns the meta object for the reference '{@link hal.AutomationRule#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activitylog</em>'.
	 * @see hal.AutomationRule#getActivitylog()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Activitylog();

	/**
	 * Returns the meta object for the attribute '{@link hal.AutomationRule#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see hal.AutomationRule#getTimestamp()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Timestamp();

	/**
	 * Returns the meta object for class '{@link hal.HomeAutomationSystem <em>Home Automation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Automation System</em>'.
	 * @see hal.HomeAutomationSystem
	 * @generated
	 */
	EClass getHomeAutomationSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HomeAutomationSystem#getSmarthome <em>Smarthome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smarthome</em>'.
	 * @see hal.HomeAutomationSystem#getSmarthome()
	 * @see #getHomeAutomationSystem()
	 * @generated
	 */
	EReference getHomeAutomationSystem_Smarthome();

	/**
	 * Returns the meta object for the containment reference '{@link hal.HomeAutomationSystem#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activitylog</em>'.
	 * @see hal.HomeAutomationSystem#getActivitylog()
	 * @see #getHomeAutomationSystem()
	 * @generated
	 */
	EReference getHomeAutomationSystem_Activitylog();

	/**
	 * Returns the meta object for class '{@link hal.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see hal.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.Precondition#getRelationalterms <em>Relationalterms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationalterms</em>'.
	 * @see hal.Precondition#getRelationalterms()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Relationalterms();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.Precondition#getBooleanoperators <em>Booleanoperators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Booleanoperators</em>'.
	 * @see hal.Precondition#getBooleanoperators()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Booleanoperators();

	/**
	 * Returns the meta object for class '{@link hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see hal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link hal.Action#getControlcommand <em>Controlcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlcommand</em>'.
	 * @see hal.Action#getControlcommand()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Controlcommand();

	/**
	 * Returns the meta object for class '{@link hal.ControlCommand <em>Control Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Command</em>'.
	 * @see hal.ControlCommand
	 * @generated
	 */
	EClass getControlCommand();

	/**
	 * Returns the meta object for the attribute '{@link hal.ControlCommand#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see hal.ControlCommand#getTimestamp()
	 * @see #getControlCommand()
	 * @generated
	 */
	EAttribute getControlCommand_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link hal.ControlCommand#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hal.ControlCommand#getType()
	 * @see #getControlCommand()
	 * @generated
	 */
	EAttribute getControlCommand_Type();

	/**
	 * Returns the meta object for the reference '{@link hal.ControlCommand#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see hal.ControlCommand#getAction()
	 * @see #getControlCommand()
	 * @generated
	 */
	EReference getControlCommand_Action();

	/**
	 * Returns the meta object for the reference '{@link hal.ControlCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see hal.ControlCommand#getActuator()
	 * @see #getControlCommand()
	 * @generated
	 */
	EReference getControlCommand_Actuator();

	/**
	 * Returns the meta object for class '{@link hal.RelationalTerms <em>Relational Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Terms</em>'.
	 * @see hal.RelationalTerms
	 * @generated
	 */
	EClass getRelationalTerms();

	/**
	 * Returns the meta object for the attribute '{@link hal.RelationalTerms#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see hal.RelationalTerms#getTerm()
	 * @see #getRelationalTerms()
	 * @generated
	 */
	EAttribute getRelationalTerms_Term();

	/**
	 * Returns the meta object for class '{@link hal.BooleanOperators <em>Boolean Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operators</em>'.
	 * @see hal.BooleanOperators
	 * @generated
	 */
	EClass getBooleanOperators();

	/**
	 * Returns the meta object for the attribute '{@link hal.BooleanOperators#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hal.BooleanOperators#getOperator()
	 * @see #getBooleanOperators()
	 * @generated
	 */
	EAttribute getBooleanOperators_Operator();

	/**
	 * Returns the meta object for enum '{@link hal.ControlCommandType <em>Control Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Command Type</em>'.
	 * @see hal.ControlCommandType
	 * @generated
	 */
	EEnum getControlCommandType();

	/**
	 * Returns the meta object for enum '{@link hal.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see hal.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link hal.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see hal.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link hal.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see hal.Operator
	 * @generated
	 */
	EEnum getOperator();

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
		 * The meta object literal for the '<em><b>Is Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__IS_OPERATIONAL = eINSTANCE.getSmartHome_IsOperational();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__ADDRESS = eINSTANCE.getSmartHome_Address();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__ROOM = eINSTANCE.getSmartHome_Room();

		/**
		 * The meta object literal for the '<em><b>Automationrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__AUTOMATIONRULE = eINSTANCE.getSmartHome_Automationrule();

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
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DEVICE = eINSTANCE.getRoom_Device();

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
		 * The meta object literal for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActuatorImpl
		 * @see hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__CONTROLCOMMAND = eINSTANCE.getActuator_Controlcommand();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorImpl
		 * @see hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Sensorreading</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSORREADING = eINSTANCE.getSensor_Sensorreading();

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
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__TIMESTAMP = eINSTANCE.getSensorReading_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Activity Log</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__ACTIVITY_LOG = eINSTANCE.getSensorReading_ActivityLog();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__SENSOR = eINSTANCE.getSensorReading_Sensor();

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
		 * The meta object literal for the '<em><b>Automationrule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__AUTOMATIONRULE = eINSTANCE.getActivityLog_Automationrule();

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
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__PRECONDITION = eINSTANCE.getAutomationRule_Precondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTION = eINSTANCE.getAutomationRule_Action();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__IS_ACTIVE = eINSTANCE.getAutomationRule_IsActive();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTIVITYLOG = eINSTANCE.getAutomationRule_Activitylog();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__TIMESTAMP = eINSTANCE.getAutomationRule_Timestamp();

		/**
		 * The meta object literal for the '{@link hal.impl.HomeAutomationSystemImpl <em>Home Automation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.HomeAutomationSystemImpl
		 * @see hal.impl.HalPackageImpl#getHomeAutomationSystem()
		 * @generated
		 */
		EClass HOME_AUTOMATION_SYSTEM = eINSTANCE.getHomeAutomationSystem();

		/**
		 * The meta object literal for the '<em><b>Smarthome</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME_AUTOMATION_SYSTEM__SMARTHOME = eINSTANCE.getHomeAutomationSystem_Smarthome();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME_AUTOMATION_SYSTEM__ACTIVITYLOG = eINSTANCE.getHomeAutomationSystem_Activitylog();

		/**
		 * The meta object literal for the '{@link hal.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.PreconditionImpl
		 * @see hal.impl.HalPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Relationalterms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__RELATIONALTERMS = eINSTANCE.getPrecondition_Relationalterms();

		/**
		 * The meta object literal for the '<em><b>Booleanoperators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__BOOLEANOPERATORS = eINSTANCE.getPrecondition_Booleanoperators();

		/**
		 * The meta object literal for the '{@link hal.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActionImpl
		 * @see hal.impl.HalPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Controlcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTROLCOMMAND = eINSTANCE.getAction_Controlcommand();

		/**
		 * The meta object literal for the '{@link hal.impl.ControlCommandImpl <em>Control Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ControlCommandImpl
		 * @see hal.impl.HalPackageImpl#getControlCommand()
		 * @generated
		 */
		EClass CONTROL_COMMAND = eINSTANCE.getControlCommand();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_COMMAND__TIMESTAMP = eINSTANCE.getControlCommand_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_COMMAND__TYPE = eINSTANCE.getControlCommand_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_COMMAND__ACTION = eINSTANCE.getControlCommand_Action();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_COMMAND__ACTUATOR = eINSTANCE.getControlCommand_Actuator();

		/**
		 * The meta object literal for the '{@link hal.impl.RelationalTermsImpl <em>Relational Terms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.RelationalTermsImpl
		 * @see hal.impl.HalPackageImpl#getRelationalTerms()
		 * @generated
		 */
		EClass RELATIONAL_TERMS = eINSTANCE.getRelationalTerms();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_TERMS__TERM = eINSTANCE.getRelationalTerms_Term();

		/**
		 * The meta object literal for the '{@link hal.impl.BooleanOperatorsImpl <em>Boolean Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.BooleanOperatorsImpl
		 * @see hal.impl.HalPackageImpl#getBooleanOperators()
		 * @generated
		 */
		EClass BOOLEAN_OPERATORS = eINSTANCE.getBooleanOperators();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_OPERATORS__OPERATOR = eINSTANCE.getBooleanOperators_Operator();

		/**
		 * The meta object literal for the '{@link hal.ControlCommandType <em>Control Command Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.ControlCommandType
		 * @see hal.impl.HalPackageImpl#getControlCommandType()
		 * @generated
		 */
		EEnum CONTROL_COMMAND_TYPE = eINSTANCE.getControlCommandType();

		/**
		 * The meta object literal for the '{@link hal.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.ActuatorType
		 * @see hal.impl.HalPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link hal.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.SensorType
		 * @see hal.impl.HalPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link hal.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.Operator
		 * @see hal.impl.HalPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //HalPackage
