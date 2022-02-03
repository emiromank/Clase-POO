package com.ers.prac2estructurado;

public class Main {
	
	public static void main(String[] args) {
		int totalP=0;	
		
		Empresa empresa1 = new Empresa("empla","acrilicos","periferico sur");
		empresa1.agregarEmpleado("pe123", "pecas", "gonzalez", 100, 200);
		empresa1.agregarEmpleado("jai123", "jaime", "perez", 50, 200	);
		
		totalP = (int)empresa1.calcularNominaTotal();
				System.out.println(totalP);
	}
}
