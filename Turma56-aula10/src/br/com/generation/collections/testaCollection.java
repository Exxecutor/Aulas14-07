                                                                                                                                                                                                                                package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class testaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aula1="CBlocoI- Java puro";
		String aula2="ABlocoII- Springboot";
		String aula3="DBlocoIII- FrontEnd";
		String aula4="BBlocoIV- Java Mobile";
		
		
		ArrayList<String> listaAulas=new ArrayList<>();
		listaAulas.add(aula1);//[0
		listaAulas.add(aula2);
		listaAulas.add(aula3);
		listaAulas.add(aula4);
		
		/*
		
		listaAulas.remove(2);
		System.out.println(listaAulas);
		
		
		//for -->each
		for(String i: listaAulas) {
			System.out.println(i);
			}
		
		String aula= listaAula.get(1);
		System.out.println(aula);
		
		
		for(int i=0;i<listaAulas.size();i++) {
			System.out.println(i+" | "+listaAulas.get(i));
			
		
		}
		*/
		
		Collections.sort(listaAulas);
		System.out.println(listaAulas);
		Collections.shuffle(listaAulas);
		System.out.println(listaAulas);
	}

}
