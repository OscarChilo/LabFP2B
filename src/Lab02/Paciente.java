package Lab02;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Paciente {
	String dni;
	String nombres;
	String apellidos;
	LocalDate fechNac;
	String nroCel;
	String nroCelFam;	
	Period edad;
	//Scanner scan=new Scanner(System.in);
	

	public Paciente() {
	
	}


	public String getDni() {
		//dni=scan.nextLine();
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
	
	

}
