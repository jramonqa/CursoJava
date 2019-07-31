package udemyjava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nElementos;
		Scanner entrada =new Scanner(System.in);
		
		nElementos =  Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos:  "));
		
		char [] letras = new char [nElementos];
		
		for (int i=0;i<nElementos;i++) {
			System.out.println("Digite un caracter:");
			letras [i] = entrada.next().charAt(0);
			
		}
		
			for (int i=0;i<nElementos;i++) {
			
				System.out.print(letras[i]+"");
			
			}
		

			
	}


}
