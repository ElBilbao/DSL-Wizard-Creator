/**
 */
package wizard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Boton#getEtiqueta <em>Etiqueta</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getBoton()
 * @model abstract="true"
 * @generated
 */
public interface Boton extends EObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see wizard.WizardPackage#getBoton_Etiqueta()
	 * @model required="true"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link wizard.Boton#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

} // Boton
