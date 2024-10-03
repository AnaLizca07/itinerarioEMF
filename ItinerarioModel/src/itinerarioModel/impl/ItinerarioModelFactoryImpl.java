/**
 */
package itinerarioModel.impl;

import itinerarioModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItinerarioModelFactoryImpl extends EFactoryImpl implements ItinerarioModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItinerarioModelFactory init() {
		try {
			ItinerarioModelFactory theItinerarioModelFactory = (ItinerarioModelFactory)EPackage.Registry.INSTANCE.getEFactory(ItinerarioModelPackage.eNS_URI);
			if (theItinerarioModelFactory != null) {
				return theItinerarioModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ItinerarioModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItinerarioModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ItinerarioModelPackage.ITINERARIO: return createItinerario();
			case ItinerarioModelPackage.PASAJERO: return createPasajero();
			case ItinerarioModelPackage.VUELO: return createVuelo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Itinerario createItinerario() {
		ItinerarioImpl itinerario = new ItinerarioImpl();
		return itinerario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pasajero createPasajero() {
		PasajeroImpl pasajero = new PasajeroImpl();
		return pasajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vuelo createVuelo() {
		VueloImpl vuelo = new VueloImpl();
		return vuelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItinerarioModelPackage getItinerarioModelPackage() {
		return (ItinerarioModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ItinerarioModelPackage getPackage() {
		return ItinerarioModelPackage.eINSTANCE;
	}

} //ItinerarioModelFactoryImpl
