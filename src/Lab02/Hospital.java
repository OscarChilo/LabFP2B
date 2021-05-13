package Lab02;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Hospital {
	static ArrayList<Caso> casos=new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {
		
		short nroMenu1, nroMenu2;
		String dni=null, codigoEnfermedad;
		String nombres = null;
		String apellidos=null;
		String fechNac=null;
		String nroCel=null;
		String nroCelFam=null;
		int cont=0;
		int contEnfermedad = 0;
		
		Scanner scan=new Scanner (System.in);
	
		ArrayList<Paciente> pacientes=new ArrayList<>();
		ArrayList<Enfermedad> enfermedades=new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		/*Paciente pa01=new Paciente("73770864", "Carlos Jesus","Vega Loa",LocalDate.parse("26/09/1995",formato),"956412324","954215562");
		Paciente pa02=new Paciente("73759744", "Maria","Rodriguez Garcia",LocalDate.parse("17/09/2000",formato),"952487555","965221485");*/
		//pacientes.add(pa01);
		//pacientes.add(pa02);
		Boolean bucle=true;
		do {
		System.out.println("** MENÚ **\r\n" +  
				"1. PACIENTES\r\n" + 
				"2. ENFERMEDADES\r\n" + 
				"3. CASOS\r\n" + 
				"4. SALIR");
		
		nroMenu1=scan.nextShort();
		switch(nroMenu1){
		
			case 1:
				do {
					System.out.println("** PACIENTES **\r\n" + 
					"1. Crear un paciente\r\n" + 
					"2. Ver pacientes\r\n" + 
					"3. Actualizar datos de un paciente\r\n" + 
					"4. Eliminar un paciente\r\n" + 
					"5. Regresar menu principal");
					
					nroMenu2=scan.nextShort();
					
					switch(nroMenu2){
						case 1:System.out.println("** CREAR NUEVO PACIENTE **");						
						//pacientes.add(new Paciente());
					      do {
					    	  pacientes.add(new Paciente());
					    	  //for(int i=0;i<cont+1;i++) {
					    	  System.out.print("Ingrese DNI: ");
					    	  String nombre2=scan.nextLine();
					    	  pacientes.get(cont).setDni(scan.nextLine());
					    	  System.out.print("Ingrese Nombres: ");
					    	  pacientes.get(cont).setNombres(scan.nextLine());
					    	  System.out.print("Ingrese Apellidos: ");
					    	  pacientes.get(cont).setApellidos(scan.nextLine());
					    	  System.out.print("Ingrese FechNacimiento año####/mes##/dia##: ");
					    	  pacientes.get(cont).setFechNac(LocalDate.parse(scan.next(),formato));
					    	  System.out.print("Ingrese NroCelular: ");
					    	  pacientes.get(cont).setNroCel(scan.nextLine());
					    	  String nroCel2=scan.nextLine();
					    	  System.out.print("Ingrese NroCelularFamliar: ");
					    	  pacientes.get(cont).setNroCelFam(scan.nextLine());
					    	  System.out.println("Seguir agregando pacientes? SI(cualquier numero)/NO(ingreae 0)");
						      nroMenu2 = scan.nextShort(); 
						      cont++;
						       
					              }while(nroMenu2!=0);
					               //Hospital.main (null);
						break;
						case 2:System.out.println("** LISTA DE PACIENTES **");
						System.out.println("DNI          Nombres y Apellidos     FechNacimiento  Edad  NroCelular    NroCelFamiliar");
						       do {
							   for(int i=0;i<pacientes.size()-1;i++) {
									System.out.println(pacientes.get(i).getDni()+"    "+pacientes.get(i).getNombres()+" "+
								    pacientes.get(i).getApellidos()+"   "+pacientes.get(i).getFechNac()+"   "+
									//(int)Period.between(pacientes.get(i).getFechNac(), LocalDate.now()).getYears()
									pacientes.get(i).getEdad()+"   "+
								    pacientes.get(i).getNroCel()+"   "+pacientes.get(i).getNroCelFam());
							   }
							   System.out.println("Para regresar a Menu(ingreae 0)");
							   nroMenu2=scan.nextShort();
						       }while(nroMenu2!=0);
						       //Hospital.main (null);
						break;
						case 3:System.out.println("** ACTUALIZAR PACIENTE **");
								do {
									System.out.print("Ingrese DNI: ");
									String dni3=scan.nextLine();
									String dni2=scan.nextLine();
									int index=0;
									int nroLista=pacientes.size();
									for(int pacientId=0;pacientId<nroLista;pacientId++) {
										if(pacientes.get(pacientId).dni.equals(dni2)) {
											index=pacientId;
											break;
										}
									}
									//System.out.println("Hola "+pacientes.get(index).getNombres() );
									System.out.print("Ingrese Nombres: ");
							    	  pacientes.get(index).setNombres(scan.nextLine());
							    	  System.out.print("Ingrese Apellidos: ");
							    	  pacientes.get(index).setApellidos(scan.nextLine());
							    	  System.out.print("Ingrese FechNacimiento año####/mes##/dia##: ");
							    	  pacientes.get(index).setFechNac(LocalDate.parse(scan.next(),formato));
							    	  System.out.print("Ingrese NroCelular: ");							    	  
							    	  String nroCel2=scan.nextLine();
							    	  pacientes.get(index).setNroCel(scan.nextLine());
							    	  System.out.print("Ingrese NroCelularFamliar: ");
							    	  pacientes.get(index).setNroCelFam(scan.nextLine());
							    	  System.out.println("Seguir actualizando? SI(cualquier numero)/NO(ingreae 0)");
							    	  nroMenu2=scan.nextShort();
								}while(nroMenu2!=0);
						for(int i=1;i<pacientes.size();i++) {
						System.out.println(pacientes.get(i-1).getDni());
						}
						break;
						case 4:System.out.println("** ELIMINAR PACIENTE **");
						do {
							System.out.println("Ingrese el codigo del paciente a eliminar: ");
							String dni1=scan.nextLine();
							String dni2=scan.nextLine();
							int i = 0;
							while(i < pacientes.size()) {
								if(pacientes.get(i).dni.equals(dni2)) {
									pacientes.remove(i);
									System.out.println("--Paciente removido con exito--");
									break;
								} 
									
								if(i == pacientes.size()-1) 
									System.out.println("--No se encontro el paciente--");
									
								i++;
								
							}
							System.out.println("¿Desea eliminar otro paciente? Si/No");
							
							}  while(scan.nextLine().equalsIgnoreCase("si"));
						
						break;
						
					}
		}while(nroMenu2!=5);
					break;
			case 2:do {
					System.out.println("** ENFERMEDADES **\r\n" +
			        "1. Registrar enfermedad\r\n" + 
					"2. Ver enfermeddades\r\n" + 
					"3. Actualizar datos de una enfermedad\r\n" + 
					"4. Eliminar una enfermedad\r\n" + 
					"5. Regresar menu principal");
					nroMenu2=scan.nextShort();
					
						switch(nroMenu2){
							case 1:
								do {
									
									enfermedades.add(new Enfermedad());
									
									System.out.println("* REGISTRAR ENFERMEDAD *");
									
									System.out.print("CODIGO: ");
									String cod1=scan.nextLine();//control error
									enfermedades.get(contEnfermedad).setCodEnfer(scan.nextLine());
									
									System.out.print("NOMBRE DE LA ENFERMEDAD: ");
									enfermedades.get(contEnfermedad).setNombEnfer(scan.nextLine());
									
									System.out.print("SINTOMAS: ");
									//String cod2=scan.nextLine();//controlde error
									enfermedades.get(contEnfermedad).setSintomas(scan.nextLine());
									
									System.out.print("MEDICACION: ");
									enfermedades.get(contEnfermedad).setMedicacion(scan.nextLine());
								
									System.out.print("\"Seguir agregando enfermedades? SI(cualquier numero)/NO(ingreae 0)\" ");
									nroMenu2=scan.nextShort();
									contEnfermedad ++;
									}
									while(nroMenu2!=0);
									
								
							break;
							case 2:
								do {
								    System.out.println("** LISTA DE ENFERMEDAD **");
								    System.out.println("CODIGO          NOMBRE           SIMTOMAS       MEDICACION");   
									if(enfermedades.isEmpty()) {
										System.out.println("No hay enfermedades registradas.");
									} else {
										for(Enfermedad i : enfermedades) {
											System.out.println(i.getCodEnfer() + "        " + 
										                     i.getNombEnfer() + "         " + 
													         i.getSintomas() + "        " + 
										                     i.getMedicacion());
											
										}
									}
									System.out.println("Para regresar a Menu(ingreae 0)");
									nroMenu2=scan.nextShort();
								}while(nroMenu2!=0);
								break;
							case 3:
								    System.out.println("** ACTUALIZAR DATOS DE UNA ENFERMEDAD **");
								    //System.out.println("* ACTUALIZAR DATOS DE UNA ENFERMEDAD *");
									
									do {
										System.out.print("Ingrese DNI: ");
										String codErr=scan.nextLine();
										String codEnf=scan.nextLine();
										int index=0;
										int nroLista=enfermedades.size();
										
										for(int enfId=0;enfId<nroLista;enfId++) {
											if(pacientes.get(enfId).dni.equals(codEnf)) {
												index=enfId;
												break;
											}
										}
												//System.out.println("CODIGO: ");
												//enfermedades.get(index).setCodEnfer(scan.nextLine());
												
												System.out.print("NOMBRE DE LA ENFERMEDAD: ");
												enfermedades.get(index).setNombEnfer(scan.nextLine());
											
												System.out.print("SINTOMAS: ");
												enfermedades.get(index).setSintomas(scan.nextLine());
											
												System.out.print("MEDICACION: ");
												enfermedades.get(index).setMedicacion(scan.nextLine());												
										
										System.out.println("¿Desea actualizar otra enfermedad? (Si/No)");
									
									
									} 	while(scan.nextLine().equalsIgnoreCase("si"));
								    
								    break;
							case 4:
								    System.out.println("** ELIMINAR ENFERMEDAD **");
								    do {
										System.out.println("Ingrese el codigo de la enfermedad: ");
										String codErr=scan.nextLine();
										int i = 0;
										//while(i < enfermedades.size()) {
											if(enfermedades.get(i).codEnfer.equals(scan.nextLine()) ) {
												enfermedades.remove(i);
												System.out.println("Enfermedad removida con exito");
												break;
											} 
												
											if(i == enfermedades.size()-1) 
												System.out.println("No se encontro el paciente");
												
											i++;
											
										//}
										System.out.println("¿Desea eliminar otra enfermedad? (Si/No)");
										}  while(scan.nextLine().equalsIgnoreCase("si"));
								    break;
							//case 0:Hospital.main (null);break;
				        }
			}while(nroMenu2!=5);
						
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
						case 1:System.out.println("** REGISTRAR UN CASO **");
						do {
							System.out.println("Ingrese DNI del paciente");
							dni = scan.nextLine();
							for(Paciente i: pacientes) {
								if(i.getDni() == dni) {
									System.out.println("");
									System.out.println("Ingrese codigo de la enfermedad");
									codigoEnfermedad = scan.nextLine();
									for(Enfermedad j: enfermedades) {
										if(j.getCodEnfer() == codigoEnfermedad) {
											casos.add(new Caso(i.toString() +"\n" + j.toString(),"Observaciones:" + scan.nextLine()));
											System.out.println("Caso añadido con exito");
										}
									}
								} else {
									System.out.println("El código de paciente no existe");
								}
							}
							System.out.println("¿Desea añadir otro caso? (Si/No)");
						} while(scan.nextLine().equalsIgnoreCase("si"));	
						break;
						
						case 2:System.out.println("** LISTA DE CASOS **");
						for(Caso i : casos) {
							System.out.println(i.toString());
						}
						break;
						
						case 3:System.out.println("** ACTUALIZAR DATOS DE UN CASO **");
						do {
							System.out.println("Ingrese DNI del paciente");
							dni = scan.nextLine();
							for(Paciente i: pacientes) {
								if(i.getDni() == dni) {
									System.out.println("");
									System.out.println("Ingrese codigo de la enfermedad");
									codigoEnfermedad = scan.nextLine();
									for(Enfermedad j: enfermedades) {
										if(j.getCodEnfer() == codigoEnfermedad) {
											casos.add(new Caso(i.toString() +"\n" + j.toString(),"Observaciones:" + scan.nextLine()));
											System.out.println("Caso actualizado con exito");
										}
									}
								} else {
									System.out.println("El código de paciente no existe");
								}
							}
							System.out.println("¿Desea actualizar otro caso? (Si/No)");
						} while(scan.nextLine().equalsIgnoreCase("si"));
						break;
						
						case 4:System.out.println("** ELIMINAR UN CASO **");
						do {
							System.out.println("Ingrese DNI del paciente");
							dni = scan.nextLine();
							for(Paciente i: pacientes) {
								if(i.getDni() == dni) {
									System.out.println("");
									System.out.println("Ingrese codigo de la enfermedad");
									codigoEnfermedad = scan.nextLine();
									for(int j = 0; j < enfermedades.size(); j++) {
										if(enfermedades.get(j).getCodEnfer() == codigoEnfermedad) {
											casos.remove(j);
											System.out.println("Caso removido exitosamente");
										}
									}
									
								} else {
									System.out.println("El código de paciente no existe");
								}
							}
							System.out.println("¿Desea actualizar otro caso? (Si/No)");
						}while(scan.nextLine().equalsIgnoreCase("si"));
						break;
						
						case 0:
						case 5:
							Hospital.main (null)
						;break;
			        }
		
			case 4:
					System.out.println("** REPORTE FINAL **");
					producir();
					break;
					
			 default:System.out.println("ingrese correctamente la opcion");
					break;
			
		}
		

	}while(scan.nextInt()!=4);
	
	}



	public static void producir() throws FileNotFoundException {
		String salida = "txt.csv";
		PrintWriter oS = new PrintWriter(salida);
	
		for(int i=0;i<casos.size();i++){
    	
    		oS.println( casos.get(i).toString());
    	
    	}
		
	
		oS.close();

	}
}