package br.com.ksg.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Teclado extends JPanel {
	
	private final Color BG_OUTROS = new Color(68, 68, 68);
	private final Color BG_NUMEROS = new Color(99, 99, 99);
	private final Color BG_OPERACOES = new Color(242, 163, 60);
	private final Color TEXTO = new Color(255,255,255);

	public Teclado() {
		
		setLayout(new GridLayout(5,4));
		
		add(new Botao("AC", BG_OUTROS));
		add(new Botao("+/-", BG_OUTROS));
		add(new Botao("%", BG_OUTROS));
		add(new Botao("/", BG_OPERACOES));
		
		add(new Botao("7", BG_NUMEROS));
		add(new Botao("8", BG_NUMEROS));
		add(new Botao("9", BG_NUMEROS));
		add(new Botao("*", BG_OPERACOES));
		
		add(new Botao("4", BG_OUTROS));
		add(new Botao("5", BG_OUTROS));
		add(new Botao("6", BG_OUTROS));
		add(new Botao("+", BG_OPERACOES));
		
		add(new Botao("1", BG_OUTROS));
		add(new Botao("2", BG_OUTROS));
		add(new Botao("3", BG_OUTROS));
		add(new Botao("-", BG_OPERACOES));
		
		add(new Botao("0", BG_OUTROS));
		add(new Botao(".", BG_OUTROS));
		add(new Botao("=", BG_OPERACOES));
	}

}
