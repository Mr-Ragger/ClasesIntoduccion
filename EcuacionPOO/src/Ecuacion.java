
public class Ecuacion {

	int a, b, c, discriminante;

	public Ecuacion(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public int calcularNumeroSoluciones() {
		discriminante = (int) ((Math.pow(b, 2)) - 4 * a * c);

		if (discriminante < 0 || a == 0) {
			return 0;
		} else if (discriminante == 0) {
			return 1;
		} else if (discriminante > 0) {
			return 2;
		}

		return 0;

	}

	public int[] calcularSoluciones() {

		
		
	}

	public String toString() {

		return this.a + " x^2 + " + this.b + " x + " + this.c + " = 0";

	}

}
