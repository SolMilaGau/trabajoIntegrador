package Integrador;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el número de sueldos a ingresar: ");
		int n = scanner.nextInt();
		double[] sueldos = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
			sueldos[i] = scanner.nextDouble();
		}
		double sueldoMaximo = sueldos[0];
		double sueldoMinimo = sueldos[0];
		double sumaSueldos = sueldos[0];
		for (int i = 1; i < n; i++) {
			if (sueldos[i] > sueldoMaximo) {
				sueldoMaximo = sueldos[i];
			}
			if (sueldos[i] < sueldoMinimo) {
				sueldoMinimo = sueldos[i];
			}
			sumaSueldos += sueldos[i];
		}
		double promedioSueldos = sumaSueldos / n;
		System.out.println("El sueldo más alto es: $" + sueldoMaximo);
		System.out.println("El sueldo más bajo es: $" + sueldoMinimo);
		System.out.println("El promedio de los sueldos ingresados es: $" + promedioSueldos);
		scanner.close();
	}
}
