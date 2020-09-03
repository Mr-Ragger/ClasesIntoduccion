import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n1;
		int n2;

		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextInt();

		if (n1 % n2 == 0) {
			System.out.println("El primero es multiplo del segundo.");
		} else {
			System.out.println("El primero no es multiplo del segundo.");
		}

		sc.close();
	}

}
