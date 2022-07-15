package br.com.generation.collection02;

import java.util.ArrayList;

public class testaAula {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		
		Aula a1=new Aula("portugues",60);
		Aula a2=new Aula("matematica",90);
		Aula a3=new Aula("historia",120);
		
		ArrayList<Aula> aulas=new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
	}

}
