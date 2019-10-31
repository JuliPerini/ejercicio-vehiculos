package ar.edu.utn.javaintermedio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        ArrayList<Moto> listaMotos = new ArrayList<>();
	        
	        Moto moto1 = new Moto();
	        moto1.setMarca("Motomel");
	        moto1.setColor("Rojo");
	        listaMotos.add(moto1);
	        
	        Moto moto2 = new Moto();
	        moto2.setMarca("Yamaha");
	        moto2.setColor("Verde");
	        listaMotos.add(moto2);
	        
	        Moto moto3 = new Moto(); 
	        moto3.setMarca("Ducati");
	        moto3.setColor("Negro");
	        listaMotos.add(moto3);
	        
	        Integer minimo = Integer.MAX_VALUE; // o listaMotos.get(0).getVelocidadMaxima();
	        String masLenta = "";
	        
	       
	        Scanner scanner = new Scanner(System.in);
	        
	        for (Moto moto : listaMotos) {
	            System.out.println("Ingrese velocidad" + moto.getMarca());
	            moto.setVelocidadMaxima(scanner.nextInt());
	            System.out.println("Metros Avanzados: " + moto.avanzar(120));
	        }
	    
	        for (Moto moto : listaMotos) {
	            int c = moto.avanzar(120);
	            minimo = Math.min(c, minimo);
	            if (c== minimo) {
	                masLenta = moto.getMarca();
	            }
	        }
	 }
}

	        
	        /*Collections.checkedSortedMap(listaMotos, new ComparadorDeVelocidad()));
	        listaMotos.stream()foreach(m -> system.out.println(m.getMarca()));
	        
	            
	        }*/
	        

