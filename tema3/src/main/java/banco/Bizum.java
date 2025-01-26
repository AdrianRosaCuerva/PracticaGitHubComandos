package banco;

public class Bizum extends OperacionBancaria{
	
	protected long telefonoOrigen;
	protected long telefonoDestino;
	
	public Bizum(Cliente cliente, Domicilio domicilio, long telefonoOrigen, long telefonoDestino) {
		super(cliente, domicilio);
		this.telefonoOrigen = telefonoOrigen;
		this.telefonoDestino = telefonoDestino;
	}

	public long getTelefonoOrigen() {
		return telefonoOrigen;
	}
	
	public void setTelefonoOrigen(long telefonoOrigen) {
		this.telefonoOrigen = telefonoOrigen;
	}
	
	public long getTelefonoDestino() {
		return telefonoDestino;
	}
	
	public void setTelefonoDestino(long telefonoDestino) {
		this.telefonoDestino = telefonoDestino;
	}
	
	@Override
	
	public String toString() {
		return "Bizum: "+ super.toString() +", Telefono de origen: "+ telefonoOrigen+", Telefono de destino: "+telefonoDestino; 
	}
}
