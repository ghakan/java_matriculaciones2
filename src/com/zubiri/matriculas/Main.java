package com.zubiri.matriculas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		int opcion;
		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("*************MENU**************");
			System.out.println("1. Introducir Alumnos         *");
			System.out.println("2. Buscar Persona             *");
			System.out.println("3. Introducir Matricula       *");
			System.out.println("4. Introducir Asignatura      *");
			System.out.println("0. Salir                      *");
			System.out.println("*******************************");
			opcion = sc.nextInt();
			switch (sc.nextInt()) {
			case 1:
				Personas.crearAlumnos(sc);
				
				break;
			case 2:
				Persona.mostrarPersona(sc);
				break;
			case 3:
				Matriculas.matriculas.add(new Matricula(sc));
				break;
			case 4:
				Asignaturas.al_asignaturas.add(new Asignatura(sc));
				break;
			default:
				if (opcion == 0) {
					break;
				}else{
					System.err.println("No has seleccionado una opcion correcta");
				break;
				}
			}
		}while(opcion != 0);
	}
}
