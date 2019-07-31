package udemyjava;

import javax.swing.JOptionPane;

public class operadorternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		String mensaje;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
		
		mensaje = (numero%2==0) ? "es par" : "es impar";
		
		JOptionPane.showMessageDialog(null, mensaje);	
			
		

	}

}
