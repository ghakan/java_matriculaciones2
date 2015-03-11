package com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	private int anoMatriculacion;
    private double precio;

    //Constructor 1
	public Matricula(String nombre, int creditos, Profesor profesor, int anoMatriculacion, double precio){
		super(nombre, creditos, profesor);
		this.anoMatriculacion = anoMatriculacion;
		this.precio = precio;
	}
	//Constructor 2
	public Matricula(Scanner sc){
		super(sc);
		System.out.println("Introduce el ano matriculacion: ");
		this.setAnoMatriculacion(sc.nextInt());
		System.out.println("Introduce el precio: ");
		this.setPrecio(sc.nextDouble());
	}

	public int getAnoMatriculacion() {
		return anoMatriculacion;
	}
	
	public void setAnoMatriculacion(int anoMatriculacion) {
		this.anoMatriculacion = anoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//MAtricula formateado en un String
	@Override
	public String formatted(){
		String matricula =
				super.formatted()+ "\n" +
				"Ano de matriculacion: \t" + this.getAnoMatriculacion()+ "\n" +
				"Precio: \t" + this.getPrecio()+ "\n";
		return matricula;
	}
    
	
	/**
	 * Metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		Double resultado = this.getPrecio() * porcentaje / 100;

		return resultado;
	}
	
}
