/**
 */
package hal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Command Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hal.HalPackage#getControlCommandType()
 * @model
 * @generated
 */
public enum ControlCommandType implements Enumerator {
	/**
	 * The '<em><b>LOCKDOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKDOOR_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKDOOR(0, "LOCKDOOR", "LOCKDOOR"),

	/**
	 * The '<em><b>TURNONHEATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURNONHEATING_VALUE
	 * @generated
	 * @ordered
	 */
	TURNONHEATING(1, "TURNONHEATING", "TURNONHEATING"),

	/**
	 * The '<em><b>TURNOFFHEATING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURNOFFHEATING_VALUE
	 * @generated
	 * @ordered
	 */
	TURNOFFHEATING(2, "TURNOFFHEATING", "TURNOFFHEATING");

	/**
	 * The '<em><b>LOCKDOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKDOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCKDOOR_VALUE = 0;

	/**
	 * The '<em><b>TURNONHEATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURNONHEATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TURNONHEATING_VALUE = 1;

	/**
	 * The '<em><b>TURNOFFHEATING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURNOFFHEATING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TURNOFFHEATING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Control Command Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlCommandType[] VALUES_ARRAY =
		new ControlCommandType[] {
			LOCKDOOR,
			TURNONHEATING,
			TURNOFFHEATING,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Command Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlCommandType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Command Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlCommandType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlCommandType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Command Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlCommandType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlCommandType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Command Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlCommandType get(int value) {
		switch (value) {
			case LOCKDOOR_VALUE: return LOCKDOOR;
			case TURNONHEATING_VALUE: return TURNONHEATING;
			case TURNOFFHEATING_VALUE: return TURNOFFHEATING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ControlCommandType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ControlCommandType
