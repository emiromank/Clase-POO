package com.ers.prac2estructurado;

public class Empresa {
	private String id;
	private String nombre;
	private String direccion;
	private Empleado[] empleados = new Empleado[20];
	private int numeroEmpleado=0;
	private int contador=0;
	
	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 * @param direccion
	 */
	Empresa(String id, String nombre, String direccion){
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	/**
	 * Agrega empleado en el arreglo de la empresa
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param horasTrabajadas
	 * @param sueldoHora
	 */
	public void agregarEmpleado(String id, String nombre, String apellido, double horasTrabajadas, double sueldoHora) {
		Empleado e = new Empleado(id,nombre,apellido);
		e.setHorasTrabajadas(horasTrabajadas);
		e.setSueldoHora(sueldoHora);

		this.empleados[contador]=e;
		this.contador++;
	}
	
	/**
	 * Calcula la nomina total de la empresa
	 * @return la nominaTotal de la empresa
	 */
	public double calcularNominaTotal() {
		double nominaTotal = 0.0;
		int i=0;
		
		for(i=0;i<contador;i++) {
			nominaTotal = nominaTotal + empleados[i].calcularSalario();
		}
		
		return nominaTotal;
	}
}
