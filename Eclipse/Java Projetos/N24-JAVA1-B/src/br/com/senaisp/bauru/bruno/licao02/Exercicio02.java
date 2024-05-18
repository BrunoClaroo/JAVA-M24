package br.com.senaisp.bauru.bruno.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome; 
		
		// mostrando a mensagem para o usuario 
		System.out.println("Digite seu nome completo: ");
		nome = scn.nextLine();
		
		//vamos separar nome de sobrenome 
		String primNome = nome.substring(0,(nome + " "), nome.indexOf(" "));
		
		// pegando o ultimo sobrenome 
		String lastName = nome.substring (0, nome.lastIndexOf(" ")+1);
				
		System.out.println(primNome);
		System.out.println(lastName);
		
		
		//fechando scanner 
		scn.close();
	}

}
