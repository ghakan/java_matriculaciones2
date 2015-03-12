package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Personas {
	
	public static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	/*
	* Alumnos
	*/
	//Método para crear alumnos
	public static void crearAlumnos(Scanner sc){
		System.out.println("Cuantos alumnos quieres crear: ");
		int cantidad = sc.nextInt();
		for (int i = 0; i < cantidad; i++){
			new Alumno(sc);
		}
	}
	
	//Método para mostrar Alumnos
	public static String formattedAlumnos(){
		String alumnosFormateados = "";
		for (int a = 0; a < personas.size(); a++) {
			if(personas.get(a).getClass().getName()=="com.zubiri.matriculas.Alumno"){
				alumnosFormateados += personas.get(a).formattedPersona();
			}
		}
		return alumnosFormateados;
	}
	
	//Método para devolver profesores formateados
	public static String formattedProfesores(){
	String profesoresFormateados = "";
	for (int a = 0; a < personas.size(); a++) {
		if (personas.get(a).getClass().getName() == "com.zubiri.matriculas.Profesor"){
			profesoresFormateados += personas.get(a).formattedPersona();
		}
	}
	return profesoresFormateados;
	}
	/*
	* Profesores
	*/
	
	
	public static void buscarAlumno(Scanner sc)
	{
		Alumno alumno = null;
		System.out.print(personas.get(0).getClass().getName());
		System.out.println("Escribe el nombre del alumno: ");
		try{
			for (int a = 0; a < personas.size(); a++) {
		
				if(personas.get(a).getClass().getName()=="com.zubiri.matriculas.Alumno"){
					if(personas.get(a).getNombre().equalsIgnoreCase(sc.next())){
						alumno = (Alumno)personas.get(a);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.print("ERROR: " + e);
		}
		System.out.println(alumno.formattedPersona());
		System.out.println("---------FIN------------");
	}
	
	public static void buscarProfesor(Scanner sc)
	{
		Profesor profesor = null;
		System.out.println("Escribe el nombre del profesor: ");
		for (int a = 0; a < personas.size(); a++) {
			if(personas.get(a).getClass().getName()=="com.zubiri.matriculas.Profesor"){
				if(personas.get(a).getNombre().equalsIgnoreCase(sc.next())){
					profesor = (Profesor)personas.get(a);
				}
			}
		}
		System.out.println(profesor.formattedPersona());
		System.out.println("---------FIN------------");
	}
	public static Profesor buscarProfesor(String nombre)
	{
		Profesor profesor = null;
		System.out.println("Escribe el nombre del profesor: ");
		for (int a = 0; a < personas.size(); a++) {
			if(personas.get(a).getClass().getName()=="com.zubiri.matriculas.Profesor"){
				if(personas.get(a).getNombre().equalsIgnoreCase(nombre)){
					profesor = (Profesor)personas.get(a);
				}
			}
		}
		return profesor;
	}
	
}
