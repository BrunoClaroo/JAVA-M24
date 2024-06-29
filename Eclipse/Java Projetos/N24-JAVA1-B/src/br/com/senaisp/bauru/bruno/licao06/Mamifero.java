package br.com.senaisp.bauru.bruno.licao06;

public abstract class Mamifero {
	// Campos ou variáveis de instancia ou fields 
	private String nome;
	private String cor;
	private int idade;
	// constructor 
		//getter / setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	// metodos 
	public void falar(){
		
		System.out.println("Mamifero falando");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+ nome + "\n"+ "Cor: "+ cor +"\n"+"Idade: "+ idade+ "\n";
		
	}

}
