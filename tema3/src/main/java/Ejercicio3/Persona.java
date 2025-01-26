package Ejercicio3;

import java.util.Random;

public class Persona {

	private final int IMC_MENOS = -1;
	private final int IMC_BIEN = 0;
	private final int IMC_MAS = 1;

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	Persona(String nombre) {
		this.nombre = nombre;
		this.dni = generaDNI();
	}

	Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI();
	}

	Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.dni = generaDNI();
	}

	public int calcularIMC() {
		double imc = peso / (altura * altura);
		int mensaje;
		if (imc < 20) {
			mensaje = IMC_MENOS;
		} else if (imc > 25) {
			mensaje = IMC_MAS;
		} else {
			mensaje = IMC_BIEN;
		}

		return mensaje;
	}

	public boolean esMayorDeEdad() {

		boolean mayorEdad = true;

		if (edad < 18) {
			mayorEdad = false;
		}

		return mayorEdad;
	}

	public char comprobarSexo(char sexo) {

		char comprobacion = 'M';

		if (sexo == 'f' || sexo == 'F') {
			comprobacion = 'F';
		}

		return comprobacion;
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

	/*public String generaDNI() {
		Random rng = new Random(10);

		int numero = rng.nextInt();
		int digito;

		for (int i = 0; i < 8; i++) {
			digito = rng.nextInt();
			numero = numero + digito;
		}

		int resto = numero % 23;

		float num_dni = numero + letraDNI.charAt(resto);

		dni = String.valueOf(num_dni);

		return dni;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + comprobarSexo(sexo) + ", Peso: " + peso
				+ ", Altura: " + altura + ", Mayor de edad: " + esMayorDeEdad() + ", DNI: "+ dni;
	}
}
