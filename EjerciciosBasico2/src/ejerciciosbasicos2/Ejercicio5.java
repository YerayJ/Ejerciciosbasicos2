package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio5 {

	// Escribir un programa que solicite las notas del primer, segundo y tercer
	// trimestre (notas enteras que se solicitarán al usuario). El programa debe
	// mostrar la nota media del curso como se utiliza en el boletín de
	// calificaciones (solo la parte entera) y como se usa en el expediente
	// académico (con decimales).

	public static void main(String[] args) {
		//Creamos las variables
		int notaPrimera,notaSegunda,notaTercera ;
		double suma;
		//Creamos el escaner
		Scanner key = new Scanner(System.in);
		//Pedimos las notas al usuario
		System.out.println("Dame las tres notas como números enteros");
		System.out.println("Primer Trimestre: ");
		notaPrimera = key.nextInt();
		System.out.println("Segundo Trimestre: ");
		notaSegunda = key.nextInt();
		System.out.println("Tercer Trimestre: ");
		notaTercera = key.nextInt();
		//Hacemos el promedio
		suma = notaPrimera + notaSegunda + notaTercera;
		double promedio = suma/3;
		
		//Imprimimos el resultado
		System.out.println("NOTAS");
		System.out.println("La nota del primer trimestre es " + notaPrimera);
		System.out.println("La nota del segundo trimestre es " + notaSegunda);
		System.out.println("La nota del tercer trimestre es " + notaTercera);
		//La sentencia %.2f servirá para indicar que solo queremos mostrar dos decimales.
		System.out.printf("El resultado total del expediente academico es  %.2f",  promedio);
		
		//Cerramos el escaner
		key.close();
		
	}

}
