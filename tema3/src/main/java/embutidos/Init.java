package embutidos;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Embutido fuet = new Embutido("Cataluña", "Embutidos Joan", 6);
		Embutido jamon = new Embutido("Extremadura", "Jamones Paco", 4);
		Embutido lomo = new Embutido("Castilla la Mancha", "Embutidos Toledo");
		Embutido salchichon = new Embutido("Castilla la Mancha", "Embutidos Toledo", 11);
		Embutido salchicha = new Embutido("", "", 0);
		
		System.out.print("Introduce la comunidad autonoma de donde proviene la salchicha: ");
		salchicha.setProcedencia(sc.nextLine());
		
		System.out.print("Introduce la empresa que produce la salchicha: ");
		salchicha.setEmpresa(sc.nextLine());
		
		System.out.print("Introduce el mes en el que se produció la salchicha: ");
		salchicha.setMes(sc.nextInt());

		String stringFuet = fuet.toString();
		System.out.println("Contenido del objeto Fuet: " + fuet);

		String stringJamon = jamon.toString();
		System.out.println("Contenido del objeto Jamón: " + jamon);

		String stringLomo = lomo.toString();
		System.out.println("Contenido del objeto Lomo: " + lomo);
		
		System.out.print("Introduce el mes en el que se produció el lomo: ");
		lomo.setMes(sc.nextInt());
		
		stringLomo = lomo.toString();
		System.out.println("Contenido del objeto Lomo: " + lomo);
		
		String stringSalchichon = salchichon.toString();
		System.out.println("Contenido del objeto Salchichón: " + salchichon);
		
		String stringSalchicha = salchicha.toString();
		System.out.println("Contenido del objeto Salchicha: " + salchicha);
		
		sc.close();
	}

}
