/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wizard.Campo;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.CampoImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link wizard.impl.CampoImpl#isObligatorio <em>Obligatorio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampoImpl extends MinimalEObjectImpl.Container implements Campo {
	/**
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected String etiqueta = ETIQUETA_EDEFAULT;

	/**
	 * The default value of the '{@link #isObligatorio() <em>Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatorio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATORIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObligatorio() <em>Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatorio()
	 * @generated
	 * @ordered
	 */
	protected boolean obligatorio = OBLIGATORIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.CAMPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEtiqueta() {
		return etiqueta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEtiqueta(String newEtiqueta) {
		String oldEtiqueta = etiqueta;
		etiqueta = newEtiqueta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CAMPO__ETIQUETA, oldEtiqueta, etiqueta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObligatorio() {
		return obligatorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObligatorio(boolean newObligatorio) {
		boolean oldObligatorio = obligatorio;
		obligatorio = newObligatorio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CAMPO__OBLIGATORIO, oldObligatorio, obligatorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.CAMPO__ETIQUETA:
				return getEtiqueta();
			case WizardPackage.CAMPO__OBLIGATORIO:
				return isObligatorio();
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
			case WizardPackage.CAMPO__ETIQUETA:
				setEtiqueta((String)newValue);
				return;
			case WizardPackage.CAMPO__OBLIGATORIO:
				setObligatorio((Boolean)newValue);
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
			case WizardPackage.CAMPO__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
				return;
			case WizardPackage.CAMPO__OBLIGATORIO:
				setObligatorio(OBLIGATORIO_EDEFAULT);
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
			case WizardPackage.CAMPO__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? etiqueta != null : !ETIQUETA_EDEFAULT.equals(etiqueta);
			case WizardPackage.CAMPO__OBLIGATORIO:
				return obligatorio != OBLIGATORIO_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (etiqueta: ");
		result.append(etiqueta);
		result.append(", obligatorio: ");
		result.append(obligatorio);
		result.append(')');
		return result.toString();
	}

} //CampoImpl
