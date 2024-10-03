/**
 */
package receta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see receta.RecetaFactory
 * @model kind="package"
 * @generated
 */
public interface RecetaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "receta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://humboldt/receta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "humboldt.receta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecetaPackage eINSTANCE = receta.impl.RecetaPackageImpl.init();

	/**
	 * The meta object id for the '{@link receta.impl.RecetaImpl <em>Receta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see receta.impl.RecetaImpl
	 * @see receta.impl.RecetaPackageImpl#getReceta()
	 * @generated
	 */
	int RECETA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ingredientes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETA__INGREDIENTES = 1;

	/**
	 * The feature id for the '<em><b>Instrucciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETA__INSTRUCCIONES = 2;

	/**
	 * The number of structural features of the '<em>Receta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Receta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link receta.impl.IngredienteImpl <em>Ingrediente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see receta.impl.IngredienteImpl
	 * @see receta.impl.RecetaPackageImpl#getIngrediente()
	 * @generated
	 */
	int INGREDIENTE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTE__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Ingrediente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ingrediente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link receta.impl.InstruccionImpl <em>Instruccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see receta.impl.InstruccionImpl
	 * @see receta.impl.RecetaPackageImpl#getInstruccion()
	 * @generated
	 */
	int INSTRUCCION = 2;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCCION__TEXTO = 0;

	/**
	 * The number of structural features of the '<em>Instruccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCCION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCCION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link receta.Receta <em>Receta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receta</em>'.
	 * @see receta.Receta
	 * @generated
	 */
	EClass getReceta();

	/**
	 * Returns the meta object for the attribute '{@link receta.Receta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see receta.Receta#getNombre()
	 * @see #getReceta()
	 * @generated
	 */
	EAttribute getReceta_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link receta.Receta#getIngredientes <em>Ingredientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ingredientes</em>'.
	 * @see receta.Receta#getIngredientes()
	 * @see #getReceta()
	 * @generated
	 */
	EReference getReceta_Ingredientes();

	/**
	 * Returns the meta object for the reference list '{@link receta.Receta#getInstrucciones <em>Instrucciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instrucciones</em>'.
	 * @see receta.Receta#getInstrucciones()
	 * @see #getReceta()
	 * @generated
	 */
	EReference getReceta_Instrucciones();

	/**
	 * Returns the meta object for class '{@link receta.Ingrediente <em>Ingrediente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingrediente</em>'.
	 * @see receta.Ingrediente
	 * @generated
	 */
	EClass getIngrediente();

	/**
	 * Returns the meta object for the attribute '{@link receta.Ingrediente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see receta.Ingrediente#getNombre()
	 * @see #getIngrediente()
	 * @generated
	 */
	EAttribute getIngrediente_Nombre();

	/**
	 * Returns the meta object for class '{@link receta.Instruccion <em>Instruccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruccion</em>'.
	 * @see receta.Instruccion
	 * @generated
	 */
	EClass getInstruccion();

	/**
	 * Returns the meta object for the attribute '{@link receta.Instruccion#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see receta.Instruccion#getTexto()
	 * @see #getInstruccion()
	 * @generated
	 */
	EAttribute getInstruccion_Texto();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecetaFactory getRecetaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link receta.impl.RecetaImpl <em>Receta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see receta.impl.RecetaImpl
		 * @see receta.impl.RecetaPackageImpl#getReceta()
		 * @generated
		 */
		EClass RECETA = eINSTANCE.getReceta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETA__NOMBRE = eINSTANCE.getReceta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ingredientes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETA__INGREDIENTES = eINSTANCE.getReceta_Ingredientes();

		/**
		 * The meta object literal for the '<em><b>Instrucciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETA__INSTRUCCIONES = eINSTANCE.getReceta_Instrucciones();

		/**
		 * The meta object literal for the '{@link receta.impl.IngredienteImpl <em>Ingrediente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see receta.impl.IngredienteImpl
		 * @see receta.impl.RecetaPackageImpl#getIngrediente()
		 * @generated
		 */
		EClass INGREDIENTE = eINSTANCE.getIngrediente();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENTE__NOMBRE = eINSTANCE.getIngrediente_Nombre();

		/**
		 * The meta object literal for the '{@link receta.impl.InstruccionImpl <em>Instruccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see receta.impl.InstruccionImpl
		 * @see receta.impl.RecetaPackageImpl#getInstruccion()
		 * @generated
		 */
		EClass INSTRUCCION = eINSTANCE.getInstruccion();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCCION__TEXTO = eINSTANCE.getInstruccion_Texto();

	}

} //RecetaPackage
