import java.util.Scanner;

public class Usuario {
	
	Scanner sc = new Scanner(System.in);
	
	String email;
	String nombre;
	String contraseña;
	Boolean activado;
	int edad;
	
	
	public void comprobarEdad() {
		int comprobarEdad;
		System.out.println("Introduce tu edad: ");
		comprobarEdad = sc.nextInt();
		
		if (comprobarEdad >= 18) {
			comprobarEdad = edad;
		} else {
			System.out.println("No eres mayor de edad >:C \n");
		}
	}
	
	
	
}
