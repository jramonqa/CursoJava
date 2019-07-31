package udemyjava;

import javax.swing.JOptionPane;

public class ejercicio1ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,cuadrado;
		
		numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite numero:  "));
		
		while (numero >=0) {
			
			cuadrado = (int) Math.pow(numero, 2);
			
			JOptionPane.showMessageDialog(null, "El numero  "+numero+" elevado al cuadro es "+cuadrado);
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:  "));
			
		}
		
		JOptionPane.showInternalMessageDialog(null,  "numero negativo ");
	}

}
