package correccion;

public class ProfesorInterino extends Profesor{
	private int diaInicio;
	private int mesInicio;
	private int anioInicio;
	
	public ProfesorInterino(String nombre, String modulo1, String modulo2, String modulo3, String modulo4, int diaInicio, int mesInicio, int anioInicio) {
		super(nombre, modulo1, modulo2, modulo3, modulo4);
		this.diaInicio = diaInicio;
		this.mesInicio = mesInicio;
		this.anioInicio = anioInicio;
	}
	
	public int getDiaAprobado() {
		return diaInicio;
	}
	
	public int getMesAprobado() {
		return mesInicio;
	}
	
	public int getAnioAprobado() {
		return anioInicio;
	}
	
	public void setDiaAprobado(int diaAprobado) {
		this.diaInicio = diaAprobado;
	}
	
	public void setMesAprobado(int mesInicio) {
		this.mesInicio = mesInicio;
	}
	
	public void setAnioAprobado(int anioInicio) {
		this.anioInicio = anioInicio;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", es profesor Interino y empezó el " + diaInicio + "/" + mesInicio + "/" + anioInicio;
	}
}