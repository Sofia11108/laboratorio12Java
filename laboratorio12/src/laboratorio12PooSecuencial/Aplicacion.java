package laboratorio12PooSecuencial;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		String cadena;
		double ladoA, ladoB, resultado;
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese longuitud lado A");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese longuitud lado B");
		ladoB = Double.parseDouble(cadena);
		
		resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "el resultado es: " +resultado);

	}

}
