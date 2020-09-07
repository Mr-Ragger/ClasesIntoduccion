
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCocheRojo = new Coche();
		Coche miCocheGranate = new Coche();
		
		
		miCocheRojo.marca = "Seat";
		miCocheGranate.marca = "Volvo";
		
		miCocheRojo.modelo = "Ibiza";
		miCocheGranate.modelo = "S70";
		
		miCocheRojo.color = "Rojo";
		miCocheGranate.color = "Granate";
		
		miCocheRojo.año = 2000;
		miCocheGranate.año = 1994;
		
		miCocheRojo.puertas = 3;
		miCocheGranate.puertas = 5;
		
		
		System.out.println(miCocheRojo.marca + " " +  miCocheRojo.modelo + " " + miCocheRojo.color + " " + miCocheRojo.año + " " + miCocheRojo.puertas + " puertas");
		System.out.println(miCocheGranate.marca + " " +  miCocheGranate.modelo + " " + miCocheGranate.color + " " + miCocheGranate.año + " " + miCocheGranate.puertas + " puertas");
		
	}

}
