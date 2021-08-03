package br.com.ksg.model;

import java.util.ArrayList;
import java.util.List;

import br.com.ksg.observer.MemoriaObserver;

public class Memoria {
	
	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObserver> observers = new ArrayList<>();
	
	private String textoAtual = "";
	private String textoBuffer = "";
	private boolean substituir = false;
	private Comandos ultimaOperacao;

	private Memoria() {
		
	}

	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void setObservers(MemoriaObserver observer) {
		this.observers.add(observer);
	}

	public String getTextoAtual() {
		return this.textoAtual.isEmpty() ? "0" : this.textoAtual;
	}
	
	public void processarComando(String texto) {
		
		Comandos comando = detectarComando(texto);
		if(comando == null) {
			return;
		} else if(comando == Comandos.ZERAR) {
			this.textoAtual = "";
			this.textoBuffer = "";
			this.substituir = false;
			this.ultimaOperacao = null;
		} else if(comando == Comandos.NUMERO || comando == Comandos.VIRGULA) {
			this.textoAtual = this.substituir ? texto : this.textoAtual + texto;
			this.substituir = false;
		} else {
			
		}
	
		this.observers.forEach(o -> o.valorAlterado(this.getTextoAtual()));
	}

	private Comandos detectarComando(String texto) {
		if(this.textoAtual.isEmpty() && texto.equals("0")) {
			return null;
		}
		
		try {
			Integer.parseInt(texto);
			return Comandos.NUMERO;
		} catch (NumberFormatException e) {
			// quando não for numero
			
			switch (texto) {
			case "AC":
				return Comandos.ZERAR;
			case "/":
				return Comandos.DIV;
			case "*":
				return Comandos.MULT;
			case "+":
				return Comandos.SOMA;
			case "-":
				return Comandos.SUB;
			case "=":
				return Comandos.SUB;
			default:
				if(!this.textoAtual.contains(",")) return Comandos.VIRGULA;
			}
		}
		return null;
	}

}
