package paquete1;

import java.util.Scanner;

public class Programa {

	public numeroRectangular capturaNumeroRectangular(int contadorIngreso){
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngrese el número complejo " + contadorIngreso + " en su forma z = a + bi");
		
		System.out.println("\nIngrese a: ");
		double a = scanner.nextDouble();
		
		System.out.println("\nIngrese b: ");
		double b = scanner.nextDouble();
		
		numeroRectangular numeroCreado = new numeroRectangular(a,b);
		return numeroCreado;
	}
}
