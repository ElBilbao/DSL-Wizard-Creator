/**
 */
package wizard.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wizard.Casilla;
import wizard.WizardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Casilla</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CasillaTest extends TestCase {

	/**
	 * The fixture for this Casilla test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Casilla fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CasillaTest.class);
	}

	/**
	 * Constructs a new Casilla test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasillaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Casilla test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Casilla fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Casilla test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Casilla getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WizardFactory.eINSTANCE.createCasilla());
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

} //CasillaTest
