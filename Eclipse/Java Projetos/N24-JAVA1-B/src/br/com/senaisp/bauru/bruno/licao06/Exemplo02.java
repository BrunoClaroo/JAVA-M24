package br.com.senaisp.bauru.bruno.licao06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [][] cinema = new String [10][10];
		// inicializando o cinema 
		for(int i=0;i<cinema.length; i++) {
			for(int j=0; j<cinema[i].length; j++) {// poltrona
					cinema [i][j] = "-";
				}
			
		
			//Comprando os ingressos 
			String term;
			mostrarPoltronas(cinema);
			do {
				System.out.println("Qual fileira voce deseja?");
				int fl = sc.nextInt();
				System.out.println("Qual a poltrona voce deseja?");
				int po = sc.nextInt();
				// verificando se esta disponivel 
				try {
					if (cinema[fl-1][po-1].equals("-")) {
						cinema[fl-1][po-1] = "X";
					}else {
						System.out.println("não disponivel");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
				System.out.println("Valor digitado é inválido!");
				}
				System.out.println("Deseja Continuar (S/N) ? ");
				mostrarPoltronas(cinema);
				sc.nextLine();// remover o enter 
				term = sc.nextLine();
				
			}while(!term.equalsIgnoreCase("N"));
			sc.close();
		}
	 }

	private static void mostrarPoltronas(String[][] cinema) {
		for(int i=0; i<cinema[i].length; i++) {// fileira 
			System.out.println("FL"+(i<9? " ": "")+ (i+1) + " ");
		
		for(int j=0; j<cinema[j].length; j++)
			System.out.print(cinema[i][j] + " ");
		}
	}
}

