package Lab02;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
//import java.Date.*;

public class Hospital {
	//private static String dni;

	//public short nroMenu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short nroMenu1, nroMenu2;
		//String edad;
		
		Scanner scan=new Scanner (System.in);
		//Paciente[]arr=new Paciente;
		ArrayList<Paciente> pacientes=new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate fechaNacimiento = LocalDate.parse(, formato);
		//Period edad = Period.between(fechaNacimiento, LocalDate.now());
		Paciente pa01=new Paciente("73770864", "Carlos Jesus","Vega Loa",LocalDate.parse("26/09/1995",formato),"956412324","954215562");
		Paciente pa02=new Paciente("73759744", "Maria","Rodriguez Garcia",LocalDate.parse("17/09/2000",formato),"952487555","965221485");
		pacientes.add(pa01);
		pacientes.add(pa02);
		
		System.out.println("** MENÚ **\r\n" +  
				"1. PACIENTES\r\n" + 
				"2. ENFERMEDADES\r\n" + 
				"3. CASOS\r\n" + 
				"4. SALIR");
		nroMenu1=scan.nextShort();
		switch(nroMenu1){
		
			case 1:
					System.out.println("** PACIENTES **\r\n" + 
					"1. Crear un paciente\r\n" + 
					"2. Ver pacientes\r\n" + 
					"3. Actualizar datos de un paciente\r\n" + 
					"4. Eliminar un paciente\r\n" + 
					"5. Regresar menu principal:0");
			
					nroMenu2=scan.nextShort();
					
					switch(nroMenu2){
						case 1:System.out.println("** CREAR NUEVO PACIENTE **");
						 //cientes.add(new ArrayList<Paciente>());
					      do {
					    	   System.out.println("Nuevo paciente");						    	   
					    	   System.out.println("Ingresar DNI: ");
					    	   String deni=scan.nextLine();
					    	   String den2=scan.nextLine();
					    	   System.out.println("Ingresar Nombres: ");
					    	   String nombres=scan.nextLine();
					    	   System.out.println("Ingresar Apellidos: ");
					    	   String apellidos=scan.nextLine();
					    	   System.out.println("Ingresar FechNacimiento ##/##/####: ");
					    	   String fecNac=scan.nextLine();
					    	   System.out.println("Ingresar NroCelular Personal: ");
					    	   String nroCel=scan.nextLine();
					    	   System.out.println("Ingresar NroCelular Familiar: ");
					    	   String nroCelFam=scan.nextLine();
						    	   for(int i=pacientes.size()+1;i<+1;i++) {
						    		  pacientes.add(new Paciente(den2,null,null,null,null, null));
						    	   }
						    	   nroMenu2=scan.nextShort();
						         
						       
						       //for(int i=0;i<arr.length;i++) {
					               }while(nroMenu2!=0);
					               Hospital.main (null);
						break;
						case 2:System.out.println("** LISTA DE PACIENTES **");
						System.out.println("DNI          Nombres y Apellidos     FechNacimiento  Edad  NroCelular    NroCelFamiliar");
						       do {
							   for(int i=0;i<pacientes.size();i++) {
									System.out.println(pacientes.get(i).getDni()+"    "+pacientes.get(i).getNombres()+" "+
								    pacientes.get(i).getApellidos()+"   "+pacientes.get(i).getFechNac()+"   "+
									Period.between(pacientes.get(i).getFechNac(), LocalDate.now()).getYears()+"   "+
								    pacientes.get(i).getNroCel()+"   "+pacientes.get(i).nroCelFam);
							   }
							   nroMenu2=scan.nextShort();
						       }while(nroMenu2!=0);
						       Hospital.main (null);
						break;
						case 3:System.out.println("** ACTUALIZAR PACIENTE **");break;
						case 4:System.out.println("** ELIMINAR PACIENTE **");break;
						case 0:Hospital.main (null);break;
					}
		
					break;
			case 2:
					System.out.println("** ENFERMEDADES **\r\n" +
			        "1. Registrar enfermedad\r\n" + 
					"2. Ver enfermeddades\r\n" + 
					"3. Actualizar datos de una enfermedad\r\n" + 
					"4. Eliminar una enfermedad\r\n" + 
					"5. Regresar menu principal:0");
					nroMenu2=scan.nextShort();
					
						switch(nroMenu2){
							case 1:System.out.println("** REGISTRAR ENFERMEDAD **");break;
							case 2:System.out.println("** LISTA DE ENFERMEDAD **");break;
							case 3:System.out.println("** ACTUALIZAR DATOS DE UNA ENFERMEDAD **");break;
							case 4:System.out.println("** ELIMINAR ENFERMEDAD **");break;
							case 0:Hospital.main (null);break;
				        }
						
					break;
			case 3:
					System.out.println("** CASOS **\r\n" + 
					"1. Registrar un caso\r\n" + 
					"2. Ver casoa\r\n" + 
					"3. Actualizar un caso\r\n" + 
					"4. Eliminar un caso\r\n" + 
					"5. Regresar menu principal:0");
					nroMenu2=scan.nextShort();
					
					switch(nroMenu2){
						case 1:System.out.println("** REGISTRAR UN CASO **");break;
						case 2:System.out.println("** LISTA DE CASOS **");break;
						case 3:System.out.println("** ACTUALIZAR DATOS DE UN CASO **");break;
						case 4:System.out.println("** ELIMINAR UN CASO **");break;
						case 0:Hospital.main (null);break;
			        }
		
			case 4:
					System.out.println("** REPORTE FINAL **");
					break;
					
			 default:System.out.println("ingrese correctamente la opcion");
					break;
			
		}

	}

}
