package laboratorio12PooClases;

import javax.swing.JOptionPane;

public class Entidad {

	private double ladoA;
	private double ladoB;
	
	//se declaran las variables de tipo private
	
	public void ingresarDatos() {
		
		ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese lado A"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese lado B"));
		
		//desde Aplicacion ingresa al método y pide los datos 
	}
	
	
	public void calcularArea() {
		
		double resultado;
		
		resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "el resultado es: " + resultado);
		
		//desde Aplicacion ingresa al método y calcula el resultado con las variables globales
	}
}
