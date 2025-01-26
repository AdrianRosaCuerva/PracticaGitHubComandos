package practicarBucles;

import java.util.Scanner;

public class UT2BuclesEj2 {

	public static void main(String[] args) {

		int contador = 0;
		int suma = 0;

		while (contador < 5) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Introduce un numero: ");
			int num = sc.nextInt();

			suma += num;

			if (num == 0) {
				contador++;
			}

		}

		System.out.println("La suma de todos los numeros da: " + suma);

	}

}
