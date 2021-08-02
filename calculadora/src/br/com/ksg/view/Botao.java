package br.com.ksg.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

	private String texto;
	private Color corBotao;
	private Color corTexto;
	
	public Botao(String texto, Color corBotao) {

		this.setTexto(texto);
		this.setCorBotao(corBotao);
		this.setCorTexto(Color.WHITE);
		
		setOpaque(true);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		setFont(new Font("courier", Font.PLAIN, 25));
		
	}
	
	public Botao(String texto, Color corBotao, Color corTexto) {

		this.setTexto(texto);
		this.setCorBotao(corBotao);
		this.setCorTexto(corTexto);
		
		setOpaque(true);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		setFont(new Font("courier", Font.PLAIN, 25));
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		setText(this.texto);
	}

	public Color getCorBotao() {
		return corBotao;
	}

	public void setCorBotao(Color corBotao) {
		this.corBotao = corBotao;
		setOpaque(true);
		setBackground(this.corBotao);
	}

	public Color getCorTexto() {
		return corTexto;
	}

	public void setCorTexto(Color corTexto) {
		this.corTexto = corTexto;
		setForeground(this.corTexto);
	}

}
