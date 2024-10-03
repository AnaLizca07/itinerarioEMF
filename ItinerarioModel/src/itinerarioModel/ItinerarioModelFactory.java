/**
 */
package itinerarioModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see itinerarioModel.ItinerarioModelPackage
 * @generated
 */
public interface ItinerarioModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItinerarioModelFactory eINSTANCE = itinerarioModel.impl.ItinerarioModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Itinerario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Itinerario</em>'.
	 * @generated
	 */
	Itinerario createItinerario();

	/**
	 * Returns a new object of class '<em>Pasajero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pasajero</em>'.
	 * @generated
	 */
	Pasajero createPasajero();

	/**
	 * Returns a new object of class '<em>Vuelo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vuelo</em>'.
	 * @generated
	 */
	Vuelo createVuelo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ItinerarioModelPackage getItinerarioModelPackage();

} //ItinerarioModelFactory
