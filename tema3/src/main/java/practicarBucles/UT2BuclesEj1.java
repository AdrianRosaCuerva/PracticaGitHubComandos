package practicarBucles;

import java.util.Scanner;

public class UT2BuclesEj1 {
	
	public static void main(String[] args) {
		
		int numMayor = 0;
		int contador = 0;
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while (num>-1) {
			
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			
			if (num>numMayor) {
				numMayor = num;
				contador = 0;
			} else if (num==numMayor) {
				contador++;
			}
			
		}
		
		if (contador==0) {
			System.out.println("El numero mayor no se ha repetido");
		} else {
			System.out.println("El numero mayor se ha repetido");
		}
	}

}
