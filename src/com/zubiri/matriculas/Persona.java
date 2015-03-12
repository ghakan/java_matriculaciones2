package com.zubiri.matriculas;

import java.util.Scanner;

public abstract class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	//static ArrayList<Persona> al_persona = new ArrayList<Persona>();

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
	public static void mostrarPersona(Scanner sc) throws Exception{
		System.out.println("Que quieres mostrar?: ");
		System.out.println("--------------------------------");
		System.out.println("Alumno-------------------------1");
		System.out.println("Profesor-----------------------2");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			Personas.buscarAlumno(sc);
			break;
		case 2:
			Personas.buscarProfesor(sc);
		default:
			throw new Exception("Error, tipo de opcion permitida 1 o 2");
		}
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
				
		return persona;
	}

	/**
	 * Metodo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		
		String[] strArray = personaStr.split(separator+"");
		this.setDni((strArray[0]));
		this.setNombre(strArray[1]);
		this.setApellido(strArray[2]);
	}
}
