/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wizard.Casilla;
import wizard.Pagina;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Casilla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.CasillaImpl#getName <em>Name</em>}</li>
 *   <li>{@link wizard.impl.CasillaImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link wizard.impl.CasillaImpl#isSeleccionado <em>Seleccionado</em>}</li>
 *   <li>{@link wizard.impl.CasillaImpl#getNuevoDestino <em>Nuevo Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CasillaImpl extends MinimalEObjectImpl.Container implements Casilla {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #isSeleccionado() <em>Seleccionado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeleccionado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECCIONADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeleccionado() <em>Seleccionado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeleccionado()
	 * @generated
	 * @ordered
	 */
	protected boolean seleccionado = SELECCIONADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNuevoDestino() <em>Nuevo Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuevoDestino()
	 * @generated
	 * @ordered
	 */
	protected Pagina nuevoDestino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasillaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.CASILLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA__ETIQUETA, oldEtiqueta, etiqueta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSeleccionado() {
		return seleccionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeleccionado(boolean newSeleccionado) {
		boolean oldSeleccionado = seleccionado;
		seleccionado = newSeleccionado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA__SELECCIONADO, oldSeleccionado, seleccionado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pagina getNuevoDestino() {
		if (nuevoDestino != null && nuevoDestino.eIsProxy()) {
			InternalEObject oldNuevoDestino = (InternalEObject)nuevoDestino;
			nuevoDestino = (Pagina)eResolveProxy(oldNuevoDestino);
			if (nuevoDestino != oldNuevoDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.CASILLA__NUEVO_DESTINO, oldNuevoDestino, nuevoDestino));
			}
		}
		return nuevoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagina basicGetNuevoDestino() {
		return nuevoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNuevoDestino(Pagina newNuevoDestino) {
		Pagina oldNuevoDestino = nuevoDestino;
		nuevoDestino = newNuevoDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.CASILLA__NUEVO_DESTINO, oldNuevoDestino, nuevoDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.CASILLA__NAME:
				return getName();
			case WizardPackage.CASILLA__ETIQUETA:
				return getEtiqueta();
			case WizardPackage.CASILLA__SELECCIONADO:
				return isSeleccionado();
			case WizardPackage.CASILLA__NUEVO_DESTINO:
				if (resolve) return getNuevoDestino();
				return basicGetNuevoDestino();
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
			case WizardPackage.CASILLA__NAME:
				setName((String)newValue);
				return;
			case WizardPackage.CASILLA__ETIQUETA:
				setEtiqueta((String)newValue);
				return;
			case WizardPackage.CASILLA__SELECCIONADO:
				setSeleccionado((Boolean)newValue);
				return;
			case WizardPackage.CASILLA__NUEVO_DESTINO:
				setNuevoDestino((Pagina)newValue);
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
			case WizardPackage.CASILLA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WizardPackage.CASILLA__ETIQUETA:
				setEtiqueta(ETIQUETA_EDEFAULT);
				return;
			case WizardPackage.CASILLA__SELECCIONADO:
				setSeleccionado(SELECCIONADO_EDEFAULT);
				return;
			case WizardPackage.CASILLA__NUEVO_DESTINO:
				setNuevoDestino((Pagina)null);
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
			case WizardPackage.CASILLA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WizardPackage.CASILLA__ETIQUETA:
				return ETIQUETA_EDEFAULT == null ? etiqueta != null : !ETIQUETA_EDEFAULT.equals(etiqueta);
			case WizardPackage.CASILLA__SELECCIONADO:
				return seleccionado != SELECCIONADO_EDEFAULT;
			case WizardPackage.CASILLA__NUEVO_DESTINO:
				return nuevoDestino != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", etiqueta: ");
		result.append(etiqueta);
		result.append(", seleccionado: ");
		result.append(seleccionado);
		result.append(')');
		return result.toString();
	}

} //CasillaImpl
