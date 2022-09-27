package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Realizar una aplicación que solicite al usuario su edad y le indique si es
	 * mayor de edad (mediante un literal booleano: true o false).
	 */

	public static void main(String[] args) {
		// Creamos todas las variables que vamos a usar.
		int edad;
		boolean res;
		final int MAYOREDAD = 18;
		// Creamos el escaner.
		Scanner key = new Scanner(System.in);
		// Pedimos al usuario la edad
		System.out.println("Deme su edad: ");
		edad = key.nextInt();
		// Creamos una operación que nos dirá si es mayor de 18 mediante booleano con
		// una condición.
		res = edad>18;
		
		// Imprimimos por pantalla

		 System.out.println(res);

		// Cerramos el escaner
			key.close();
	}

}
