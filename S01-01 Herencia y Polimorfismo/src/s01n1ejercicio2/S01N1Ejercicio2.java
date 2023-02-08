package s01n1ejercicio2;

import java.util.Scanner;

public class S01N1Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String modelo;
		
		System.out.print("Ingrese el modelo del coche: ");
		
		modelo = sc.nextLine();
		
		Coche.setModelo(modelo);
		
		Coche coche1 = new Coche();
		
		Coche coche2 = new Coche();
		
		System.out.println("Marca: " + Coche.getMarca() + "\nModelo: " + Coche.getModelo() + "\nPotencia: " + coche1.getPOTENCIA() + " CV");
		
		Coche.setModelo("Focus");
		
		System.out.println("Marca: " + Coche.getMarca() + "\nModelo: " + Coche.getModelo() + "\nPotencia: " + coche2.getPOTENCIA() + " CV");
		System.out.println(coche1.getModelo());
		
		
		coche1.acelerar();
		
		Coche.frenar();
		

	}

}
