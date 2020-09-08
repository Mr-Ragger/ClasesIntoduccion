
public class Contador {

	int valorContador = 0;

	public Contador(int n1) {

		this.valorContador = n1;

	}

	public void incrementarContador() {

		this.valorContador++;

	}

	public void decrementarContador() {

		this.valorContador--;

	}

	public void setContador(int n1) {

		this.valorContador = n1;
	}

	public String toString() {

		return "El valor del contador es: " + valorContador;

	}
}
