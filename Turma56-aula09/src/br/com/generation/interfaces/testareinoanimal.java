package br.com.generation.interfaces;

public class testareinoanimal {
	
	public static void main(String[] args) {
		
		cachorro meuCachorro=new cachorro();
		meuCachorro.setNome("Thor");
		meuCachorro.setIdade(2);
		
		
		System.out.println(meuCachorro.getNome());
		System.out.println(meuCachorro.getIdade());
		
		
		meuCachorro.somAnimal();
		System.out.println();
		meuCachorro.dormir();
		System.out.println();
		
		
	}

}
