package laboratorio12PooMetodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		double ladoA, ladoB;
		
		ladoA = ingresarDatos("Ingrese longuitud lado A");
		ladoB = ingresarDatos("Ingrese longuitud lado B");
		
		calcularArea(ladoA, ladoB);
	}

	private static double ingresarDatos(String mensaje) {
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor =  Double.parseDouble(cadena);
		return valor;
	}

	private static void calcularArea(double ladoA, double ladoB) {
		double resultado;
		
		resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "el resultado es: " +resultado);
	}

}
