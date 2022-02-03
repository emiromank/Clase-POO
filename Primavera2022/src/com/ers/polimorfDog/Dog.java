package com.ers.polimorfDog;

public class Dog {
	private String nombre;
	private String sexo;
	private int edad;
	
	Dog(String nombre, String sexo, int edad){
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	public void ladrar () {
		System.out.println("guau guau dice el perro");
	}
	
	public void realizarActividad () {
		System.out.println("oh no! el perro está comiendo cereal");
	}
	
	public void caminar () {
		System.out.println("tu perro está caminando");
	}
}
