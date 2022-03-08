package com.ers.empleados;
/**
 * 
 * @author Roman
 *
 */
 
public class Main {
	
	public static void main(String[] args) {
		
		Empresa emp = new Empresa("Acrilicos", "Empla", "Periferico Sur");
		emp.agregarEmpleado("pe123", "pecas", "gonzalez", 100, 200);
		emp.agregarEmpleado("jai123", "jaime", "perez", 50, 200	);
		
		emp.agregarEmpleadoComision("ii43", "Pedro", "Lopez", 15000, 0.2, 5000);
		emp.agregarEmpleadoComision("te31", "Teresa", "Del Monte", 23000, 0.1, 6000);
		
		emp.agregarEmpleadoFijo("pr87", "Laura", "Sanchez", 8000);
		emp.agregarEmpleadoFijo("to99", "Tomas", "Boy", 12000);
		
		System.out.println("La empresa: " + emp.getNombre()+ 
							"  tiene una nomina de: $" + emp.calcularNominaTotal() +
							"\nEmpleados por hora: " + emp.getContador() +
							"\nEmpleados por comision: " + emp.getContadorC() +
							"\nEmpleados con salario fijo: " + emp.getContadorF()
							);
		
		
		System.out.println("Empleados por comision");
		for(int i=0; i<emp.getContadorC(); i++) {
			System.out.println("Empleado #"+ (i+1)+
								emp.empleadosC[i].getNombre()
					);
			
		}
		
	}
}


	
*/
