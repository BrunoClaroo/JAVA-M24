package br.com.senaisp.bauru.bruno.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class TesteDesenhos {

	public static void main(String[] args) {
		// Criando janela 
			JOptionPane janela = new JOptionPane();
			//Criando a jane com dialogo 
			JDialog dlg = janela.createDialog("Desenhos");
			//dimensionando janela 
			dlg.setSize(800,600);
			//criando nosso conteudo
			DesenhoSwing desenho = new DesenhoSwing();
			dlg.setContentPane(desenho);
			dlg.setVisible(true);
			}


}
