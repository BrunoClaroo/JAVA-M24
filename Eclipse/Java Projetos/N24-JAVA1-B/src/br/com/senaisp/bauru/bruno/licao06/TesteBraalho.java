package br.com.senaisp.bauru.bruno.licao06;

public class TesteBraalho {

	public static void main(String[] args) {
		Baralho ba = new Baralho();
		Carta ct = ba.sortearCarta();
		System.out.println(ct.toString());

	}

}
