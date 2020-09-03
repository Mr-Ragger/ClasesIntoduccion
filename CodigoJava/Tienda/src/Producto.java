
public class Producto {
	public static void main(String[] args) {
		
		String nombreProducto = "Lejia";
		double precio = 10;
		double precioConIva = precio * 0.21 + precio ;
		
		
		System.out.println("Nombre del producto: " + nombreProducto + "\n" + "Precio sin iva: " + precio + "\n" + "Precio con iva: " + precioConIva );
		 
		
	}
}
