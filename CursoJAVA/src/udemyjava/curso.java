package udemyjava;

import java.util.Scanner;

public class curso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hola mundo");
		
		Scanner entrada = new Scanner (System.in);
		
		char letra;
						
		System.out.println("digite una cadena: ");
		
		letra = entrada.next().charAt(0);
		
		System.out.println("la letra es: "+letra);
		
	
	}
}
