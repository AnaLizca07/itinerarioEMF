/**
 */
package receta.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import receta.Instruccion;
import receta.RecetaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instruccion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstruccionTest extends TestCase {

	/**
	 * The fixture for this Instruccion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instruccion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstruccionTest.class);
	}

	/**
	 * Constructs a new Instruccion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstruccionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Instruccion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Instruccion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Instruccion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instruccion getFixture() {
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
		setFixture(RecetaFactory.eINSTANCE.createInstruccion());
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

} //InstruccionTest
