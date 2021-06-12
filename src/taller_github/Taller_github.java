package taller_github;

import domain.Estudiante;

public class Taller_github {
	
	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		estudiante.setId(1);
		estudiante.setNombre("Nicole Fonseca");
		estudiante.setCarrera("Informática");
		
		System.out.println(estudiante.toString());
	}
}
