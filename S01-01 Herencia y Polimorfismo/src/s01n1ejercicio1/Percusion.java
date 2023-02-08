package s01n1ejercicio1;

public class Percusion extends Instrumento{

	public Percusion(String nombre, int precio) {
		super(nombre, precio);

	}
	
	public static void tocarStatic()  {
		System.out.println("Esta sonando un instrumento de percusion");
	}

	public void tocar() {
		
		System.out.println("Esta sonando un instrumento de percusion");
		
	}
	
}
