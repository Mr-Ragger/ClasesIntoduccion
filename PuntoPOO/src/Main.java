import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int selector = 0;
		int valorX1;
		int valorY1;
		int valorX2;
		int valorY2;

		Point puntoA = new Point(3, 6);
		Point puntoB = new Point(8, 2);
		
		
		puntoA.calcularDistancia(puntoB.x, puntoB.y);

//		System.out.println("Selecciona la opcion que desee realizar");
//		System.out.println("1. Definir la primera coordenada");
//		System.out.println("2. Definir la segunda coordenada");
//		System.out.println("3. Calcular e imprimir la distancia entre coordenadas");

//		selector = sc.nextInt();
//
//		switch (selector) {
//		case 1:
//			System.out.println("introduce el valor de X");
//			valorX1 = sc.nextInt();
//			myPoint.setValorX1(valorX1);
//			System.out.println("introduce el valor de Y");
//			valorY1 = sc.nextInt();
//			myPoint.setValorY1(valorY1);
//			System.out.println("la primera coordenada es :" + myPoint.getValorX1() + "," + myPoint.getValorY1());
//			break;
//		case 2:
//			System.out.println("introduce el valor de X");
//			valorX2 = sc.nextInt();
//			myPoint.setValorX2(valorX2);
//			System.out.println("introduce el valor de Y");
//			valorY2 = sc.nextInt();
//			myPoint.setValorY2(valorY2);
//			System.out.println("la segunda coordenada es :" + myPoint.getValorX2() + "," + myPoint.getValorY2());
//			break;
//		case 3:
//			System.out.println("work in progress");
//			break;
//
//		default:
//			break;
//		}

		System.out.println(puntoA.toString());

		sc.close();

	}

}
