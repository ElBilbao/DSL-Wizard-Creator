/**
 */
package wizard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Pagina#getName <em>Name</em>}</li>
 *   <li>{@link wizard.Pagina#isInicial <em>Inicial</em>}</li>
 *   <li>{@link wizard.Pagina#getCampos <em>Campos</em>}</li>
 *   <li>{@link wizard.Pagina#getCasillas <em>Casillas</em>}</li>
 *   <li>{@link wizard.Pagina#getBotones <em>Botones</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getPagina()
 * @model
 * @generated
 */
public interface Pagina extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizard.WizardPackage#getPagina_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizard.Pagina#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicial</em>' attribute.
	 * @see #setInicial(boolean)
	 * @see wizard.WizardPackage#getPagina_Inicial()
	 * @model required="true"
	 * @generated
	 */
	boolean isInicial();

	/**
	 * Sets the value of the '{@link wizard.Pagina#isInicial <em>Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicial</em>' attribute.
	 * @see #isInicial()
	 * @generated
	 */
	void setInicial(boolean value);

	/**
	 * Returns the value of the '<em><b>Campos</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Campo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campos</em>' containment reference list.
	 * @see wizard.WizardPackage#getPagina_Campos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Campo> getCampos();

	/**
	 * Returns the value of the '<em><b>Casillas</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Casilla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casillas</em>' containment reference list.
	 * @see wizard.WizardPackage#getPagina_Casillas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Casilla> getCasillas();

	/**
	 * Returns the value of the '<em><b>Botones</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Boton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botones</em>' containment reference list.
	 * @see wizard.WizardPackage#getPagina_Botones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Boton> getBotones();

} // Pagina
