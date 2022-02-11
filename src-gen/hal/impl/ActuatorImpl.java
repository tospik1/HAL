/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.Actuator;
import hal.ControlCommand;
import hal.HalPackage;
import hal.SmartHome;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.ActuatorImpl#getControlCommand <em>Control Command</em>}</li>
 *   <li>{@link hal.impl.ActuatorImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link hal.impl.ActuatorImpl#getSmarthome <em>Smarthome</em>}</li>
 *   <li>{@link hal.impl.ActuatorImpl#getActuatorLog <em>Actuator Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends DeviceImpl implements Actuator {
	/**
	 * The default value of the '{@link #getControlCommand() <em>Control Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlCommand()
	 * @generated
	 * @ordered
	 */
	protected static final ControlCommand CONTROL_COMMAND_EDEFAULT = ControlCommand.LOCKDOOR;

	/**
	 * The cached value of the '{@link #getControlCommand() <em>Control Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlCommand()
	 * @generated
	 * @ordered
	 */
	protected ControlCommand controlCommand = CONTROL_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSmarthome() <em>Smarthome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmarthome()
	 * @generated
	 * @ordered
	 */
	protected SmartHome smarthome;

	/**
	 * The cached value of the '{@link #getActuatorLog() <em>Actuator Log</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorLog()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityLog> actuatorLog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCommand getControlCommand() {
		return controlCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlCommand(ControlCommand newControlCommand) {
		ControlCommand oldControlCommand = controlCommand;
		controlCommand = newControlCommand == null ? CONTROL_COMMAND_EDEFAULT : newControlCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__CONTROL_COMMAND,
					oldControlCommand, controlCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__TIME_STAMP, oldTimeStamp,
					timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHome getSmarthome() {
		if (smarthome != null && smarthome.eIsProxy()) {
			InternalEObject oldSmarthome = (InternalEObject) smarthome;
			smarthome = (SmartHome) eResolveProxy(oldSmarthome);
			if (smarthome != oldSmarthome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR__SMARTHOME,
							oldSmarthome, smarthome));
			}
		}
		return smarthome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHome basicGetSmarthome() {
		return smarthome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmarthome(SmartHome newSmarthome, NotificationChain msgs) {
		SmartHome oldSmarthome = smarthome;
		smarthome = newSmarthome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.ACTUATOR__SMARTHOME, oldSmarthome, newSmarthome);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmarthome(SmartHome newSmarthome) {
		if (newSmarthome != smarthome) {
			NotificationChain msgs = null;
			if (smarthome != null)
				msgs = ((InternalEObject) smarthome).eInverseRemove(this, HalPackage.SMART_HOME__ACTUATOR,
						SmartHome.class, msgs);
			if (newSmarthome != null)
				msgs = ((InternalEObject) newSmarthome).eInverseAdd(this, HalPackage.SMART_HOME__ACTUATOR,
						SmartHome.class, msgs);
			msgs = basicSetSmarthome(newSmarthome, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__SMARTHOME, newSmarthome,
					newSmarthome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityLog> getActuatorLog() {
		if (actuatorLog == null) {
			actuatorLog = new EObjectWithInverseResolvingEList.ManyInverse<ActivityLog>(ActivityLog.class, this,
					HalPackage.ACTUATOR__ACTUATOR_LOG, HalPackage.ACTIVITY_LOG__ACTUATOR);
		}
		return actuatorLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTUATOR__SMARTHOME:
			if (smarthome != null)
				msgs = ((InternalEObject) smarthome).eInverseRemove(this, HalPackage.SMART_HOME__ACTUATOR,
						SmartHome.class, msgs);
			return basicSetSmarthome((SmartHome) otherEnd, msgs);
		case HalPackage.ACTUATOR__ACTUATOR_LOG:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActuatorLog()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTUATOR__SMARTHOME:
			return basicSetSmarthome(null, msgs);
		case HalPackage.ACTUATOR__ACTUATOR_LOG:
			return ((InternalEList<?>) getActuatorLog()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.ACTUATOR__CONTROL_COMMAND:
			return getControlCommand();
		case HalPackage.ACTUATOR__TIME_STAMP:
			return getTimeStamp();
		case HalPackage.ACTUATOR__SMARTHOME:
			if (resolve)
				return getSmarthome();
			return basicGetSmarthome();
		case HalPackage.ACTUATOR__ACTUATOR_LOG:
			return getActuatorLog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.ACTUATOR__CONTROL_COMMAND:
			setControlCommand((ControlCommand) newValue);
			return;
		case HalPackage.ACTUATOR__TIME_STAMP:
			setTimeStamp((Date) newValue);
			return;
		case HalPackage.ACTUATOR__SMARTHOME:
			setSmarthome((SmartHome) newValue);
			return;
		case HalPackage.ACTUATOR__ACTUATOR_LOG:
			getActuatorLog().clear();
			getActuatorLog().addAll((Collection<? extends ActivityLog>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HalPackage.ACTUATOR__CONTROL_COMMAND:
			setControlCommand(CONTROL_COMMAND_EDEFAULT);
			return;
		case HalPackage.ACTUATOR__TIME_STAMP:
			setTimeStamp(TIME_STAMP_EDEFAULT);
			return;
		case HalPackage.ACTUATOR__SMARTHOME:
			setSmarthome((SmartHome) null);
			return;
		case HalPackage.ACTUATOR__ACTUATOR_LOG:
			getActuatorLog().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HalPackage.ACTUATOR__CONTROL_COMMAND:
			return controlCommand != CONTROL_COMMAND_EDEFAULT;
		case HalPackage.ACTUATOR__TIME_STAMP:
			return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
		case HalPackage.ACTUATOR__SMARTHOME:
			return smarthome != null;
		case HalPackage.ACTUATOR__ACTUATOR_LOG:
			return actuatorLog != null && !actuatorLog.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (controlCommand: ");
		result.append(controlCommand);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
