package practicarBucles;

import java.util.Random;

public class UT2BuclesEj5 {
	
	public static void main(String[] args) {
		
		String dni = "";
		final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		Random rng = new Random();
		
		int num = rng.nextInt(89999999) + 10000000;
		
		int posicion = num%23;
		
		dni = ""+num+LETRAS_DNI.charAt(posicion);
		
		System.out.println(dni);
		
	}

}
