/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.HalPackage;
import hal.HomeAutomationSystem;
import hal.SmartHome;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home Automation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.HomeAutomationSystemImpl#getSmarthome <em>Smarthome</em>}</li>
 *   <li>{@link hal.impl.HomeAutomationSystemImpl#getActivitylog <em>Activitylog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeAutomationSystemImpl extends MinimalEObjectImpl.Container implements HomeAutomationSystem {
	/**
	 * The cached value of the '{@link #getSmarthome() <em>Smarthome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmarthome()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartHome> smarthome;

	/**
	 * The cached value of the '{@link #getActivitylog() <em>Activitylog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitylog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activitylog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeAutomationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.HOME_AUTOMATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartHome> getSmarthome() {
		if (smarthome == null) {
			smarthome = new EObjectContainmentEList<SmartHome>(SmartHome.class, this, HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOME);
		}
		return smarthome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog getActivitylog() {
		return activitylog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitylog(ActivityLog newActivitylog, NotificationChain msgs) {
		ActivityLog oldActivitylog = activitylog;
		activitylog = newActivitylog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG, oldActivitylog, newActivitylog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitylog(ActivityLog newActivitylog) {
		if (newActivitylog != activitylog) {
			NotificationChain msgs = null;
			if (activitylog != null)
				msgs = ((InternalEObject)activitylog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG, null, msgs);
			if (newActivitylog != null)
				msgs = ((InternalEObject)newActivitylog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG, null, msgs);
			msgs = basicSetActivitylog(newActivitylog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG, newActivitylog, newActivitylog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOME:
				return ((InternalEList<?>)getSmarthome()).basicRemove(otherEnd, msgs);
			case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG:
				return basicSetActivitylog(null, msgs);
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
			case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOME:
				return getSmarthome();
			case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG:
				return getActivitylog();
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
			case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOME:
				getSmarthome().clear();
				getSmarthome().addAll((Collection<? extends SmartHome>)newValue);
				return;
			case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG:
				setActivitylog((ActivityLog)newValue);
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
			case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOME:
				getSmarthome().clear();
				return;
			case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG:
				setActivitylog((ActivityLog)null);
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
			case HalPackage.HOME_AUTOMATION_SYSTEM__SMARTHOME:
				return smarthome != null && !smarthome.isEmpty();
			case HalPackage.HOME_AUTOMATION_SYSTEM__ACTIVITYLOG:
				return activitylog != null;
		}
		return super.eIsSet(featureID);
	}

} //HomeAutomationSystemImpl
