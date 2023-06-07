package laboratorio12ClaseNumeros;

import javax.swing.JOptionPane;

public class Numeros {

	int numero, neg = 0, par = 0;
	
	public void entrada() {
		
		for (int i = 0; i < 5; i++) {
			numero = ingresarDatos("digite el número #" + (i+1));  //con un ciclo finito llama al método para ingresar datos
			
			if (numero % 2 == 0) {  //evalua cada número pedido y si es par, aumenta la variable par 
				par++;
			}
			if (numero < 0) { //evalua cada número pedido y si es negativo, aumenta la variable neg
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null, "cantidad de números pares es: " +par+ "\n"
				+ "y la cantidad de números negativos es: " +neg);  //se muestra resultado
	}

	private int ingresarDatos(String mensaje) {
		
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
		return valor;
	}
}
