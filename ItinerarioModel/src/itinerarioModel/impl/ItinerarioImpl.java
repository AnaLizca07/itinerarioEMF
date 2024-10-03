/**
 */
package itinerarioModel.impl;

import itinerarioModel.Itinerario;
import itinerarioModel.ItinerarioModelPackage;
import itinerarioModel.Pasajero;
import itinerarioModel.Vuelo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link itinerarioModel.impl.ItinerarioImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itinerarioModel.impl.ItinerarioImpl#getVuelos <em>Vuelos</em>}</li>
 *   <li>{@link itinerarioModel.impl.ItinerarioImpl#getPasajeros <em>Pasajeros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItinerarioImpl extends MinimalEObjectImpl.Container implements Itinerario {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVuelos() <em>Vuelos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVuelos()
	 * @generated
	 * @ordered
	 */
	protected EList<Vuelo> vuelos;

	/**
	 * The cached value of the '{@link #getPasajeros() <em>Pasajeros</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasajeros()
	 * @generated
	 * @ordered
	 */
	protected EList<Pasajero> pasajeros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItinerarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerarioModelPackage.Literals.ITINERARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioModelPackage.ITINERARIO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vuelo> getVuelos() {
		if (vuelos == null) {
			vuelos = new EObjectResolvingEList<Vuelo>(Vuelo.class, this, ItinerarioModelPackage.ITINERARIO__VUELOS);
		}
		return vuelos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pasajero> getPasajeros() {
		if (pasajeros == null) {
			pasajeros = new EObjectResolvingEList<Pasajero>(Pasajero.class, this, ItinerarioModelPackage.ITINERARIO__PASAJEROS);
		}
		return pasajeros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__NOMBRE:
				return getNombre();
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				return getVuelos();
			case ItinerarioModelPackage.ITINERARIO__PASAJEROS:
				return getPasajeros();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				getVuelos().clear();
				getVuelos().addAll((Collection<? extends Vuelo>)newValue);
				return;
			case ItinerarioModelPackage.ITINERARIO__PASAJEROS:
				getPasajeros().clear();
				getPasajeros().addAll((Collection<? extends Pasajero>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				getVuelos().clear();
				return;
			case ItinerarioModelPackage.ITINERARIO__PASAJEROS:
				getPasajeros().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				return vuelos != null && !vuelos.isEmpty();
			case ItinerarioModelPackage.ITINERARIO__PASAJEROS:
				return pasajeros != null && !pasajeros.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ItinerarioImpl
