import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int miArray[] = { 7, 55, 11, 45, 9, 1358, 567, 7, 543, 735 };
		int miArrayVacio[] = new int[10];
		int posicionArray, posicionArrayCopiado;
		

		for (int i = 0; i < miArray.length; i++) {

			System.out.println("La posicion: " + i + " Contiene: " + miArray[i]);

		}

		System.out.println("¿Que posicion quieres copiar? ");
		posicionArray = sc.nextInt();
		System.out.println("¿En que posicion lo quieres copiar?");
		posicionArrayCopiado = sc.nextInt();
		
		miArrayVacio[posicionArrayCopiado] = miArray[posicionArray];
		
		System.out.println("Se ha copiado: " + miArray[posicionArray] + " en la posicion: " + posicionArrayCopiado);

		sc.close();

	}

}
