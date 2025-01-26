package correccion;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		double peso = 0, altura = 0;
		char sexo = 'a';
		String nombre = "";
		

		System.out.println("Escribe el nombre que quieras: ");
		nombre = sc.nextLine();
		System.out.println(" ");
			
		Persona primera = new Persona(nombre);
		
		System.out.println("Escribe el nombre que quieras: ");
		nombre = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Escribe la edad que quieras para " + nombre + ": ");
		edad = sc.nextInt();
		System.out.println(" ");
		
		System.out.println("Escribe el sexo que quieras (H o M) para " + nombre + ": ");
		sexo = sc.next().charAt(0);
		System.out.println(" ");
		
		Persona segunda = new Persona(nombre, edad, sexo);
		
		System.out.println("Escribe el nombre que quieras: ");
		nombre = sc.nextLine();
		nombre = sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Escribe la edad que quieras para " + nombre + ": ");
		edad = sc.nextInt();
		System.out.println(" ");
		
		System.out.println("Escribe el peso que quieras para " + nombre + ": ");
		peso = sc.nextDouble();
		System.out.println(" ");
		
		System.out.println("Escribe la altura que quieras para " + nombre + ": ");
		altura = sc.nextDouble();
		System.out.println(" ");
		
		System.out.println("Escribe el sexo que quieras (H o M) para " + nombre + ": ");
		sexo = sc.next().charAt(0);
		System.out.println(" ");
		
		
		Persona tercera = new Persona(nombre, edad, sexo, peso, altura);
		
		sc.close();
		
		switch (tercera.calcularIMC()) {
			case -1:
				System.out.println("En el caso de " + tercera.getNombre() + ", su peso es idoneo");
				break;
			case 0:
				System.out.println("En el caso de " + tercera.getNombre() + ", su peso es normal");
				break;
			case 1:
				System.out.println("En el caso de " + tercera.getNombre() + ", tiene sobrepeso");
				break;
		}
		
		System.out.println(" ");
		
		if (segunda.esMayorDeEdad()==true) {
			System.out.println(segunda.getNombre() + " es mayor de edad");
		} else {
			System.out.println(segunda.getNombre() + " es menor de edad");
		}
		
		System.out.println(" ");
		
		if (tercera.esMayorDeEdad()==true) {
			System.out.println(tercera.getNombre() + " es mayor de edad");
		} else {
			System.out.println(tercera.getNombre() + " es menor de edad");
		}
				
		System.out.println(" ");
		System.out.println(primera);
		System.out.println(" ");
		System.out.println(segunda);
		System.out.println(" ");
		System.out.println(tercera);
		
	}
}
