package paquete1;

public class numeroRectangular {
	private double numeroReal;
	private double numeroImaginario;
	private String formaRectangular;
	
	public numeroRectangular(double numeroReal, double numeroImaginario){
		numeroReal = this.numeroReal;
		numeroImaginario = this.numeroImaginario;
		formaRectangular = escribeRectangular();
	}
	
	public String escribeRectangular(){
		String simbolo1;
		String simbolo2;
		if(numeroReal < 0) simbolo1 = "- ";
		else simbolo1 = "+ ";
		if(numeroImaginario < 0) simbolo2 = "- ";
		else simbolo2 = "+ ";
		
		return "Z = " + simbolo1 + numeroReal + simbolo2 + numeroImaginario;
	}
	
}
