package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriculas {
	//Atributos
	static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

	//Crear matriculas
	public static ArrayList<Matricula> crearMatriculas(Scanner sc){
		int opcion;
		System.out.println("¿Cuantas matriculas son?: ");
		opcion = sc.nextInt();
		for (int a = 0; a < opcion; a++) {
			matriculas.add(new Matricula(sc));
		}
		return matriculas;
	}
	
	//String de matriculas formateado
	public static String formatted(ArrayList<Matricula> matriculas){
		String strMatriculas = "";
		try{
		strMatriculas =
				"\n******MATRICULAS REALIZADAS*****";
		for (int i = 0; i < matriculas.size(); i++) {
			strMatriculas += matriculas.get(i).formatted();
		}
			strMatriculas += 
				"\n*******FIN********";
		}
		catch(Exception e)
		{
			System.out.print("Error:" + e);
		}
		return strMatriculas;
			
	}
	
	//Método que busca por nombre y devuelve una matricula del ArrayList matriculas 
  	public static Matricula obtainMatricula(Scanner sc){
  		Matricula matricula = null;
  		try{
	  		for (int i = 0; i < matriculas.size(); i++) {
	  			if (matriculas.get(i).getNombre().equalsIgnoreCase(sc.next())) {
	  				matricula = matriculas.get(i);
	  			}
	  		}
  		}
  		
  		catch(Exception e)
  		{
  			System.out.println("Error: " + e);
  		}
  		return matricula;
  	}
  	
}
