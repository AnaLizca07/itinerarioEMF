import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import itinerarioModel.Itinerario;
import itinerarioModel.ItinerarioModelFactory;
import itinerarioModel.Vuelo;

public class Main {

	public static void main(String[] args) {
		Itinerario itinerario = ItinerarioModelFactory.eINSTANCE.createItinerario();
		itinerario.getPasajeros();

		Vuelo vuelo1 = ItinerarioModelFactory.eINSTANCE.createVuelo();
		vuelo1.setNombre("AA123");
		vuelo1.setOrigen("Madrid");
		vuelo1.setDestino("Nueva York");

		Vuelo vuelo2 = ItinerarioModelFactory.eINSTANCE.createVuelo();
		vuelo2.setNombre("AA456");
		vuelo2.setOrigen("Nueva York");
		vuelo2.setDestino("Los Ángeles");

		itinerario.getVuelos().add(vuelo1);
		itinerario.getVuelos().add(vuelo2);
		System.out.print(vuelo1);
		System.out.print(vuelo2);

	}
	
}
