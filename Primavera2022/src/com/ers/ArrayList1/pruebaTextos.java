package com.ers.ArrayList1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pruebaTextos {

	public static void main(String[] args) {
		
		pruebaTextos obj1 = new pruebaTextos();
		ArrayList<String> list = new ArrayList<String>();
		
		list = obj1.regresaArrayList("C:\\\\Users\\\\Roman\\\\git\\\\repository\\\\Primavera2022\\\\src\\\\com\\\\ers\\\\ArrayList1\\\\spam2.csv") ;
		
		
		String cadena = "ham,\"I am sorry it hurt you.,\",";
		int i;
		int j = 0;
		
		
			System.out.println("1. Imprimir el contenido de ArrayList");
			
			for(i=0;i<list.size();i++) {
				
				System.out.println("Elemento:"+i+"  "+list.get(i));
			}

			System.out.println("\n2. Ultimo elemento de ArrayList");
			System.out.println("El ultimo elemento es: "+list.get((list.size())-1));

			System.out.println("\n3.Encontrar el numero de coincidencias\n4.Imprimir la posicion donde esta");
			for(i=0; i<list.size(); i++) {
				if(cadena.equals(list.get(i))) {
					j++;
					System.out.println("Coincidencia en: "+i);
					}
			}

			System.out.println("Coincidencias totales: "+j);
			
		
	}
	
	public ArrayList<String> regresaArrayList(String ruta){
		ArrayList <String> list = new ArrayList <String>();
		
		
		try {
			Scanner csvData = new Scanner(new File(ruta));
			while(csvData.hasNext()) {
				list.add(csvData.nextLine());
			}}catch(FileNotFoundException ex){
				System.out.println(ex.toString());
			}
			
		
		return list;
		
	}
}
