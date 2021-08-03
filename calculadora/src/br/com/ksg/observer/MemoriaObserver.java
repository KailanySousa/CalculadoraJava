package br.com.ksg.observer;

@FunctionalInterface
public interface MemoriaObserver {

	public void valorAlterado(String novoValor);
}
