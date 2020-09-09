
public class Point {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int resultadoX;
	private int resultadoY;
	
	
	
	public Point(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	
		System.out.println("la primera ubiccacion esta en " + x1 + "," + y1 + " y la segunda esta en " + x2 + "," + y2);
	}
	
	
	public void calcularDistancia() {		
		
			resultadoX = this.x2 - this.x1;
			resultadoY = this.y2 - this.y1;
			
//			System.out.println(resultadoX + "," + resultadoY);
		
		/////////////////////////////////////GETTERS Y SETTERS///////////////////////////////////////////////////////
	}
	public int getValorX1() {
		return this.x1;
	}
	public void setValorX1(int x1) {
		this.x1 = x1;
	}
	public int getValorY1() {
		return this.x1;
	}
	public void setValorY1(int y1) {
		this.y1 = y1;
	}
	public int getValorX2() {
		return this.x1;
	}
	public void setValorX2(int x2) {
		this.x2 = x2;
	}
	public int getValorY2() {
		return this.x1;
	}
	public void setValorY2(int y2) {
		this.y2 = y2;
	}
	
	
	
	public String toString() {
		
		
		return "la distancia entre los dos puntos es de " + resultadoX + "," + resultadoY ;
	}

}

