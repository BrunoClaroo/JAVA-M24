package br.com.senaisp.bauru.bruno.licao05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o operando 1");
		int vlr1 = sc.nextInt();
		sc.nextLine();//caputra do enter 
		System.out.println("Digite a operação: ");
		String operacao = sc.next();
		System.out.println("Digite o operando 2 :");
		int vlr2 = sc.nextInt();
		//verificando as operações 
		int valor = 0;
		//testes 
		if (operacao.equals("+")) {
			valor = vlr1 + vlr2;
			}
		else if (operacao.equals("-")) {
			valor = vlr1 - vlr2;
			}
		else if (operacao.equals("/")) {
		valor = vlr1 / vlr2;
			}
		else if (operacao.equals("*")) {
			valor = vlr1 * vlr2;
			}
		else { 
			System.out.println("Operação invalida!");
		}
		System.out.println("Resultado: " + valor);
		sc.close();
		
	}

}
