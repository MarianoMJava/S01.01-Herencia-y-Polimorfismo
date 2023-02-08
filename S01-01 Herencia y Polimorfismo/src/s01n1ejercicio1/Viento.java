package s01n1ejercicio1;

public class Viento extends Instrumento {
	


	public Viento(String nombre, int precio) {
		super(nombre, precio);
			
	}
	
	public static void tocarStatic()  {
		System.out.println("Esta sonando un instrumento de viento");
	}
	
	public void tocar() {
		
		System.out.println("Esta sonando un instrumento de viento");
		
	}
	
	
}
