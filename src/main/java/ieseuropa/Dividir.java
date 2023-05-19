package main.java.ieseuropa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Pedir num1");
			int num1 = teclado.nextInt();
			System.out.println("Pedir num2");
			int num2 = teclado.nextInt();
			
			System.out.println("Resultado" + num1 / num2);
		}catch (ArithmeticException ae) {
			System.out.println("Dato incorrecto");
			System.out.println(ae.getMessage());
			System.out.println(ae.getClass());
		}catch (InputMismatchException ime) {
			System.out.println(ime.getClass());
		}finally {
			System.out.println("Hoy es viernes y quiero cerveza");
		}
		System.out.println("Fin");
	}

}
