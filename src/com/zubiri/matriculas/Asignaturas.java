package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Asignaturas {


	private static ArrayList<Asignatura> al_asignaturas = new ArrayList<Asignatura>();

	//Metodo para buscar asignatura por nombre
	public static Asignatura buscarAsignatura(String nombre){
		Asignatura asignatura = null;
		if (asignaturas == null) {
			System.out.println("No se han cargado asignaturas en la lista....");
		}else {
			for (int i = 0; i < asignaturas.size(); i++) {
				if (asignaturas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					asignatura = asignaturas.get(i);
				}
			}
		}
		return asignatura;
	}

	public static String formattedAsignaturas(ArrayList<Asignatura> arrayAsignaturas){
		String asignaturasFormat = "";
		for (int i = 0; i < arrayAsignaturas.size(); i++) {
			asignaturasFormat += arrayAsignaturas.get(i).formattedAsignatura();
		}
		return asignaturasFormat;	
	}


	public static void anadirAsignatura(Asignatura asignatura){
		asignaturas.add(asignatura);
	}

	public static void borrarAsignatura(String nombre){
		asignaturas.remove(buscarAsignatura(nombre));
	}
	
	//Getters y setters
	public static ArrayList<Asignatura> getAsignatura() {
		return asignatura;
	}

	public static void setAsignatura(ArrayList<Asignatura> asignatura) {
		Asignatura.asignatura = asignatura;
	}

}