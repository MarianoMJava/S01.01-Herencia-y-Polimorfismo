package s0101n1ejercicio1;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
				
	}
	
	public static void tocarStatic()  {
		System.out.println("Esta sonando un instrumento de cuerda");
	}
		
	@Override
	public void tocar() {
		
		System.out.println("Esta sonando un instrumento de cuerda");
		
	}
	
}
