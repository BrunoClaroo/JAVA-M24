package br.com.senaisp.bauru.bruno.licao06;

public class Cachorro extends Mamifero{
			// campos / Fields
		private boolean quadrupede;
			//constructor 
				// Getter e setter
		public boolean isQuadrupede() {
			return quadrupede;
		}

		public void setQuadrupede(boolean quadrupede) {
			this.quadrupede = quadrupede;
		}
		
			// Métodos 
		
		public void falar () {
			System.out.println("Au Au Au!");
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+
						"Quadrupede: " + quadrupede+ "\n";
		}
}
