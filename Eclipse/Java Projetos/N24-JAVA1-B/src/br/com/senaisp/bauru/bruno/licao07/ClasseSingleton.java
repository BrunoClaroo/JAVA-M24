package br.com.senaisp.bauru.bruno.licao07;
/*
 * Exemplo do uso de padrão singleton no java 
 */
public class ClasseSingleton {
		private static ClasseSingleton instancia = null;
		private static int nSeqInstancia = 0; 
		private int id; 
		private String nome; 
		//constructor 
		private ClasseSingleton() {
			id = ++nSeqInstancia;
			nome = null;
		}
		//Getters e Setters 
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getId() {
			return id;
		}
		//metodos 
		public static ClasseSingleton getInstancia() {
			if instancia == null
					instancia = new ClasseSingleton();
		}
		return instancia;
 
}
