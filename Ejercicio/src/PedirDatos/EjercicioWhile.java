package PedirDatos;
import java.util.Scanner;
public class EjercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//imprimir por consola los numeros enteros del 1 al 5 UNO POR UNO
			
		//imprimir los numeros del 1 al 5 usando while
		
		/*int i=1;
		while(i<=5) {
		System.out.println(i);
		i++;*/	
		
		/*int i=10;
		
		do {
			System.out.println(i);	
			i--;
			
		} while (i>=1);*/
		
		//Ejercicio de Bandera (flag)
		
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un numero del 1 al 4:");
		
		do {
			//(!flag);
			
			int valor=sc.nextInt();
			if(valor>=1 && valor<=4) {
					flag=true;
			}
			
			switch(valor) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
				
			default:
			System.out.println("Error ingresa un numero del 1 al 4");
			break;
			}
			
		}while (flag=false);
					
		}
	}


