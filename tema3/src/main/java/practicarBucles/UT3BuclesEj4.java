package practicarBucles;

import java.util.Scanner;

public class UT3BuclesEj4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		
		for (int fila = 1; fila <= n; fila++) {
			
			for (int j = 1; j <= fila; j++) {
				System.out.print(j);
			}
			
			System.out.println("");
		}
		
	}

}
