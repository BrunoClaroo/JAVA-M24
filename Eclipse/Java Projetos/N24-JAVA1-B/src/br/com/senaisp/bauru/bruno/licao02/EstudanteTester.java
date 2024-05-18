package br.com.senaisp.bauru.bruno.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Tasks (DONE para finalizar)
		
		//criando estudante 
		Estudante est01 = new Estudante();
		
		//atribuindo valores 
		est01.setNome("Bruno");
		est01.setId(1);
		est01.setMedia(5.5f);
		
		//Mostrando valores 
		
		//comparando strings 
		//if("Bruno".equals("Richard") ) 
			
		//System.out.println("Nome: "+ est01.getNome());
		//System.out.println("Documento: "+ est01.getDocumento());
		
		//obtendo o objeto como representação textual 
		System.out.println(est01.toString());
		
		//criando um novo estudante 
		Estudante est02 = new Estudante(2, "Richard", "12345678900", 9.6f, 1600.00, true);
		
		// Mostrando estudante 
		System.out.println(est02.toString());
		
	}

}
