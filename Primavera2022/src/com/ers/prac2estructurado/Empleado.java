package com.ers.prac2estructurado;

/**
 * 
 * @author Roman
 * @description Clase empleado
 * @version 1.1
 * @date 24 de enero de 2022
 */
public class Empleado {
	private String id;
	private String nombre;
	private String apellido;
	private double horasTrabajadas;
	private double sueldoHora;


	/**
	 * Calcula el salario usando las horas trabajadas y el sueldo por hora
	 * @return Salario total del empleado
	 */
	public double calcularSalario() {
		return this.getHorasTrabajadas()*this.getSueldoHora();	
  }

	/**
 *  Constructor de la clase Empleado
 * @param id
 * @param nombre
 * @param apellido
 */
	Empleado(String id, String nombre, String apellido) {
		this.id = id;
		this.setNombre(nombre);
		this.setApellido(apellido);
		
	}
	
/**
 * get de nombre
 * @return nombre de el objeto empleado que se llama
 */
	public String getNombre() {
		return nombre;
	}
/**
 * set de nombre
 * @param nombre String que reemplazara el valor del nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * set de apellido
	 * @param apellido String que reemplazara el valor
	 */	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * get de apellido
	 * @return apellido de el objeto empleado que se llama
	 */
	public String getApellido() {
		return apellido;
	}
	
	public String getId() {
		return id;
	}
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		if(horasTrabajadas<500) {
			this.horasTrabajadas = horasTrabajadas;
		} else {
			this.horasTrabajadas = -1.0;
		}
	}

	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setSueldoHora(double sueldoHora) {
		if(sueldoHora<1500) {
			this.sueldoHora = sueldoHora;
		}	else {
				this.sueldoHora = -2.0;	
		}	
	}
	
	public double getSueldoHora() {
		return sueldoHora;
	}
}
