
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ecuacion miEcuacion = new Ecuacion(1,2,1);
		
		
		System.out.println(miEcuacion);
		
		System.out.println("Nº Soluciones: " + miEcuacion.calcularNumeroSoluciones());
		
		System.out.println("Solucion: " + miEcuacion.calcularSoluciones().length);
	}

}
