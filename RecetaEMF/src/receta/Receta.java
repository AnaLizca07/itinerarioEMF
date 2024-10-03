/**
 */
package receta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link receta.Receta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link receta.Receta#getIngredientes <em>Ingredientes</em>}</li>
 *   <li>{@link receta.Receta#getInstrucciones <em>Instrucciones</em>}</li>
 * </ul>
 *
 * @see receta.RecetaPackage#getReceta()
 * @model
 * @generated
 */
public interface Receta extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see receta.RecetaPackage#getReceta_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link receta.Receta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ingredientes</b></em>' reference list.
	 * The list contents are of type {@link receta.Ingrediente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredientes</em>' reference list.
	 * @see receta.RecetaPackage#getReceta_Ingredientes()
	 * @model required="true"
	 * @generated
	 */
	EList<Ingrediente> getIngredientes();

	/**
	 * Returns the value of the '<em><b>Instrucciones</b></em>' reference list.
	 * The list contents are of type {@link receta.Instruccion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrucciones</em>' reference list.
	 * @see receta.RecetaPackage#getReceta_Instrucciones()
	 * @model required="true"
	 * @generated
	 */
	EList<Instruccion> getInstrucciones();

} // Receta
