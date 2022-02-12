/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.ActivityLog#getActivity <em>Activity</em>}</li>
 *   <li>{@link hal.ActivityLog#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActivityLog()
 * @model
 * @generated
 */
public interface ActivityLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link hal.SensorReading}.
	 * It is bidirectional and its opposite is '{@link hal.SensorReading#getActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see hal.HalPackage#getActivityLog_Activity()
	 * @see hal.SensorReading#getActivityLog
	 * @model opposite="activityLog"
	 * @generated
	 */
	EList<SensorReading> getActivity();

	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' reference list.
	 * The list contents are of type {@link hal.AutomationRule}.
	 * It is bidirectional and its opposite is '{@link hal.AutomationRule#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' reference list.
	 * @see hal.HalPackage#getActivityLog_Automationrule()
	 * @see hal.AutomationRule#getActivitylog
	 * @model opposite="activitylog"
	 * @generated
	 */
	EList<AutomationRule> getAutomationrule();

} // ActivityLog
