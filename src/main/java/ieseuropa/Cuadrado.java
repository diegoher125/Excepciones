package main.java.ieseuropa;

import java.util.Scanner;

public class Cuadrado {
	
	private static void pintar(int lado) {
		for(int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws ExcepcionSize{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pon el lado");
		int lado = teclado.nextInt();
		try {
			if(lado <= 10) {
				pintar(lado);
			}else {
				throw new ExcepcionSize();
			}
		}catch(ExcepcionSize es) {
			
		}
		
	}

}
