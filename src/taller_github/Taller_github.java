package taller_github;

import domain.Estudiante;

public class Taller_github {
	
	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante();
		estudiante.setId(002);
		estudiante.setNombre("Nicole");
		estudiante.setCarrera("Informática Empresarial");
		
		System.out.println(estudiante.toString());
	}
}
