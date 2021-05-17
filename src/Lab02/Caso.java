package Lab02;
import java.time.LocalDate;

public class Caso {
	String codCaso;
	String observacion;
	String dnic;
	String nomEnf;
	LocalDate fecha;

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getDnic() {
		return dnic;
	}

	public void setDnic(String dni) {
		this.dnic = dni;
	}

	public String getNomEnf() {
		return nomEnf;
	}

	public void setNomEnf(String nomEnf) {
		this.nomEnf = nomEnf;
	}

	public String getCodCaso() {
		return codCaso;
	}

	public void setCodCaso(String codCaso) {
		this.codCaso = codCaso;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String toString() {
		return "Caso\n [datos=" + dnic + "\nobservacion=" + observacion + "]";
	}
	
	

}