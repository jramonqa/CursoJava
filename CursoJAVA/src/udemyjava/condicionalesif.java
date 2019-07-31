package udemyjava;

import javax.swing.JOptionPane;

public class condicionalesif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * == Igual
		 * != diferente
		 * < menor
		 * > mayor
		 */
		
		int numero,dato=5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nuemero"));
		
		if (numero != dato) {
			
			JOptionPane.showMessageDialog(null, "El numero es diferente  5");
		}
		
		else {
			
			JOptionPane.showMessageDialog(null,"El numero  de 5");
		}

	}

}
