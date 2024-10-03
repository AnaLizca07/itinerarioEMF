/**
 */
package receta.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import receta.Receta;
import receta.RecetaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Receta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecetaTest extends TestCase {

	/**
	 * The fixture for this Receta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Receta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecetaTest.class);
	}

	/**
	 * Constructs a new Receta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecetaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Receta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Receta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Receta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Receta getFixture() {
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
		setFixture(RecetaFactory.eINSTANCE.createReceta());
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

} //RecetaTest
