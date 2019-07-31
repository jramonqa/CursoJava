package Condicionales;

import javax.swing.JOptionPane;

public class Setencia_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  La sentencia Switch
		 
		 	switch (dato){
		 	case 1: Instrucciones1;
		 			break;
		 	case 2: Instrucciones2;
		 			break;
		 	....
		 	case b: InstruccionesN;
		 			break;
		 	default: CasoContrario;
		 			break;
		 }
		  */
		
		int dato;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 - 3"));
		
		switch (dato) {
			case 1: JOptionPane.showMessageDialog(null, "El numero es 1");
					break;
			case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
					break;
			case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
					break;
			default: JOptionPane.showMessageDialog(null, "El numero no esta en la lista");
			
		}
		

	}

}
