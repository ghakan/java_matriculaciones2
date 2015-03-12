package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {

	private String nombre;
	private int creditos;
	private Profesor profesor;


	//Constructor 1
	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	//Constructor 2
	public Asignatura(Scanner sc){
		System.out.println("Introduce el nombre asignatura: ");
		this.setNombre(sc.next());
		System.out.println("Introduce los creditos: ");
		this.setCreditos(sc.nextInt());
		System.out.println("Introduce el profesor: ");
		if  (Personas.buscarProfesor(sc.next()) == null)
			this.setProfesor(new Profesor(sc));
			//sino asigna la informacion del profesor ya existente
			else this.setProfesor(Personas.buscarProfesor(sc.next()));
		this.setProfesor(new Profesor(sc));
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		String asignatura =
				"Nombre: \t" + this.getNombre()+"\n" +
				"Creditos: \t" + this.getCreditos()+ "\n" +
				"Profesor: \t" + this.getProfesor()+ "\n";
		return asignatura;
	}
	
	/**
	 * Metodo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {

		String[] strArray = personaStr.split(separator+"");
		this.setNombre(strArray[0]);
		this.setCreditos(Integer.parseInt(strArray[1]));
	}

}
