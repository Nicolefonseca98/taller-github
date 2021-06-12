package taller_github;

import domain.Estudiante;

public class Taller_github {
	
	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		estudiante.setId(100);
		estudiante.setNombre("Wilmer");
		estudiante.setCarrera("Informatica Empresarial");
		
		System.out.println(estudiante.toString());
	}
}
