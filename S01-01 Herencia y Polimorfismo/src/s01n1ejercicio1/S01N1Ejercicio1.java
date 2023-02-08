package s01n1ejercicio1;

public class S01N1Ejercicio1 {

	public static void main(String[] args) {
	
		Viento v1 = new Viento ("Trompeta", 2000);
		
		v1.tocar(); //Llamando al metodo de la clase por inicializacion
		
		Cuerda.tocarStatic(); //llamando al metodo estatico de la clase
		
		Percusion.tocarStatic();
			
	}

}