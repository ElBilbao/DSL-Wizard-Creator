/**
 */
package wizard.tests;

import junit.textui.TestRunner;

import wizard.Navegar;
import wizard.WizardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Navegar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavegarTest extends BotonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NavegarTest.class);
	}

	/**
	 * Constructs a new Navegar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavegarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Navegar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Navegar getFixture() {
		return (Navegar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WizardFactory.eINSTANCE.createNavegar());
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

} //NavegarTest
