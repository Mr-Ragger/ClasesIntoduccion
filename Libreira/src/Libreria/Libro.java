package Libreria;

public class Libro {

	int edad, paginas, isbn;
	String titulo, editorial;
	
	public Libro(int isbn, String titulo, int paginas, String editorial) {

		this.isbn = isbn;
		this.titulo = titulo;
		this.paginas = paginas;
		this.editorial = editorial;
		
		System.out.println(" Titulo: " + this.titulo + "\n ISBN: " + this.isbn + "\n Editorial: " + this.editorial + "\n Paginas: " + this.paginas);
		
		
	}

}
