/**
 */
package wizard.tests;

import junit.textui.TestRunner;

import wizard.Cerrar;
import wizard.WizardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cerrar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CerrarTest extends BotonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CerrarTest.class);
	}

	/**
	 * Constructs a new Cerrar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CerrarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cerrar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cerrar getFixture() {
		return (Cerrar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WizardFactory.eINSTANCE.createCerrar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CerrarTest
