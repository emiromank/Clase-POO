package com.ers.polimorfDog;

public class Pitbull extends Dog{
	private String actitud;
	private double peso;
	
	Pitbull(String nombre, String sexo, int edad, String actitud, double peso){
		super(nombre,sexo,edad);
		this.actitud = actitud;
		this.peso = peso;
	}
	
	
	public void jugarPelota () {
		System.out.println("tu pitbull está jugando pelota :)");
	}
	
	public void realizarActividad () {
		System.out.println("tu pitbull acaba de comer un niño :0");
	}	
	
}