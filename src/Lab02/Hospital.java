package Lab02;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Hospital {
	

	public static void main(String[] args) {
		
		short nroMenu1, nroMenu2;
		
		
		Scanner scan=new Scanner (System.in);
	
		ArrayList<Paciente> pacientes=new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	
		
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
					
						case 1:
							
							do {
							System.out.println("** CREAR NUEVO PACIENTE **");
							
							pacientes.add(new Paciente());
							
							System.out.println("NOMBRES: ");
							pacientes.get(Paciente.codigo).setNombres(scan.nextLine());
							
							System.out.println("APELLIDOS: ");
							pacientes.get(Paciente.codigo).setApellidos(scan.nextLine());
							
							System.out.println("DNI: ");
							pacientes.get(Paciente.codigo).setDni(scan.nextLine());
							
								//System.out.println("FECHA DE NACIMIENTO: ");
								//pacientes.get(Paciente.contador).setFechNac(scan.next());
							
							System.out.println("CELULAR: ");
							pacientes.get(Paciente.codigo).setNombres(scan.nextLine());
							
							System.out.println("CELULAR DE ALGUN FAMILIAR: ");
							pacientes.get(Paciente.codigo).setNombres(scan.nextLine());
							
							System.out.println("EDAD: ");
							pacientes.get(Paciente.codigo).setNombres(scan.nextLine());
							
							pacientes.get(Paciente.codigo).setCodigoPaciente(Paciente.codigo);
							System.out.println("¿Desea ingresar otro paciente? Si/No");
							}
							while(scan.nextLine().equalsIgnoreCase("si"));
							Hospital.main(null);
							break;
							
						case 2:
							
							System.out.println("** LISTA DE PACIENTES **");
							System.out.println("DNI          Nombres y Apellidos     FechNacimiento  Edad  NroCelular    NroCelFamiliar    Codigo");
						       
							   for(int i=0;i<pacientes.size();i++) {
									System.out.println(pacientes.get(i));
							   }
							 
							   break;
						case 3:
							System.out.println("** ACTUALIZAR PACIENTE **");
							
							do {
								System.out.println("Ingrese el codigo del paciente ha actualizar");
								int j = 0;
								while(j < pacientes.size()) {
									if(pacientes.get(j).getCodigoPaciente() == scan.nextInt() ) {
									
										System.out.println("NOMBRES: ");
										pacientes.get(j).setNombres(scan.nextLine());
									
										System.out.println("APELLIDOS: ");
										pacientes.get(j).setApellidos(scan.nextLine());
									
										System.out.println("DNI: ");
										pacientes.get(j).setDni(scan.nextLine());
									
											//System.out.println("FECHA DE NACIMIENTO: ");
											//pacientes.get(Paciente.contador).setFechNac(scan.next());
									
										System.out.println("CELULAR: ");
										pacientes.get(j).setNombres(scan.nextLine());
									
										System.out.println("CELULAR DE ALGUN FAMILIAR: ");
										pacientes.get(j).setNombres(scan.nextLine());
									
										System.out.println("EDAD: ");
										pacientes.get(j).setNombres(scan.nextLine());
									
									
										break;
								
										}
								
									}
								
								System.out.println("¿Desea actualizar otro paciente? Si/No");
							
							
							} 	while(scan.nextLine().equalsIgnoreCase("si"));
							
							Hospital.main(null);
							break;
						case 4:
							System.out.println("** ELIMINAR PACIENTE **");
							do {
							System.out.println("Ingrese el codigo del paciente a eliminar: ");
							
							int i = 0;
							while(i < pacientes.size()) {
								if(pacientes.get(i).getCodigoPaciente() == scan.nextInt() ) {
									pacientes.remove(i);
									System.out.println("Paciente removido con exito");
									break;
								} 
									
								if(i == pacientes.size()-1) 
									System.out.println("No se encontro el paciente");
									
								i++;
								
							}
							System.out.println("¿Desea eliminar otro paciente? Si/No");
							}  while(scan.nextLine().equalsIgnoreCase("si"));
							
							Hospital.main(null);
							break;
						
						case 0:
							Hospital.main (null);break;
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
