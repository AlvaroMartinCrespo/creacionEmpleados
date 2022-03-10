package Ejercicio2Relacion10;

public class Operario extends Empleado {

//	Constantes

	final private static int SUELDO_MAXIMO = 1200;

//	Atributos

	private int nave;

//	Constructores

	public Operario(String dni, String nombre, int sueldo, int nave) throws EmpleadoException, OperarioException {

		super(dni, nombre, sueldo);
		comprobarNave(nave);

	}

	public void comprobarNave(int nave) throws OperarioException {

		if (nave < 0 || nave > 5) {

			throw new OperarioException("La nave debe estar comprendida entre 0 y 5");

		} else {

			this.nave = nave;

		}

	}

//	GET y SET
	
	public int getNave() {
		return nave;
	}

	public void setNave(int nave) {
		this.nave = nave;
	}

}
