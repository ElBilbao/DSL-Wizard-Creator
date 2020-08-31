/**
 */
package wizard.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wizard.Wizard;
import wizard.WizardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardTest extends TestCase {

	/**
	 * The fixture for this Wizard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wizard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WizardTest.class);
	}

	/**
	 * Constructs a new Wizard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Wizard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Wizard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Wizard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wizard getFixture() {
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
		setFixture(WizardFactory.eINSTANCE.createWizard());
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

} //WizardTest
