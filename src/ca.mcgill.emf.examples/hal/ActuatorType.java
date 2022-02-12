/**
 */
package hal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actuator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hal.HalPackage#getActuatorType()
 * @model
 * @generated
 */
public enum ActuatorType implements Enumerator {
	/**
	 * The '<em><b>HEATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATER_VALUE
	 * @generated
	 * @ordered
	 */
	HEATER(0, "HEATER", "HEATER"),

	/**
	 * The '<em><b>LOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	LOCK(1, "LOCK", "LOCK"),

	/**
	 * The '<em><b>LIGHTSWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTSWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTSWITCH(2, "LIGHTSWITCH", "LIGHTSWITCH");

	/**
	 * The '<em><b>HEATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEATER_VALUE = 0;

	/**
	 * The '<em><b>LOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCK_VALUE = 1;

	/**
	 * The '<em><b>LIGHTSWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTSWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTSWITCH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Actuator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActuatorType[] VALUES_ARRAY =
		new ActuatorType[] {
			HEATER,
			LOCK,
			LIGHTSWITCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Actuator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActuatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActuatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActuatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType get(int value) {
		switch (value) {
			case HEATER_VALUE: return HEATER;
			case LOCK_VALUE: return LOCK;
			case LIGHTSWITCH_VALUE: return LIGHTSWITCH;
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
	private ActuatorType(int value, String name, String literal) {
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
	
} //ActuatorType
