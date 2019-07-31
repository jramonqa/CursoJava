package udemyjava;

import java.util.Scanner;

public class ciclodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int i=1, contador;
		
		System.out.println("digite la cantidad de terminos");
		contador = entrada.nextInt ();
		
		do {
			System.out.println(i);
			i++;
		}while (i<=contador);
		
	}

}
