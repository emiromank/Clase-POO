package com.ers.empleados;

public class Empresa {
	private String id;
	private String nombre;
	private String direccion;
	public Empleado[] empleados = new Empleado[20];
	public EmpleadoComision[] empleadosC = new EmpleadoComision[20];
	public EmpleadoFijo[] empleadosF = new EmpleadoFijo[20];
	private int numeroEmpleado=0;
	private int contador=0;
	private int contadorC=0;
	private int contadorF=0;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContador() {
		return contador;
	}

	public int getContadorC() {
		return contadorC;
	}

	public int getContadorF() {
		return contadorF;
	}

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
	 * Metodo que agrega un nuevo empleado por comision
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param totalVentas
	 * @param porcentaje
	 * @param sueldoBase
	 */
	public void agregarEmpleadoComision(String id, String nombre, String apellido, double totalVentas, double porcentaje, double sueldoBase) {
		EmpleadoComision empC = new EmpleadoComision( id, nombre, apellido, totalVentas, porcentaje, sueldoBase);
		empleadosC[contadorC] = empC;
		contadorC++;
	}
	
	/**
	 *  Metodo que agrega un nuevo empleado con sueldo fijo
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param sueldoMensual
	 */
	public void agregarEmpleadoFijo(String id, String nombre, String apellido, double sueldoMensual) {
		EmpleadoFijo empF = new EmpleadoFijo( id, nombre, apellido, sueldoMensual);
		empleadosF[contadorF] = empF;
		contadorF++;
	}
	
	
	/**
	 * Calcula la nomina total de la empresa
	 * @return la nominaTotal de la empresa
	 */
	public double calcularNominaTotal() {
		double nominaTotal = 0.0;
		int i=0, j=0,k=0;
		
		for(i=0;i<contador;i++) {
			nominaTotal = nominaTotal + empleados[i].calcularSalario();
			for(j=0;j<contador;j++) {
				nominaTotal = nominaTotal + empleadosC[j].calcularSueldoTotal();
			}
			for(k=0;k<contador;k++) {
				nominaTotal = nominaTotal + empleadosF[k].getSueldoMensual();
			}
		}
		
		return nominaTotal;
	}
}
