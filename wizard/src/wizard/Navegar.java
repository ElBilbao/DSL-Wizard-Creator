/**
 */
package wizard;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navegar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Navegar#getDestino <em>Destino</em>}</li>
 *   <li>{@link wizard.Navegar#getCasillas <em>Casillas</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getNavegar()
 * @model
 * @generated
 */
public interface Navegar extends Boton {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Pagina)
	 * @see wizard.WizardPackage#getNavegar_Destino()
	 * @model required="true"
	 * @generated
	 */
	Pagina getDestino();

	/**
	 * Sets the value of the '{@link wizard.Navegar#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Pagina value);

	/**
	 * Returns the value of the '<em><b>Casillas</b></em>' reference list.
	 * The list contents are of type {@link wizard.Casilla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casillas</em>' reference list.
	 * @see wizard.WizardPackage#getNavegar_Casillas()
	 * @model
	 * @generated
	 */
	EList<Casilla> getCasillas();

} // Navegar
