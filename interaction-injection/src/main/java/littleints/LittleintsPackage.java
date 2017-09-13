/**
 */
package littleints;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see littleints.LittleintsFactory
 * @model kind="package"
 * @generated
 */
public interface LittleintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "littleints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://standards.ieee.org/IEEE1516-2010";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "littleints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LittleintsPackage eINSTANCE = littleints.impl.LittleintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link littleints.impl.Int1Impl <em>Int1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see littleints.impl.Int1Impl
	 * @see littleints.impl.LittleintsPackageImpl#getInt1()
	 * @generated
	 */
	int INT1 = 0;

	/**
	 * The feature id for the '<em><b>Bool Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__BOOL_VAL = 0;

	/**
	 * The feature id for the '<em><b>Int Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__INT_VAL = 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1__STR_VAL = 2;

	/**
	 * The number of structural features of the '<em>Int1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Int1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT1_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link littleints.Int1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int1</em>'.
	 * @see littleints.Int1
	 * @generated
	 */
	EClass getInt1();

	/**
	 * Returns the meta object for the attribute '{@link littleints.Int1#isBoolVal <em>Bool Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool Val</em>'.
	 * @see littleints.Int1#isBoolVal()
	 * @see #getInt1()
	 * @generated
	 */
	EAttribute getInt1_BoolVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.Int1#getIntVal <em>Int Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Val</em>'.
	 * @see littleints.Int1#getIntVal()
	 * @see #getInt1()
	 * @generated
	 */
	EAttribute getInt1_IntVal();

	/**
	 * Returns the meta object for the attribute '{@link littleints.Int1#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str Val</em>'.
	 * @see littleints.Int1#getStrVal()
	 * @see #getInt1()
	 * @generated
	 */
	EAttribute getInt1_StrVal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LittleintsFactory getLittleintsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link littleints.impl.Int1Impl <em>Int1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see littleints.impl.Int1Impl
		 * @see littleints.impl.LittleintsPackageImpl#getInt1()
		 * @generated
		 */
		EClass INT1 = eINSTANCE.getInt1();

		/**
		 * The meta object literal for the '<em><b>Bool Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT1__BOOL_VAL = eINSTANCE.getInt1_BoolVal();

		/**
		 * The meta object literal for the '<em><b>Int Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT1__INT_VAL = eINSTANCE.getInt1_IntVal();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT1__STR_VAL = eINSTANCE.getInt1_StrVal();

	}

} //LittleintsPackage
