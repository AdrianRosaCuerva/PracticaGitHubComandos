package rectangulo;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alturaRombo = 0;

		while (alturaRombo % 2 == 0) {

			System.out.print("Introduce la altura del rombo: ");
			alturaRombo = sc.nextInt();

		}
		
		sc.close();

		System.out.println("El rombo de altura " + alturaRombo + " sería asi:");

		int alturaMitadRombo = (alturaRombo + 1) / 2;

		for (int fila = 1; fila <= alturaMitadRombo; fila++) {

			// Espacios
			for (int columna = 1; columna <= (alturaMitadRombo - fila); columna++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int columna = 1; columna < (fila * 2); columna++) {
				System.out.print("*");
			}

			System.out.println("");
		}

		for (int fila = 1; fila < alturaMitadRombo; fila++) {

			// Espacios
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int columna = 1; columna < ((alturaMitadRombo - fila) * 2); columna++) {
				System.out.print("*");
			}

			System.out.println("");
		}

	}

}
