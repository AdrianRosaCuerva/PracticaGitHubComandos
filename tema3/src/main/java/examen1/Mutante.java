package examen1;

public class Mutante extends Superheroe {

	private int nivelMutacion;

	public Mutante(String nombre, String poder, String universo, int nivelMutacion) {
		super(nombre, poder, universo);
		this.nivelMutacion = nivelMutacion;
	}

	public int getNivelMutacion() {
		return nivelMutacion;
	}

	public void setNivelMutacion(int nivelMutacion) {
		this.nivelMutacion = nivelMutacion;
	}
	
	public String usarPoder() {
		return "El mutante "+ getNombre() +" usa su habilidad mutante de nivel "+ nivelMutacion;
	}

	@Override
	public String toString() {
		return "Mutante: Nombre: " + getNombre() + ", Poder: " + getPoder() + ", Universo: " + getUniverso()
				+ ", Nivel de mutacion: " + nivelMutacion;
	}

}
