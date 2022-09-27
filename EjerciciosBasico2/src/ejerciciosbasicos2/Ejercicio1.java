package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta
	 * de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
	 * solicite las ventas (en kilos) de cada semestre para cada fruta. La
	 * aplicación mostrará el importe total sabiendo que el precio del kilo de
	 * manzanas está fijado en 2,35€ y el kilo de peras en 1,95€. Utiliza operadores
	 * opera y asigna.
	 */

	public static void main(String[] args) {
		//Dejamos el escaner creado
		Scanner key = new Scanner(System.in);
		// Creamos las variables y dos constantes de los precios de los kilos, ya que el
		// precio siempre será el mismo.
		double kgperas, kgmanzanas;
		final double MANZANAS = 2.35;
		final double PERAS = 1.95;

		//Ahora pedimos la cantidad de kilos y manzanas al usuario.
		System.out.println("Deme la cantidad de peras en kilos: ");
		kgperas = key.nextDouble();
		System.out.println("Deme la cantidad de manzanas en kilos: ");
		kgmanzanas = key.nextDouble();
		
		//A continuación realizamos las operaciones para el cálculo de cada semestre.
		kgperas *= PERAS;
		kgmanzanas *= MANZANAS;
		
		//Y mostramos el resultado
		System.out.println("El resultado del semestre en manzanas es: " + kgmanzanas +
				" y en peras: " + kgperas );
		// Cerramos el escaner
				key.close();
		
	}

}
