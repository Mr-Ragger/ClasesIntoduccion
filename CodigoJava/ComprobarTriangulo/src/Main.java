import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;

		System.out.println("Introduce el primer lado del triangulo");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo lado del triangulo");
		n2 = sc.nextInt();
		System.out.println("Introduce el tercel lado del triangulo");
		n3 = sc.nextInt();

		if (n1 == n2 && n2 == n3) {
			System.out.println("Es un triangulo equilatero. ");
		} else {
			System.out.println("No es un triangulo equilatero. ");
		}

		sc.close();
	}

}
