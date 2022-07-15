package br.com.generation.polimorfismos;

public class imprimeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testaAnimal t=new testaAnimal();
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Tigre());
	}

}
