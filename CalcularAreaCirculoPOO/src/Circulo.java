
public class Circulo {

	double radio;
	double area;
	
	public double calcularArea(int radio) {
		
		this.radio = radio;
		
		this.area = Math.PI * Math.pow(this.radio, 2);
		
		return this.area;
		
	}
	
}
