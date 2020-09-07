
public class Coche {

	String marca,modelo,color,caballos;
	int año,puertas;
	
	public Coche() {
		
		System.out.println("Se ha creado un coche vacio");
	
	}
	
	public Coche(String modelo, String color) {
		
		this.modelo = modelo;
		this.color = color;
		
		System.out.println("El objeto seat se compone de " + modelo + " " + color);
		
	}
	
	public Coche(String caballos, String color, String modelo) {
		
		this.caballos = caballos;
		this.color = color;
		this.modelo = modelo;
		
		System.out.println("El bmw tiene: " + this.caballos + " es de color: " + this.color + " y es el modelo: " + this.modelo);
		
	}
	
}
