package Ejercicio3;

public class ProfesorTitular extends Profesor{
	
	private String fechaAprobado;
	
	ProfesorTitular(String nombre, String modulo1, String modulo2, String modulo3, String modulo4, String fechaAprobado) {
		super(nombre, modulo1, modulo2, modulo3, modulo4);
		this.fechaAprobado = fechaAprobado;
	}
	
	ProfesorTitular(String nombre, int edad, char sexo, String modulo1, String modulo2, String modulo3, String modulo4, String fechaAprobado) {
		super(nombre, edad, sexo, modulo1, modulo2, modulo3, modulo4);
		this.fechaAprobado = fechaAprobado;
	}
	
	ProfesorTitular(String nombre, int edad, char sexo, double altura, double peso, String modulo1, String modulo2, String modulo3, String modulo4, String fechaAprobado) {
		super(nombre, edad, sexo, altura, peso, modulo1, modulo2, modulo3, modulo4);
		this.fechaAprobado = fechaAprobado;
	}
	
	public String getFechaAprobado() {
		return fechaAprobado;
	}
	
	public void setFechaAprobado(String fechaAprobado) {
		this.fechaAprobado = fechaAprobado;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Sexo: " + getSexo() + ", Peso: " + getPeso()
				+ ", Altura: " + getAltura() + ", Mayor de edad: " + esMayorDeEdad() + ", DNI: " + getDNI()
				+ ", Modulos: " + getModulo1() + ", " + getModulo2() + ", " + getModulo3()+", "+getModulo4() +", Fecha de aprobado: "+ fechaAprobado;
	}


}
