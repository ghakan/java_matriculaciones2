package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	private String titulacion;
	private String departamento;
	
    //Constructor 1
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento){
		super(dni, nombre, apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
		Personas.personas.add(this);
	}
	//Constructor 2
	public Profesor(Scanner sc){
		super(sc);
		System.out.println("Introduce la titulacion: ");
		this.setDni(sc.next());
		System.out.println("Introduce el departamento: ");
		this.setNombre(sc.next());
		Personas.personas.add(this);
	}

	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	//Profesor formateado en un String
	@Override
	public String formattedPersona(){
		String profesor =
				super.formattedPersona()+ "\n" +
				"Titulacion: \t" + this.getTitulacion()+ "\n" +
				"Departamento: \t" + this.getDepartamento()+ "\n";
		return profesor;
	}
}
