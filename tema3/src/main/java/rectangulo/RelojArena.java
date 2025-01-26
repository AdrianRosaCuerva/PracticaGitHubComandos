package rectangulo;

public class RelojArena {

	public static void main(String[] args) {

		int h = 7;

		// Mitad arriba

		int alturaArriba = (h + 1) / 2;

		for (int fila = 0; fila < alturaArriba; fila++) {

			// Espacios

			for (int col = 1; col <= fila; col++) {
				System.out.print(" ");
			}
			
			//Asteriscos
			
			for (int col = 1; col < (2*(alturaArriba-fila)); col++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		//Mitad Abajo
		
		for (int fila = 1; fila < alturaArriba; fila++) {
			
			//Espacios
			
			for (int col = 1; col <= (alturaArriba-fila); col++) {
				System.out.print(" ");
			}
			
			//Asteriscos
			
			for (int col = 1; col < (fila*2); col++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
