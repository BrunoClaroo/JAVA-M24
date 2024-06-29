package br.com.senaisp.bauru.bruno.licao06;

public class ShapeJava {
	protected double altura;
	private double largura;
	String cor;
	// constructor 
	// getters e setters 
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public ShapeJava (double alt, double larg) {
		altura = alt;
		largura = larg;
	}
		// Classe dentro de outra classe 
	public class apoio{
			public void chamarApoio () {
				ShapeJava sp2 = new ShapeJava(2,2);
				sp2.altura = 10;
				
			}
	}
	// método estatico de criação do objeto 
	public static ShapeJava getInstancia(double v1, double v2) {
		ShapeJava ret = new ShapeJava(v1, v2);
		ret.altura = 15;
		return ret;
	}
}
