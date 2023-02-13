package s0101n1ejercicio2;

import java.util.Scanner;

public class S01N1Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String modelo;
		
		System.out.print("Ingrese el modelo del coche: ");
		
		modelo = sc.nextLine();			//Se verifica que se puede acceder definiendo el parametro a traves del constructor
		
		Coche.setModelo(modelo);		//Se verifica que se puede acceder tanto de forma estatica y definir el atributo modelo 
		
		//Coche.setMarca = "BMW";			//No se puede acceder a escribir sobre marca ya que esta definida como FINAL
		
		Coche coche1 = new Coche(modelo);
		
		Coche coche2 = new Coche(modelo);
		
		System.out.println("Marca: " + Coche.getMarca() + "\nModelo: " + Coche.getModelo() + "\nPotencia: " + coche1.getPOTENCIA() + " CV");
		
		Coche.setModelo("Focus");
		
		System.out.println("Marca: " + Coche.getMarca() + "\nModelo: " + Coche.getModelo() + "\nPotencia: " + coche2.getPOTENCIA() + " CV");
		
		coche1.acelerar();
		
		Coche.frenar();
		

	}

}
