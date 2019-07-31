package udemyjava;

import java.util.Scanner;

public class ciclowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int i=1,contador;
		
		System.out.println("Digite cuantos numeros quiere en pantalla");
		contador = entrada.nextInt();
		
		while (i<=contador) {
			
			System.out.println(i);
			
			i+=2;
			
		}
	}

}
