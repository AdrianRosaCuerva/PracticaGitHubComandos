package empresa;

public class Desarrollador extends Empleado {

	private boolean sabeJava;
	private boolean sabeJavaScript;
	private boolean sabeNet;

	Desarrollador(String nombre, String dni, int edad, double sueldo, boolean sabeJava, boolean sabeJavaScript,
			boolean sabeNet) {
		super(nombre, dni, edad, sueldo);
		this.sabeJava = sabeJava;
		this.sabeJavaScript = sabeJavaScript;
		this.sabeNet = sabeNet;
	}

	public String getJava() {
		String Java = "";
		if (sabeJava == true) {
			Java = "Java\n";
		}
		return Java;
	}

	public void setJava(boolean sabeJava) {
		this.sabeJava = sabeJava;
	}

	public String getJavaScript() {
		String JavaScript = "";
		if (sabeJavaScript == true) {
			JavaScript = "JavaScript\n";
		}
		return JavaScript;
	}

	public void setJavaScript(boolean sabeJavaScript) {
		this.sabeJavaScript = sabeJavaScript;
	}

	public String getNet() {
		String Net = "";
		if (sabeNet == true) {
			Net = ".Net\n";
		}
		return Net;
	}

	public void setNet(boolean sabeNet) {
		this.sabeNet = sabeNet;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + "\nDNI: " + getDNI() + "\nEdad: " + getEdad() + "\nSueldo: " + getSueldo()
				+ "\nConocimientos:\n" + getJava() + getJavaScript() + getNet();
	}

}
