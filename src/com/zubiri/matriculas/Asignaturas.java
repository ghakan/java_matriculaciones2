package com.zubiri.matriculas;

import java.util.ArrayList;

public class Asignaturas {


	 static ArrayList<Asignatura> al_asignaturas = new ArrayList<Asignatura>();

	//Metodo para buscar asignatura por nombre
	public static Asignatura buscarAsignatura(String nombre){
		Asignatura asignatura = null;
		if (al_asignaturas == null) {
			System.out.println("No se han cargado asignaturas en la lista....");
		}else {
			for (int i = 0; i < al_asignaturas.size(); i++) {
				if (al_asignaturas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					asignatura = al_asignaturas.get(i);
				}
			}
		}
		return asignatura;
	}

	public static String formattedAsignaturas(ArrayList<Asignatura> arrayAsignaturas){
		String asignaturasFormat = "";
		for (int i = 0; i < arrayAsignaturas.size(); i++) {
			asignaturasFormat += arrayAsignaturas.get(i).formatted();
		}
		return asignaturasFormat;	
	}


	public static void anadirAsignatura(Asignatura asignatura){
		al_asignaturas.add(asignatura);
	}

	public static void borrarAsignatura(String nombre){
		al_asignaturas.remove(buscarAsignatura(nombre));
	}
	
	//Getters y setters
	public static ArrayList<Asignatura> getAsignatura() {
		return al_asignaturas;
	}

	public static void setAsignatura(ArrayList<Asignatura> asignatura) {
		al_asignaturas = asignatura;
	}

}