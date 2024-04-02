package com.generation;

//Funcionamiento
//#Cambios

//#Librería añadida
import java.util.Scanner;

public class Codigo4 {

	//#Función main agregada
	public static void main(String[] args) {
	    
		//#Líneas iniciales reorganizadas para mejorar legibilidad
		
		//Se recibe la entrada del primer usuario
		//#Se cambió print por println para mayor claridad de entradas/salidas
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    //#System.in añadido a ambos scanners
	    Scanner s = new Scanner(System.in);
	    String j1 = s.nextLine();

	  //Se recibe la entrada del segundo usuario
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    
	  //Compara las entradas para descartar empates
	    //#Comparación cambiada de "==" a "equals.to" para comparar correctamente
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } 
	  //Compara el mínimo de casos necesarios, el resto se determina con el valor por defecto para eficientar.
	    else 
	    {
	      int g = 2;
	      //#breaks añadidos
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break;
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	          break;
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	break;
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	    //#Se agregaron los cierres a las entradas de datos 
	    s.close();
	    s2.close();
	}

}
