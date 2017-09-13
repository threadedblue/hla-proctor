/**
 */
package littleints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see littleints.LittleintsPackage
 * @generated
 */
public interface LittleintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LittleintsFactory eINSTANCE = littleints.impl.LittleintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int1</em>'.
	 * @generated
	 */
	Int1 createInt1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LittleintsPackage getLittleintsPackage();

} //LittleintsFactory
