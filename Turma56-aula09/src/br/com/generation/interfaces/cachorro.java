package br.com.generation.interfaces;

public class cachorro extends animal2 implements animal{
	
	@Override //-->sobrescrita
	public void somAnimal() {
		System.out.println("latido");
	
	}
	@Override
	public void dormir() {
		System.out.println("ZZzzzzzZZZzzzzZZZZZZZZzzZZzzZZz......");
		
	}

}