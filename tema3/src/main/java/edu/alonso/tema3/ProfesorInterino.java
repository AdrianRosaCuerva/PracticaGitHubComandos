package edu.alonso.tema3;

public class ProfesorInterino extends Profesor{
	
	public ProfesorInterino(String nombre, int edad, String provinciaEleccion) {
		super(nombre, edad);
		this.provinciaEleccion = provinciaEleccion;
	}
	
	public ProfesorInterino(String nombre, int edad, String asignatura, String provinciaEleccion) {
		super(nombre, edad, asignatura);
		this.provinciaEleccion = provinciaEleccion;
	}
	
	private String centroActual;
	private String provinciaEleccion;
	
	public int SUELDO_BASE = 18000;

	public String getCentro(){
		return centroActual;
	}
	
	public String getProvincia(){
		return provinciaEleccion;
	}
	
	public void setCentro(String centroActual) {
		this.centroActual = centroActual;
	}
	
	public void setProvincia(String provinciaEleccion) {
		this.provinciaEleccion = provinciaEleccion;
	}
	
	@Override
	public String toString() {
		String interino = ("Nombre: "+ super.nombre +", Edad: "+ super.edad +", Asignatura: "+ super.asignatura+", Centro actual: "+ centroActual +", Provincia de elección: "+ provinciaEleccion);
		return interino;
	}
}
