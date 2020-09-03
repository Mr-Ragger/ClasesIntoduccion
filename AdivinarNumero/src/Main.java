import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double numeroDouble = Math.random() * 100;
		int numeroInt = (int) numeroDouble;
		int numeroTeclado;

		System.out.println("Introduce un numero: ");
		numeroTeclado = sc.nextInt();
		while (numeroTeclado != numeroInt) {

			if (numeroTeclado > numeroInt) {

				System.out.println("Introduce un numero menor: ");
				numeroTeclado = sc.nextInt();

			} else {

				System.out.println("Introduce un numero mayor: ");
				numeroTeclado = sc.nextInt();

			}

		}
		System.out.println("Has acertado !! :D");

		sc.close();
	}

}
