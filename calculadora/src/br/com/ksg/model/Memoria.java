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
	
	public void processarComando(String valor) {
		
		if("AC".equals(valor)) {
			this.textoAtual = "";
		} else {
			this.textoAtual += valor;			
		}
		
		this.observers.forEach(o -> o.valorAlterado(this.getTextoAtual()));
	}

}
