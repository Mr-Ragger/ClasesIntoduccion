
public class Point {
	int x;
	int y;
	int resultadoX;
	int resultadoY;
	
	
	
	public Point(int x1, int y1) {
		this.x = x1;
		this.y = y1;
		
	}
	
	
	public double calcularDistancia(int x, int y) {		
		
			resultadoX = this.x - x;
			resultadoY = this.y - y;
			
			double distancia = Math.sqrt(resultadoX * resultadoX + resultadoY * resultadoY);

			return distancia;
			
			//			System.out.println(resultadoX + "," + resultadoY);
		
		/////////////////////////////////////GETTERS Y SETTERS///////////////////////////////////////////////////////
	}
	
	public double calcularDistancia (Point point) {
		
		int distanciaY = this.y - point.y;
		int distanciaX = this.x - point.x;
		
		double distanciaDos = Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
		
		return distanciaDos;
	}
	
	
	public int getValorX1() {
		return this.x;
	}
	public void setValorX1(int x1) {
		this.x = x1;
	}
	public int getValorY1() {
		return this.x;
	}
	public void setValorY1(int y1) {
		this.y = y1;
	}
	
	
	public String toString() {
		
		
		return "la distancia entre los dos puntos es de " + resultadoX + "," + resultadoY ;
	}

}

