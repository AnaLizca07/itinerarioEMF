/**
 */
package itinerarioModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pasajero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link itinerarioModel.Pasajero#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itinerarioModel.Pasajero#getIdentificacion <em>Identificacion</em>}</li>
 * </ul>
 *
 * @see itinerarioModel.ItinerarioModelPackage#getPasajero()
 * @model
 * @generated
 */
public interface Pasajero extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see itinerarioModel.ItinerarioModelPackage#getPasajero_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itinerarioModel.Pasajero#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Identificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identificacion</em>' attribute.
	 * @see #setIdentificacion(String)
	 * @see itinerarioModel.ItinerarioModelPackage#getPasajero_Identificacion()
	 * @model
	 * @generated
	 */
	String getIdentificacion();

	/**
	 * Sets the value of the '{@link itinerarioModel.Pasajero#getIdentificacion <em>Identificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identificacion</em>' attribute.
	 * @see #getIdentificacion()
	 * @generated
	 */
	void setIdentificacion(String value);

} // Pasajero
