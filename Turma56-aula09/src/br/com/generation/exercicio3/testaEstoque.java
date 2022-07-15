package br.com.generation.exercicio3;



import java.util.ArrayList;
import java.util.Scanner;
public class testaEstoque {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/
		ArrayList<Estoque> itens = new ArrayList<>();
		System.out.println("Bem vindo ao Materiais Rodolfo");
		Scanner sc=new Scanner(System.in);
		int esc=99;
		while(esc!=0) {
			System.out.println("=====================================");
			System.out.println("Digite:");
			System.out.println("1- para adicionar um produto ao estoque");
			System.out.println("2- para remover um produto do estoque");
			System.out.println("3- mostrar estoque");
			System.out.println("0- para sair");
			esc=sc.nextInt();
			if(esc==1) {
				System.out.println("Quantos produtos deseja adicionar? ");
				int quantidadeProdutos = sc.nextInt();
				for(int i = 0; i < quantidadeProdutos; i++) {
					System.out.println("Digite o nome do produto: ");
					String produto = sc.next();
					sc.nextLine();
					System.out.println("Digite a quantidade do produto: ");
					int quantidade = sc.nextInt();
					itens.add(new Estoque(produto, quantidade));
			}
				continue;
				
			
		}
			if(esc==2) {
				System.out.println("Qual o �ndice do produto que deseja remover? ");
				int indice = sc.nextInt();
				if(indice > itens.size()) {
					System.out.println("Não é possível remover o item neste índice, tente novamente.");
				} else {
					itens.remove(indice);
					for (Estoque i : itens) {
						System.out.println(i);
					}
				}
				continue;
			}
			if(esc==3) {
				for(Estoque i : itens) {
					System.out.println(i);
				}
			}
			continue;
			/*
			if(esc!=0 & esc!=1 & esc!=2 & esc!=3){
				System.out.println("Digite um número válido");
			}
			if(esc==0) {
				System.out.println("================================================");
				System.out.println("Saindo do programa");
				break;
			}
			*/
		

	}
	}
}
