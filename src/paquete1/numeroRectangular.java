package paquete1;

import java.lang.Math;

public class numeroRectangular {
	private double numeroReal;
	private double numeroImaginario;

	public numeroRectangular(double numeroReal, double numeroImaginario){
		numeroReal = this.numeroReal;
		numeroImaginario = this.numeroImaginario;
	}
	
	public numeroRectangular() {}
	
	public double getNumeroReal() {
		return numeroReal;
	}
	
	public double getNumeroImaginario() {
		return numeroImaginario;
	}
	
	//Funcion que realiza la suma en forma rectangular.
	public String sumaRectangular(numeroRectangular numero2, boolean tipoResultado) {
		double sumaReal = numeroReal + numero2.getNumeroReal();
		double sumaImaginario = numeroImaginario + numero2.getNumeroImaginario();
		
		if(tipoResultado) return imprimePolar(sumaReal, sumaImaginario);
		return  "(" + sumaReal + ") + (" + sumaImaginario + ")i";
	}
	
	//Funcion que realiza la resta en forma rectangular.
	public String restaRectangular(numeroRectangular numero2, boolean tipoResultado) {
		double restaReal = numeroReal - numero2.getNumeroReal();
		double restaImaginario = numeroImaginario - numero2.getNumeroImaginario();
		
		if(tipoResultado) return imprimePolar(restaReal, restaImaginario);
		else return  "(" + restaReal + ") - (" + restaImaginario + ")i";
	}
	
	//Funcion que imprime el resultado de manera polar.
	public String imprimePolar(double real, double imaginario) {
		double modulo = Math.sqrt(real*real + imaginario*imaginario);
		double argumento = Math.toDegrees(Math.atan(imaginario/real));
		
		return modulo + " L" + argumento; 
	}

	public void setNumeroReal(double numeroReal) {
		this.numeroReal = numeroReal;
	}

	public void setNumeroImaginario(double numeroImaginario) {
		this.numeroImaginario = numeroImaginario;
	}
	
}
