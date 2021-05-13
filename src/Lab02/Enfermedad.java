package Lab02;


public class Enfermedad {
	String codEnfer;
	private String nombEnfer;
	private String sintomas;
	private String medicacion;
	
	public Enfermedad() {
	}
	
	// SETTERS
	public void setCodEnfer(String codEnfer) {
		this.codEnfer = codEnfer;
	}
	public void setNombEnfer(String nombEnfer) {
		this.nombEnfer = nombEnfer;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}
	
	// GETTERS
	public String getCodEnfer() {
		return codEnfer;
	}
	public String getNombEnfer() {
		return nombEnfer;
	}
	public String getSintomas() {
		return sintomas;
	}
	public String getMedicacion() {
		return medicacion;
	}
	public String toString() {
		return codEnfer + "    ,    " + nombEnfer + ", "+sintomas+","+medicacion;
	}

}