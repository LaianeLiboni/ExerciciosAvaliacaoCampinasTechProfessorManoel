package Exercicio7;

public class TesteException {
	
	public static void main(String[]args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	public static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	public static void metodo2() {
	
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		
		try {
		for (int i = 0; i <= 15; i++) {
			array[i]= i;
			System.out.println(i);
		}
	}catch(ArrayIndexOutOfBoundsException exception) {
		System.out.println("Posi��o do array inv�lida");
		
	}
	System.out.println("Esse texto ser� impresso ap�s a exception");
	System.out.println("fim do m�todo2");
	
	}

}
