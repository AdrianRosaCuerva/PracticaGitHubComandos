package banco;

public class Transferencia extends OperacionBancaria{
	
	private String ibanDestino;
	
	public Transferencia(Cliente cliente, Domicilio domicilio) {
		super(cliente, domicilio);
		this.ibanDestino = generaIban();
	}
	
	public String getIbanDestino() {
		return ibanDestino;
	}
	
	@Override
	public String toString() {
		return "Transferencia: "+ toString()+", IBAN de destino: "+ ibanDestino;
	}

}
