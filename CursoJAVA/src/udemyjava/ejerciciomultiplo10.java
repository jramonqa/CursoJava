package udemyjava;

import javax.swing.JOptionPane;

public class ejerciciomultiplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		
		if (numero%10 == 0) {
			
			JOptionPane.showMessageDialog(null, "el numero " +numero+" es multiplo de 10");
			
		}
			
			else {
				
				JOptionPane.showMessageDialog(null,"El numero "+numero+" No es multiplo de 10" );
				
			}
		}

	}

