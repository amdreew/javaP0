/* 
 * esto es con el fin de demostrar el uso de la 
 * sobre carga de constructores en java como tema
 * de afianzamiento de POO autodidacta. 
 * 
 * */
package mpEmpleados;

import mnEmpleados.Empleados;

public class ManejoEmpleados {

	public static void main(String args []) {
		
		Empleados [] misEmpleado = new Empleados[4];
		
		misEmpleado [0] = new Empleados ("Andrew", 3000000.0, 2016, 01, 25);
		misEmpleado [1] = new Empleados ("Amdrew", 4000000.0, 2017, 07, 12);
		misEmpleado [2] = new Empleados ("Katya", 5000000.0, 2016, 10, 16);		
		misEmpleado [3] = new Empleados ("Peiper");
		/*COMO SE PUEDE OBSERVAR A QUI EN PEIPER SOLO SE ENVIA UN PARAMETRO 
		POR LO TANTO SE DIRECIONA ESTO AL CONSTRUCTOR Q RESIVE SOLO
		UN PARAMETRO STRING Q ES EL NOMBRE.
		*/
		
		for(Empleados e: misEmpleado) {
			e.SubeSueldo(5);
		}
		
		misEmpleado [0].CambiaSecccion("gerente general ");
		
		for(Empleados e: misEmpleado) {
			
			System.out.println("Nombre: "+e.Rname()+"\n"+
					"seccion: "+e.Rseccion()+"\n"+
					"sueldo: "+e.getSueldo()+"\n"+
					"fecha de alta: "+e.getFechaContrato()+"\n"+
					"*******************************************\n");			
		}
		
		
	
		
	}
}
