import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double numeroDouble = Math.random() * 100;
		int numeroInt = (int) numeroDouble;
		int numeroTeclado;
		int contador = 1;

		System.out.print("Introduce un numero: ");
		numeroTeclado = sc.nextInt();
		while (numeroTeclado != numeroInt) {
			contador++;
			if (numeroTeclado > numeroInt) {

				System.out.print("Introduce un numero menor: ");
				numeroTeclado = sc.nextInt();

			} else {

				System.out.print("Introduce un numero mayor: ");
				numeroTeclado = sc.nextInt();

			}

		}

		System.out.println("Has acertado !! :D");
		System.out.println("Numero de intentos: " + contador);

		sc.close();
	}

}
