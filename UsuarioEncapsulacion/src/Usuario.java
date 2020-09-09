import java.util.Date;

public class Usuario {

	public String nombre;
	private boolean activado;
	public Date fechaActivacion;

	public Usuario(String nombre) {

		this.nombre = nombre;
		this.activado = false;

	}

	public boolean getActivado() {
		return this.activado;
	}

	public void activarUsuario() {

		this.activado = true;
		this.fechaActivacion = new Date();
		
	}

	public String toString() {

		if(activado == true) {
			
			return "Usuario: " + this.nombre + "\nActivado: " + this.activado + "\nFecha de activacion: " + fechaActivacion;
		
		} else {
			
			return "Usuario: " + this.nombre + "\nActivado: " + this.activado;
			
		}
		
		
		

	}

}
