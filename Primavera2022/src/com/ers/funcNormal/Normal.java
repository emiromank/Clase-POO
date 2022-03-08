package com.ers.funcNormal;

/**
 * Clase que trabaja con probabilidad de la normal
 * @author Roman
 * @date 8/2/2022
 */
public class Normal {
	private double media;
	private double desviacionE;
	double areaTot=0.0;
	 double fdeX=0.0;
	
	 
	/**
	 * Constructor de la clase 
	 * @param media
	 * @param desviacionE
	 */
	Normal(double media, double desviacionE){
		this.media=media;
		this.desviacionE=desviacionE;
	}
	
	/**
	 * Metodo que calcula F(x) según la fórmula de densidad normal
	 * @param X
	 */
	public void calcularValorFDN(double X) throws Exception{
		
		if(this.getMedia()==0||this.getDesviacionE()==0) {
			throw new ArithmeticException("Error en division");
		} else {
			this.fdeX = (1/(this.desviacionE*(Math.sqrt(2*Math.PI))))*Math.exp(-0.5*((Math.pow((X-this.media), 2))/(Math.pow(this.desviacionE, 2))));
	}
	}
	
	/**
	 * Metodo que obtiene la probabilidad con el area entre limites
	 * @param limInf
	 * @param limSup
	 * @param delta
	 * @throws Exception 
	 */
	public void calcularProbFDN(double limInf, double limSup, double delta) throws Exception {
		double i;
		
		if(this.getMedia()==0||this.getDesviacionE()==0) {
			throw new ArithmeticException("Error en division");
		} else {
		for (i=limInf; i<= limSup;i+=delta) {
			this.calcularValorFDN(i);
			this.areaTot += (this.fdeX*delta);
		}
		}
		
		
	}

	public double getMedia() {
		return media;
	}

	public double getDesviacionE() {
		return desviacionE;
	}
	
	
}
