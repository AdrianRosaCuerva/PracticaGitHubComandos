package rectangulo;

import java.util.Scanner;

public class Init {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangulo prueba1 = new Rectangulo(6, 4);
		
		String stringPrueba1 = prueba1.toString();
		System.out.println("Prueba de rectangulo 1: \n"+ prueba1);
		
		Rectangulo prueba2 = new Rectangulo();
		
		System.out.print("Introduce el ancho del rectangulo: ");
		prueba2.setAncho(sc.nextInt());
		
		System.out.print("Introduce el largo del rectangulo: ");
		prueba2.setLargo(sc.nextInt());
		
		String stringPrueba2 = prueba2.toString();
		System.out.println("Prueba de rectangulo 2: \n"+ prueba2);
	}

}
