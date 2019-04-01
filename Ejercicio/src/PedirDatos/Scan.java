package PedirDatos;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int cantbancosDisponibles;
		int cantAlumnosInscriptos;
		
		//Leer desde consola, cantidad de bancos disponibles
		System.out.println("Ingrese la cantidad de bancos disponibles: ");
		cantbancosDisponibles = reader.nextInt();
		
		//Leer desde consola, cantidad de alumnos incriptos disponibles
		System.out.println("Ingrese la cantidad de Alumnos Incriptos: ");
		cantAlumnosInscriptos = reader.nextInt();
		
		// informar si cant_alumnos es menor o igual a cantidad bancos disponibles
		if (cantAlumnosInscriptos <= cantbancosDisponibles) {
			System.out.println("El curso se inscribio correctamente");
		} else {
			int resultado = cantAlumnosInscriptos-cantbancosDisponibles;
			System.out.println("Los bancos no son suficientes. Faltan: " + resultado);
			System.out.println(resultado);			
		}
		
		
		
	}
		
}
