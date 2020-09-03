import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dados los coeficientes de una ecucaion de segundo grado:
		// - Mostrar si tiene solucion unica
		// - Mostrar si tiene solucion doble
		// - Mostrar si no tiene solucion posible

		Scanner sc = new Scanner(System.in);

		double n1, n2, n3;
		double x1, x2, discriminante;

		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextDouble();
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextDouble();
		System.out.println("Introduce el tercer numero: ");
		n3 = sc.nextDouble();

		discriminante = ((Math.pow(n2, 2)) - 4 * n1 * n3);

		if (discriminante < 0) {

			System.out.println("No existen soluciones reales");

		} else if (discriminante == 0) {

			x1 = (-n2 + Math.sqrt(discriminante)) / (2 * n1);

			System.out.println("Solucion: " + x1);

		} else if (discriminante > 0) {

			x1 = (-n2 + Math.sqrt(discriminante)) / (2 * n1);
			x2 = (-n2 + Math.sqrt(discriminante)) / (2 * n1);

			System.out.println("Solucion: " + x1);
			System.out.println("Solucion: " + x2);
		}

		sc.close();
	}

}
