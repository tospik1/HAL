/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Device#getType <em>Type</em>}</li>
 *   <li>{@link hal.Device#getName <em>Name</em>}</li>
 *   <li>{@link hal.Device#isIsActivated <em>Is Activated</em>}</li>
 *   <li>{@link hal.Device#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hal.DeviceType
	 * @see #setType(DeviceType)
	 * @see hal.HalPackage#getDevice_Type()
	 * @model
	 * @generated
	 */
	DeviceType getType();

	/**
	 * Sets the value of the '{@link hal.Device#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hal.DeviceType
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hal.HalPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hal.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Activated</em>' attribute.
	 * @see #setIsActivated(boolean)
	 * @see hal.HalPackage#getDevice_IsActivated()
	 * @model
	 * @generated
	 */
	boolean isIsActivated();

	/**
	 * Sets the value of the '{@link hal.Device#isIsActivated <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Activated</em>' attribute.
	 * @see #isIsActivated()
	 * @generated
	 */
	void setIsActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see hal.HalPackage#getDevice_Room()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRoom();

} // Device
