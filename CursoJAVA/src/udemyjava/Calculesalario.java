package udemyjava;

import java.util.Scanner;

public class Calculesalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int horassemanales;
		float salariohoras,salarios;
		
		System.out.println("horas semanales:");
		horassemanales = entrada.nextInt();
		System.out.println("salario por hora:");		
		salariohoras = entrada.nextFloat();
		
		salarios = horassemanales * salariohoras;
		System.out.println("salario semanas es "+salarios);
		

	}

}
