import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		a=20;
						
		System.out.println("El salon cuenta con 20 bancos disponibles.");
			
		System.out.println("Ingrese la cantidad de Alumnos Inscriptos: ");
		
		Scanner entradaScan = new Scanner(System.in);
		
		int entradaAlumnos=entradaScan.nextInt();
		
		System.out.println("Dato ingresado.");
		
		
		if (a > entradaAlumnos) {
		    
		    System.out.println("La cantidad de Bancos es suficiente");
		} else if (a < entradaAlumnos) {
			
			
		    System.out.println("Tiene que buscar esta cantidad de bancos: ");
		    System.out.println(entradaAlumnos-a);
		    }
		   
	}

}
