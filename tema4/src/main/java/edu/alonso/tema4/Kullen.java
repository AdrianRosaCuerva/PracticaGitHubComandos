package edu.alonso.tema4;

public class Kullen {
	
	private int numCalcetin;
	private String marcaCalcetin;
	private int tallaCalcetin;
	
	
	public Kullen(int numCalcetin, String marcaCalcetin, int tallaCalcetin) {
		this.numCalcetin = numCalcetin;
		this.marcaCalcetin = marcaCalcetin;
		this.tallaCalcetin = tallaCalcetin;
	}


	public int getNumCalcetin() {
		return numCalcetin;
	}


	public void setNumCalcetin(int numCalcetin) {
		this.numCalcetin = numCalcetin;
	}


	public String getMarcaCalcetin() {
		return marcaCalcetin;
	}


	public void setMarcaCalcetin(String marcaCalcetin) {
		this.marcaCalcetin = marcaCalcetin;
	}


	public int getTallaCalcetin() {
		return tallaCalcetin;
	}


	public void setTallaCalcetin(int tallaCalcetin) {
		this.tallaCalcetin = tallaCalcetin;
	}


	@Override
	public String toString() {
		return "Calcetín " + numCalcetin + "= Marca: " + marcaCalcetin + ", Talla: "
				+ tallaCalcetin;
	}
	
	

}
