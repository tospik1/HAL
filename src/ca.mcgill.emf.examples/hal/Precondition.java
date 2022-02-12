/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Precondition#getRelationalterms <em>Relationalterms</em>}</li>
 *   <li>{@link hal.Precondition#getBooleanoperators <em>Booleanoperators</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationalterms</b></em>' containment reference list.
	 * The list contents are of type {@link hal.RelationalTerms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationalterms</em>' containment reference list.
	 * @see hal.HalPackage#getPrecondition_Relationalterms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationalTerms> getRelationalterms();

	/**
	 * Returns the value of the '<em><b>Booleanoperators</b></em>' containment reference list.
	 * The list contents are of type {@link hal.BooleanOperators}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanoperators</em>' containment reference list.
	 * @see hal.HalPackage#getPrecondition_Booleanoperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanOperators> getBooleanoperators();

} // Precondition
