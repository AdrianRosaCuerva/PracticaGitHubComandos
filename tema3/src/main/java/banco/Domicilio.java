package banco;

public class Domicilio {
	
	protected String calle;
	protected int numero;
	protected int planta;
	protected char puerta;
	protected String localidad;
	protected String provincia;
	protected int codigoPostal;
	
	public Domicilio(String calle, int numero, String localidad, String provincia, int codigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}
	
	public Domicilio(String calle, int numero, int planta, char puerta, String localidad, String provincia, int codigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.planta = planta;
		this.puerta = puerta;
		this.localidad = localidad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getPlanta() {
		return planta;
	}
	
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
	public char getPuerta() {
		return puerta;
	}
	
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		String auxDomicilio = ("Calle: "+calle+", Numero: "+numero+
				", Planta: "+planta+", Localidad: "+localidad+
				", Provincia: "+provincia+", Código Postal: "+codigoPostal);
		return auxDomicilio;
	}
}
