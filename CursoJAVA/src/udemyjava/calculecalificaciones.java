package udemyjava;

import java.util.Scanner;

public class calculecalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float nota1,nota2,nota3,suma;
		
		System.out.println("digite 3 calificaciones: ");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		suma= nota1+nota2+nota3;
		
		System.out.println("\nLa suma es: "+suma);
		
		
		

	}

}
