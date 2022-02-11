/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.HalPackage;
import hal.SensorDevice;
import hal.SensorReading;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.SensorReadingImpl#getMeasuredValue <em>Measured Value</em>}</li>
 *   <li>{@link hal.impl.SensorReadingImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link hal.impl.SensorReadingImpl#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link hal.impl.SensorReadingImpl#getActivityLog <em>Activity Log</em>}</li>
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
	 * The cached value of the '{@link #getSensordevice() <em>Sensordevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensordevice()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorDevice> sensordevice;

	/**
	 * The cached value of the '{@link #getActivityLog() <em>Activity Log</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityLog()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityLog> activityLog;

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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__MEASURED_VALUE,
					oldMeasuredValue, measuredValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_READING__TIME_STAMP, oldTimeStamp,
					timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorDevice> getSensordevice() {
		if (sensordevice == null) {
			sensordevice = new EObjectContainmentEList<SensorDevice>(SensorDevice.class, this,
					HalPackage.SENSOR_READING__SENSORDEVICE);
		}
		return sensordevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityLog> getActivityLog() {
		if (activityLog == null) {
			activityLog = new EObjectWithInverseResolvingEList.ManyInverse<ActivityLog>(ActivityLog.class, this,
					HalPackage.SENSOR_READING__ACTIVITY_LOG, HalPackage.ACTIVITY_LOG__ACTIVITY);
		}
		return activityLog;
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
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActivityLog()).basicAdd(otherEnd, msgs);
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
		case HalPackage.SENSOR_READING__SENSORDEVICE:
			return ((InternalEList<?>) getSensordevice()).basicRemove(otherEnd, msgs);
		case HalPackage.SENSOR_READING__ACTIVITY_LOG:
			return ((InternalEList<?>) getActivityLog()).basicRemove(otherEnd, msgs);
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
		case HalPackage.SENSOR_READING__TIME_STAMP:
			return getTimeStamp();
		case HalPackage.SENSOR_READING__SENSORDEVICE:
			return getSensordevice();
		case HalPackage.SENSOR_READING__ACTIVITY_LOG:
			return getActivityLog();
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
			setMeasuredValue((Double) newValue);
			return;
		case HalPackage.SENSOR_READING__TIME_STAMP:
			setTimeStamp((Date) newValue);
			return;
		case HalPackage.SENSOR_READING__SENSORDEVICE:
			getSensordevice().clear();
			getSensordevice().addAll((Collection<? extends SensorDevice>) newValue);
			return;
		case HalPackage.SENSOR_READING__ACTIVITY_LOG:
			getActivityLog().clear();
			getActivityLog().addAll((Collection<? extends ActivityLog>) newValue);
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
		case HalPackage.SENSOR_READING__TIME_STAMP:
			setTimeStamp(TIME_STAMP_EDEFAULT);
			return;
		case HalPackage.SENSOR_READING__SENSORDEVICE:
			getSensordevice().clear();
			return;
		case HalPackage.SENSOR_READING__ACTIVITY_LOG:
			getActivityLog().clear();
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
		case HalPackage.SENSOR_READING__TIME_STAMP:
			return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
		case HalPackage.SENSOR_READING__SENSORDEVICE:
			return sensordevice != null && !sensordevice.isEmpty();
		case HalPackage.SENSOR_READING__ACTIVITY_LOG:
			return activityLog != null && !activityLog.isEmpty();
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
		result.append(" (measuredValue: ");
		result.append(measuredValue);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //SensorReadingImpl
