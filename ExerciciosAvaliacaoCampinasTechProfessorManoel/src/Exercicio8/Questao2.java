package Exercicio8;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Eu sei dividir!");
		System.out.println("Informe o primeiro valor: ");			
		int x = teclado.nextInt();
			
		System.out.println("Informe o segundo valor:");
		int y = teclado.nextInt();
		
		double a;
		double b;
		
		if (x < y) {
			
			a = x;
			b = y;
			
			double resultado = a / b;
			
			System.out.println("O resultado da divisão é: " + resultado );
			
		} else {
			try {		
				double resultado = (x / y);
				System.out.println("O resultado da divisão é: " + resultado );
			} catch(ArithmeticException e) {
				System.err.println("Divisao por zero. Tente novamente");
				
				System.out.println("Escolha outro número: ");
				int z = teclado.nextInt();
				double resultado = (x / z);
				System.out.println("O resultado da divisão é: " + resultado );
			}	
		}
	teclado.close();
	
		}
	
}
