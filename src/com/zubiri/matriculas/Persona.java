package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private static ArrayList<Persona> al_persona = new ArrayList<Persona>();

    //Constructor 1
	public Persona(String dni, String nombre, String apellido){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//Constructor 2
	public Persona(Scanner sc){
		System.out.println("Introduce el DNI: ");
		this.setDni(sc.next());
		System.out.println("Introduce el nombre: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el apellido: ");
		this.setApellido(sc.next());
	}

	//Metodo buscar 
	public static void buscarPersona(Scanner sc) throws Exception{
		System.out.println("Que quieres buscar?: ");
		System.out.println("--------------------------------");
		System.out.println("Alumno-------------------------1");
		System.out.println("Profesor-----------------------2");
		int opcion = sc.nextInt();
		String nombre;
		switch (opcion) {
		case 1:
			Persona alumno = null;
			System.out.println("Escribe el nombre del alumno: ");
			nombre = sc.next();
			alumno = obtainNombre(nombre);
			System.out.println(alumno.formattedPersona());
			System.out.println("---------FIN------------");
			break;
		case 2:
			Persona profesor = null;
			System.out.println("Escribe el nombre del profesor: ");
			nombre = sc.next();
			profesor = obtainNombre(nombre);
			System.out.println(profesor.formattedPersona());
			System.out.println("---------FIN------------");
		default:
			throw new Exception("Error, tipo de opcion permitida 1 o 2");
		}
	}
	//Metodo que busca por nombre y devuelve una persona del ArrayList al_persona 
	public static Persona obtainNombre(String nombre){
		Persona persona = null;
		for (int i = 0; i < al_persona.size(); i++) {
			if (al_persona.get(i).getNombre().equalsIgnoreCase(nombre)) {
				persona = al_persona.get(i);
			}
		}
		return persona;
	}

	public Persona(ArrayList<Persona> datos){
		setPersona(datos);
	}
	public static ArrayList<Persona> getPersona() {
		return al_persona;
	}
	public static void setPersona(ArrayList<Persona> datos) {
		Persona.al_persona = datos;
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formattedPersona() {
		String persona =
				"DNI: \t" + this.getDni()+"\n" +
				"Nombre: \t" + this.getNombre()+ "\n" +
				"Apellido: \t" + this.getApellido()+ "\n";
				if (sc == 1){
					persona+= getAnoInscripcion().alumno.formattedPersona() + "\n"
					+ getCiclo().alumno.formattedPersona() + "\n";
				}
				if(sc == 2){
					persona+= getTitulacion().profesor.formattedPersona() + "\n"
					+ getDepartamento().profesor.formattedPersona() + "\n";
				}

		return persona;
	}

	/**
	 * Metodo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		
		String[] strArray = personaStr.split(separator+"");
		this.setDni(Integer.parseInt(strArray[0]));
		this.setNombre(strArray[1]);
		this.setApellido(strArray[2]);
		this.setPersona(new Alumno(strArray[2],";"));
		this.setPersona(new Profesor(strArray[3],"#"));
	}
}
