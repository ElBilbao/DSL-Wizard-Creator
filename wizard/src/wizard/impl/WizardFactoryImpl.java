/**
 */
package wizard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wizard.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardFactoryImpl extends EFactoryImpl implements WizardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardFactory init() {
		try {
			WizardFactory theWizardFactory = (WizardFactory)EPackage.Registry.INSTANCE.getEFactory(WizardPackage.eNS_URI);
			if (theWizardFactory != null) {
				return theWizardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WizardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WizardPackage.WIZARD: return createWizard();
			case WizardPackage.PAGINA: return createPagina();
			case WizardPackage.CAMPO: return createCampo();
			case WizardPackage.CASILLA: return createCasilla();
			case WizardPackage.NAVEGAR: return createNavegar();
			case WizardPackage.MOSTRAR: return createMostrar();
			case WizardPackage.CERRAR: return createCerrar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wizard createWizard() {
		WizardImpl wizard = new WizardImpl();
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pagina createPagina() {
		PaginaImpl pagina = new PaginaImpl();
		return pagina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Campo createCampo() {
		CampoImpl campo = new CampoImpl();
		return campo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Casilla createCasilla() {
		CasillaImpl casilla = new CasillaImpl();
		return casilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navegar createNavegar() {
		NavegarImpl navegar = new NavegarImpl();
		return navegar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mostrar createMostrar() {
		MostrarImpl mostrar = new MostrarImpl();
		return mostrar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cerrar createCerrar() {
		CerrarImpl cerrar = new CerrarImpl();
		return cerrar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WizardPackage getWizardPackage() {
		return (WizardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WizardPackage getPackage() {
		return WizardPackage.eINSTANCE;
	}

} //WizardFactoryImpl
