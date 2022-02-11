/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.Actuator;
import hal.AutomationRule;
import hal.ControlCommand;
import hal.Device;
import hal.DeviceType;
import hal.HalFactory;
import hal.HalPackage;
import hal.Room;
import hal.SensorDevice;
import hal.SensorReading;
import hal.SmartHome;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HalPackageImpl extends EPackageImpl implements HalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartHomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlCommandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hal.HalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HalPackageImpl() {
		super(eNS_URI, HalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HalPackage init() {
		if (isInited)
			return (HalPackage) EPackage.Registry.INSTANCE.getEPackage(HalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HalPackageImpl theHalPackage = registeredHalPackage instanceof HalPackageImpl
				? (HalPackageImpl) registeredHalPackage
				: new HalPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHalPackage.createPackageContents();

		// Initialize created meta-data
		theHalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HalPackage.eNS_URI, theHalPackage);
		return theHalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartHome() {
		return smartHomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartHome_NewAttribute() {
		return (EAttribute) smartHomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartHome_IsOperational() {
		return (EAttribute) smartHomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartHome_Actuator() {
		return (EReference) smartHomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Name() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Home() {
		return (EReference) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Type() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_IsActivated() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Room() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_ControlCommand() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_TimeStamp() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Smarthome() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_ActuatorLog() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorDevice() {
		return sensorDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorReading() {
		return sensorReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorReading_MeasuredValue() {
		return (EAttribute) sensorReadingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorReading_TimeStamp() {
		return (EAttribute) sensorReadingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorReading_Sensordevice() {
		return (EReference) sensorReadingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorReading_ActivityLog() {
		return (EReference) sensorReadingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLog() {
		return activityLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLog_Activity() {
		return (EReference) activityLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLog_Actuator() {
		return (EReference) activityLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomationRule() {
		return automationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomationRule_Password() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomationRule_Precondition() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomationRule_Action() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlCommand() {
		return controlCommandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceType() {
		return deviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalFactory getHalFactory() {
		return (HalFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		smartHomeEClass = createEClass(SMART_HOME);
		createEAttribute(smartHomeEClass, SMART_HOME__NEW_ATTRIBUTE);
		createEAttribute(smartHomeEClass, SMART_HOME__IS_OPERATIONAL);
		createEReference(smartHomeEClass, SMART_HOME__ACTUATOR);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);
		createEReference(roomEClass, ROOM__HOME);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__TYPE);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEAttribute(deviceEClass, DEVICE__IS_ACTIVATED);
		createEReference(deviceEClass, DEVICE__ROOM);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__CONTROL_COMMAND);
		createEAttribute(actuatorEClass, ACTUATOR__TIME_STAMP);
		createEReference(actuatorEClass, ACTUATOR__SMARTHOME);
		createEReference(actuatorEClass, ACTUATOR__ACTUATOR_LOG);

		sensorDeviceEClass = createEClass(SENSOR_DEVICE);

		sensorReadingEClass = createEClass(SENSOR_READING);
		createEAttribute(sensorReadingEClass, SENSOR_READING__MEASURED_VALUE);
		createEAttribute(sensorReadingEClass, SENSOR_READING__TIME_STAMP);
		createEReference(sensorReadingEClass, SENSOR_READING__SENSORDEVICE);
		createEReference(sensorReadingEClass, SENSOR_READING__ACTIVITY_LOG);

		activityLogEClass = createEClass(ACTIVITY_LOG);
		createEReference(activityLogEClass, ACTIVITY_LOG__ACTIVITY);
		createEReference(activityLogEClass, ACTIVITY_LOG__ACTUATOR);

		automationRuleEClass = createEClass(AUTOMATION_RULE);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__PASSWORD);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__PRECONDITION);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__ACTION);

		// Create enums
		controlCommandEEnum = createEEnum(CONTROL_COMMAND);
		deviceTypeEEnum = createEEnum(DEVICE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actuatorEClass.getESuperTypes().add(this.getDevice());
		sensorDeviceEClass.getESuperTypes().add(this.getDevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(smartHomeEClass, SmartHome.class, "SmartHome", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartHome_NewAttribute(), ecorePackage.getEString(), "newAttribute", null, 0, 1,
				SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartHome_IsOperational(), ecorePackage.getEBoolean(), "isOperational", null, 0, 1,
				SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSmartHome_Actuator(), this.getActuator(), this.getActuator_Smarthome(), "actuator", null, 0,
				-1, SmartHome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Home(), this.getSmartHome(), null, "home", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Type(), this.getDeviceType(), "type", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_IsActivated(), ecorePackage.getEBoolean(), "isActivated", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Room(), this.getRoom(), null, "room", null, 0, -1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_ControlCommand(), this.getControlCommand(), "controlCommand", null, 0, 1,
				Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Smarthome(), this.getSmartHome(), this.getSmartHome_Actuator(), "smarthome", null, 0,
				1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_ActuatorLog(), this.getActivityLog(), this.getActivityLog_Actuator(), "actuatorLog",
				null, 0, -1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorDeviceEClass, SensorDevice.class, "SensorDevice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorReadingEClass, SensorReading.class, "SensorReading", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorReading_MeasuredValue(), ecorePackage.getEDouble(), "measuredValue", null, 0, 1,
				SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorReading_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1,
				SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSensorReading_Sensordevice(), this.getSensorDevice(), null, "sensordevice", null, 0, -1,
				SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorReading_ActivityLog(), this.getActivityLog(), this.getActivityLog_Activity(),
				"activityLog", null, 0, -1, SensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityLogEClass, ActivityLog.class, "ActivityLog", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityLog_Activity(), this.getSensorReading(), this.getSensorReading_ActivityLog(),
				"activity", null, 0, -1, ActivityLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityLog_Actuator(), this.getActuator(), this.getActuator_ActuatorLog(), "actuator", null,
				0, -1, ActivityLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automationRuleEClass, AutomationRule.class, "AutomationRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomationRule_Password(), ecorePackage.getEString(), "password", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomationRule_Precondition(), ecorePackage.getEBooleanObject(), "precondition", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomationRule_Action(), ecorePackage.getEString(), "action", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(controlCommandEEnum, ControlCommand.class, "ControlCommand");
		addEEnumLiteral(controlCommandEEnum, ControlCommand.LOCKDOOR);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.TURNONHEATING);
		addEEnumLiteral(controlCommandEEnum, ControlCommand.TURNOFFHEATING);

		initEEnum(deviceTypeEEnum, DeviceType.class, "DeviceType");
		addEEnumLiteral(deviceTypeEEnum, DeviceType.TEMPERATURE);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.MOVEMENT);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.LIGHTS);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.LOCKS);

		// Create resource
		createResource(eNS_URI);
	}

} //HalPackageImpl
