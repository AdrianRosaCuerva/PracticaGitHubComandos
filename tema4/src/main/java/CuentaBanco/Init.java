package CuentaBanco;

public class Init {

	public static void main(String[] args) {

		Cuenta santander[] = new Cuenta[4];

		santander[0] = new Cuenta(new Titular("Fernando", "Alonso", "Diaz"), "ES61 1234 4372 42 0456323532", 2312453.46);
		santander[1] = new Cuenta(new Titular("Carlos", "Sainz", "Vazquez"), "ES61 1234 3456 42 0456323532", 3143453);
		santander[2] = new Cuenta(new Titular("Adrian", "Rosa", "Cuerva"), "ES61 1234 9832 42 0456323532", 123.50);
		santander[3] = new Cuenta(new Titular("Diego", "Sampedro", "Garcia"), "ES61 1234 9832 42 0456323556", 2334);

		for (int i = 0; i < santander.length; i++) {
			System.out.println(santander[i]);
		}
		System.out.println();
		System.out.println("Despues de añadir el 1%:\n");

		for (int i = 0; i < santander.length; i++) {

			if (santander[i].getDinero() >= 1000000) {
				santander[i].setDinero(santander[i].getDinero() * 1.01);
			}
		}

		for (int i = 0; i < santander.length; i++) {
			System.out.printf("%s tiene %.2f€\n", santander[i].getTitular().getNombre(), santander[i].getDinero());
		}

	}

}
