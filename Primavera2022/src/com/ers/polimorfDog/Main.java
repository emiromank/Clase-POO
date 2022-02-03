package com.ers.polimorfDog;

public class Main {

	public static void main(String[] args) {
		Dog perro = new Dog("Manchas", "macho", 5);
		PastorAleman pastor = new PastorAleman ("Terminator", "hembra", 2, "Negro", "Grande");
		Pitbull pitbull = new Pitbull("Morro", "macho", 3, "alegre", 10);
		
		perro.realizarActividad();
		pastor.realizarActividad();		
		pitbull.realizarActividad();
				
	}

}
