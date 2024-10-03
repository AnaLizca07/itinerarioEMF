/**
 */
package receta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import receta.Ingrediente;
import receta.Instruccion;
import receta.Receta;
import receta.RecetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link receta.impl.RecetaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link receta.impl.RecetaImpl#getIngredientes <em>Ingredientes</em>}</li>
 *   <li>{@link receta.impl.RecetaImpl#getInstrucciones <em>Instrucciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecetaImpl extends MinimalEObjectImpl.Container implements Receta {
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
	 * The cached value of the '{@link #getIngredientes() <em>Ingredientes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientes()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingrediente> ingredientes;

	/**
	 * The cached value of the '{@link #getInstrucciones() <em>Instrucciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrucciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruccion> instrucciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecetaPackage.Literals.RECETA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecetaPackage.RECETA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ingrediente> getIngredientes() {
		if (ingredientes == null) {
			ingredientes = new EObjectResolvingEList<Ingrediente>(Ingrediente.class, this, RecetaPackage.RECETA__INGREDIENTES);
		}
		return ingredientes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruccion> getInstrucciones() {
		if (instrucciones == null) {
			instrucciones = new EObjectResolvingEList<Instruccion>(Instruccion.class, this, RecetaPackage.RECETA__INSTRUCCIONES);
		}
		return instrucciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecetaPackage.RECETA__NOMBRE:
				return getNombre();
			case RecetaPackage.RECETA__INGREDIENTES:
				return getIngredientes();
			case RecetaPackage.RECETA__INSTRUCCIONES:
				return getInstrucciones();
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
			case RecetaPackage.RECETA__NOMBRE:
				setNombre((String)newValue);
				return;
			case RecetaPackage.RECETA__INGREDIENTES:
				getIngredientes().clear();
				getIngredientes().addAll((Collection<? extends Ingrediente>)newValue);
				return;
			case RecetaPackage.RECETA__INSTRUCCIONES:
				getInstrucciones().clear();
				getInstrucciones().addAll((Collection<? extends Instruccion>)newValue);
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
			case RecetaPackage.RECETA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case RecetaPackage.RECETA__INGREDIENTES:
				getIngredientes().clear();
				return;
			case RecetaPackage.RECETA__INSTRUCCIONES:
				getInstrucciones().clear();
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
			case RecetaPackage.RECETA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case RecetaPackage.RECETA__INGREDIENTES:
				return ingredientes != null && !ingredientes.isEmpty();
			case RecetaPackage.RECETA__INSTRUCCIONES:
				return instrucciones != null && !instrucciones.isEmpty();
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

} //RecetaImpl
