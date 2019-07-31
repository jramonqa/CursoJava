package udemyjava;

import javax.swing.JOptionPane;

public class curso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("digite una cadena: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("digite una entero: "));
		letra = JOptionPane.showInputDialog("digite una letra: ").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("digite una decimal: "));
		
		JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
		JOptionPane.showMessageDialog(null, "La cadena es: "+entero);
		JOptionPane.showMessageDialog(null, "La cadena es: "+letra);
		JOptionPane.showMessageDialog(null, "La cadena es: "+decimal);
		
		

	}

}
