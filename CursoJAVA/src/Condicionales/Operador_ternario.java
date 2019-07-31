package Condicionales;

import javax.swing.JOptionPane;

public class Operador_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  El operador ternario '?'
		 	
		 	Valor = (Condicion) ? valor1 : valor2
		 			 
		 */
		
		int numero;
		String mensaje;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
		
		mensaje = (numero%2==0) ? "es par" : "es impar";
		
		JOptionPane.showInternalMessageDialog(null, mensaje);
		
	/*	int numero;
				
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
 		
		JOptionPane.showInternalMessageDialog(null, (numero%2==0) ? "es par" : "es impar";);
		
		*/

	}

}
