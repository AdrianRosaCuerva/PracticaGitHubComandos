package edu.alonso.tema3;

public class ProfesorDefinitivo extends Profesor{
	
	public ProfesorDefinitivo(String nombre, int edad, String ciudad) {
		super(nombre, edad);
		this.ciudad = ciudad;
	}
	
	public ProfesorDefinitivo(String nombre, int edad, String asignatura, String ciudad) {
		super(nombre, edad, asignatura);
		this.ciudad = ciudad;
	}
	
	public ProfesorDefinitivo(String nombre, int edad, String asignatura, String ciudad, int aniosPlaza) {
		super(nombre, edad, asignatura);
		this.ciudad = ciudad;
		this.aniosPlaza = aniosPlaza;
	}
	
	private String ciudad;
	public int aniosPlaza;
	
	public int SUELDO_BASE = 20000;
	
	public String getCiudad(){
		return ciudad;
	}
	
	public int getAnios(){
		return aniosPlaza;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setProvincia(int aniosPlaza) {
		this.aniosPlaza = aniosPlaza;
	}
	
	@Override
	public String toString() {
		String definitivo = ("Nombre: "+ super.nombre +", Edad: "+ super.edad +", Asignatura: "+ super.asignatura+", Ciudad: "+ ciudad +", Duración de la plaza: "+ aniosPlaza);
		return definitivo;
	}

}
