package correccion;

public class Profesor extends Persona {
	protected String modulo1;
	protected String modulo2;
	protected String modulo3;
	protected String modulo4;
	
	public Profesor(String nombre, String modulo1, String modulo2, String modulo3, String modulo4) {
		super(nombre);
		this.modulo1 = modulo1;
		this.modulo2 = modulo2;
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
	}
	
	public Profesor(String nombre, int edad, char sexo, String modulo1, String modulo2, String modulo3, String modulo4) {
		super(nombre, edad, sexo);
		this.modulo1 = modulo1;
		this.modulo2 = modulo2;
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
	}
	
	public Profesor(String nombre, int edad, char sexo, double peso, double altura, String modulo1, String modulo2, String modulo3, String modulo4) {
		super(nombre, edad, sexo, peso, altura);
		this.modulo1 = modulo1;
		this.modulo2 = modulo2;
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
	}
	
	public String getModulo1() {
		return modulo1;
	}
	
	public String getModulo2() {
		return modulo2;
	}
	
	public String getModulo3() {
		return modulo3;
	}
	
	public String getModulo4() {
		return modulo4;
	}
	
	public void setModulo1(String modulo) {
		modulo1 = modulo;
	}
	
	public void setModulo2(String modulo) {
		modulo2 = modulo;
	}
	
	public void setModulo3(String modulo) {
		modulo3 = modulo;
	}
	
	public void setModulo4(String modulo) {
		modulo4 = modulo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", ademas es profesor e imparte: " + modulo1 + ", " + modulo2 + ", " + modulo3 + " y " + modulo4;
	}
}
