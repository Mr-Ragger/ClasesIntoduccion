import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n1;
		int n2;

		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextInt();/*n1 = Main.comprobarEntero(sc.nextInt());*/
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("El primero es mayor que el segundo");
		} else if (n1 < n2) {
			System.out.println("El primero es menor que el segundo");
		} else if (n1 == n2) {
			System.out.println("El primero es igual que el segundo");
		}

		sc.close();
	}

//Testeo metodos (descartar)
	
	
//	public static int comprobarEntero(int teclado) {
//		
//		int comprobacion = teclado;
//		int n1;
//		
//		if (comprobacion == ) {
//			return comprobacion;
//		} else {
//			System.out.println(" El numero da fallo");
//		}
//		
//	return 0;
//	}
}
