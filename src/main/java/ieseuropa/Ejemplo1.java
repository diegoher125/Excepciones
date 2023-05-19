package main.java.ieseuropa;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int maximo = Integer.MIN_VALUE;
		for(int i=0;i<6;i++) {
			boolean datoValido = false;
			int numero = 0;
			do {
				try {
					System.out.println("Numero " + i + ":");
					numero = teclado.nextInt();
					datoValido = true;
				}catch (Exception e) {
					System.out.println("Dato incorrecto");
				}
			}while(!datoValido);
			if(numero > maximo) {
				maximo = numero;
			}
		}
		
		System.out.println("Mayor " + maximo);
	}

}
