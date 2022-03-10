package Ejercicio2Relacion10;

public class Directivo extends Empleado{
	
//	Constantes
	
	final static private int SUELDO_MAXIMO=3500;
	
//	Atributos
	
	private String nombreDepartamento;
	
//	Constructor
	
	public Directivo(String dni, String nombre, int sueldo, String nombreDepartamento) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		
		this.nombreDepartamento=nombreDepartamento;
		
		
	}

}
