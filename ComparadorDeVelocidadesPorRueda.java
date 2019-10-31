package ar.edu.utn.javaintermedio;
import java.util.Comparator;

public class ComparadorDeVelocidadesPorRueda implements Comparator<Vehiculo> {
	
	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {					//con este metodo se puede comparar strings, por defecto los ordena alfabeticamente
		float miVelXRueda = v1.velocidadPorRueda();
		float laOtraVel = v2.velocidadPorRueda();
			
		return (int)(miVelXRueda - laOtraVel);
	}

}
