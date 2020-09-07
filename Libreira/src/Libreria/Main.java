package Libreria;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int isbn = 123456789;
		int edad, paginas;
		String nombre, editorial, titulo;
		
		edad = 32;
		paginas = 128;
		nombre = "Linus";
		editorial = "Microsoft";
		titulo = "Java";
		
		
		Libro miLibro = new Libro(isbn, titulo, paginas, editorial);
		Autor miAutor = new Autor(nombre, edad);
		
	
	}

}
