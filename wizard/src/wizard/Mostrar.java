/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mostrar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Mostrar#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getMostrar()
 * @model
 * @generated
 */
public interface Mostrar extends Boton {
	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' attribute.
	 * @see #setMensaje(String)
	 * @see wizard.WizardPackage#getMostrar_Mensaje()
	 * @model required="true"
	 * @generated
	 */
	String getMensaje();

	/**
	 * Sets the value of the '{@link wizard.Mostrar#getMensaje <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mensaje</em>' attribute.
	 * @see #getMensaje()
	 * @generated
	 */
	void setMensaje(String value);

} // Mostrar
