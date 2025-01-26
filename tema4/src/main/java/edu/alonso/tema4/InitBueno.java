package edu.alonso.tema4;

public class InitBueno {
	
	public static void main(String[] args) {
		
		Calcetin kullen[] = new Calcetin[5];
		
		kullen[0] = new Calcetin("Channo", 42);
		kullen[1] = new Calcetin("Klavin Klain", 40);
		kullen[2] = new Calcetin("Jalvin Clain", 43);
		kullen[3] = new Calcetin("Adioss", 39);
		kullen[4] = new Calcetin("Suprimo", 42);
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		kullen[1].setMarca("Papipas");
		
		kullen [3] = null;
		
		System.out.println("Despues del cambio:");

		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
	}

}
