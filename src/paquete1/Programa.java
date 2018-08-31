package paquete1;

import java.io.IOException;
import java.util.Scanner;

public class Programa {

	//Funcion que captura los dos digitos que forman al numero rectangular.
	public void capturaNumeroRectangular(numeroRectangular nuevoNumero, int contadorIngreso){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el número complejo " + contadorIngreso + " en su forma z = a + bi");
		
		//El while se utiliza para que la entrada solo se acepte si es un numero.
		System.out.println("Ingrese a: ");
		double a; 
		while(!scanner.hasNextDouble()) scanner.next(); 
		a = scanner.nextDouble();
		
		System.out.println("Ingrese b: ");
		double b;
		while(!scanner.hasNextDouble()) scanner.next();
		b = scanner.nextDouble();
		
		System.out.println("\n");
		
		nuevoNumero.setNumeroReal(a);
		nuevoNumero.setNumeroImaginario(b);
	}
	
	//Funcion que imprime el menu.
	public void Menu() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		boolean usoPrograma = true;
		
		numeroRectangular numRect1 = new numeroRectangular();
		numeroRectangular numRect2 = new numeroRectangular();
		numeroPolar numPolar1 = new numeroPolar();
		numeroPolar numPolar2 = new numeroPolar();
		
		//se capturan los datos en forma rectangular y se realiza la conversion.
		capturaNumeroRectangular(numRect1, 1);
		capturaNumeroRectangular(numRect2, 2);
		
		numPolar1.transformarAPolar(numRect1.getNumeroReal(), numRect1.getNumeroImaginario());
		numPolar2.transformarAPolar(numRect2.getNumeroReal(), numRect2.getNumeroImaginario());
		
		//do while que hace funcionar al menu mientras no se elija la opcion de salida.
		do {
			System.out.println("\n");
			System.out.println("1.- Suma de dos numeros complejos.");
			System.out.println("2.- Resta de dos numeros complejos.");
			System.out.println("3.- Multiplicacion de dos numeros complejos.");
			System.out.println("4.- Division de dos numeros complejos.");
			System.out.println("5.- Salir.");
			System.out.println("\nSeleccione una opcion: ");

			//While que permite solo la entrada de numeros.
			while(!scanner.hasNextInt()) scanner.next();
			opcion = scanner.nextInt();
			
			//If que detecta si la opcion de entrada esta en el rango aceptado o no.
			if(opcion < 6 && opcion > 0)
				switch(opcion) {
				case 1:  System.out.println("((" + numRect1.getNumeroReal() + ") + (" + numRect1.getNumeroImaginario() + 
								" i)) + ((" + numRect2.getNumeroReal() + ") + (" + numRect2.getNumeroImaginario() 
								+ " i)) = " + numRect1.sumaRectangular(numRect2, false));
						 System.out.println("(" + numPolar1.getModulo() + " L" + numPolar1.getArgumento() + ") + ("
								 + numPolar2.getModulo() + " L" + numPolar2.getArgumento() + ") = " + 
								 numRect1.sumaRectangular(numRect2, true));
						 try{System.in.read();} 
						 catch (IOException e) {
						        e.printStackTrace();
						    }
						 break;
				case 2:  System.out.println("((" + numRect1.getNumeroReal() + ") + (" + numRect1.getNumeroImaginario() + 
								" i)) - ((" + numRect2.getNumeroReal() + ") + (" + numRect2.getNumeroImaginario() 
								+ " i)) = " + numRect1.restaRectangular(numRect2, false));
				 		 System.out.println("(" + numPolar1.getModulo() + " L" + numPolar1.getArgumento() + ") - ("
				 				 + numPolar2.getModulo() + " L" + numPolar2.getArgumento() + ") = " + 
				 				 numRect1.restaRectangular(numRect2, true));
				 		 try{System.in.read();} 
				 		 	catch (IOException e) {
				 		 		e.printStackTrace();
				 		 	}
				 		 break;
				case 3:  System.out.println("((" + numRect1.getNumeroReal() + ") + (" + numRect1.getNumeroImaginario() + 
								" i)) * ((" + numRect2.getNumeroReal() + ") + (" + numRect2.getNumeroImaginario() 
								+ " i)) = " + numPolar1.multiplicacionPolar(numPolar2, true));
		 		 		 System.out.println("(" + numPolar1.getModulo() + " L" + numPolar1.getArgumento() + ") * ("
		 		 				 + numPolar2.getModulo() + " L" + numPolar2.getArgumento() + ") = " + 
		 		 				numPolar1.multiplicacionPolar(numPolar2, false));
		 		 		 try{System.in.read();} 
		 		 		 	catch (IOException e) {
		 		 		 		e.printStackTrace();
		 		 		 	}
		 		 		 break;
				case 4:  System.out.println("((" + numRect1.getNumeroReal() + ") + (" + numRect1.getNumeroImaginario() + 
								" i)) / ((" + numRect2.getNumeroReal() + ") + (" + numRect2.getNumeroImaginario() 
								+ " i)) = " + numPolar1.divisionPolar(numPolar2, true));
		 		 		 System.out.println("(" + numPolar1.getModulo() + " L" + numPolar1.getArgumento() + ") / ("
		 		 				 + numPolar2.getModulo() + " L" + numPolar2.getArgumento() + ") = " + 
		 		 				numPolar1.divisionPolar(numPolar2, false));
		 		 		 try{System.in.read();} 
		 		 		 	catch (IOException e) {
		 		 		 		e.printStackTrace();
		 		 		 	}
		 		 		 break;
				case 5: usoPrograma = false;
						break;
				}
			else {System.out.println("\nIngresa una opcion valida.");
			try{System.in.read();} 
	 		 	catch (IOException e) {
	 		 		e.printStackTrace();
	 		 	}
			}
		}while(usoPrograma);
		

	}
}
