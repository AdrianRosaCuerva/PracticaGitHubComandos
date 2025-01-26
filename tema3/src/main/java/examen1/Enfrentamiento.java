package examen1;

import java.util.Random;

public class Enfrentamiento {

	public static void main(String[] args) {

		Random dado = new Random();
		
		final int VIDA_MAX = 10;

		String superheroe = "Thor";
		String mutante = "Magneto";

		int vidaHeroe = VIDA_MAX;
		int vidaMutante = VIDA_MAX;
		
		int tiradaHeroe;
		int tiradaMutante;

		// Inicio pelea

		for (int i = 1;; i++) {
			System.out.println("----- Turno " + i + " -----");

			// Tirada dados

			tiradaHeroe = dado.nextInt(6) + 1;
			tiradaMutante = dado.nextInt(6) + 1;

			// Dañar o curar

			if (tiradaHeroe % 2 == 0) {
				vidaMutante -= tiradaHeroe;
				System.out.println(superheroe + " inflinge " + tiradaHeroe + " punto(s) de daño.");
			} else {
				vidaHeroe += tiradaHeroe;

				System.out.println(superheroe + " se cura " + tiradaHeroe + " punto(s).");

				if (vidaHeroe > VIDA_MAX) {
					vidaHeroe = VIDA_MAX;
				}
			}

			if (tiradaMutante % 2 == 0) {
				vidaHeroe -= tiradaMutante;
				System.out.println(mutante + " inflinge " + tiradaMutante + " punto(s) de daño.");
			} else {
				vidaMutante += tiradaMutante;

				System.out.println(mutante + " se cura " + tiradaMutante + " punto(s).");

				if (vidaMutante > VIDA_MAX) {
					vidaMutante = VIDA_MAX;
				}
			}

			// Imprimir vida

			System.out.println("Vida " + superheroe + ": " + vidaHeroe);
			System.out.println("Vida " + mutante + ": " + vidaMutante);

			// Comprobacion vida

			if (vidaHeroe <= 0 && vidaMutante <= 0) {
				System.out.println("Ha habido un empate técnico.");
				System.exit(0);
			} else if (vidaHeroe <= 0) {
				System.out.println(mutante + " gana el enfrentamiento.");
				System.exit(0);
			} else if (vidaMutante <= 0) {
				System.out.println(superheroe + " gana el enfrentamiento.");
				System.exit(0);
			}

			System.out.println("");

		}
	}
}
