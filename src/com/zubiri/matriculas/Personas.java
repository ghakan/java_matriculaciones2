package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Personas {
	
	//2x ArrayList de Persona para guardar lista de alumnos y profesores
	public static ArrayList<Persona> personas = new ArrayList<Persona>();
	//public static ArrayList<Persona> profesores = new ArrayList<Persona>();
	//public static ArrayList<Persona> alumnos = new ArrayList<Persona>();
	/*
	* Alumnos
	*/
	//Método para crear alumnos
	public static void crearAlumnos(Scanner sc){
	System.out.println("Cuantos alumnos quieres crear: ");
	for (int i = 0; i < sc.nextInt(); i++){
	new Alumno(sc);
	}
	}
	
	//Método para mostrar Alumnos
	public static String formattedAlumnos(){
	String alumnosFormateados = "";
	for (int a = 0; a < personas.size(); a++) {
		if(personas.get(a).getClass().getName()=="Alumno.java"){
			alumnosFormateados += personas.get(a).formatted();
			}
	}
	return alumnosFormateados;
	}
	/*
	* Profesores
	*/
	//Método para crear profesores
	public static void crearProfesores(Scanner sc){
	System.out.println("Cuantos alumnos quieres crear: ");
	for (int e = 0; e < sc.nextInt(); e++){
	new Profesor(sc);
	}
	}
	//Método para devolver profesores formateados
	public static String formattedProfesores(){
	String profesoresFormateados = "";
	for (int a = 0; a < alumnos.size(); a++) {
	profesoresFormateados += alumnos.get(a).formatted();
	}
	return profesoresFormateados;
	}
	//Getters y setters
	public static ArrayList<Persona> getAlumnos() {
	return alumnos;
	}
	public static void setAlumnos(ArrayList<Persona> alumnos) {
	Personas.alumnos = alumnos;
	}
	public static ArrayList<Persona> getProfesores() {
	return profesores;
	}
	public static void setProfesores(ArrayList<Persona> profesores) {
	Personas.profesores = profesores;
	}
}
