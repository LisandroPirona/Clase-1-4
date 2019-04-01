package Ejercicioprueba;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int var1;
		int var2;
		int var3;
			
		System.out.println("Ingrese el primer número: ");
		var1 = reader.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
		var2 = reader.nextInt();
		
		System.out.println("Ingrese el tercer número: ");
		var3 = reader.nextInt();
		
		System.out.println(var1 + "," + var2); 
		var1=var2;
		var2=var2;
				
	}
		
}