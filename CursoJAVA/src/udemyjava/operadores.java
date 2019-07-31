package udemyjava;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		float numero1,numero2,suma,resta,mult,div,resto;
		
		System.out.println("digite 2 numeros");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1+numero2;
		resta = numero1-numero2;
		mult = numero1 * numero2;
		resto = numero1%numero2;
		
		System.out.println("la suma es: "+suma);
		System.out.println("la resta es: "+resta);
		System.out.println("la multiplicacion es: "+mult);
		System.out.println("el residuo es: "+ resto);
		

	}

}
