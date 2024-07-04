package Clase1;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in); 
		System.out.println("Ingresa un numero entero: ");
		int numero = entrada.nextInt();
		if (numero % 2 ==0) {
			System.out.println("el numero ingresado es multiplo de 2"); 
		}
		else if (numero % 3 ==0){
			System.out.println(numero + " es multiplo de 3");
			}
		
		
	
	}
	
	
}
