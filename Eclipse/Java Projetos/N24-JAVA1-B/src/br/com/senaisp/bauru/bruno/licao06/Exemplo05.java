package br.com.senaisp.bauru.bruno.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.senaisp.bauru.bruno.licao07.Utils;

public class Exemplo05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		  int vlr01,vlr02;
		  //garantindo a entrada do primeiro valor 
		do{
			System.out.println("digite o" + " primeiro valor ");
			try {
				vlr01 = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("valor deve "+"ser inteiro!");
				sc.nextLine(); // captura do enter 
				vlr01 = 0;
			}
		}while (vlr01 <= 0);
		vlr02 = Utils.lerInteiro(sc, "digite o segundo valor: ",
									1, Integer.MAX_VALUE);
		int vlr03 = vlr01/vlr02;
		System.out.println("resultado: "+ vlr03);
		sc.close();
	}
}
