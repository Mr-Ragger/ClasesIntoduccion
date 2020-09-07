
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo miCirculo = new Circulo(15);
		
		double area = miCirculo.calcularArea();
		double perimetro = miCirculo.calcularPerimetro();
		
		System.out.println("El area del circulo: " + area);
		
		System.out.println("El perimetro es : " + perimetro);
		
		System.out.println(miCirculo); 
	}

}
