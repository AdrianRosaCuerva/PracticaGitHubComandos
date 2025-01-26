package correccion;

public class ProfesorTitular extends Profesor {
	private int diaAprobado;
	private int mesAprobado;
	private int anioAprobado;
	
	public ProfesorTitular(String nombre, String modulo1, String modulo2, String modulo3, String modulo4, int diaAprobado, int mesAprobado, int anioAprobado) {
		super(nombre, modulo1, modulo2, modulo3, modulo4);
		this.diaAprobado = diaAprobado;
		this.mesAprobado = mesAprobado;
		this.anioAprobado = anioAprobado;
	}
	
	public int getDiaAprobado() {
		return diaAprobado;
	}
	
	public int getMesAprobado() {
		return mesAprobado;
	}
	
	public int getAnioAprobado() {
		return anioAprobado;
	}
	
	public void setDiaAprobado(int diaAprobado) {
		this.diaAprobado = diaAprobado;
	}
	
	public void setMesAprobado(int mesAprobado) {
		this.mesAprobado = mesAprobado;
	}
	
	public void setAnioAprobado(int anioAprobado) {
		this.anioAprobado = anioAprobado;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", es profesor titular y aprobó las oposiciones el " + diaAprobado + "/" + mesAprobado + "/" + anioAprobado;
	}
}
