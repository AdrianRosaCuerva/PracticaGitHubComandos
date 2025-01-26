package examen1;

public class Init {

	public static void main(String[] args) {

		Vengador ironMan = new Vengador("Iron Man", "Tecnologia avanzada", "Marvel", "Mark LXXXV");
		Vengador thor = new Vengador("Thor", "Control del trueno", "Marvel", "Stormbreaker");

		Mutante wolverine = new Mutante("Wolverine", "Regeneracion", "Marvel", 10);
		Mutante magneto = new Mutante("Magneto", "Control de metales", "Marvel", 9);

		System.out.println("Informacion sobre los superheroes creados:");
		System.out.println("------------------------------------------");
		System.out.println(ironMan);
		System.out.println(thor);
		System.out.println(wolverine);
		System.out.println(magneto);
		
		System.out.println("");
		
		System.out.println("Nivel de poder:");
		System.out.println("---------------");
		System.out.println(ironMan.usarPoder());
		System.out.println(thor.usarPoder());
		System.out.println(wolverine.usarPoder());
		System.out.println(magneto.usarPoder());
		
	}

}
