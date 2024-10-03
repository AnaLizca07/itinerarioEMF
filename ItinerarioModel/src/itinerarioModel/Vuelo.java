/**
 */
package itinerarioModel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vuelo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link itinerarioModel.Vuelo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itinerarioModel.Vuelo#getOrigen <em>Origen</em>}</li>
 *   <li>{@link itinerarioModel.Vuelo#getDestino <em>Destino</em>}</li>
 *   <li>{@link itinerarioModel.Vuelo#getSalida <em>Salida</em>}</li>
 *   <li>{@link itinerarioModel.Vuelo#getLlegada <em>Llegada</em>}</li>
 * </ul>
 *
 * @see itinerarioModel.ItinerarioModelPackage#getVuelo()
 * @model
 * @generated
 */
public interface Vuelo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see itinerarioModel.ItinerarioModelPackage#getVuelo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itinerarioModel.Vuelo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see itinerarioModel.ItinerarioModelPackage#getVuelo_Origen()
	 * @model
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link itinerarioModel.Vuelo#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' attribute.
	 * @see #setDestino(String)
	 * @see itinerarioModel.ItinerarioModelPackage#getVuelo_Destino()
	 * @model
	 * @generated
	 */
	String getDestino();

	/**
	 * Sets the value of the '{@link itinerarioModel.Vuelo#getDestino <em>Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' attribute.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(String value);

	/**
	 * Returns the value of the '<em><b>Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salida</em>' attribute.
	 * @see #setSalida(Date)
	 * @see itinerarioModel.ItinerarioModelPackage#getVuelo_Salida()
	 * @model
	 * @generated
	 */
	Date getSalida();

	/**
	 * Sets the value of the '{@link itinerarioModel.Vuelo#getSalida <em>Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salida</em>' attribute.
	 * @see #getSalida()
	 * @generated
	 */
	void setSalida(Date value);

	/**
	 * Returns the value of the '<em><b>Llegada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Llegada</em>' attribute.
	 * @see #setLlegada(Date)
	 * @see itinerarioModel.ItinerarioModelPackage#getVuelo_Llegada()
	 * @model
	 * @generated
	 */
	Date getLlegada();

	/**
	 * Sets the value of the '{@link itinerarioModel.Vuelo#getLlegada <em>Llegada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Llegada</em>' attribute.
	 * @see #getLlegada()
	 * @generated
	 */
	void setLlegada(Date value);

} // Vuelo
