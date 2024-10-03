/**
 */
package itinerarioModel.tests;

import itinerarioModel.ItinerarioModelFactory;
import itinerarioModel.Vuelo;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vuelo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VueloTest extends TestCase {

	/**
	 * The fixture for this Vuelo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vuelo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VueloTest.class);
	}

	/**
	 * Constructs a new Vuelo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueloTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vuelo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vuelo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vuelo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vuelo getFixture() {
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
		setFixture(ItinerarioModelFactory.eINSTANCE.createVuelo());
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

} //VueloTest
