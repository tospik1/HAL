/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home Automation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.HomeAutomationSystem#getSmarthome <em>Smarthome</em>}</li>
 *   <li>{@link hal.HomeAutomationSystem#getActivitylog <em>Activitylog</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getHomeAutomationSystem()
 * @model
 * @generated
 */
public interface HomeAutomationSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Smarthome</b></em>' containment reference list.
	 * The list contents are of type {@link hal.SmartHome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smarthome</em>' containment reference list.
	 * @see hal.HalPackage#getHomeAutomationSystem_Smarthome()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartHome> getSmarthome();

	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' containment reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see hal.HalPackage#getHomeAutomationSystem_Activitylog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link hal.HomeAutomationSystem#getActivitylog <em>Activitylog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' containment reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

} // HomeAutomationSystem
