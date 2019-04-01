package PedirDatos;

import java.util.Scanner;

//import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Nmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		int mes=0;
		String mesString; 
		switch(mes) {
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
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
			
		}
		
		System.out.println("Ingrese el Número del mes a mostrar en pantalla: ");
		mes = reader.nextInt();
		
		if (mes==1 || mes==2 || mes==3 || mes==4 || mes==5 || mes==6 || mes==7 || mes==8 || mes==9 || mes==10 || mes==11 || mes==12) {
			
		} else {

		}
		

		System.out.println("El mes es:");
		}
		

}
