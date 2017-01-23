package br.com.treinar.modelo.treinamento;

public class Aviao {

	public int numeroPoltronas;

	public void inserirPoltronas(int np) {
		numeroPoltronas = np;

	}

	public void inserirPoltronas(Double x) {
		numeroPoltronas = x.intValue();
	}

	public int retornarPoltronas() {
		return numeroPoltronas;

	}
}
