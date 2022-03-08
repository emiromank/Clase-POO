package com.ers.minCuadrados;

public class DatosEstad {

	/**
	 * Funcion que obtiene el promedio en un arreglo de doubles
	 * @param valores
	 * @return
	 */
	public double promedio(double[] valores) {
		
		int i=0;
		double suma=0;
		
		for(i=0;i<valores.length; i++) {
			suma+=valores[i];
		}
		
		return (suma/valores.length);
		
	}
}
