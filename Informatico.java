package Ejercicio2Relacion10;

public class Informatico extends Empleado {

//	Constantes

	final private static int SUELO_MAXIMO = 2500;

//	Atributos

	private String especialidad;

//	Constructor

	public Informatico(String dni, String nombre, int sueldo, String especialidad)
			throws EmpleadoException, informaticoException {

		super(dni, nombre, sueldo);

		comprobarEspecialidad(especialidad);

	}

	public void comprobarEspecialidad(String especialidad) throws informaticoException {

		especialidad = especialidad.toUpperCase();

		if (especialidad.equals("DESARROLLO") && especialidad.equals("SISTEMAS") && especialidad.equals("BD")) {

			throw new informaticoException("Esa opción no es válida");

		} else {

			this.especialidad = especialidad;

		}

	}
	
//	GET y SET

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
