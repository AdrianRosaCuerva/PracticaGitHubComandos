package examen1;

public class Superheroe {
	
	private String nombre;
	private String poder;
	private String universo;
	
	public Superheroe(String nombre, String poder, String universo) {
		this.nombre = nombre;
		this.poder = poder;
		this.universo = universo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getUniverso() {
		return universo;
	}

	public void setUniverso(String universo) {
		this.universo = universo;
	}

}
