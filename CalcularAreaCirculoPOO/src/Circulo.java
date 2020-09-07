
public class Circulo {

	double radio;
	double area;

	public Circulo(int radio) {

		this.radio = radio;

	}

	public double calcularArea() {

		this.area = Math.PI * Math.pow(this.radio, 2);

		return this.area;

	}

}
