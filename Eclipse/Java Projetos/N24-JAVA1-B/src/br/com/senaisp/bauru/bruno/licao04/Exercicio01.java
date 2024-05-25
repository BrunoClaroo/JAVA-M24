package br.com.senaisp.bauru.bruno.licao04;

import java.util.Scanner;

public class Exercicio01 {
	
		public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			
			//strings 
			String nome1 = "Bruno";
			String nome2 = "Bruno";

			nome2 = sc.next() ;
			//comparando endereços de memoria quando é objeto  
			
			
			//if (nome1 == nome2)
				//System.out.println("São iguais");
			// else { 
				//System.out.println("São Diferentes");
				// comaparando conteudo de objeto 
			if (nome1.equals(nome2)) {
				System.out.println("são iguais no conteudo");
				}
			else { 
				System.out.println("São diferentes no conteudo" );
				}
			//nome 1 = > que nome 2 
			if (nome1.compareTo(nome2)>0) {
				System.out.println("Nome1 é maior que o nome2");
				
			if (nome1.compareTo(nome2)<0) {
				System.out.println("Nome2 é maior que o nome2");
					
			if (nome1.compareTo(nome2)==0) {
				System.out.println("Nome1 é igual ao nome2");
					
						}
					}
					
				}
			}
//		}
}

		
		
		

