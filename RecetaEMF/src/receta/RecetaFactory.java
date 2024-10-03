/**
 */
package receta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see receta.RecetaPackage
 * @generated
 */
public interface RecetaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecetaFactory eINSTANCE = receta.impl.RecetaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Receta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receta</em>'.
	 * @generated
	 */
	Receta createReceta();

	/**
	 * Returns a new object of class '<em>Ingrediente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingrediente</em>'.
	 * @generated
	 */
	Ingrediente createIngrediente();

	/**
	 * Returns a new object of class '<em>Instruccion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruccion</em>'.
	 * @generated
	 */
	Instruccion createInstruccion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecetaPackage getRecetaPackage();

} //RecetaFactory
