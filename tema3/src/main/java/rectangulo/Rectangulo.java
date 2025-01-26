package rectangulo;

public class Rectangulo {

	private int ancho;
	private int largo;
	
	private final int ANCHO_DEF = 3;
	private final int LARGO_DEF = 10;

	public Rectangulo() {
		ancho = ANCHO_DEF;
		largo = LARGO_DEF;
	}

	public Rectangulo(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho < 1) {
			this.ancho = ANCHO_DEF;
		} else {
			this.ancho = ancho;
		}
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		if (largo < 1) {
			this.largo = LARGO_DEF;
		} else {
			this.largo = largo;
		}
	}

	private int calculaArea() {
		int area = largo * ancho;
		return area;
	}

	private int calculaPerimetro() {
		int perimetro = (2 * largo) + (2 * ancho);
		return perimetro;
	}

	private String verticalHorizontal() {
		String vertHor;

		if (ancho > largo) {
			vertHor = "Horizontal";
		} else if (largo > ancho) {
			vertHor = "Vertical";
		} else {
			vertHor = "Es un cuadrado";
		}

		return vertHor;
	}
	
	/*private String dibujarRectangulo() {
		String dibujo = "";
		
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				 dibujo = dibujo + "*";
			}
			
			dibujo = dibujo +"\n";
		}
		
		return dibujo;
	}
	*/
	
	public void dibujarRectangulo() {
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				 System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	@Override
	public String toString() {
		return "Largo: "+ largo +"\nAncho: "+ ancho +"\nArea: "+ calculaArea() +"\nPerimetro: "+ calculaPerimetro() +"\nOrientacion: "+
	verticalHorizontal();
	}

}
