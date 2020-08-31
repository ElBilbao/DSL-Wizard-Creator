/**
 */
package wizard.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wizard.Pagina;
import wizard.WizardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginaTest extends TestCase {

	/**
	 * The fixture for this Pagina test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pagina fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginaTest.class);
	}

	/**
	 * Constructs a new Pagina test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pagina test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pagina fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pagina test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pagina getFixture() {
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
		setFixture(WizardFactory.eINSTANCE.createPagina());
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

} //PaginaTest
