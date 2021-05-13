package Lab02;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Paciente {
	String dni;
	String dnib;
	String nombres;
	String apellidos;
	LocalDate fechNac;
	String nroCel;
	String nroCelFam;	
	int edad;
		
	//Scanner scan=new Scanner(System.in);
	

	/*public Paciente(String string, String string2, String string3, LocalDate localDate, String string4, String string5) {
	
	}*/


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


	public int getEdad() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate hoy = LocalDate.now();
		Period periodo=Period.between(fechNac, hoy);
        edad = periodo.getYears();
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	/*public int buscarPaciente(String dni) {
		
		return index;
		
	}*/
	
	

}