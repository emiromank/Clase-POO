package com.ers.prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) throws Exception  {
		int tamaño, cont = 0 , i;



		ArrayList <String> list = new ArrayList <String>();

		try {
		Scanner csvData = new Scanner(new File("C:\\\\Users\\\\Roman\\\\git\\\\repository\\\\Primavera2022\\\\src\\\\com\\\\ers\\\\ArrayList1\\\\spam2.csv"));
		while(csvData.hasNext()) {
		list.add(csvData.nextLine());
		}

		}catch(FileNotFoundException ex) {
		System.out.println(ex.toString());
		}

		for(String txt : list) {
		System.out.println(txt);
		}

		tamaño = list.size();

		System.out.println("El ultimo elemento es: "+list.get(tamaño-1));

		String cadena = "ham,\"I am sorry it hurt you.,\",";

		for(i=0; i< tamaño; i++) {
		if(cadena.equals(list.get(i))) {
		cont++;
		System.out.println("Coincide en : "+i);



		}
		}

		System.out.println("El numero de coincidencias es: "+cont);



		}



		}

