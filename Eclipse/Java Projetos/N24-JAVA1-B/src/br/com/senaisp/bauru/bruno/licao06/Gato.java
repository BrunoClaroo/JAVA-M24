package br.com.senaisp.bauru.bruno.licao06;

public class Gato extends Mamifero {

	
			public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	private boolean quadrupede;
	
	public void falar () {
		System.out.println("miau miau !");
		
	}
}
