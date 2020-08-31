/**
 */
package wizard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Campo#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link wizard.Campo#isObligatorio <em>Obligatorio</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getCampo()
 * @model
 * @generated
 */
public interface Campo extends EObject {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see wizard.WizardPackage#getCampo_Etiqueta()
	 * @model required="true"
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link wizard.Campo#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Obligatorio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligatorio</em>' attribute.
	 * @see #setObligatorio(boolean)
	 * @see wizard.WizardPackage#getCampo_Obligatorio()
	 * @model required="true"
	 * @generated
	 */
	boolean isObligatorio();

	/**
	 * Sets the value of the '{@link wizard.Campo#isObligatorio <em>Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligatorio</em>' attribute.
	 * @see #isObligatorio()
	 * @generated
	 */
	void setObligatorio(boolean value);

} // Campo
