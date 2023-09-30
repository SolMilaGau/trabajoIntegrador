package Integrador;
import java.util.Scanner;
public class Ejercicio4 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Ingrese un número de 3 dígitos: "); 
		int number = scanner.nextInt();
		
		while (number < 100 || number > 999) {
			System.out.print("El número debe ser de 3 dígitos. Ingrese otro número: ");
			number = scanner.nextInt();
		}
		
		for (int i = 0; i <= number; i+=2) {
			System.out.println(i);		
		}
		scanner.close();
	}	   
}