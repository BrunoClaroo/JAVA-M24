package br.com.senaisp.bauru.bruno.licao07;

public class Filhote {
	private static int nSeq = 0;
	public static int getnSeq() {
		return nSeq;
	}
	public static void setnSeq(int nSeq) {
		Filhote.nSeq = nSeq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private int id;
	private String nome ;
	//constructor 
	public Filhote(String nome) {
		id = ++nSeq;
		this.nome = nome;
	}

}
