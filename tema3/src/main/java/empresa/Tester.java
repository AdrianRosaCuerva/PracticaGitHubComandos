package empresa;

public class Tester extends Empleado{
	
	private int proyectos;
	
	Tester(String nombre, String dni, int edad, double sueldo, int proyectos){
		super(nombre, dni, edad, sueldo);
		this.proyectos = proyectos;
	}
	
	public int getProyectos() {
		return proyectos;
	}
	
	public void setProyectos(int proyectos) {
		this.proyectos = proyectos;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + "\nDNI: " + getDNI() + "\nEdad: " + getEdad() + "\nSueldo: " + getSueldo()
				+ "\nNumero de proyectos: " + proyectos;
	}

}
