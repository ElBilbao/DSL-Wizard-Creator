/**
 */
package wizard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Casilla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Casilla#getName <em>Name</em>}</li>
 *   <li>{@link wizard.Casilla#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link wizard.Casilla#isSeleccionado <em>Seleccionado</em>}</li>
 *   <li>{@link wizard.Casilla#getNuevoDestino <em>Nuevo Destino</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getCasilla()
 * @model
 * @generated
 */
public interface Casilla extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizard.WizardPackage#getCasilla_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizard.Casilla#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see wizard.WizardPackage#getCasilla_Etiqueta()
	 * @model required="true"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link wizard.Casilla#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Seleccionado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seleccionado</em>' attribute.
	 * @see #setSeleccionado(boolean)
	 * @see wizard.WizardPackage#getCasilla_Seleccionado()
	 * @model required="true"
	 * @generated
	 */
	boolean isSeleccionado();

	/**
	 * Sets the value of the '{@link wizard.Casilla#isSeleccionado <em>Seleccionado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seleccionado</em>' attribute.
	 * @see #isSeleccionado()
	 * @generated
	 */
	void setSeleccionado(boolean value);

	/**
	 * Returns the value of the '<em><b>Nuevo Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuevo Destino</em>' reference.
	 * @see #setNuevoDestino(Pagina)
	 * @see wizard.WizardPackage#getCasilla_NuevoDestino()
	 * @model
	 * @generated
	 */
	Pagina getNuevoDestino();

	/**
	 * Sets the value of the '{@link wizard.Casilla#getNuevoDestino <em>Nuevo Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuevo Destino</em>' reference.
	 * @see #getNuevoDestino()
	 * @generated
	 */
	void setNuevoDestino(Pagina value);

} // Casilla
