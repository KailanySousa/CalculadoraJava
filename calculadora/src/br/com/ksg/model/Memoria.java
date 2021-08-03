package br.com.ksg.model;

import java.util.ArrayList;
import java.util.List;

import br.com.ksg.observer.MemoriaObserver;

public class Memoria {
	
	private static final Memoria instancia = new Memoria();
	private String textoAtual = "";
	private final List<MemoriaObserver> observers = new ArrayList<>();

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
		
		
		if("AC".equals(texto)) {
			this.textoAtual = "";
		} else {
			this.textoAtual += texto;			
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
				return Comandos.VIRGULA;
			}
		}
	}

}
