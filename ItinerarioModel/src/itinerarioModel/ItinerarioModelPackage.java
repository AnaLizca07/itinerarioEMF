/**
 */
package itinerarioModel;

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
 * @see itinerarioModel.ItinerarioModelFactory
 * @model kind="package"
 * @generated
 */
public interface ItinerarioModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "itinerarioModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://humboldt/itinerario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "humboldtItinerario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItinerarioModelPackage eINSTANCE = itinerarioModel.impl.ItinerarioModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link itinerarioModel.impl.ItinerarioImpl <em>Itinerario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itinerarioModel.impl.ItinerarioImpl
	 * @see itinerarioModel.impl.ItinerarioModelPackageImpl#getItinerario()
	 * @generated
	 */
	int ITINERARIO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Vuelos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__VUELOS = 1;

	/**
	 * The feature id for the '<em><b>Pasajeros</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__PASAJEROS = 2;

	/**
	 * The number of structural features of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itinerarioModel.impl.PasajeroImpl <em>Pasajero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itinerarioModel.impl.PasajeroImpl
	 * @see itinerarioModel.impl.ItinerarioModelPackageImpl#getPasajero()
	 * @generated
	 */
	int PASAJERO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Identificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO__IDENTIFICACION = 1;

	/**
	 * The number of structural features of the '<em>Pasajero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pasajero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASAJERO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link itinerarioModel.impl.VueloImpl <em>Vuelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see itinerarioModel.impl.VueloImpl
	 * @see itinerarioModel.impl.ItinerarioModelPackageImpl#getVuelo()
	 * @generated
	 */
	int VUELO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__ORIGEN = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__SALIDA = 3;

	/**
	 * The feature id for the '<em><b>Llegada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__LLEGADA = 4;

	/**
	 * The number of structural features of the '<em>Vuelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vuelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link itinerarioModel.Itinerario <em>Itinerario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itinerario</em>'.
	 * @see itinerarioModel.Itinerario
	 * @generated
	 */
	EClass getItinerario();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Itinerario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itinerarioModel.Itinerario#getNombre()
	 * @see #getItinerario()
	 * @generated
	 */
	EAttribute getItinerario_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link itinerarioModel.Itinerario#getVuelos <em>Vuelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vuelos</em>'.
	 * @see itinerarioModel.Itinerario#getVuelos()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Vuelos();

	/**
	 * Returns the meta object for the reference list '{@link itinerarioModel.Itinerario#getPasajeros <em>Pasajeros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pasajeros</em>'.
	 * @see itinerarioModel.Itinerario#getPasajeros()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Pasajeros();

	/**
	 * Returns the meta object for class '{@link itinerarioModel.Pasajero <em>Pasajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pasajero</em>'.
	 * @see itinerarioModel.Pasajero
	 * @generated
	 */
	EClass getPasajero();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Pasajero#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itinerarioModel.Pasajero#getNombre()
	 * @see #getPasajero()
	 * @generated
	 */
	EAttribute getPasajero_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Pasajero#getIdentificacion <em>Identificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identificacion</em>'.
	 * @see itinerarioModel.Pasajero#getIdentificacion()
	 * @see #getPasajero()
	 * @generated
	 */
	EAttribute getPasajero_Identificacion();

	/**
	 * Returns the meta object for class '{@link itinerarioModel.Vuelo <em>Vuelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vuelo</em>'.
	 * @see itinerarioModel.Vuelo
	 * @generated
	 */
	EClass getVuelo();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Vuelo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see itinerarioModel.Vuelo#getNombre()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Vuelo#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see itinerarioModel.Vuelo#getOrigen()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Origen();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Vuelo#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destino</em>'.
	 * @see itinerarioModel.Vuelo#getDestino()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Destino();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Vuelo#getSalida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salida</em>'.
	 * @see itinerarioModel.Vuelo#getSalida()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Salida();

	/**
	 * Returns the meta object for the attribute '{@link itinerarioModel.Vuelo#getLlegada <em>Llegada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Llegada</em>'.
	 * @see itinerarioModel.Vuelo#getLlegada()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Llegada();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItinerarioModelFactory getItinerarioModelFactory();

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
		 * The meta object literal for the '{@link itinerarioModel.impl.ItinerarioImpl <em>Itinerario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itinerarioModel.impl.ItinerarioImpl
		 * @see itinerarioModel.impl.ItinerarioModelPackageImpl#getItinerario()
		 * @generated
		 */
		EClass ITINERARIO = eINSTANCE.getItinerario();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERARIO__NOMBRE = eINSTANCE.getItinerario_Nombre();

		/**
		 * The meta object literal for the '<em><b>Vuelos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERARIO__VUELOS = eINSTANCE.getItinerario_Vuelos();

		/**
		 * The meta object literal for the '<em><b>Pasajeros</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERARIO__PASAJEROS = eINSTANCE.getItinerario_Pasajeros();

		/**
		 * The meta object literal for the '{@link itinerarioModel.impl.PasajeroImpl <em>Pasajero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itinerarioModel.impl.PasajeroImpl
		 * @see itinerarioModel.impl.ItinerarioModelPackageImpl#getPasajero()
		 * @generated
		 */
		EClass PASAJERO = eINSTANCE.getPasajero();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASAJERO__NOMBRE = eINSTANCE.getPasajero_Nombre();

		/**
		 * The meta object literal for the '<em><b>Identificacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASAJERO__IDENTIFICACION = eINSTANCE.getPasajero_Identificacion();

		/**
		 * The meta object literal for the '{@link itinerarioModel.impl.VueloImpl <em>Vuelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see itinerarioModel.impl.VueloImpl
		 * @see itinerarioModel.impl.ItinerarioModelPackageImpl#getVuelo()
		 * @generated
		 */
		EClass VUELO = eINSTANCE.getVuelo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__NOMBRE = eINSTANCE.getVuelo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__ORIGEN = eINSTANCE.getVuelo_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__DESTINO = eINSTANCE.getVuelo_Destino();

		/**
		 * The meta object literal for the '<em><b>Salida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__SALIDA = eINSTANCE.getVuelo_Salida();

		/**
		 * The meta object literal for the '<em><b>Llegada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__LLEGADA = eINSTANCE.getVuelo_Llegada();

	}

} //ItinerarioModelPackage
