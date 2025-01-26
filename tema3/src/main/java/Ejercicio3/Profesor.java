package Ejercicio3;

public class Profesor extends Persona{
	
	private String modulo1;
	private String modulo2;
	private String modulo3;
	private String modulo4;
	
	Profesor(String nombre, String modulo1, String modulo2, String modulo3, String modulo4) {
		super(nombre);
		this.modulo1 = modulo1;
		this.modulo2 = modulo2; 
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
	}
	
	Profesor(String nombre, int edad, char sexo, String modulo1, String modulo2, String modulo3, String modulo4) {
		super(nombre, edad, sexo);
		this.modulo1 = modulo1;
		this.modulo2 = modulo2; 
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
	}
	
	Profesor(String nombre, int edad, char sexo, double altura, double peso, String modulo1, String modulo2, String modulo3, String modulo4) {
		super(nombre, edad, sexo, altura, peso);
		this.modulo1 = modulo1;
		this.modulo2 = modulo2; 
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
	}
	
	public String getModulo1() {
		return modulo1;
	}
	
	public void setModulo1(String modulo1) {
		this.modulo1 = modulo1;
	}
	
	public String getModulo2() {
		return modulo2;
	}
	
	public void setModulo2(String modulo2) {
		this.modulo2 = modulo2;
	}
	
	public String getModulo3() {
		return modulo3;
	}
	
	public void setModulo3 (String modulo3) {
		this.modulo3 = modulo3;
	}
	
	public String getModulo4() {
		return modulo4;
	}
	
	public void setModulo4(String modulo4) {
		this.modulo4 = modulo4;
	}

}
