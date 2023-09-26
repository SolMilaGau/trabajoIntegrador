package Integrador;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número entre 0 y 9.999: ");
		int numero = scanner.nextInt();

		if (numero >= 0 && numero <= 9999) {
			int cantidadCifras = String.valueOf(numero).length();
			System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");
		} else {
			System.out.println("El número ingresado no pertenece al rango solicitado.");
		}

		scanner.close();
	}
}
