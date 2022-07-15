package br.com.generation.testa;

import br.com.generation.funcionarios.professor;

public class testatudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		professor prof1 = new professor();
		prof1.setNome("Jefferson");
		prof1.setIdade(23);
		prof1.setEndereco("Rua das Palmeiras 457");
		
		prof1.setDisciplina("Curso de Java");
		prof1.setSalario(2000);
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario());
	}
	

}
