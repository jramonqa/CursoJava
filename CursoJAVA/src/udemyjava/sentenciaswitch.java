package udemyjava;

import javax.swing.JOptionPane;

public class sentenciaswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dato;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("digite numero de 1 - 5"));
		
		switch (dato) {
			case 1: JOptionPane.showInputDialog(null,"es el numero 1");
				break;
			case 2: JOptionPane.showInputDialog(null,"es el numero 2");
				break;
			case 3: JOptionPane.showInputDialog(null,"es el numero 3");
				break;
			case 4: JOptionPane.showInputDialog(null,"es el numero 4");
				break;
			case 5: JOptionPane.showInputDialog(null,"es el numero 5");
				break;
			default: JOptionPane.showInputDialog(null,"el numero no esta en el rango"); 
		
		}
		
		

	}

}
