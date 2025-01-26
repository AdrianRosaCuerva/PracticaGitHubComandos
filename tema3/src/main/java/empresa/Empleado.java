package empresa;

public class Empleado {
	
	private String nombre;
	private String dni;
	private int edad;
	protected double sueldo;
	
	Empleado(String nombre, String dni, int edad, double sueldo){
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
