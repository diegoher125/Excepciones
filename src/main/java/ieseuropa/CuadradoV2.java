package main.java.ieseuropa;

import java.util.Scanner;

public class CuadradoV2 {
	
	private static void pintar(int lado) throws ExcepcionSize{
		if(lado > 10) {
			throw new ExcepcionSize();
		}
		for(int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pon el lado");
		int lado = teclado.nextInt();
		
		try {
			pintar(lado);
		}catch(ExcepcionSize es) {
			
		}
	}

}
