/**
 */
package hal;

import java.util.Date;
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
 *   <li>{@link hal.SensorReading#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hal.SensorReading#getActivityLog <em>Activity Log</em>}</li>
 *   <li>{@link hal.SensorReading#getSensor <em>Sensor</em>}</li>
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
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see hal.HalPackage#getSensorReading_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link hal.SensorReading#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Activity Log</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.ActivityLog#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Log</em>' reference.
	 * @see #setActivityLog(ActivityLog)
	 * @see hal.HalPackage#getSensorReading_ActivityLog()
	 * @see hal.ActivityLog#getActivity
	 * @model opposite="activity" required="true"
	 * @generated
	 */
	ActivityLog getActivityLog();

	/**
	 * Sets the value of the '{@link hal.SensorReading#getActivityLog <em>Activity Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Log</em>' reference.
	 * @see #getActivityLog()
	 * @generated
	 */
	void setActivityLog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.Sensor#getSensorreading <em>Sensorreading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see hal.HalPackage#getSensorReading_Sensor()
	 * @see hal.Sensor#getSensorreading
	 * @model opposite="sensorreading" required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link hal.SensorReading#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // SensorReading
