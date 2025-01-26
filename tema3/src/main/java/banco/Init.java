package banco;

public class Init {
	
	public static void main(String[] args) {
		
		/*

		Cliente fernando = new Cliente("Fernando", "Alonso", "Díaz", 43, "12345678A");
		Cliente carlos = new Cliente("Carlos", "Sainz", 27, "987654321K");
		
		Domicilio domicilioFernando = new Domicilio("C/Larga", 14, "Oviedo", "Oviedo", 12345);
		Domicilio domicilioCarlos = new Domicilio("C/Grande", 55, 3, 'a', "Madrid", "Madrid", 12353);
		
		String stringFernando = fernando.toString();
		String stringDomicilioFernando = domicilioFernando.toString();
		System.out.println("Cliente 1: "+fernando+"\nDomicilio: "+domicilioFernando+"\n");
		
		String stringCarlos = carlos.toString();
		String stringDomicilioCarlos = domicilioCarlos.toString();
		System.out.println("Cliente 2: "+carlos+"\nDomicilio: "+domicilioCarlos);
		
		*/
		
		OperacionBancaria pruebaTransferencia = new Transferencia(new Cliente("Fernando", "Alonso", "Díaz", 43, "12345678A"),
				new Domicilio("C/Larga", 14, "Oviedo", "Oviedo", 12345));
		
		String stringTransferencia = pruebaTransferencia.toString();
		System.out.println("Prueba de transferencia: "+pruebaTransferencia);
		
		//OperacionBancaria pruebaBizum = new Bizum(new Cliente("Carlos", "Sainz", 27, "987654321K"),
//				new Domicilio("C/Grande", 55, 3, 'a', "Madrid", "Madrid", 12353));
	}
	
}
