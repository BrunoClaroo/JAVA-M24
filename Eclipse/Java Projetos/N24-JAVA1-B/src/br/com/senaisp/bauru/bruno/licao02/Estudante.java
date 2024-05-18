package br.com.senaisp.bauru.bruno.licao02;

import javax.management.RuntimeErrorException;

public class Estudante {
	//Classes de variaveis ou campos / fields 
	
	private int id;
	//numeros inteiros 
	
	private String nome;
	private String documento;
	// palavras 
	
	private float media;
	//numeros fracionarios menores 
	
	private boolean fumante;
	// verdadeiro ou falso
	
	private double bolsaEstudo;
	// sim ou não numeros fracionarios maiores 
	
	// Constructors 
	
	// contructor padrão sem parametros
	public Estudante() {
		
		id = 0 ;
		nome = "Sem Nome";
		documento = "sem documento ";
		media = 0.0f; 
		fumante = false ;
		bolsaEstudo = 0.0;
	}
		//contructor personalizado 
		
	public Estudante (int id, String nome, String documento, float media, double bolsa,
				boolean fum) {
			setId (id) ; 
			setNome (nome); 
			setDocumento (documento);
			setMedia (media); 
			setBolsaEstudo(bolsa);
			setFumante(fum) ;
			
			
		}
		// geradores ctrl + 1 // ctrl + 3 (mais eficaz) // botão direito // mouse encima
		//gerar getter and setter automatic 
		
		// gettes e setters 
	

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
		//criando erro de execução 
		if(nome.length()<2) {
		//throw new RuntimeErrorException("nome deve ter", + "pelo menos 2 caracteres");
		}
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public double getBolsaEstudo() {
		return bolsaEstudo;
	}

	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}
	

	
	//metodos 
	
	@Override
	
	public String toString() {
		return  "id: " + getId() + "\n" +
				"Nome: " + getNome()+"\n"+
				"Documento: " + getDocumento()+"\n"+
				"Média: " + getMedia() + "\n" +
				"Bolsa Estudos: " + getBolsaEstudo() + "\n"+
				"Fumante: " + isFumante();
			
	}
}
