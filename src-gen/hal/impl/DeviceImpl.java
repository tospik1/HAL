/**
 */
package hal.impl;

import hal.Device;
import hal.DeviceType;
import hal.HalPackage;
import hal.Room;

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
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link hal.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link hal.impl.DeviceImpl#isIsActivated <em>Is Activated</em>}</li>
 *   <li>{@link hal.impl.DeviceImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceType TYPE_EDEFAULT = DeviceType.TEMPERATURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeviceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActivated() <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActivated() <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean isActivated = IS_ACTIVATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeviceType newType) {
		DeviceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.DEVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActivated() {
		return isActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActivated(boolean newIsActivated) {
		boolean oldIsActivated = isActivated;
		isActivated = newIsActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.DEVICE__IS_ACTIVATED, oldIsActivated,
					isActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectContainmentEList<Room>(Room.class, this, HalPackage.DEVICE__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.DEVICE__ROOM:
			return ((InternalEList<?>) getRoom()).basicRemove(otherEnd, msgs);
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
		case HalPackage.DEVICE__TYPE:
			return getType();
		case HalPackage.DEVICE__NAME:
			return getName();
		case HalPackage.DEVICE__IS_ACTIVATED:
			return isIsActivated();
		case HalPackage.DEVICE__ROOM:
			return getRoom();
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
		case HalPackage.DEVICE__TYPE:
			setType((DeviceType) newValue);
			return;
		case HalPackage.DEVICE__NAME:
			setName((String) newValue);
			return;
		case HalPackage.DEVICE__IS_ACTIVATED:
			setIsActivated((Boolean) newValue);
			return;
		case HalPackage.DEVICE__ROOM:
			getRoom().clear();
			getRoom().addAll((Collection<? extends Room>) newValue);
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
		case HalPackage.DEVICE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case HalPackage.DEVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HalPackage.DEVICE__IS_ACTIVATED:
			setIsActivated(IS_ACTIVATED_EDEFAULT);
			return;
		case HalPackage.DEVICE__ROOM:
			getRoom().clear();
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
		case HalPackage.DEVICE__TYPE:
			return type != TYPE_EDEFAULT;
		case HalPackage.DEVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HalPackage.DEVICE__IS_ACTIVATED:
			return isActivated != IS_ACTIVATED_EDEFAULT;
		case HalPackage.DEVICE__ROOM:
			return room != null && !room.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", isActivated: ");
		result.append(isActivated);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
