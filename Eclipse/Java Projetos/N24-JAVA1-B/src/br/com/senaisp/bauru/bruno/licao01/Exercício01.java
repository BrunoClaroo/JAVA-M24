package br.com.senaisp.bauru.bruno.licao01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
	//Variaveis (double)
		
		Scanner scn = new Scanner(System.in);// Forçar a utilizar o padrão (.useLocale(Locale.US);)
		
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		
	//Solicitar a entrada via teclado pelo usuario 
		
		System.out.println("Digite a Quantidade de Galões:");
		galoes = scn.nextDouble();
		scn.close();
		
	// Fazendo as contas 
		
		litros = galoes * gal2lt;
		
	//mostrar resultado 
		System.out.println(galoes + " Galões equivalem a " +
						   litros + " litros");
	}
}
