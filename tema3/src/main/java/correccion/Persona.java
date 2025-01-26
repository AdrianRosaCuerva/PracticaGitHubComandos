package correccion;

import java.util.Random;

public class Persona {
	protected String nombre;
	protected String dni;
	protected int edad;
	protected char sexo;
	protected double peso;
	protected double altura;
	
	private final int PESO_IDEAL = -1;
	private final int PESO_NORMAL = 0;
	private final int SOBREPESO = 1;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.dni = generaDNI();
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI();
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.dni = generaDNI();
	}
	
	public int calcularIMC() {
		double resultado = peso/(altura*altura);
		int respuesta = 0;
		
		if (resultado<20) {
			respuesta = PESO_IDEAL;
		} else if (resultado>=20 && resultado<=25) {
			respuesta = PESO_NORMAL;
		} else if (resultado>25) {
			respuesta = SOBREPESO;
		}
		
		return respuesta;
	}
	
	public boolean esMayorDeEdad() {
		boolean respuesta = false;
		if (edad>=18) {
			respuesta = true;
		}
		return respuesta;
	}
	
	private char comprobarSexo(char sexo) {
		char respuesta = 'H';
		switch(sexo) {
			case 'H':
				respuesta = 'H';
				break;
			case 'M':
				respuesta = 'M';
				break;
			case 'h':
				respuesta = 'H';
				break;
			case 'm':
				respuesta = 'M';
				break;
		}
		return respuesta;
	}
	
	private String generaDNI() {
		String modeloDni = "";
		Random r = new Random();
		int numero = r.nextInt(99999999)+1;
		if (numero < 10) {
			modeloDni+= "0000000" + numero;
		} else if (numero < 100) {
			modeloDni+= "000000" + numero;
		} else if (numero < 1000) {
			modeloDni+= "00000" + numero;
		} else if (numero < 10000) {
			modeloDni+= "0000" + numero;
		} else if (numero < 100000) {
			modeloDni+= "000" + numero;
		} else if (numero < 1000000) {
			modeloDni+= "00" + numero;
		} else if (numero < 10000000) {
			modeloDni+= "0" + numero;
		} else {
			modeloDni+=numero;
		}
		int comprobante = numero%23;
		switch(comprobante) {
			case 0:
				modeloDni+="T";
				break;
			case 1:
				modeloDni+="R";
				break;
			case 2:
				modeloDni+="W";
				break;
			case 3:
				modeloDni+="A";
				break;
			case 4:
				modeloDni+="G";
				break;
			case 5:
				modeloDni+="M";
				break;
			case 6:
				modeloDni+="Y";
				break;
			case 7:
				modeloDni+="F";
				break;
			case 8:
				modeloDni+="P";
				break;
			case 9:
				modeloDni+="D";
				break;
			case 10:
				modeloDni+="X";
				break;
			case 11:
				modeloDni+="B";
				break;
			case 12:
				modeloDni+="N";
				break;
			case 13:
				modeloDni+="J";
				break;
			case 14:
				modeloDni+="Z";
				break;
			case 15:
				modeloDni+="S";
				break;
			case 16:
				modeloDni+="Q";
				break;
			case 17:
				modeloDni+="V";
				break;
			case 18:
				modeloDni+="H";
				break;
			case 19:
				modeloDni+="L";
				break;
			case 20:
				modeloDni+="C";
				break;
			case 21:
				modeloDni+="K";
				break;
			case 22:
				modeloDni+="E";
				break;
		}
		return modeloDni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Los atributos de la persona son: DNI: " + dni + ", Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Peso: " + peso + ", Altura: " + altura;
	}
}
