/**
 */
package itinerarioModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link itinerarioModel.Itinerario#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itinerarioModel.Itinerario#getVuelos <em>Vuelos</em>}</li>
 *   <li>{@link itinerarioModel.Itinerario#getPasajeros <em>Pasajeros</em>}</li>
 * </ul>
 *
 * @see itinerarioModel.ItinerarioModelPackage#getItinerario()
 * @model
 * @generated
 */
public interface Itinerario extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see itinerarioModel.ItinerarioModelPackage#getItinerario_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itinerarioModel.Itinerario#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Vuelos</b></em>' reference list.
	 * The list contents are of type {@link itinerarioModel.Vuelo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vuelos</em>' reference list.
	 * @see itinerarioModel.ItinerarioModelPackage#getItinerario_Vuelos()
	 * @model required="true"
	 * @generated
	 */
	EList<Vuelo> getVuelos();

	/**
	 * Returns the value of the '<em><b>Pasajeros</b></em>' reference list.
	 * The list contents are of type {@link itinerarioModel.Pasajero}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pasajeros</em>' reference list.
	 * @see itinerarioModel.ItinerarioModelPackage#getItinerario_Pasajeros()
	 * @model required="true"
	 * @generated
	 */
	EList<Pasajero> getPasajeros();

} // Itinerario
