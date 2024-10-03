/**
 */
package itinerarioModel.tests;

import itinerarioModel.ItinerarioModelFactory;
import itinerarioModel.Pasajero;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pasajero</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PasajeroTest extends TestCase {

	/**
	 * The fixture for this Pasajero test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pasajero fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PasajeroTest.class);
	}

	/**
	 * Constructs a new Pasajero test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasajeroTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pasajero test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pasajero fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pasajero test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pasajero getFixture() {
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
		setFixture(ItinerarioModelFactory.eINSTANCE.createPasajero());
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

} //PasajeroTest
