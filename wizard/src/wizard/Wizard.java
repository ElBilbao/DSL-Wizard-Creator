/**
 */
package wizard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Wizard#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link wizard.Wizard#getPaginas <em>Paginas</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getWizard()
 * @model
 * @generated
 */
public interface Wizard extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see wizard.WizardPackage#getWizard_Titulo()
	 * @model required="true"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link wizard.Wizard#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Paginas</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Pagina}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginas</em>' containment reference list.
	 * @see wizard.WizardPackage#getWizard_Paginas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pagina> getPaginas();

} // Wizard
