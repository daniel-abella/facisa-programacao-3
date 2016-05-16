package br.cesed.si.p3.arvoresbinarias.exemplo2;

public class Node {

	private Node direita;
	private Node esquerda;
	private int valor;

	// Inicializa o nó
	public Node(int valor) {
		this.valor = valor;
		direita = null;
		esquerda = null;
	}

	// Inicializa o nó
	public Node(Node esquerda, int valor, Node direita) {
		this.valor = valor;
		this.direita = direita;
		this.esquerda = esquerda;
	}

	public void setNull() {
		valor = 0;
		direita = null;
		esquerda = null;
	}

	public int getValor() {
		return this.valor;
	}

	public Node getEsquerda() {
		return this.esquerda;
	}

	public Node getDireita() {
		return this.direita;
	}

	public void setValor(int _valor) {
		valor = _valor;
	}

	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}

	public void setDireita(Node direita) {
		this.direita = direita;
	}

}