package br.com.senaisp.bauru.bruno.licao06;

public class Gato extends Mamifero {
	private boolean quadrupede;
	  // constructor 
		public Gato(String nome) {
			setNome (nome);
		}
		public Gato(int idade, String nome) {
			setIdade(idade);
			setNome(nome);
		}
		public Gato () {
			setIdade(0);
			setNome("Gato sem nome");
			setCor("Gato sem cor");
		}
		// getters e setters 
			public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	
	public void falar () {
		System.out.println("miau miau !");
		
	}
}
