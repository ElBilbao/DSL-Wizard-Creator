/**
 */
package wizard.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wizard.Boton;
import wizard.Campo;
import wizard.Casilla;
import wizard.Pagina;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.PaginaImpl#getName <em>Name</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#isInicial <em>Inicial</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#getCampos <em>Campos</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#getCasillas <em>Casillas</em>}</li>
 *   <li>{@link wizard.impl.PaginaImpl#getBotones <em>Botones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaginaImpl extends MinimalEObjectImpl.Container implements Pagina {
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
	 * The default value of the '{@link #isInicial() <em>Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INICIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInicial() <em>Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInicial()
	 * @generated
	 * @ordered
	 */
	protected boolean inicial = INICIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampos() <em>Campos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampos()
	 * @generated
	 * @ordered
	 */
	protected EList<Campo> campos;

	/**
	 * The cached value of the '{@link #getCasillas() <em>Casillas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasillas()
	 * @generated
	 * @ordered
	 */
	protected EList<Casilla> casillas;

	/**
	 * The cached value of the '{@link #getBotones() <em>Botones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotones()
	 * @generated
	 * @ordered
	 */
	protected EList<Boton> botones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.PAGINA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.PAGINA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInicial() {
		return inicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInicial(boolean newInicial) {
		boolean oldInicial = inicial;
		inicial = newInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.PAGINA__INICIAL, oldInicial, inicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Campo> getCampos() {
		if (campos == null) {
			campos = new EObjectContainmentEList<Campo>(Campo.class, this, WizardPackage.PAGINA__CAMPOS);
		}
		return campos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Casilla> getCasillas() {
		if (casillas == null) {
			casillas = new EObjectContainmentEList<Casilla>(Casilla.class, this, WizardPackage.PAGINA__CASILLAS);
		}
		return casillas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boton> getBotones() {
		if (botones == null) {
			botones = new EObjectContainmentEList<Boton>(Boton.class, this, WizardPackage.PAGINA__BOTONES);
		}
		return botones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardPackage.PAGINA__CAMPOS:
				return ((InternalEList<?>)getCampos()).basicRemove(otherEnd, msgs);
			case WizardPackage.PAGINA__CASILLAS:
				return ((InternalEList<?>)getCasillas()).basicRemove(otherEnd, msgs);
			case WizardPackage.PAGINA__BOTONES:
				return ((InternalEList<?>)getBotones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.PAGINA__NAME:
				return getName();
			case WizardPackage.PAGINA__INICIAL:
				return isInicial();
			case WizardPackage.PAGINA__CAMPOS:
				return getCampos();
			case WizardPackage.PAGINA__CASILLAS:
				return getCasillas();
			case WizardPackage.PAGINA__BOTONES:
				return getBotones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WizardPackage.PAGINA__NAME:
				setName((String)newValue);
				return;
			case WizardPackage.PAGINA__INICIAL:
				setInicial((Boolean)newValue);
				return;
			case WizardPackage.PAGINA__CAMPOS:
				getCampos().clear();
				getCampos().addAll((Collection<? extends Campo>)newValue);
				return;
			case WizardPackage.PAGINA__CASILLAS:
				getCasillas().clear();
				getCasillas().addAll((Collection<? extends Casilla>)newValue);
				return;
			case WizardPackage.PAGINA__BOTONES:
				getBotones().clear();
				getBotones().addAll((Collection<? extends Boton>)newValue);
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
			case WizardPackage.PAGINA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WizardPackage.PAGINA__INICIAL:
				setInicial(INICIAL_EDEFAULT);
				return;
			case WizardPackage.PAGINA__CAMPOS:
				getCampos().clear();
				return;
			case WizardPackage.PAGINA__CASILLAS:
				getCasillas().clear();
				return;
			case WizardPackage.PAGINA__BOTONES:
				getBotones().clear();
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
			case WizardPackage.PAGINA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WizardPackage.PAGINA__INICIAL:
				return inicial != INICIAL_EDEFAULT;
			case WizardPackage.PAGINA__CAMPOS:
				return campos != null && !campos.isEmpty();
			case WizardPackage.PAGINA__CASILLAS:
				return casillas != null && !casillas.isEmpty();
			case WizardPackage.PAGINA__BOTONES:
				return botones != null && !botones.isEmpty();
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
		result.append(", inicial: ");
		result.append(inicial);
		result.append(')');
		return result.toString();
	}

} //PaginaImpl
