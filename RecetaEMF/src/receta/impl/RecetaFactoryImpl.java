/**
 */
package receta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import receta.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecetaFactoryImpl extends EFactoryImpl implements RecetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecetaFactory init() {
		try {
			RecetaFactory theRecetaFactory = (RecetaFactory)EPackage.Registry.INSTANCE.getEFactory(RecetaPackage.eNS_URI);
			if (theRecetaFactory != null) {
				return theRecetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecetaFactoryImpl() {
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
			case RecetaPackage.RECETA: return createReceta();
			case RecetaPackage.INGREDIENTE: return createIngrediente();
			case RecetaPackage.INSTRUCCION: return createInstruccion();
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
	public Receta createReceta() {
		RecetaImpl receta = new RecetaImpl();
		return receta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingrediente createIngrediente() {
		IngredienteImpl ingrediente = new IngredienteImpl();
		return ingrediente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruccion createInstruccion() {
		InstruccionImpl instruccion = new InstruccionImpl();
		return instruccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecetaPackage getRecetaPackage() {
		return (RecetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecetaPackage getPackage() {
		return RecetaPackage.eINSTANCE;
	}

} //RecetaFactoryImpl
