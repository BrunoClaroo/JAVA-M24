package br.com.senaisp.bauru.bruno.licao06;

public class TesteZoo {

	public static void main(String[] args) {
		
		Mamifero mam = new Gato();
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
			//testa se o mam é um cachorro
			if (mam instanceof Cachorro)
				((Cachorro) mam).setQuadrupede(true);
		mam.falar();
		System.out.println(mam.toString());	
		

	}

}
