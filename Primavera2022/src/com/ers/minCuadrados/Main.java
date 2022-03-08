package com.ers.minCuadrados;

public class Main {

	/**
	 * Funcion que calcula la funcion de regresion lineal usando el 
	 * metodo de minimos cuadrados
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i=0;
		
		double[] valoresx = {30,28,32,25,25,25,22,24,35,40};
		double[] valoresy = {25,30,27,40,42,40,50,45,30,25};
		
		DatosEstad ob1 = new DatosEstad();
		
		double promedioX = ob1.promedio(valoresx);
		double promedioY = ob1.promedio(valoresy);
		double tempX=0.0, tempY=0.0, numerador=0.0, denominador=0.0, beta1 =0.0,beta0 = 0.0;
		
		for(i=0; i<valoresx.length; i++) {
			tempX = valoresx[i] - promedioX;
			tempY = valoresy[i] - promedioY;
			
			beta1+=(tempX*tempY)/(Math.pow(tempX, 2));
			
			}
		
			beta0=promedioY-(beta1*promedioX);
		
		System.out.println("Funcion final\ny="+beta1+"X + "+beta0);

	}
}
