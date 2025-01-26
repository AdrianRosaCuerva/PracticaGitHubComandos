package Ejercicio3;

public class ProfesorInterino extends Profesor {

	private String fechaInicio;

	ProfesorInterino(String nombre, String modulo1, String modulo2, String modulo3, String modulo4,
			String fechaInicio) {
		super(nombre, modulo1, modulo2, modulo3, modulo4);
		this.fechaInicio = fechaInicio;
	}

	ProfesorInterino(String nombre, int edad, char sexo, String modulo1, String modulo2, String modulo3, String modulo4,
			String fechaInicio) {
		super(nombre, edad, sexo, modulo1, modulo2, modulo3, modulo4);
		this.fechaInicio = fechaInicio;
	}

	ProfesorInterino(String nombre, int edad, char sexo, double altura, double peso, String modulo1, String modulo2,
			String modulo3, String modulo4, String fechaInicio) {
		super(nombre, edad, sexo, altura, peso, modulo1, modulo2, modulo3, modulo4);
		this.fechaInicio = fechaInicio;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Sexo: " + getSexo() + ", Peso: " + getPeso()
				+ ", Altura: " + getAltura() + ", Mayor de edad: " + esMayorDeEdad() + ", DNI: " + getDNI()
				+ ", Modulos: " + getModulo1() + ", " + getModulo2() + ", " + getModulo3()+", "+getModulo4()+", Fecha de inicio: "+fechaInicio;
	}

}
