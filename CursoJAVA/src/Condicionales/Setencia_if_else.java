package Condicionales;

import javax.swing.JOptionPane;

public class Setencia_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  La setencia if:
		 	
		 	if (condicion) {
		 		Instruccion1;
		 	}
		 	else {
		 		Instruccion2;
		 	{
		
		 */
		
		int numero, dato = 5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		
		if (numero == dato) {  // == igual, != diferente, > mayor, < menor, <= mayor o igual, 
			JOptionPane.showInternalMessageDialog(null,"El numero es 5");
		}
		else {
			JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
		}
		

	}

}
