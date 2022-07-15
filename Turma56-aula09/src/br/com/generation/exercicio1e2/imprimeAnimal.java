package br.com.generation.exercicio1e2;

public class imprimeAnimal {

	public static void main(String[] args) {
		/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:

		Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
		 */
		testaAnimal t=new testaAnimal();
		t.fazerNome(new Cachorro());
		t.fazerIdade(new Cachorro());
		t.fazerSom(new Cachorro());
		t.fazerCorrer(new Cachorro());
		t.fazerNome(new Cavalo());
		t.fazerIdade(new Cavalo());
		t.fazerSom(new Cavalo());
		t.fazerCorrer(new Cavalo());
		t.fazerNome(new Preguica());
		t.fazerIdade(new Preguica());
		t.fazerSom(new Preguica());
		t.fazerSubir(new Preguica());
	}

}
