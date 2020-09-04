
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] miArray = new int[] { 2, 3, 4, 5, 6, 7 };
		double sumatorio = 0;

		for (int i = 0; i < miArray.length; i++) {

			sumatorio = sumatorio + miArray[i];
			
		}

		double media = sumatorio / miArray.length;
		
		System.out.println("La media es " + media);

	}

}
