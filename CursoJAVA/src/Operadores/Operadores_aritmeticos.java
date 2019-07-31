package Operadores;

import java.util.Scanner;

public class Operadores_aritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Operadores Aritmeticos
		
		Scanner entrada = new Scanner(System.in);
		float numero1,numero2,suma,resta,mult,div,resto;
		
		System.out.println("Digite un numero");
		numero1 = entrada.nextFloat();
		System.out.println("Digite otro numero");
		numero2 = entrada.nextFloat();
		
		suma = numero1+numero2;
		resta = numero1-numero2;
		mult = numero1*numero2;
		div = numero1/numero2;
		resto = numero1%numero2;
		
		System.out.println("la suma es: "+suma);
		System.out.println("la resta es: "+resta);
		System.out.println("la multiplicacion es: "+mult);
		System.out.println("la division es: "+div);
		System.out.println("el residuo es: "+resto);
		
		

	}

}
