/**
 */
package hal.impl;

import hal.BooleanOperators;
import hal.HalPackage;
import hal.Precondition;
import hal.RelationalTerms;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.PreconditionImpl#getRelationalterms <em>Relationalterms</em>}</li>
 *   <li>{@link hal.impl.PreconditionImpl#getBooleanoperators <em>Booleanoperators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreconditionImpl extends MinimalEObjectImpl.Container implements Precondition {
	/**
	 * The cached value of the '{@link #getRelationalterms() <em>Relationalterms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalterms()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalTerms> relationalterms;

	/**
	 * The cached value of the '{@link #getBooleanoperators() <em>Booleanoperators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanoperators()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperators> booleanoperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationalTerms> getRelationalterms() {
		if (relationalterms == null) {
			relationalterms = new EObjectContainmentEList<RelationalTerms>(RelationalTerms.class, this, HalPackage.PRECONDITION__RELATIONALTERMS);
		}
		return relationalterms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanOperators> getBooleanoperators() {
		if (booleanoperators == null) {
			booleanoperators = new EObjectContainmentEList<BooleanOperators>(BooleanOperators.class, this, HalPackage.PRECONDITION__BOOLEANOPERATORS);
		}
		return booleanoperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.PRECONDITION__RELATIONALTERMS:
				return ((InternalEList<?>)getRelationalterms()).basicRemove(otherEnd, msgs);
			case HalPackage.PRECONDITION__BOOLEANOPERATORS:
				return ((InternalEList<?>)getBooleanoperators()).basicRemove(otherEnd, msgs);
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
			case HalPackage.PRECONDITION__RELATIONALTERMS:
				return getRelationalterms();
			case HalPackage.PRECONDITION__BOOLEANOPERATORS:
				return getBooleanoperators();
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
			case HalPackage.PRECONDITION__RELATIONALTERMS:
				getRelationalterms().clear();
				getRelationalterms().addAll((Collection<? extends RelationalTerms>)newValue);
				return;
			case HalPackage.PRECONDITION__BOOLEANOPERATORS:
				getBooleanoperators().clear();
				getBooleanoperators().addAll((Collection<? extends BooleanOperators>)newValue);
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
			case HalPackage.PRECONDITION__RELATIONALTERMS:
				getRelationalterms().clear();
				return;
			case HalPackage.PRECONDITION__BOOLEANOPERATORS:
				getBooleanoperators().clear();
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
			case HalPackage.PRECONDITION__RELATIONALTERMS:
				return relationalterms != null && !relationalterms.isEmpty();
			case HalPackage.PRECONDITION__BOOLEANOPERATORS:
				return booleanoperators != null && !booleanoperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PreconditionImpl
