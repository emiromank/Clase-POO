package com.ers.empleados;

/**
 * Clase empleado con sueldo fijo
 * @author Roman
 *	@date 27 de enero
 */
public class EmpleadoFijo extends Empleado{
	private double sueldoMensual;
	
	/**
	 * Constructor de la clase EmpleadoFijo
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param sueldoMensual
	 */
	EmpleadoFijo(String id, String nombre, String apellido, double sueldoMensual) {
		super(id,nombre,apellido);
		this.sueldoMensual = sueldoMensual;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
}
