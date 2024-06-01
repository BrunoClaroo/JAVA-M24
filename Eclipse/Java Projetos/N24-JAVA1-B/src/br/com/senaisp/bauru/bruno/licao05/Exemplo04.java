package br.com.senaisp.bauru.bruno.licao05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(Exemplo04.
								class.getResourceAsStream("dados.cvs"));
		
		String linha = sc.nextLine();
		// linha cabecalho
		
		Scanner scA = new Scanner(linha);
		scA.useDelimiter(";"); 
		// colocando como delimitador o ; 
		//usando laço de impressão do cabeçalho
		
		while (scA.hasNext())s {
			System.out.print(scA.next() + "\t\t");
				}		
			System.out.println();
			//pulando linha 
			
			scA.close();
			//fechando o scanner da linha 
			//percorrendo os itens do arquivo 
			
			while(sc.hasNext()) {
				linha= sc.nextLine();
				scA= new Scanner (linha);
				scA.useDelimiter(";");
			
				while (scA.hasNext());
					System.out.println(scA.next()+"\t\t");
			}
			System.out.println();// pulando a linha 
			
			scA.close();// fechando a linha 
		
	}

}
