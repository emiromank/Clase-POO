package com.ers.empleados;

/**
 * Clase Empleado Comision
 * @author Roman
 *	@date 27 de enero de 2022
 */

public class EmpleadoComision extends Empleado{
	private double totalVentas;
	private double porcentaje;
	private double sueldoBase;
	
/**
 * Constructor de la clase Empleado Comision
 * @param id
 * @param nombre
 * @param apellido
 * @param totalVentas
 * @param porcentaje
 * @param sueldoBase
 */
	EmpleadoComision(String id, String nombre, String apellido, double totalVentas, double porcentaje, double sueldoBase){
		super(id,nombre,apellido);
		this.totalVentas=totalVentas;
		this.porcentaje=porcentaje;
		this.sueldoBase= sueldoBase;
	}
	
	/**
	 * Obtiene todo lo que recibirá el empleado
	 * @return sueldo por comision + sueldo base
	 */
	public double calcularSueldoTotal() {
		return this.calcularComision()+this.sueldoBase;
	}
/**
 * Obtiene la parte del sueldo por ventas
 * @return sueldo por ventas
 */
	public double calcularComision() {
		return this.porcentaje*this.totalVentas;
	}
	
}