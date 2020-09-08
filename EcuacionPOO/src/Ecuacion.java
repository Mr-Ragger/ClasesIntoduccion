
public class Ecuacion {

	int a, b, c, discriminante;

	public Ecuacion(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public int calcularNumeroSoluciones() {
		discriminante = (int) ((Math.pow(b, 2)) - 4 * a * c);
		int numSoluciones = 0;
		
		if (discriminante < 0 || a == 0) {
			return numSoluciones = 0;
		} else if (discriminante == 0) {
			return numSoluciones = 1;
		} else if (discriminante > 0) {
			return numSoluciones = 2;
		}

		return numSoluciones;

	}

	public double[] calcularSoluciones() {

		int  numSoluciones = this.calcularNumeroSoluciones();
		double[] array = new double[numSoluciones];
		if (numSoluciones == 1) {
			
			double resultado = ((-1) * b ) / (2 * a);
			array[0] = resultado;

		}
		if ( numSoluciones == 2){
			discriminante = (int) ((Math.pow(b, 2)) - 4 * a * c);
			double resultado1 = ((-1) * b ) + Math.sqrt(2 * a);
			double resultado2 = ((-1) * b ) - Math.sqrt(2 * a);
			
			array[0] = resultado1;
			array[1] = resultado2;
		}
		
		return array;
		
	}

	public String toString() {

		return this.a + " x^2 + " + this.b + " x + " + this.c + " = 0";

	}

}
