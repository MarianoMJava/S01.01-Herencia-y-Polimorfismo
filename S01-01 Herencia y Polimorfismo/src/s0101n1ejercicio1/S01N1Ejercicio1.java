package s0101n1ejercicio1;

public class S01N1Ejercicio1 {

	public static void main(String[] args) {
	
		Viento i1 = new Viento ("Trompeta", 2000);
		
		i1.tocar(); //Llamando al metodo de la clase por inicializacion
		
		Viento.tocarStatic(); //llamando al metodo estatico de la clase
		Cuerda.tocarStatic();
		Percusion.tocarStatic();
			
	}

}
