package Ejercicio3;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Persona persona1 = new Persona("Juan", 33, 'm', 78.5, 1.80);
		Persona persona2 = new Persona("Maria", 45, 'F');
		Persona persona3 = new Persona("Alberto");
		ProfesorInterino interino1 = new ProfesorInterino("Pepe", 23, 'd', 1.90, 94, "SIF", "SOMP", "SOR", "SER", "24/12/2018");
		ProfesorTitular titular1 = new ProfesorTitular("Ramon", 23, 's', 1.94, 96, "SIF", "SOMP", "SOR", "SER", "24/12/2018");
/*
		String stringPersona1 = persona1.toString();
		System.out.println("Persona 1: [" + persona1 + "]");
		switch (persona1.calcularIMC()) {
		case -1:
			System.out.println("Su peso está por debajo de lo ideal.");
			break;
		case 0:
			System.out.println("Su peso está en el rango ideal.");
			break;
		case 1:
			System.out.println("Su peso está por encima de lo ideal.");
		}

		System.out.print("Introduce el peso de Maria: ");
		persona2.setPeso(sc.nextDouble());

		System.out.print("Introduce la altura de Maria: ");
		persona2.setAltura(sc.nextDouble());

		String stringPersona2 = persona2.toString();
		System.out.println("Persona 2: [" + persona2 + "]");
		switch (persona2.calcularIMC()) {
		case -1:
			System.out.println("Su peso está por debajo de lo ideal.");
			break;
		case 0:
			System.out.println("Su peso está en el rango ideal.");
			break;
		case 1:
			System.out.println("Su peso está por encima de lo ideal.");
		}
		
		System.out.print("Introduce la edad de Alberto: ");
		persona3.setEdad(sc.nextInt());
		
		System.out.print("Introduce el peso de Alberto: ");
		persona3.setPeso(sc.nextDouble());

		System.out.print("Introduce la altura de Alberto: ");
		persona3.setAltura(sc.nextDouble());

		String stringPersona3 = persona3.toString();
		System.out.println("Persona 2: [" + persona3 + "]");
		switch (persona3.calcularIMC()) {
		case -1:
			System.out.println("Su peso está por debajo de lo ideal.");
			break;
		case 0:
			System.out.println("Su peso está en el rango ideal.");
			break;
		case 1:
			System.out.println("Su peso está por encima de lo ideal.");
		}
		*/
		
		String stringInterino1 = interino1.toString();
		System.out.println("Interino 1: ["+ interino1 +"]");
		switch (interino1.calcularIMC()) {
		case -1:
			System.out.println("Su peso está por debajo de lo ideal.");
			break;
		case 0:
			System.out.println("Su peso está en el rango ideal.");
			break;
		case 1:
			System.out.println("Su peso está por encima de lo ideal.");
		}
		
		String stringTitular1 = titular1.toString();
		System.out.println("Titular 1: ["+ titular1 +"]");
		switch (titular1.calcularIMC()) {
		case -1:
			System.out.println("Su peso está por debajo de lo ideal.");
			break;
		case 0:
			System.out.println("Su peso está en el rango ideal.");
			break;
		case 1:
			System.out.println("Su peso está por encima de lo ideal.");
		}

	}

}
