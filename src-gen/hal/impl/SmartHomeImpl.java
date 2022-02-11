/**
 */
package hal.impl;

import hal.Actuator;
import hal.HalPackage;
import hal.SmartHome;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.SmartHomeImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link hal.impl.SmartHomeImpl#isIsOperational <em>Is Operational</em>}</li>
 *   <li>{@link hal.impl.SmartHomeImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartHomeImpl extends MinimalEObjectImpl.Container implements SmartHome {
	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected String newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean isOperational = IS_OPERATIONAL_EDEFAULT;

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
	protected SmartHomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SMART_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(String newNewAttribute) {
		String oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__NEW_ATTRIBUTE, oldNewAttribute,
					newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOperational() {
		return isOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOperational(boolean newIsOperational) {
		boolean oldIsOperational = isOperational;
		isOperational = newIsOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__IS_OPERATIONAL,
					oldIsOperational, isOperational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuator() {
		if (actuator == null) {
			actuator = new EObjectWithInverseResolvingEList<Actuator>(Actuator.class, this,
					HalPackage.SMART_HOME__ACTUATOR, HalPackage.ACTUATOR__SMARTHOME);
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
		case HalPackage.SMART_HOME__ACTUATOR:
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
		case HalPackage.SMART_HOME__ACTUATOR:
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
		case HalPackage.SMART_HOME__NEW_ATTRIBUTE:
			return getNewAttribute();
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			return isIsOperational();
		case HalPackage.SMART_HOME__ACTUATOR:
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
		case HalPackage.SMART_HOME__NEW_ATTRIBUTE:
			setNewAttribute((String) newValue);
			return;
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			setIsOperational((Boolean) newValue);
			return;
		case HalPackage.SMART_HOME__ACTUATOR:
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
		case HalPackage.SMART_HOME__NEW_ATTRIBUTE:
			setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			setIsOperational(IS_OPERATIONAL_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__ACTUATOR:
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
		case HalPackage.SMART_HOME__NEW_ATTRIBUTE:
			return NEW_ATTRIBUTE_EDEFAULT == null ? newAttribute != null : !NEW_ATTRIBUTE_EDEFAULT.equals(newAttribute);
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			return isOperational != IS_OPERATIONAL_EDEFAULT;
		case HalPackage.SMART_HOME__ACTUATOR:
			return actuator != null && !actuator.isEmpty();
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
		result.append(" (newAttribute: ");
		result.append(newAttribute);
		result.append(", isOperational: ");
		result.append(isOperational);
		result.append(')');
		return result.toString();
	}

} //SmartHomeImpl
