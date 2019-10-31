package ar.edu.utn.javaintermedio;

public class Moto extends Vehiculo implements Comparable<Moto>{
	
   /* public Moto(String color, String marca) {
        super(color, marca, 2);
    }*/

	@Override
    public Integer getCantidadDeRuedas() {
        
        
        Integer RuedasMoto = 2;
        return RuedasMoto;
    }
	
	
   @Override
	public int compareTo(Moto arg0) {
		//devolver un numero positivo si la moto es mas rapida que la moto del parametro
		//devolver un numero negativo si la moto es menos rapida que la moto del parametro
		//devolver 0 si la moto es igual de rapida que la moto del parametro
		
	   int miVelocidad = getVelocidadMaxima();
	   int velocidadDeLaOtraMoto = arg0.getVelocidadMaxima();
	   
	   return miVelocidad - velocidadDeLaOtraMoto;
	 
		   }
	}


