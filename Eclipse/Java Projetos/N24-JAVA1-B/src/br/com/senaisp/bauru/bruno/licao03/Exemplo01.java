package br.com.senaisp.bauru.bruno.licao03;

public class Exemplo01 {
	public static int _idade = 18 ;
	public static void main(String[] args) {
		byte vByte = 127;
		vByte++; //aqui ocorre o esoturo do limite do byte 
		System.out.println(vByte); //mostra limite inferior 
		float vFloat = 6_000.00f; // preciso colocar f para dizer o float
		if(vByte == - 128) {
			String nome = "Bruno";
					System.out.println("Meu nome é"+ nome);
		}
		//aqui não existe a variavel nome 
		//System.out.println (nome);
		//alternando variavel idade 
		_idade = 20;
		System.out.println(_idade);
		//apartir deste ponto passa a utilizar a variavel local 
		int idade = 50; 
		System.out.println(idade);
		idade += 20; // somando 20 a idade 
		System.out.println(idade);
	}

}
