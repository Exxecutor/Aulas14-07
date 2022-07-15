package br.com.generation.polimorfismos03;

public class sobrecargaMetodo {
	public static void main(String[] args) {
		linha('x', 10);
		linha('*');
		linha();

	}
	
	public static void linha(char tipo, int tamanho) {
		System.out.println("1� vers�o: ");
		for(int i = 0; i <= tamanho; i++) {
			System.out.printf("%c", tipo);
		}
		System.out.println();
	}
	
	public static void linha(char tipo) {
		System.out.println("2� vers�o: ");
		for(int i = 0; i <= 10; i++) {
			System.out.printf("%c", tipo);
		}
		System.out.println();
	}
	
	public static void linha() {
		System.out.println("3� vers�o: ");
		for(int i = 0; i <= 10; i++) {
			System.out.printf("x");
		}
		System.out.println();
	}
	
}
