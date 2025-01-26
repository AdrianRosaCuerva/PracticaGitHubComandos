package CuentaBanco;

public class Cuenta {
	
	private Titular titular;
	private String iban;
	private double dinero;
	
	public Cuenta(Titular titular, String iban, double dinero) {
		this.titular = titular;
		this.iban = iban;
		this.dinero = dinero;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Cuenta= Titular: " + titular + ", IBAN: " + iban + ", Cantidad: " + dinero;
	}
	
	

}
