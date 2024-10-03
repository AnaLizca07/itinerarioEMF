/**
 */
package itinerarioModel.impl;

import itinerarioModel.ItinerarioModelPackage;
import itinerarioModel.Pasajero;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pasajero</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link itinerarioModel.impl.PasajeroImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itinerarioModel.impl.PasajeroImpl#getIdentificacion <em>Identificacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PasajeroImpl extends MinimalEObjectImpl.Container implements Pasajero {
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
	 * The default value of the '{@link #getIdentificacion() <em>Identificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificacion()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificacion() <em>Identificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificacion()
	 * @generated
	 * @ordered
	 */
	protected String identificacion = IDENTIFICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasajeroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerarioModelPackage.Literals.PASAJERO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioModelPackage.PASAJERO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentificacion(String newIdentificacion) {
		String oldIdentificacion = identificacion;
		identificacion = newIdentificacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioModelPackage.PASAJERO__IDENTIFICACION, oldIdentificacion, identificacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItinerarioModelPackage.PASAJERO__NOMBRE:
				return getNombre();
			case ItinerarioModelPackage.PASAJERO__IDENTIFICACION:
				return getIdentificacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ItinerarioModelPackage.PASAJERO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ItinerarioModelPackage.PASAJERO__IDENTIFICACION:
				setIdentificacion((String)newValue);
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
			case ItinerarioModelPackage.PASAJERO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ItinerarioModelPackage.PASAJERO__IDENTIFICACION:
				setIdentificacion(IDENTIFICACION_EDEFAULT);
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
			case ItinerarioModelPackage.PASAJERO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ItinerarioModelPackage.PASAJERO__IDENTIFICACION:
				return IDENTIFICACION_EDEFAULT == null ? identificacion != null : !IDENTIFICACION_EDEFAULT.equals(identificacion);
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
		result.append(", identificacion: ");
		result.append(identificacion);
		result.append(')');
		return result.toString();
	}

} //PasajeroImpl
