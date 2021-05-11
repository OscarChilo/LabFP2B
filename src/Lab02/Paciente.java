package Lab02;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Paciente {
	private String dni;
	private String nombres;
	private String apellidos;
	private LocalDate fechNac;
	private String nroCel;
	private String nroCelFam;	
	private Period edad;
	private int codigoPaciente;
	public static int codigo = 0;
	

	public Paciente() {
		Paciente.codigo++;
	}


	public String getDni() {
		
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate getFechNac() {
		return fechNac;
	}
	
	public void setFechNac(LocalDate fechNac) {
		this.fechNac = fechNac;
	}
	
	public String getNroCel() {
		return nroCel;
	}
	
	public void setNroCel(String nroCel) {
		this.nroCel = nroCel;
	}
	
	public String getNroCelFam() {
		return nroCelFam;
	}
	
	public void setNroCelFam(String nroCelFam) {
		this.nroCelFam = nroCelFam;
	}


	public Period getEdad() {
		edad = Period.between(fechNac, LocalDate.now());
		return edad;
	}


	public void setEdad(Period edad) {
		this.edad = edad;
	}
	
	

	public int getCodigoPaciente() {
		return codigoPaciente;
	}


	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}


	@Override
	public String toString() {
		return this.getDni()+"    "+this.getNombres()+" "+
			    this.getApellidos()+"   "+this.getFechNac()+"   "+
				Period.between(this.getFechNac(), LocalDate.now()).getYears()+"   "+
			    this.getNroCel()+"   "+this.getNroCelFam()+"   "+Paciente.codigo;
	}
	
	

}
