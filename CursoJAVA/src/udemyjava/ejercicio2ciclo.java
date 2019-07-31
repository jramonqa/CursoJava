package udemyjava;

import javax.swing.JOptionPane;

public class ejercicio2ciclo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite numero:  "));
		
		while (numero != 0) {
			
			if (numero>0) {
				
				JOptionPane.showMessageDialog(null, "El numero "+numero+" es positivo");
			}
			else {
				
				JOptionPane.showMessageDialog(null, "El numero "+numero+" es negativo");
				
			}
			
			numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:  "));
								
		}
		
		JOptionPane.showInternalMessageDialog(null,  "numero es cero ");
	}

}