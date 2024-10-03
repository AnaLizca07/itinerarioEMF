/**
 */
package receta.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import receta.Ingrediente;
import receta.RecetaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ingrediente</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IngredienteTest extends TestCase {

	/**
	 * The fixture for this Ingrediente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ingrediente fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IngredienteTest.class);
	}

	/**
	 * Constructs a new Ingrediente test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngredienteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ingrediente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ingrediente fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ingrediente test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ingrediente getFixture() {
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
		setFixture(RecetaFactory.eINSTANCE.createIngrediente());
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

} //IngredienteTest
