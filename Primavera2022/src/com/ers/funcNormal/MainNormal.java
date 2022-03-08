package com.ers.funcNormal;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MainNormal {

	public static void main(String[] args) throws Exception {
		
		Scanner Scan = new Scanner(System.in);
		double media=0.0;
		double desvE=0.0;
				
	     try {
	    	System.out.println("Ingresa valor de la media:  ");
			media = Scan.nextDouble();
			
			System.out.println("Ingresa valor de la desviacion estandar:  ");
			desvE = Scan.nextDouble();

		
		Normal ej1 = new Normal(media,desvE);
		
		DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(5);
		

		ej1.calcularValorFDN(0.007);		
		System.out.println("El valor de f(x) = " + df.format(ej1.fdeX) );
		ej1.calcularProbFDN(2, 11, 0.001);
		System.out.println("El valor de la probabilidad es " + df.format(ej1.areaTot));

	     }catch (Exception e) {
	    	 System.out.println("Error de tipo  "+e.toString());
	     }

	}

}
