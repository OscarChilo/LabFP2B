package Lab02;
import java.util.*;

public class Hospital {
	//public short nroMenu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short nroMenu1, nroMenu2;
		
		Scanner scan=new Scanner (System.in);
		
		
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
						case 1:System.out.println("** CREAR NUEVO PACIENTE **");break;
						case 2:System.out.println("** LISTA DE PACIENTES **");break;
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
					break;
			case 3:
					System.out.println("** CASOS **\r\n" + 
							"1. Registrar un caso\r\n" + 
							"2. Ver casoa\r\n" + 
							"3. Actualizar un caso\r\n" + 
							"4. Eliminar un caso\r\n" + 
							"5. Regresar menu principal:0");
					nroMenu2=scan.nextShort();
		
			case 4:
					System.out.println("** REPORTE FINAL **");
					break;
					
			default:System.out.println("ingrese correctamente la opcion");
					break;
			
		}

	}

}
