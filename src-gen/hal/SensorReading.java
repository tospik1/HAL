/**
 */
package hal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.SensorReading#getMeasuredValue <em>Measured Value</em>}</li>
 *   <li>{@link hal.SensorReading#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link hal.SensorReading#getSensordevice <em>Sensordevice</em>}</li>
 *   <li>{@link hal.SensorReading#getActivityLog <em>Activity Log</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getSensorReading()
 * @model
 * @generated
 */
public interface SensorReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Value</em>' attribute.
	 * @see #setMeasuredValue(double)
	 * @see hal.HalPackage#getSensorReading_MeasuredValue()
	 * @model
	 * @generated
	 */
	double getMeasuredValue();

	/**
	 * Sets the value of the '{@link hal.SensorReading#getMeasuredValue <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Value</em>' attribute.
	 * @see #getMeasuredValue()
	 * @generated
	 */
	void setMeasuredValue(double value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see hal.HalPackage#getSensorReading_TimeStamp()
	 * @model
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link hal.SensorReading#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Sensordevice</b></em>' containment reference list.
	 * The list contents are of type {@link hal.SensorDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensordevice</em>' containment reference list.
	 * @see hal.HalPackage#getSensorReading_Sensordevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorDevice> getSensordevice();

	/**
	 * Returns the value of the '<em><b>Activity Log</b></em>' reference list.
	 * The list contents are of type {@link hal.ActivityLog}.
	 * It is bidirectional and its opposite is '{@link hal.ActivityLog#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Log</em>' reference list.
	 * @see hal.HalPackage#getSensorReading_ActivityLog()
	 * @see hal.ActivityLog#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	EList<ActivityLog> getActivityLog();

} // SensorReading
