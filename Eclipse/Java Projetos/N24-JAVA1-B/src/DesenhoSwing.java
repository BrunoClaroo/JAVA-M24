import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhoSwing extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Override
		public void paint(Graphics g) {
			//setando a cor de preenchimento do desenho 
			// TODO Auto-generated method stub
			g.setColor(Color.BLUE);
			//Desenhando um quadrado na posição X=50 Y=50 
			g.fillRect(50, 50, 150, 150);
		}

}
