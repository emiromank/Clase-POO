package com.ers.prac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void mainEstructural(String[] args) throws IOException  {
		
		String[] ids = new String[30];
		String[] nombre = new String[30];
		Double[] horasTrabajadas = new Double[30];
		Double[] sueldoHora = new Double[30];
		
		Integer empleados;
		Integer i;
		Double totNomina=0.0;
		Double pagEmpleado;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Escriba el total de empleados");
		empleados = Integer.valueOf(br.readLine()).intValue();		
		
		for (i = 0; i < empleados; i++) {
			
			System.out.println("Escriba el ID de empleado");
			ids[i] = br.readLine();
			
			System.out.println("Escriba el nombre del empleado");
			nombre[i] = br.readLine();
			
			System.out.println("Escriba el # de horas trabajadas por el empleado");
			horasTrabajadas[i] = Double.valueOf(br.readLine()).doubleValue();
			
			System.out.println("Escriba el sueldo por hora del empleado");
			sueldoHora[i] = Double.valueOf(br.readLine()).doubleValue();
			
			pagEmpleado = horasTrabajadas[i] * sueldoHora[i];
			
			System.out.println("El empleado " + ids[i] + " recibe $ " + pagEmpleado);

			totNomina = totNomina + pagEmpleado;
			}
		
		
		
		System.out.println("El total a pagar es " + totNomina);
		
	}
}
