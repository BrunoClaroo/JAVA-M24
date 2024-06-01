package br.com.senaisp.bauru.bruno.licao05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		sc.nextLine(); // para capturar enter do numerico 
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite sua cidade:");
		String cidade = sc.next();
		System.out.println("Nome: "+ nome+
							"\nidade: "+idade +
							"\nCidade: "+ cidade);
sc.close();
	}

}
