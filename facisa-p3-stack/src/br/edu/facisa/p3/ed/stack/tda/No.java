package br.edu.facisa.p3.ed.stack.tda;

public class No<T> {

	private T valor;
	private No<T> proximo;

	public No() {
	}

	public No(T valor, No<T> proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
}
