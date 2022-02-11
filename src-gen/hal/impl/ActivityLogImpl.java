/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.Actuator;
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
 *   <li>{@link hal.impl.ActivityLogImpl#getActuator <em>Actuator</em>}</li>
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
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuator;

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
			activity = new EObjectWithInverseResolvingEList.ManyInverse<SensorReading>(SensorReading.class, this,
					HalPackage.ACTIVITY_LOG__ACTIVITY, HalPackage.SENSOR_READING__ACTIVITY_LOG);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuator() {
		if (actuator == null) {
			actuator = new EObjectWithInverseResolvingEList.ManyInverse<Actuator>(Actuator.class, this,
					HalPackage.ACTIVITY_LOG__ACTUATOR, HalPackage.ACTUATOR__ACTUATOR_LOG);
		}
		return actuator;
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
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActivity()).basicAdd(otherEnd, msgs);
		case HalPackage.ACTIVITY_LOG__ACTUATOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActuator()).basicAdd(otherEnd, msgs);
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
			return ((InternalEList<?>) getActivity()).basicRemove(otherEnd, msgs);
		case HalPackage.ACTIVITY_LOG__ACTUATOR:
			return ((InternalEList<?>) getActuator()).basicRemove(otherEnd, msgs);
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
		case HalPackage.ACTIVITY_LOG__ACTUATOR:
			return getActuator();
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
			getActivity().addAll((Collection<? extends SensorReading>) newValue);
			return;
		case HalPackage.ACTIVITY_LOG__ACTUATOR:
			getActuator().clear();
			getActuator().addAll((Collection<? extends Actuator>) newValue);
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
		case HalPackage.ACTIVITY_LOG__ACTUATOR:
			getActuator().clear();
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
		case HalPackage.ACTIVITY_LOG__ACTUATOR:
			return actuator != null && !actuator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityLogImpl
