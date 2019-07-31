package Arreglos;

public class Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Que es un arreglo?
		 Un arry en Java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo.
		 el tamaño de los arrays se declara en un primer momento y no puede cambiar luego durante la ejecucion del programa.
		 
		 Arrys Unidimensionales
		 
		 Tipo_de_variable [] Nombre_del_arry = new Tipo_de_variable[dimension];
		 
		 ejemplos
		 - int[] edad = new int[3];
		 - long[] edad = new long[3];
		 
		 dar valores
		 edad[0]= 1;
		 edad[1]= 2;
		 ....
		 ....
		 int[] edad = {1,2,3};
		 
		 */
		
		int[] numeros = new int [3];
		
		// int [] numeros = {1,2,3};
		
		numeros [0] = 1;
		numeros [1] = 2;
		numeros [2] = 3;
		
		for(int i=0; i<3; i++) {
			
			System.out.println(numeros [i]);
		}

	}

}
