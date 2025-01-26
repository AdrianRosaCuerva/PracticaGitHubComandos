package Cajonera;

public class Calcetines {
	
	private String color;
	private int talla;
	private String marca;
	
	public Calcetines(String color, int talla, String marca) {
		this.color = color;
		this.talla = talla;
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Calcetines de talla "+ talla +", de marca "+ marca +" y de color "+ color;
	}
}
