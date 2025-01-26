package edu.alonso.tema3;

public class Init {
	
	public static void main(String[] args) {
		
		Profesor fran = new Profesor("Fran", 25);
		Profesor javi = new Profesor("Javier", 50, "Bases de datos");
		Profesor ana = new Profesor("Ana", 34, "Entornos de desarrollo");
		ProfesorInterino juan = new ProfesorInterino("Juan", 23, "SIF", "Ávila");
		ProfesorDefinitivo alfonso = new ProfesorDefinitivo("Alfonso", 42, "SOR", "Ávila", 9);
		
		fran.setAsignatura("Programación");
		
		String stringFran = fran.toString();
		System.out.println("Contenido del objeto Fran (otra vez): "+ fran);
		
		String stringJavi = javi.toString();
		System.out.println("Contenido del objeto Javi: "+ javi);
		
		String stringAna = ana.toString();
		System.out.println("Contenido del objeto Ana: "+ ana);
		
		String stringJuan = juan.toString();
		System.out.println("Contenido del objeto Juan: "+ juan);
		
		String stringAlfonso = alfonso.toString();
		System.out.println("Contenido del objeto Alfonso: "+ alfonso);
		
		System.out.println("Juan cobra: "+ CalculaSueldo.calculadoraSueldo(juan));
		
		System.out.println("Alfonso cobra: "+ CalculaSueldo.calculadoraSueldo(alfonso));
	}

}
