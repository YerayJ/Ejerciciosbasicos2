package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Escribir un programa que pida un número al usuario e indique mediante un
	 * literal booleano (true o false) si el número es par.
	 */

	public static void main(String[] args) {
		// Creamos las variables
		int num, par, impar;
		boolean res;
		// Creamos un escaner
		Scanner key = new Scanner(System.in);
		// Pedimos al usuario un número
		System.out.print("Dame un número para saber si es par o impar: ");
		num = key.nextInt();

		// Ahora haremos una operacion para saber si un numero es par. Sacamos el resto
		// del número y si es igual a 0 el número es par.
		res = num % 2 == 0;

		System.out.println(res);
		// Cerramos el escaner
		key.close();

	}

}
