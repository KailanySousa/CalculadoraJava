package br.com.ksg.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.ksg.model.Memoria;

public class Display extends JPanel {
	
	private JLabel label = new JLabel(Memoria.getInstancia().getTextoAtual());

	public Display() {
		
		setBackground(new Color(46, 49,50));
		this.label.setForeground(Color.WHITE);
		this.label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(this.label);
		
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

}
