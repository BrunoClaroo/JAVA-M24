package br.com.senaisp.bauru.bruno.licao06;

import java.util.Scanner;

public class exemplo01 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] valores;
	System.out.println("Digite o numero de elementos"+" que voce deseja?");
	int qtde = sc.nextInt();
	valores = new int [qtde];
	// laço de repetição para solicitar os numeros 
	for(int i=0; i<valores.length; i++) {
		System.out.println("Digite o elemento " + (i+1)+ ":");
		valores[i]= sc.nextInt();
	}
	int maior=Integer.MIN_VALUE,soma=0;
	for(int el :valores) {
		soma+= el ; // soma = soma + el 
		if (el >maior){
			maior = el ;
			
		}
	}
	System.out.println("Maior valor:"+maior);
	System.out.println("Média"+(soma *  1.0 / valores.length));
	System.out.println("Soma:"+ soma );
}
}
