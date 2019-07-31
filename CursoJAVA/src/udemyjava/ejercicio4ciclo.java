package udemyjava;

import javax.swing.JOptionPane;

public class ejercicio4ciclo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, contador=0;
		
		numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite numero:  "));
		
		while (numero >= 0) {
			contador++;
			
			numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite numero:  "));
			
			}
	
		JOptionPane.showInternalMessageDialog(null,  "Ha introducido "+contador+" no negativos");
	}

}