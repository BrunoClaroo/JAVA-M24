package br.com.senaisp.bauru.bruno.licao04;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavraSecreta = "Java";

		System.out.println("digite uma letra:");
		String letra = sc.next();
		
		if (palavraSecreta.indexOf(letra.charAt(0))>-1) {
			System.out.println("A plavra contém a letra \"" 
								+ letra 
								+ "\"que digitou na posição "
								+ palavraSecreta.indexOf(letra.charAt(0)));
		
		}
		sc.close();
	}

}
