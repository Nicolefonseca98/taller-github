package taller_github;

import domain.Estudiante;

public class Taller_github {
	
	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		estudiante.setId(500);
		estudiante.setNombre("Sofia");
		estudiante.setCarrera("Informatica Empresarial");
		
		System.out.println(estudiante.toString());
	}
}
