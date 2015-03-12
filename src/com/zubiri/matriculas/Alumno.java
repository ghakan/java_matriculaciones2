package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	
	//Ano en el que se inscribio por primera vez en alguna asignatura
	private int anoInscripcion = -1;
	//Ciclo que cursa el alumno
	private String ciclo = null;

	//Constructor 1
	public Alumno(String dni, String nombre, String apellido, String ciclo, int anoInscripcion){
		super(dni, nombre, apellido);
		this.ciclo = ciclo;
		this.anoInscripcion = anoInscripcion;
		Personas.personas.add(this);
	}
	//Constructor 2
	public Alumno(Scanner sc){
		super(sc);
		System.out.println("Introduce el ciclo: ");
		this.setCiclo(sc.next());
		System.out.println("Introduce el ano de inscripcion: ");
		this.setAnoInscripcion(sc.nextInt());
		Personas.personas.add(this);
	}
	
	//Matriculas realizadas a lo largo de los anos en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public int getAnoInscripcion() {
		return anoInscripcion;
	}
	
	public void setAnoInscripcion(int anoInscripcion) {
		this.anoInscripcion = anoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	//Alumno formateado en un String
	@Override
	public String formattedPersona(){
		String alumno =
				super.formattedPersona()+ "\n" +
				"Ciclo: \t" + this.getCiclo()+ "\n" +
				"Ano de Inscripcion: \t" + this.getAnoInscripcion()+ "\n";
		return alumno;
	}
	

}
