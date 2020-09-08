
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador miContador = new Contador(456);
		Contador miContadorB = new Contador(1234);	
		
		System.out.println(miContador);
		System.out.println(miContadorB);
		
		
		miContador.setContador(356);
		System.out.println(miContador);
		miContador.incrementarContador();
		System.out.println(miContador);
		miContador.decrementarContador();
		System.out.println(miContador);
	}

}
