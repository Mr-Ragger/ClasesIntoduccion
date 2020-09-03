
public class CalculoHipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double primerCateto  = 4;
		double segundoCateto = 5;
		double hipotenusa;
		
		hipotenusa = Math.sqrt( Math.pow(primerCateto, 2) + Math.pow(segundoCateto, 2));
		
		
		System.out.println(hipotenusa);
	}

}
