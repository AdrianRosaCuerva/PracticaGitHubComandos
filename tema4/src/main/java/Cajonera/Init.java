package Cajonera;

public class Init {
	
	public static void main(String[] args) {
		
		Calcetines kullen [][]= {
				{
					new Calcetines("rojo", 43, "Suprimo"),
					new Calcetines("azul", 43, "Apipas"),
					new Calcetines("negro", 43, "Pumba"),
					new Calcetines("negro", 43, "Joma"),
					new Calcetines("rojo", 43, "Suprimo")
				},
				{
					new Calcetines("rojo", 43, "Suprimo"),
					new Calcetines("azul", 43, "Apipas"),
					new Calcetines("negro", 43, "Pumba"),
					new Calcetines("negro", 43, "Joma"),
					new Calcetines("rojo", 43, "Suprimo")
				}, 
				{
					new Calcetines("rojo", 43, "Suprimo"),
					new Calcetines("azul", 43, "Apipas"),
					new Calcetines("negro", 43, "Pumba"),
					new Calcetines("negro", 43, "Joma"),
					new Calcetines("rojo", 43, "Suprimo")
				}	
		};
		
		for (int i = 0; i < kullen.length; i++) {
			for (int j = 0; j < kullen[0].length; j++) {
				System.out.println(kullen[i][j]);
			}
		}
	}

}
