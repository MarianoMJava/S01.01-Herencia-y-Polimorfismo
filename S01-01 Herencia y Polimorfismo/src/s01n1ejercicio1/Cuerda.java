package s01n1ejercicio1;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
				
	}
	
	public static void tocarStatic()  {
		System.out.println("Esta sonando un instrumento de cuerda");
	}
	
	public void tocar() {
		
		System.out.println("Esta sonando un instrumento de cuerda");
		
	}
	
}
