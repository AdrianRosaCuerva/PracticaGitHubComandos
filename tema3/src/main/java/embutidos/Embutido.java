package embutidos;

public class Embutido {
	
	private String procedencia;
	private String empresa;
	private int mes;
	
	public Embutido(String procedencia, String empresa) {
		this.procedencia = procedencia;
		this.empresa = empresa;
	} 
	
	public Embutido(String procedencia, String empresa, int mes) {
		this(procedencia, empresa);
		this.mes = mes ;
	} 
	
	public String getProcedencia() {
		return procedencia;
	}
	
	public void setProcedencia (String procedencia) {
		this.procedencia = procedencia;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa (String empresa) {
		this.empresa = empresa;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes (int mes) {
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		String datos = ("Procedencia: "+ procedencia +", Empresa: "+ empresa +", Mes de producción: "+ mes);
		return datos;
	}


}
