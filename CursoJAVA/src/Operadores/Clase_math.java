package Operadores;

public class Clase_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Clase Math
		
		double raiz = Math.sqrt(3);  //Raiz cuadrada
		
		int raiz2 = (int) Math.sqrt(3);
		
		System.out.println(raiz);
		System.out.println(raiz2);
		System.out.println("-----------------");
		
		double base= 5, exponente = 2;
		double resultado = Math.pow(base, exponente); // elevacion a una potencia
		
		System.out.println(resultado);
		System.out.println("-----------------");
		
		double numero = 4.56;
		long resultado2 = Math.round(numero); // Redondear
		
		System.out.println(resultado2);
		System.out.println("-----------------");
		
		

	}

}
