/**
 */
package littleints.impl;

import littleints.Int1;
import littleints.LittleintsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link littleints.impl.Int1Impl#isBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link littleints.impl.Int1Impl#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link littleints.impl.Int1Impl#getStrVal <em>Str Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Int1Impl extends MinimalEObjectImpl.Container implements Int1 {
	/**
	 * The default value of the '{@link #isBoolVal() <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolVal() <em>Bool Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolVal()
	 * @generated
	 * @ordered
	 */
	protected boolean boolVal = BOOL_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVal()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntVal()
	 * @generated
	 * @ordered
	 */
	protected int intVal = INT_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrVal() <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrVal()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrVal() <em>Str Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrVal()
	 * @generated
	 * @ordered
	 */
	protected String strVal = STR_VAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Int1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LittleintsPackage.Literals.INT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolVal() {
		return boolVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolVal(boolean newBoolVal) {
		boolean oldBoolVal = boolVal;
		boolVal = newBoolVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LittleintsPackage.INT1__BOOL_VAL, oldBoolVal, boolVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntVal() {
		return intVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntVal(int newIntVal) {
		int oldIntVal = intVal;
		intVal = newIntVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LittleintsPackage.INT1__INT_VAL, oldIntVal, intVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrVal() {
		return strVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrVal(String newStrVal) {
		String oldStrVal = strVal;
		strVal = newStrVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LittleintsPackage.INT1__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LittleintsPackage.INT1__BOOL_VAL:
				return isBoolVal();
			case LittleintsPackage.INT1__INT_VAL:
				return getIntVal();
			case LittleintsPackage.INT1__STR_VAL:
				return getStrVal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LittleintsPackage.INT1__BOOL_VAL:
				setBoolVal((Boolean)newValue);
				return;
			case LittleintsPackage.INT1__INT_VAL:
				setIntVal((Integer)newValue);
				return;
			case LittleintsPackage.INT1__STR_VAL:
				setStrVal((String)newValue);
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
			case LittleintsPackage.INT1__BOOL_VAL:
				setBoolVal(BOOL_VAL_EDEFAULT);
				return;
			case LittleintsPackage.INT1__INT_VAL:
				setIntVal(INT_VAL_EDEFAULT);
				return;
			case LittleintsPackage.INT1__STR_VAL:
				setStrVal(STR_VAL_EDEFAULT);
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
			case LittleintsPackage.INT1__BOOL_VAL:
				return boolVal != BOOL_VAL_EDEFAULT;
			case LittleintsPackage.INT1__INT_VAL:
				return intVal != INT_VAL_EDEFAULT;
			case LittleintsPackage.INT1__STR_VAL:
				return STR_VAL_EDEFAULT == null ? strVal != null : !STR_VAL_EDEFAULT.equals(strVal);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (boolVal: ");
		result.append(boolVal);
		result.append(", intVal: ");
		result.append(intVal);
		result.append(", strVal: ");
		result.append(strVal);
		result.append(')');
		return result.toString();
	}

} //Int1Impl
