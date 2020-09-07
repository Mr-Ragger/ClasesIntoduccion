package Libreria;

public class Autor {

	String nombre;
	int edad;
	
	public Autor(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
		System.out.println(" El autor se llama: " + this.nombre + " y tiene: " + this.edad + " años");
		
		
	}

}
