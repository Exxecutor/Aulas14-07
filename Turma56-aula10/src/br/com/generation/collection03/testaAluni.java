package br.com.generation.collection03;

import java.util.ArrayList;
import java.util.Scanner;

public class testaAluni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Aluno> alunos=new ArrayList<>();
		
		
		System.out.println("Quantos alunos deseja adicionar: ");
		int numerodeAlunos=sc.nextInt();
		
		for(int i=0;i<numerodeAlunos;i++) {
			System.out.println("Digite a idade do aluno: ");
			int idade=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do aluno:");
			String nome =sc.nextLine();
			
			alunos.add(new Aluno(nome,idade));
		}
			
		for(Aluno i:alunos) {
			System.out.println(i);
		}
		sc.close();
	}

}
