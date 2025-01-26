package banco;

public class Cliente {
	
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected int edad;
	protected String dni;
	
	public Cliente(String nombre, String apellido1, int edad, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.edad = edad;
		this.dni = dni;
	}
	
	public Cliente(String nombre, String apellido1, String apellido2, int edad, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		String auxCliente = ("Nombre: "+ nombre+", Primer Apellido: "+apellido1+", Segundo Apellido: "+ apellido2+", Edad: "+edad+", DNI: "+ dni);
		return auxCliente;
	}

}
