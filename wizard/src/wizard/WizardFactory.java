/**
 */
package wizard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wizard.WizardPackage
 * @generated
 */
public interface WizardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardFactory eINSTANCE = wizard.impl.WizardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard</em>'.
	 * @generated
	 */
	Wizard createWizard();

	/**
	 * Returns a new object of class '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagina</em>'.
	 * @generated
	 */
	Pagina createPagina();

	/**
	 * Returns a new object of class '<em>Campo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campo</em>'.
	 * @generated
	 */
	Campo createCampo();

	/**
	 * Returns a new object of class '<em>Casilla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Casilla</em>'.
	 * @generated
	 */
	Casilla createCasilla();

	/**
	 * Returns a new object of class '<em>Navegar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navegar</em>'.
	 * @generated
	 */
	Navegar createNavegar();

	/**
	 * Returns a new object of class '<em>Mostrar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mostrar</em>'.
	 * @generated
	 */
	Mostrar createMostrar();

	/**
	 * Returns a new object of class '<em>Cerrar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cerrar</em>'.
	 * @generated
	 */
	Cerrar createCerrar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WizardPackage getWizardPackage();

} //WizardFactory
