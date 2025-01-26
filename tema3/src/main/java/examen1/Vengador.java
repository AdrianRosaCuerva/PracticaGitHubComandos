package examen1;

public class Vengador extends Superheroe {

	private String armadura;

	public Vengador(String nombre, String poder, String universo, String armadura) {
		super(nombre, poder, universo);
		this.armadura = armadura;
	}

	public String getArmadura() {
		return armadura;
	}

	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}

	public String usarPoder() {
		return "El Vengador " + getNombre() + " usa su poder especial " + getPoder();
	}

	@Override
	public String toString() {
		return "Vengador: Nombre: " + getNombre() + ", Poder: " + getPoder() + ", Universo: " + getUniverso()
				+ ", Armadura: " + armadura;
	}

}
