package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
	 * aspectos que influirán en esta decisión: solo podremos salir a la calle si no
	 * está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la
	 * que, indistintamente de lo anterior, podremos salir a la calle: el hecho de
	 * tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano) si
	 * llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El
	 * algoritmo debe mostrar mediante un booleano (true o false) si es posible que
	 * se le otorgue permiso para salir a la calle.
	 * 
	 */

	public static void main(String[] args) {
		// Creamos las variables
		boolean lluvia, tarea, biblioteca, algoritmo1, algoritmo2;
		// Creamos un escaner para añadir datos
		Scanner key = new Scanner(System.in);
		// Pedimos los datos al usuario
		System.out.println("Responda con true o false");
		System.out.println("Dígame si va a llover:");
		lluvia = key.nextBoolean();
		System.out.println("Dígame si ha hecho las tareas: ");
		tarea = key.nextBoolean();
		System.out.println("Dígame si va a la biblioteca:");
		biblioteca = key.nextBoolean();

		// Creamos el algoritmo con operadores ternarios.
		// Si no llueve y tiene la tarea hecha sale de casa, o si tiene que ir a la
		// biblioteca, también sale de casa.
		algoritmo1 = (lluvia == false && tarea == true) || biblioteca;
		// Imprimimos el resultado
		System.out.println("¿Puede salir? " + (algoritmo1 ? "Sí" : "No")); // Nos dirá si puede salir, true si puede
																			// salir, false si no puede
		// Cerramos el escaner
		key.close();

	}

}
