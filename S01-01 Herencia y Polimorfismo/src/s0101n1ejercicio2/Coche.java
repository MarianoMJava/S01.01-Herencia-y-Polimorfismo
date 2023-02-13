package s0101n1ejercicio2;

public class Coche {
	
	private static final String MARCA = "Ford";
	private static String modelo;
	private final int POTENCIA = 500;
	
	//No se puede utilizar como constructor ninguno de los atributos, se puede utilizar el modelo pero al ser estatico sera propio de la clase y habra que acceder de forma estatica 
	
	public Coche  (String modelo) {

		//this.MARCA = MARCA;			//En este caso da un fallo, proponiendo el compilador en eliminar la declaracion final del atributo MARCA al igual que en POTENCIA
		this.modelo= modelo;			//Da un warning que indica que se deberia acceder al atributo de forma estatica
		//this.POTENCIA=POTENCIA;
		
		
	}
	
	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
	
	public static String setMarca() {
		return MARCA;
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
