/**
 */
package littleints;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link littleints.Int1#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.Int1#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link littleints.Int1#getStrVal <em>Str Val</em>}</li>
 * </ul>
 *
 * @see littleints.LittleintsPackage#getInt1()
 * @model
 * @generated
 */
public interface Int1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Bool Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Val</em>' attribute.
	 * @see #setBoolVal(boolean)
	 * @see littleints.LittleintsPackage#getInt1_BoolVal()
	 * @model
	 * @generated
	 */
	boolean isBoolVal();

	/**
	 * Sets the value of the '{@link littleints.Int1#isBoolVal <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Val</em>' attribute.
	 * @see #isBoolVal()
	 * @generated
	 */
	void setBoolVal(boolean value);

	/**
	 * Returns the value of the '<em><b>Int Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Val</em>' attribute.
	 * @see #setIntVal(int)
	 * @see littleints.LittleintsPackage#getInt1_IntVal()
	 * @model
	 * @generated
	 */
	int getIntVal();

	/**
	 * Sets the value of the '{@link littleints.Int1#getIntVal <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Val</em>' attribute.
	 * @see #getIntVal()
	 * @generated
	 */
	void setIntVal(int value);

	/**
	 * Returns the value of the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str Val</em>' attribute.
	 * @see #setStrVal(String)
	 * @see littleints.LittleintsPackage#getInt1_StrVal()
	 * @model
	 * @generated
	 */
	String getStrVal();

	/**
	 * Sets the value of the '{@link littleints.Int1#getStrVal <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str Val</em>' attribute.
	 * @see #getStrVal()
	 * @generated
	 */
	void setStrVal(String value);

} // Int1
