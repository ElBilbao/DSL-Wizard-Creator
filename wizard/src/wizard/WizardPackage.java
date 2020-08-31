/**
 */
package wizard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see wizard.WizardFactory
 * @model kind="package"
 * @generated
 */
public interface WizardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "wizard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wizard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardPackage eINSTANCE = wizard.impl.WizardPackageImpl.init();

	/**
	 * The meta object id for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.WizardImpl
	 * @see wizard.impl.WizardPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Paginas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGINAS = 1;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.PaginaImpl <em>Pagina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.PaginaImpl
	 * @see wizard.impl.WizardPackageImpl#getPagina()
	 * @generated
	 */
	int PAGINA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__INICIAL = 1;

	/**
	 * The feature id for the '<em><b>Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__CAMPOS = 2;

	/**
	 * The feature id for the '<em><b>Casillas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__CASILLAS = 3;

	/**
	 * The feature id for the '<em><b>Botones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__BOTONES = 4;

	/**
	 * The number of structural features of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.CampoImpl <em>Campo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CampoImpl
	 * @see wizard.impl.WizardPackageImpl#getCampo()
	 * @generated
	 */
	int CAMPO = 2;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__ETIQUETA = 0;

	/**
	 * The feature id for the '<em><b>Obligatorio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO__OBLIGATORIO = 1;

	/**
	 * The number of structural features of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Campo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.CasillaImpl <em>Casilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CasillaImpl
	 * @see wizard.impl.WizardPackageImpl#getCasilla()
	 * @generated
	 */
	int CASILLA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA__ETIQUETA = 1;

	/**
	 * The feature id for the '<em><b>Seleccionado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA__SELECCIONADO = 2;

	/**
	 * The feature id for the '<em><b>Nuevo Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA__NUEVO_DESTINO = 3;

	/**
	 * The number of structural features of the '<em>Casilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Casilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASILLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.BotonImpl <em>Boton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.BotonImpl
	 * @see wizard.impl.WizardPackageImpl#getBoton()
	 * @generated
	 */
	int BOTON = 4;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__ETIQUETA = 0;

	/**
	 * The number of structural features of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.NavegarImpl <em>Navegar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.NavegarImpl
	 * @see wizard.impl.WizardPackageImpl#getNavegar()
	 * @generated
	 */
	int NAVEGAR = 5;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGAR__ETIQUETA = BOTON__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGAR__DESTINO = BOTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Casillas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGAR__CASILLAS = BOTON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navegar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGAR_FEATURE_COUNT = BOTON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Navegar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGAR_OPERATION_COUNT = BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.MostrarImpl <em>Mostrar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.MostrarImpl
	 * @see wizard.impl.WizardPackageImpl#getMostrar()
	 * @generated
	 */
	int MOSTRAR = 6;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSTRAR__ETIQUETA = BOTON__ETIQUETA;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSTRAR__MENSAJE = BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mostrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSTRAR_FEATURE_COUNT = BOTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mostrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSTRAR_OPERATION_COUNT = BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.CerrarImpl <em>Cerrar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CerrarImpl
	 * @see wizard.impl.WizardPackageImpl#getCerrar()
	 * @generated
	 */
	int CERRAR = 7;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERRAR__ETIQUETA = BOTON__ETIQUETA;

	/**
	 * The number of structural features of the '<em>Cerrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERRAR_FEATURE_COUNT = BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cerrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERRAR_OPERATION_COUNT = BOTON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wizard.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see wizard.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Wizard#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see wizard.Wizard#getTitulo()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Titulo();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Wizard#getPaginas <em>Paginas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginas</em>'.
	 * @see wizard.Wizard#getPaginas()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Paginas();

	/**
	 * Returns the meta object for class '{@link wizard.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina</em>'.
	 * @see wizard.Pagina
	 * @generated
	 */
	EClass getPagina();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Pagina#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizard.Pagina#getName()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Name();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Pagina#isInicial <em>Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inicial</em>'.
	 * @see wizard.Pagina#isInicial()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Inicial();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Pagina#getCampos <em>Campos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campos</em>'.
	 * @see wizard.Pagina#getCampos()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Campos();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Pagina#getCasillas <em>Casillas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Casillas</em>'.
	 * @see wizard.Pagina#getCasillas()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Casillas();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Pagina#getBotones <em>Botones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Botones</em>'.
	 * @see wizard.Pagina#getBotones()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Botones();

	/**
	 * Returns the meta object for class '{@link wizard.Campo <em>Campo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campo</em>'.
	 * @see wizard.Campo
	 * @generated
	 */
	EClass getCampo();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Campo#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see wizard.Campo#getEtiqueta()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Campo#isObligatorio <em>Obligatorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obligatorio</em>'.
	 * @see wizard.Campo#isObligatorio()
	 * @see #getCampo()
	 * @generated
	 */
	EAttribute getCampo_Obligatorio();

	/**
	 * Returns the meta object for class '{@link wizard.Casilla <em>Casilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Casilla</em>'.
	 * @see wizard.Casilla
	 * @generated
	 */
	EClass getCasilla();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Casilla#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizard.Casilla#getName()
	 * @see #getCasilla()
	 * @generated
	 */
	EAttribute getCasilla_Name();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Casilla#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see wizard.Casilla#getEtiqueta()
	 * @see #getCasilla()
	 * @generated
	 */
	EAttribute getCasilla_Etiqueta();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Casilla#isSeleccionado <em>Seleccionado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seleccionado</em>'.
	 * @see wizard.Casilla#isSeleccionado()
	 * @see #getCasilla()
	 * @generated
	 */
	EAttribute getCasilla_Seleccionado();

	/**
	 * Returns the meta object for the reference '{@link wizard.Casilla#getNuevoDestino <em>Nuevo Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuevo Destino</em>'.
	 * @see wizard.Casilla#getNuevoDestino()
	 * @see #getCasilla()
	 * @generated
	 */
	EReference getCasilla_NuevoDestino();

	/**
	 * Returns the meta object for class '{@link wizard.Boton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton</em>'.
	 * @see wizard.Boton
	 * @generated
	 */
	EClass getBoton();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Boton#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see wizard.Boton#getEtiqueta()
	 * @see #getBoton()
	 * @generated
	 */
	EAttribute getBoton_Etiqueta();

	/**
	 * Returns the meta object for class '{@link wizard.Navegar <em>Navegar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navegar</em>'.
	 * @see wizard.Navegar
	 * @generated
	 */
	EClass getNavegar();

	/**
	 * Returns the meta object for the reference '{@link wizard.Navegar#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see wizard.Navegar#getDestino()
	 * @see #getNavegar()
	 * @generated
	 */
	EReference getNavegar_Destino();

	/**
	 * Returns the meta object for the reference list '{@link wizard.Navegar#getCasillas <em>Casillas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Casillas</em>'.
	 * @see wizard.Navegar#getCasillas()
	 * @see #getNavegar()
	 * @generated
	 */
	EReference getNavegar_Casillas();

	/**
	 * Returns the meta object for class '{@link wizard.Mostrar <em>Mostrar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mostrar</em>'.
	 * @see wizard.Mostrar
	 * @generated
	 */
	EClass getMostrar();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Mostrar#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mensaje</em>'.
	 * @see wizard.Mostrar#getMensaje()
	 * @see #getMostrar()
	 * @generated
	 */
	EAttribute getMostrar_Mensaje();

	/**
	 * Returns the meta object for class '{@link wizard.Cerrar <em>Cerrar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cerrar</em>'.
	 * @see wizard.Cerrar
	 * @generated
	 */
	EClass getCerrar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WizardFactory getWizardFactory();

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
		 * The meta object literal for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.WizardImpl
		 * @see wizard.impl.WizardPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__TITULO = eINSTANCE.getWizard_Titulo();

		/**
		 * The meta object literal for the '<em><b>Paginas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGINAS = eINSTANCE.getWizard_Paginas();

		/**
		 * The meta object literal for the '{@link wizard.impl.PaginaImpl <em>Pagina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.PaginaImpl
		 * @see wizard.impl.WizardPackageImpl#getPagina()
		 * @generated
		 */
		EClass PAGINA = eINSTANCE.getPagina();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__NAME = eINSTANCE.getPagina_Name();

		/**
		 * The meta object literal for the '<em><b>Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__INICIAL = eINSTANCE.getPagina_Inicial();

		/**
		 * The meta object literal for the '<em><b>Campos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__CAMPOS = eINSTANCE.getPagina_Campos();

		/**
		 * The meta object literal for the '<em><b>Casillas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__CASILLAS = eINSTANCE.getPagina_Casillas();

		/**
		 * The meta object literal for the '<em><b>Botones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__BOTONES = eINSTANCE.getPagina_Botones();

		/**
		 * The meta object literal for the '{@link wizard.impl.CampoImpl <em>Campo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CampoImpl
		 * @see wizard.impl.WizardPackageImpl#getCampo()
		 * @generated
		 */
		EClass CAMPO = eINSTANCE.getCampo();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__ETIQUETA = eINSTANCE.getCampo_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Obligatorio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPO__OBLIGATORIO = eINSTANCE.getCampo_Obligatorio();

		/**
		 * The meta object literal for the '{@link wizard.impl.CasillaImpl <em>Casilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CasillaImpl
		 * @see wizard.impl.WizardPackageImpl#getCasilla()
		 * @generated
		 */
		EClass CASILLA = eINSTANCE.getCasilla();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASILLA__NAME = eINSTANCE.getCasilla_Name();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASILLA__ETIQUETA = eINSTANCE.getCasilla_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Seleccionado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASILLA__SELECCIONADO = eINSTANCE.getCasilla_Seleccionado();

		/**
		 * The meta object literal for the '<em><b>Nuevo Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASILLA__NUEVO_DESTINO = eINSTANCE.getCasilla_NuevoDestino();

		/**
		 * The meta object literal for the '{@link wizard.impl.BotonImpl <em>Boton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.BotonImpl
		 * @see wizard.impl.WizardPackageImpl#getBoton()
		 * @generated
		 */
		EClass BOTON = eINSTANCE.getBoton();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTON__ETIQUETA = eINSTANCE.getBoton_Etiqueta();

		/**
		 * The meta object literal for the '{@link wizard.impl.NavegarImpl <em>Navegar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.NavegarImpl
		 * @see wizard.impl.WizardPackageImpl#getNavegar()
		 * @generated
		 */
		EClass NAVEGAR = eINSTANCE.getNavegar();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVEGAR__DESTINO = eINSTANCE.getNavegar_Destino();

		/**
		 * The meta object literal for the '<em><b>Casillas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVEGAR__CASILLAS = eINSTANCE.getNavegar_Casillas();

		/**
		 * The meta object literal for the '{@link wizard.impl.MostrarImpl <em>Mostrar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.MostrarImpl
		 * @see wizard.impl.WizardPackageImpl#getMostrar()
		 * @generated
		 */
		EClass MOSTRAR = eINSTANCE.getMostrar();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOSTRAR__MENSAJE = eINSTANCE.getMostrar_Mensaje();

		/**
		 * The meta object literal for the '{@link wizard.impl.CerrarImpl <em>Cerrar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CerrarImpl
		 * @see wizard.impl.WizardPackageImpl#getCerrar()
		 * @generated
		 */
		EClass CERRAR = eINSTANCE.getCerrar();

	}

} //WizardPackage
