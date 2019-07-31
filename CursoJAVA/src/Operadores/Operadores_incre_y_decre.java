package Operadores;

public class Operadores_incre_y_decre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Incremento y Decremento
		
		int x = 5;
		int y = 5;
		
		x++; // igual a X += 1 ; o  X = x + 1;
		y--; 
		
		System.out.println(x);
		System.out.println(y);
		
		//
		
		int z = 5, q;
		
		q = ++z; // primero se asigna y luego incremente
		
		// q = ++z  // primero incrementa y luego asigna 
		
		System.out.println(q);
		

	}

}
