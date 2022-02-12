/**
 */
package hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.BooleanOperators#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getBooleanOperators()
 * @model
 * @generated
 */
public interface BooleanOperators extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hal.Operator
	 * @see #setOperator(Operator)
	 * @see hal.HalPackage#getBooleanOperators_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link hal.BooleanOperators#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hal.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // BooleanOperators
