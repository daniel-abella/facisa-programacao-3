package br.edu.facisa.p3.ed.stack.tda;

public class Pilha<T> {

	protected No<T> topo;
	protected int tamanho;

	public Pilha() {
		tamanho = 0;
		topo = null;
	}

	public boolean vazia() {
		return topo == null;
	}

	public int tamanho() {
		return tamanho;
	}

	void empilhar(T elemento) {

		No<T> aux = new No(null, null);
		aux.setValor(elemento);
		aux.setProximo(topo);
		topo = aux;
		tamanho++;
	}

	void verTopo() {
		No<T> aux = null;
		if (!vazia()) {
			aux = topo;
			System.out.println("Topo: " + aux.getValor());
		} else {
			System.out.println("Pilha vazia\n");
		}
	}

	T desempilhar() {

		No<T> aux = null;
		T elemento = null;
		if (vazia()) {
			System.out.println("Pilha vazia\n");
		} else {
			aux = topo;
			elemento = topo.getValor();
			topo = aux.getProximo();
			tamanho--;
		}
		return elemento;
	}

	public No<T> getTopo() {
		return topo;
	}

	public void setTopo(No<T> topo) {
		this.topo = topo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
