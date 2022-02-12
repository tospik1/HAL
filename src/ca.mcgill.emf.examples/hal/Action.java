/**
 */
package hal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Action#getControlcommand <em>Controlcommand</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {

	/**
	 * Returns the value of the '<em><b>Controlcommand</b></em>' reference list.
	 * The list contents are of type {@link hal.ControlCommand}.
	 * It is bidirectional and its opposite is '{@link hal.ControlCommand#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlcommand</em>' reference list.
	 * @see hal.HalPackage#getAction_Controlcommand()
	 * @see hal.ControlCommand#getAction
	 * @model opposite="action" required="true"
	 * @generated
	 */
	EList<ControlCommand> getControlcommand();

} // Action
