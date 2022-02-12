/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.AutomationRule;
import hal.HalPackage;
import hal.SensorReading;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.ActivityLogImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link hal.impl.ActivityLogImpl#getAutomationrule <em>Automationrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityLogImpl extends MinimalEObjectImpl.Container implements ActivityLog {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorReading> activity;

	/**
	 * The cached value of the '{@link #getAutomationrule() <em>Automationrule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationrule()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> automationrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTIVITY_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorReading> getActivity() {
		if (activity == null) {
			activity = new EObjectWithInverseResolvingEList<SensorReading>(SensorReading.class, this, HalPackage.ACTIVITY_LOG__ACTIVITY, HalPackage.SENSOR_READING__ACTIVITY_LOG);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRule> getAutomationrule() {
		if (automationrule == null) {
			automationrule = new EObjectWithInverseResolvingEList<AutomationRule>(AutomationRule.class, this, HalPackage.ACTIVITY_LOG__AUTOMATIONRULE, HalPackage.AUTOMATION_RULE__ACTIVITYLOG);
		}
		return automationrule;
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
			case HalPackage.ACTIVITY_LOG__ACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity()).basicAdd(otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__AUTOMATIONRULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAutomationrule()).basicAdd(otherEnd, msgs);
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
			case HalPackage.ACTIVITY_LOG__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__AUTOMATIONRULE:
				return ((InternalEList<?>)getAutomationrule()).basicRemove(otherEnd, msgs);
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
			case HalPackage.ACTIVITY_LOG__ACTIVITY:
				return getActivity();
			case HalPackage.ACTIVITY_LOG__AUTOMATIONRULE:
				return getAutomationrule();
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
			case HalPackage.ACTIVITY_LOG__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends SensorReading>)newValue);
				return;
			case HalPackage.ACTIVITY_LOG__AUTOMATIONRULE:
				getAutomationrule().clear();
				getAutomationrule().addAll((Collection<? extends AutomationRule>)newValue);
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
			case HalPackage.ACTIVITY_LOG__ACTIVITY:
				getActivity().clear();
				return;
			case HalPackage.ACTIVITY_LOG__AUTOMATIONRULE:
				getAutomationrule().clear();
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
			case HalPackage.ACTIVITY_LOG__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case HalPackage.ACTIVITY_LOG__AUTOMATIONRULE:
				return automationrule != null && !automationrule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityLogImpl
