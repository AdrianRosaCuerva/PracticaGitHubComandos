package edu.alonso.tema4;

public class Init {

	public static void main(String[] args) {
		
		/*

		String[] nombre = new String[10];
		nombre[0] = "Fran";
		nombre[1] = "Adri";
		nombre[5] = "Sampe";

		int[] numeros = { 2, 3, 4, 5, 7 };
		
		System.out.println("Tamaño de nombre: "+ nombre.length);
		System.out.println("Tamaño de numeros: "+ numeros.length);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		/*
		 * Otra manera de moverse por array 
		 * for (int i = 0; i < 5; i++) { --> Si el numero es mayor que el array => Out of bounds
		 * System.out.println(numeros[i]); }
		

		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
		
		*/
		
		int[] numCalcetin = { 1, 2, 3, 4, 5, 6 };

		String[] marcaCalcetin = new String[6];
		marcaCalcetin[0] = "Nike";
		marcaCalcetin[1] = "Adidas";
		marcaCalcetin[2] = "Adidas";
		marcaCalcetin[3] = "Puma";
		marcaCalcetin[4] = "Nike";
		marcaCalcetin[5] = "Puma";

		int[] tallaCalcetin = new int[6];
		tallaCalcetin[0] = 41;
		tallaCalcetin[1] = 39;
		tallaCalcetin[2] = 38;
		tallaCalcetin[3] = 43;
		tallaCalcetin[4] = 40;
		tallaCalcetin[5] = 37;

		
		Kullen Calcetin1 = new Kullen(numCalcetin[0], marcaCalcetin[0], tallaCalcetin[0]);
		Kullen Calcetin2 = new Kullen(numCalcetin[1], marcaCalcetin[1], tallaCalcetin[1]);
		Kullen Calcetin3 = new Kullen(numCalcetin[2], marcaCalcetin[2], tallaCalcetin[2]);
		Kullen Calcetin4 = new Kullen(numCalcetin[3], marcaCalcetin[3], tallaCalcetin[3]);
		Kullen Calcetin5 = new Kullen(numCalcetin[4], marcaCalcetin[4], tallaCalcetin[4]);
		Kullen Calcetin6 = new Kullen(numCalcetin[5], marcaCalcetin[5], tallaCalcetin[5]);
		
		System.out.println(Calcetin1.toString());
		System.out.println(Calcetin2.toString());
		System.out.println(Calcetin3.toString());
		System.out.println(Calcetin4.toString());
		System.out.println(Calcetin5.toString());
		System.out.println(Calcetin6.toString());
		
		Calcetin3.setMarcaCalcetin("Suprimo");
		
		System.out.println(Calcetin3.toString());
	}

}
