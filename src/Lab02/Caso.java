package Lab02;
public class Caso {
	String observacion;
	String datos;

	
	public Caso(String datos, String observacion) {
		super();
		this.datos = datos;
		this.observacion = observacion;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String toString() {
		return "Caso\n [datos=" + datos + "\nobservacion=" + observacion + "]";
	}
	
	

}