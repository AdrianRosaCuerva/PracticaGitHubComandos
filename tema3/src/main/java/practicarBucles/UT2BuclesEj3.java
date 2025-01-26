package practicarBucles;

import java.util.Scanner;

public class UT2BuclesEj3 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int multiplos3 = 0;
		int multiplos5 = 0;
		int noMultiplos = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (contador<5) {
			System.out.print("Introduce un numero: ");
			int num = sc.nextInt();
			
			if (num%3==0||num%5==0) {
				if (num%3==0) {
					multiplos3++;
				}
				
				if (num%5==0) {
					multiplos5++;
				}
			} else {
				noMultiplos++;
			}
			
			contador++;
		}
		
		System.out.println(multiplos3+" de los numeros eran multiplos de 3. "+multiplos5+" eran multiplos de 5. "+noMultiplos+" no eran multiplos ni de 3 ni de 5.");
		
	}

}
