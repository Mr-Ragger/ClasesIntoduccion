
public class Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "pipas";
		int cantidad = 3;
		double precioIndividual = 1.50;
		double precioTotal = precioIndividual*cantidad;
		double precioTotalConIva = precioTotal*1.21;
		
		System.out.println("Producto: " + nombre);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Precio individual: " + precioIndividual);
		System.out.println("Precio total con IVA: " + precioTotalConIva);
	}

}
