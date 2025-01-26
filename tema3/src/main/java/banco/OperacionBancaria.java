package banco;

import java.util.Random;

public class OperacionBancaria {

	protected Cliente cliente;
	protected Domicilio domicilio;
	protected String iban;

	public OperacionBancaria(Cliente cliente, Domicilio domicilio) {
		this.cliente = cliente;
		this.domicilio = domicilio;
		this.iban = generaIban();
	}

	protected String generaIban() {
		
		final String PREFIJO1 = "ES 91";
		final String PREFIJO2 = "ES 32";
		final String PREFIJO3 = "ES 45";

		Random ran = new Random();

		int rng = ran.nextInt(3);

		String iban = null;

		switch (rng) {
		case 0:
			iban = PREFIJO1;
			break;
		case 1:
			iban = PREFIJO2;
			break;
		case 2:
			iban = PREFIJO3;
			break;
		}
		
		for (int i = 0; i < 5; i++) {
			int aleatorio = ran.nextInt(10000);
			String textoGenerado = "";
			if (aleatorio < 10) {
				textoGenerado = "000" + aleatorio;
			} else if (aleatorio < 100) {
				textoGenerado = "00" + aleatorio;
			} else if (aleatorio < 1000) {
				textoGenerado = "0" + aleatorio;
			} else {
				textoGenerado = Integer.valueOf(aleatorio).toString();
			}
			
			iban += textoGenerado;
		}
		
		return iban;

	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getIban() {
		return iban;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
