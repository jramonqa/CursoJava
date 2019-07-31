package Ciclos;

import java.util.Scanner;

public class Ciclo_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 Ciclo While
		 
		 while (condicion) {
		 	instrucciones;
		 
		 }		 
		 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int i=1, contador;
		
		System.out.println ("digite cuantos numeros quiere en pantalla");
		contador = entrada.nextInt();
		
		while (i<=contador) {
			System.out.println(+i);
			i+=2;   //i++ o i--;
		}

	}

}
