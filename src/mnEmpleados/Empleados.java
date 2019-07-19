package mnEmpleados;

import java.util.*;
public class Empleados {

	
	//CONSTRUCTOR
	public Empleados(String nom, double sue , int agno , int mes ,int dia ) {
	
		nombre = nom;
		sueldo = sue;
		seccion = "administracion";
		
		GregorianCalendar calendario = new GregorianCalendar ( agno, mes-1, dia);
		
		altacontrato = calendario.getTime();		
		
	}
	
	/*APLICANDO LO QUE SERIA SOBRE CARGA DE CONSTRUCTORES 
	QUE ES SOS O MAS CONSTRUCTURES EN UNA MISMA CLASE 
	EN ESTE CASO SE HARA CON EL FI DE QUE SI SE INCORPORA 
	UN NUEVO EMPLEADP DE QUIEN SOLO SE CONOSE YASEA SU NUMBRE 
	ENTONCES SOLO SE LLAMA ESTE CONSTRUCTOR QUE RESIVE UN PARAMETRO 
	QUE ES EL DE NOMBRE Y A SU BES ESTE CONSTRUTOR REDIRECIONA 
	AL QUE RESIVE 5 PARAMETROS PARA QUE ESTABLESCA EL RESTO DE LOS 
	CAMPOS POR DEFAUL PAR LOS EMPLEADOS NUEVOS POR LO TANTO ESTO EVITARIA
	EL PROBLEMA DE QUE SI SOLO SABEMOS SU NOMBRE Q LE MANDARIAMOS EN EL
	RESTO DE LOS PARAMETROS AL CONSTRUCTOR A QUI ENTRA EL CONSTRUCTOR Q RESIVE
	LO QUE CONOCEMOS EN ESPECIFICO. 
	*/
	
	public Empleados (String nom) {
		/*
		 con este THIS(); LO QUE HACEMOS ES LO Q EXPLIQUE ARRIBA RESIBO EL
		 NOMBRE QUE TENGO SOLAMENTE Y ASIGNO EL RESTO DE LOS DATOS POR 
		 DEFAUL Y SE ENVIA AL CONSTRUCTOR DE 5 PARAMETROS YA CON LOS 5
		 PARAMETROS A FIN DE QUE AL MOMENTO DE MOSTRAR LA INFORMACION POR
		 CONSOLA NO ME SALGAN NULL O CERROS COMO RESPUESTA ... ACLARO
		 LOCONVENIENTE SERIA QUE LA FECHA ENVIADA FUERA EL DIA EN QUE 
		 SE LE HACE ESTE REGISTRO AL TRABAJADOR  Y Q ADEMAS EL SUELDO 
		 ESTUVIERA ENLASADO AL CARGO PERO BUSCANDO EJEMPLIFICAR DE MODO PRACTICO
		 LA SOBRECARGA DE CONSTRUCTORES OPTE POR ALGO SENSILLO QUE LE SEGUIRE MEJORANDO 
		 EN ESTOS ASPECTOS.	 
		 */
		this(nom,2000000,2017,10,5);
	}
	
	//METODOS 
	public double getSueldo() {		
		return sueldo;
	}
	
	public void SubeSueldo (double porcentaje) {
		
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
	
	public Date getFechaContrato() {
		return altacontrato;
	}
	
	
	public void CambiaSecccion(String seccion) {//setter
		this.seccion = seccion;
	}
	
	
	public String Rname() {
		return nombre;
	}
	
	public String Rseccion() {
		return seccion;
	}
	
	
	
	
	
	//ATRIBUTOS
	private final String nombre;
	private String seccion;	
	private double sueldo;
	private Date altacontrato;
	
}
