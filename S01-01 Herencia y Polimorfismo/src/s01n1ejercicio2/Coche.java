package s01n1ejercicio2;

public class Coche {
	
	private static final String MARCA = "Ford";
	private static String modelo;
	private final int POTENCIA = 500;
	
	//No se puede utilizar como constructor ninguno de los atributos, pero se puede utilizar el 
	// atributo estatico pero sera propio de la clase y modificara todos los objetos creados luego porq
	//apuntan a una misma instancia de moemoria
	
	public Coche () {

	}
	
	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}
	
public static void frenar() {
		
		System.out.println("El coche esta frenando");
		
	}

public void acelerar() {
		
		System.out.println("El coche esta acelerando");
		
	}

}
