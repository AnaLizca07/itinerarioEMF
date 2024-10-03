/**
 */
package itinerarioModel.tests;

import itinerarioModel.Itinerario;
import itinerarioModel.ItinerarioModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItinerarioTest extends TestCase {

	/**
	 * The fixture for this Itinerario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Itinerario fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItinerarioTest.class);
	}

	/**
	 * Constructs a new Itinerario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItinerarioTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Itinerario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Itinerario fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Itinerario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Itinerario getFixture() {
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
		setFixture(ItinerarioModelFactory.eINSTANCE.createItinerario());
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

} //ItinerarioTest
