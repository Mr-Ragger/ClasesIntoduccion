
public class Circulo {

	double radio;
	double area;
	double perimetro;
	
	public Circulo(int radio) {

		this.radio = radio;

	}

	public double calcularArea() {

		this.area = Math.PI * Math.pow(this.radio, 2);

		return this.area;

	}
	
	public double calcularPerimetro() {
		
		this.perimetro = 2 * Math.PI * this.radio;
		
		return perimetro;
	}
	
	public String toString() {
		
		return "El area del circulo es: " + this.area + " y su radio es: " + this.radio + " y su perimetro es: " + this.perimetro ;
	}

}
