package br.com.senaisp.bauru.bruno.licao03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			System.out.println("Digite o valor da base do" + "triangulo; ");
			
			float base = sc.nextFloat();
			System.out.println("gitie a altura do triangulo:");
			float altura = sc.nextFloat();
			//calculando a area do triangulo 
			float area = base * altura /2 ;
			// mostrando area 
			System.out.println("A área do triagulo é "+area);
			//fechando scanner 
			sc.close();
		}
	}

