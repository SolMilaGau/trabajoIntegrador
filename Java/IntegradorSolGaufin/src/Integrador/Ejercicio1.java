package Integrador;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Ejercicio1");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese una nota: ");
		int nota = scanner.nextInt();

		if (nota >= 0 && nota <= 3) {
			System.out.println("Nota: " + nota);
			System.out.println("Detalle: Insuficiente");
		} else if (nota == 4) {
			System.out.println("Nota: " + nota);
			System.out.println("Detalle: Suficiente");
		} else if (nota <= 6) {
			System.out.println("Nota: " + nota);
			System.out.println("Detalle: Bien");
		} else if (nota <= 8) {
			System.out.println("Nota: " + nota);
			System.out.println("Detalle: Notable");
		} else if (nota <= 10) {
			System.out.println("Nota: " + nota);
			System.out.println("Detalle: Sobresaliente");
		} else {
			System.out.println("Nota inválida");
		}

		scanner.close();
	}

}
