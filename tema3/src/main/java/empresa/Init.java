package empresa;

public class Init {

	public static void main(String[] args) {

		Empleado directivo = new Directivo("Fran", "12345678J", 33, 12364.50, 20);
		Empleado desarrollador = new Desarrollador("Mario", "12346789P", 45, 12345, true, true, true);
		Empleado tester = new Tester("Ahinoa", "98765432U", 34, 12345, 4);

		String stringDirectivo = directivo.toString();
		System.out.println("Directivo:\n" + directivo + "\n\n");

		String stringDesarrollador = desarrollador.toString();
		System.out.println("Desarrollador:\n" + desarrollador + "\n\n");

		String stringTester = tester.toString();
		System.out.println("Tester:\n" + tester + "\n\n");

	}

}
