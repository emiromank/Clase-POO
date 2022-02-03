package com.ers.polimorfDog;

public class PastorAleman extends Dog{
	private String tamano;
	private String color;
	
	PastorAleman(String nombre, String sexo, int edad, String tamano, String color){
		super(nombre,sexo,edad);
		this.tamano = tamano;
		this.color = color;
	}
	
	public void sentarse () {
		System.out.println("tu pastor alemán se sentó");
	}
	
	public void realizarActividad () {
		System.out.println("tu pastor alemán se puso a correr como loco!!!!!");
	}	
	
}
