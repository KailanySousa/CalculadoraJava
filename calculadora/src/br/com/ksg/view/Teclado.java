package br.com.ksg.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class Teclado extends JPanel {
	
	private final Color BG_OUTROS = new Color(68, 68, 68);
	private final Color BG_NUMEROS = new Color(99, 99, 99);
	private final Color BG_OPERACOES = new Color(242, 163, 60);

	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		this.adicionarBotao("AC", BG_OUTROS, c, 0, 0);
		this.adicionarBotao("+/-", BG_OUTROS, c, 1 , 0);
		this.adicionarBotao("%", BG_OUTROS, c, 2, 0);
		this.adicionarBotao("/", BG_OPERACOES, c, 3, 0);
	
		this.adicionarBotao("7", BG_NUMEROS, c, 0, 1);
		this.adicionarBotao("8", BG_NUMEROS, c, 1, 1);
		this.adicionarBotao("9", BG_NUMEROS, c, 2, 1);
		this.adicionarBotao("*", BG_OPERACOES, c, 3, 1);
		
		this.adicionarBotao("4", BG_NUMEROS, c, 0, 2);
		this.adicionarBotao("5", BG_NUMEROS, c, 1, 2);
		this.adicionarBotao("6", BG_NUMEROS, c, 2, 2);
		this.adicionarBotao("-", BG_OPERACOES, c, 3, 2);
		
		this.adicionarBotao("1", BG_NUMEROS, c, 0, 3);
		this.adicionarBotao("2", BG_NUMEROS, c, 1, 3);
		this.adicionarBotao("3", BG_NUMEROS, c, 2, 3);
		this.adicionarBotao("+", BG_OPERACOES, c, 3, 3);
		
		this.adicionarBotao("0", BG_NUMEROS, c, 0, 4);
		this.adicionarBotao(",", BG_NUMEROS, c, 2, 4);
		this.adicionarBotao("=", BG_OPERACOES, c, 3,4);
		
		
	}

	private void adicionarBotao(String texto, Color cor, 
			GridBagConstraints c, int x, int y) {
	
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		add(botao, c);
		
	}

}
