package Ejercicio2Relacion10;

import java.util.*;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

//		Variables
		Operario o1;
		Informatico i1;
		Directivo d1;

//		creacion de empleados
		o1 = creacionOperario();
		i1 = creacionInformatico();
		d1 = creacionDirectivo();

	}

	public static Operario creacionOperario() {

//		variables
		String dni, nombre;
		int sueldo, nave;
		boolean comprobar;

		do {

			System.out.println("Vamos a introducir al operario");

			try {

				dni = dni();
				nombre = nombre();
				nave = nave();
				sueldo = sueldo();

				Operario o1 = new Operario(dni, nombre, sueldo, nave);

				return o1;

			} catch (EmpleadoException e) {

				e.getMessage();
				comprobar = false;

			} catch (OperarioException e) {

				e.getMessage();
				comprobar = false;

			}

		} while (comprobar == false);

		return null;

	}

	public static Informatico creacionInformatico() {

//		variables
		String dni, nombre, especialidad;
		int sueldo;
		boolean comprobar = false;

		do {

			System.out.println("Vamos a introducir al informatico");

			try {

				dni = dni();
				nombre = nombre();
				especialidad = especialidad();
				sueldo = sueldo();

				Informatico i1 = new Informatico(dni, nombre, sueldo, especialidad);

				return i1;

			} catch (EmpleadoException e) {

				e.getMessage();
				comprobar = false;

			} catch (informaticoException e) {

				e.getMessage();
				comprobar = false;

			}

		} while (comprobar == false);

		return null;

	}

	public static Directivo creacionDirectivo() {

		String dni, nombre, nombreDepartamento;
		int sueldo;
		boolean comprobar = true;

		do {

			System.out.println("Vamos a introducir al directivo");

			try {

				dni = dni();
				nombre = nombre();
				nombreDepartamento = nombreDepartamento();
				sueldo = sueldo();

				Directivo d1 = new Directivo(dni, nombre, sueldo, nombreDepartamento);

				return d1;

			} catch (EmpleadoException e) {

				e.getMessage();
				comprobar = false;

			}

		} while (comprobar == false);

		return null;

	}

	public static int sueldo() {

		int sueldo;

		System.out.println("Introduce el sueldo");
		sueldo = entrada.nextInt();

		return sueldo;

	}

	public static int nave() {

		int nave;

		System.out.println("Introduce la nave a la que pertences");
		nave = entrada.nextInt();

		return nave;

	}

	public static String dni() {

		String dni;

		System.out.println("Introduce el dni:");
		dni = entrada.next();

		return dni;

	}

	public static String nombre() {

		String nombre;

		System.out.println("Introduce tu nombre");
		nombre = entrada.next();

		return nombre;

	}

	public static String especialidad() {

		String especialidad;

		System.out.println("Introduce tu especialidad");
		especialidad = entrada.next();

		return especialidad;

	}

	public static String nombreDepartamento() {

		String nombreDepartamento;

		System.out.println("Introduce tu nombre de departamento");
		nombreDepartamento = entrada.next();

		return nombreDepartamento;

	}

}
