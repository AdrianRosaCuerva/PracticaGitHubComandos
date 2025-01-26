package empresa;

public class Directivo extends Empleado {

	private int bonus;

	Directivo(String nombre, String dni, int edad, double sueldo, int bonus) {
		super(nombre, dni, edad, sueldo);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + "\nDNI: " + getDNI() + "\nEdad: " + getEdad() + "\nSueldo: " + getSueldo()
				+ "\nBouns de sueldo: " + bonus;
	}
}
