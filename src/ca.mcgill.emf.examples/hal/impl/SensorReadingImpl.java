/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.HalPackage;
import hal.Sensor;
import hal.SensorReading;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.SensorReadingImpl#getMeasuredValue <em>Measured Value</em>}</li>
 *   <li>{@link hal.impl.SensorReadingImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hal.impl.SensorReadingImpl#getActivityLog <em>Activity Log</em>}</li>
 *   <li>{@link hal.impl.SensorReadingImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorReadingImpl extends MinimalEObjectImpl.Container implements SensorReading {
	/**
	 * The default value of the '{@link #getMeasuredValue() <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MEASURED_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeasuredValue() <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredValue()
	 * @generated
	 * @ordered
	 */
	protected double measuredValue = MEASURED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivityLog() <em>Activity Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityLog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activityLog;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeasuredValue() {
		return measuredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredValue(double newMeasuredValue) {
		double oldMeasuredValue = measuredValue;
		measuredValue = newMeasuredValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__MEASURED_VALUE, oldMeasuredValue, measuredValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog getActivityLog() {
		if (activityLog != null && activityLog.eIsProxy()) {
			InternalEObject oldActivityLog = (InternalEObject)activityLog;
			activityLog = (ActivityLog)eResolveProxy(oldActivityLog);
			if (activityLog != oldActivityLog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_READING__ACTIVITY_LOG, oldActivityLog, activityLog));
			}
		}
		return activityLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog basicGetActivityLog() {
		return activityLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityLog(ActivityLog newActivityLog, NotificationChain msgs) {
		ActivityLog oldActivityLog = activityLog;
		activityLog = newActivityLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__ACTIVITY_LOG, oldActivityLog, newActivityLog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityLog(ActivityLog newActivityLog) {
		if (newActivityLog != activityLog) {
			NotificationChain msgs = null;
			if (activityLog != null)
				msgs = ((InternalEObject)activityLog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__ACTIVITY, ActivityLog.class, msgs);
			if (newActivityLog != null)
				msgs = ((InternalEObject)newActivityLog).eInverseAdd(this, HalPackage.ACTIVITY_LOG__ACTIVITY, ActivityLog.class, msgs);
			msgs = basicSetActivityLog(newActivityLog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__ACTIVITY_LOG, newActivityLog, newActivityLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject)sensor;
			sensor = (Sensor)eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SENSOR_READING__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(Sensor newSensor, NotificationChain msgs) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__SENSOR, oldSensor, newSensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		if (newSensor != sensor) {
			NotificationChain msgs = null;
			if (sensor != null)
				msgs = ((InternalEObject)sensor).eInverseRemove(this, HalPackage.SENSOR__SENSORREADING, Sensor.class, msgs);
			if (newSensor != null)
				msgs = ((InternalEObject)newSensor).eInverseAdd(this, HalPackage.SENSOR__SENSORREADING, Sensor.class, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__SENSOR, newSensor, newSensor));
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
			case HalPackage.SENSOR_READING__ACTIVITY_LOG:
				if (activityLog != null)
					msgs = ((InternalEObject)activityLog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__ACTIVITY, ActivityLog.class, msgs);
				return basicSetActivityLog((ActivityLog)otherEnd, msgs);
			case HalPackage.SENSOR_READING__SENSOR:
				if (sensor != null)
					msgs = ((InternalEObject)sensor).eInverseRemove(this, HalPackage.SENSOR__SENSORREADING, Sensor.class, msgs);
				return basicSetSensor((Sensor)otherEnd, msgs);
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
			case HalPackage.SENSOR_READING__ACTIVITY_LOG:
				return basicSetActivityLog(null, msgs);
			case HalPackage.SENSOR_READING__SENSOR:
				return basicSetSensor(null, msgs);
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
			case HalPackage.SENSOR_READING__MEASURED_VALUE:
				return getMeasuredValue();
			case HalPackage.SENSOR_READING__TIMESTAMP:
				return getTimestamp();
			case HalPackage.SENSOR_READING__ACTIVITY_LOG:
				if (resolve) return getActivityLog();
				return basicGetActivityLog();
			case HalPackage.SENSOR_READING__SENSOR:
				if (resolve) return getSensor();
				return basicGetSensor();
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
			case HalPackage.SENSOR_READING__MEASURED_VALUE:
				setMeasuredValue((Double)newValue);
				return;
			case HalPackage.SENSOR_READING__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case HalPackage.SENSOR_READING__ACTIVITY_LOG:
				setActivityLog((ActivityLog)newValue);
				return;
			case HalPackage.SENSOR_READING__SENSOR:
				setSensor((Sensor)newValue);
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
			case HalPackage.SENSOR_READING__MEASURED_VALUE:
				setMeasuredValue(MEASURED_VALUE_EDEFAULT);
				return;
			case HalPackage.SENSOR_READING__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case HalPackage.SENSOR_READING__ACTIVITY_LOG:
				setActivityLog((ActivityLog)null);
				return;
			case HalPackage.SENSOR_READING__SENSOR:
				setSensor((Sensor)null);
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
			case HalPackage.SENSOR_READING__MEASURED_VALUE:
				return measuredValue != MEASURED_VALUE_EDEFAULT;
			case HalPackage.SENSOR_READING__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case HalPackage.SENSOR_READING__ACTIVITY_LOG:
				return activityLog != null;
			case HalPackage.SENSOR_READING__SENSOR:
				return sensor != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (measuredValue: ");
		result.append(measuredValue);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //SensorReadingImpl
