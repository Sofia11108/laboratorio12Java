package laboratorio12PooClases;

public class Aplicacion {

	public static void main(String[] args) {
	
		Entidad rectangulo;
		rectangulo = new Entidad(); //se hace una instancia de la clase Entidad
		
		rectangulo.ingresarDatos(); //desde el objeto creado se llama a los métodos
		rectangulo.calcularArea();
	}

}
