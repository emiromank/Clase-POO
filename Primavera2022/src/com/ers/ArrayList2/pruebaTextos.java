package com.ers.ArrayList2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pruebaTextos {

	public static void main(String[] args) {
		
		pruebaTextos obj1 = new pruebaTextos();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> listElim = new ArrayList<String>();
		ArrayList<String> listPalabrasElim = new ArrayList<String>();
		
		int i=0,j=0;
		
		
		list2 = obj1.regresaArrayList("C:\\\\Users\\\\Roman\\\\git\\\\repository\\\\Primavera2022\\\\src\\\\com\\\\ers\\\\ArrayList1\\\\spam2.csv") ;
		listElim = obj1.regresaArrayList("C:\\Users\\Roman\\git\\repository\\Primavera2022\\src\\com\\ers\\ArrayList2\\palabrasEliminar.txt");
		
		String[] tempArray = list2.toArray(new String[0]);
		String resultado [][] = obj1.matriz(list2);
		
		list2 = obj1.modificarMeta(list2); 
		list2 = obj1.etiquetar(list2);
		list2 = obj1.eliminarPalabras(list2, listElim, listPalabrasElim);
		
	}
	
	/**
	 * Crea una array list con un csv
	 * @param ruta
	 * @return
	 */
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
	/**
	 * Funcion que crea una matriz de strings con Split
	 * @param list2
	 * @return
	 */
	public String[][] matriz(ArrayList<String> list2){
		int i=0;	
		String[][] resultado=new String[list2.size()][];
		for (i=0; i<list2.size();i++) {
			resultado[i] = list2.get(i).split(",");
		}
		return resultado;
	}
	/**
	 * Funcion que imprime la Matriz bidimensional
	 * @param resultado
	 */
	public void imprimirMatriz(String[][] resultado) {
		int i=0, j=0;
		
		for(i=0; i<resultado.length; i++) {
			System.out.println("\nFila "+i);
			for(j=0;j<resultado[i].length;j++) {
			System.out.print(resultado[i][j]+"|");
			}
		}
		
	}
	/**
	 * Metodo que elimina numeros, caracteres especiales y palabras que contengan Mo//mo
	 * @param list2
	 * @return
	 */
	public ArrayList<String> modificarMeta(ArrayList<String> list2) {
		int i=0, j=0;
		
		ArrayList<String> list = new ArrayList<String>();
		String[] tempArray = list2.toArray(new String[0]);
		
		for(i=0; i<tempArray.length; i++) {
			
			tempArray[i]=tempArray[i].replaceAll("mo[\\w]*", " ").replaceAll("\\d", " ").replaceAll("\\W", " ").replaceAll("Mo[\\w]*", " ");
			list.add(tempArray[i]);
		}
		return list;
	}
	/**
	 * Metodo que añade etiquetas a los strings
	 * @param blabla
	 * @return
	 */
	public ArrayList<String>  etiquetar(ArrayList<String> list2) {
	int i=0;
	
		String [] feel = list2.toArray(new String[0]);
		ArrayList<String> list = new ArrayList<String>();
		
		for(i=0; i<feel.length; i++) {
			if(feel[i].contains("I am")==true) {
				feel[i]="FEEL 1 || "+feel[i];
			}
			if(feel[i].contains("is not")==true) {
				feel[i]="FEEL 2 || "+feel[i];
			}
			if(feel[i].contains("to the")==true) {
				feel[i]="FEEL 3 || "+feel[i];
			}
			//System.out.println(feel[i]);
			list.add(feel[i]);
		}
		
		
		return list;
	}
	/**
	 * Metodo para eliminar palabras que se encuentran en un archivo txt
	 * @param list2
	 * @param listElim
	 * @param listPalabrasEliminadas
	 * @return
	 */
	public ArrayList<String> eliminarPalabras(ArrayList<String> list2, ArrayList<String> listElim,ArrayList<String> listPalabrasEliminadas)
	{
		ArrayList<String> list = new ArrayList<String>();
		int i=0,j=0;
		String [] eliminados = list2.toArray(new String[0]);
		String[] palabras = listElim.toArray(new String[0]);
		
		
		for(i=0; i<eliminados.length; i++) {
			for(j=0; j<palabras.length; j++) {
				if(eliminados[i].contains(palabras[j])==true) {
					eliminados[i]=eliminados[i].replaceAll(palabras[j]+"[\\w]*", " ");
					listPalabrasEliminadas.add(palabras[j]);
				}
			}
			System.out.println(eliminados[i]);
			list.add(eliminados[i]);
		}
		
		
		return list;
	}
}


