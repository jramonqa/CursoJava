package udemyjava;

import javax.swing.JOptionPane;

public class ejercicio3ciclo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite numero:  "));
		
		while (numero != 0) {
			
			if (numero %2 == 0) {
				
				JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
			}
			else {
				
				JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
				
			}
			
			numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:  "));
								
		}
		
		JOptionPane.showInternalMessageDialog(null,  "numero es cero ");
	}

}