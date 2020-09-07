import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Introduce que tabla quieres del 1 al 10: ");
		n1 = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {

			System.out.println(n1 + " x " + i + " = " + i * n1);
		}
		
		sc.close();
	}

}
