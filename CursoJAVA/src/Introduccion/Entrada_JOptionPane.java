package Introduccion;

import javax.swing.JOptionPane;

public class Entrada_JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Entrada y salida de datos por medio de JOptionPnae
		
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("digite una cadena");
		entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
		letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite una decimal"));
		
		JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
		JOptionPane.showMessageDialog(null, "el entero es: "+entero);
		JOptionPane.showMessageDialog(null, "la letra es: "+letra);
		JOptionPane.showMessageDialog(null, "el decimal es: "+decimal);
		
		

	}

}
