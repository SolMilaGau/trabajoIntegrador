package Integrador;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];

		System.out.println("Por favor, ingrese 5 números:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		Arrays.sort(numeros);
		System.out.println("Orden de mayor a menor: " + Arrays.toString(numeros));

		int[] numerosInvertidos = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			numerosInvertidos[i] = numeros[numeros.length - 1 - i];
		}
		System.out.println("Orden de menor a mayor: " + Arrays.toString(numerosInvertidos));
		scanner.close();
	}
}
