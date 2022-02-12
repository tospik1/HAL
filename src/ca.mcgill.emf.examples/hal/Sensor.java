/**
 */
package hal;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link hal.Sensor#getSensorreading <em>Sensorreading</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Device {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hal.SensorType
	 * @see #setType(SensorType)
	 * @see hal.HalPackage#getSensor_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link hal.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hal.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Sensorreading</b></em>' reference list.
	 * The list contents are of type {@link hal.SensorReading}.
	 * It is bidirectional and its opposite is '{@link hal.SensorReading#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorreading</em>' reference list.
	 * @see hal.HalPackage#getSensor_Sensorreading()
	 * @see hal.SensorReading#getSensor
	 * @model opposite="sensor"
	 * @generated
	 */
	EList<SensorReading> getSensorreading();

} // Sensor
