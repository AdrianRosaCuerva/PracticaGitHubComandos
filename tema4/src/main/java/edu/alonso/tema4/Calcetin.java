package edu.alonso.tema4;

public class Calcetin {
	
	private String marca;
	private int talla;
	
	public Calcetin(String marca, int talla) {
		this.marca = marca;
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Calcetin [marca= " + marca + ", talla= " + talla + "]";
	}
	
	
	
	

}
