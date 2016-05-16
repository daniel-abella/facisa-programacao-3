package br.cesed.si.p3.arvoresbinarias.exemplo1;

public class Node {

	private Integer valor;

	private Node noEsquerda;

	private Node noDireita;

	public Node() {
	}

	public Node(Integer valor) {
		super();
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Node getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(Node noEsquerda) {
		this.noEsquerda = noEsquerda;
	}

	public Node getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(Node noDireita) {
		this.noDireita = noDireita;
	}

	@Override
	public String toString() {
		return "Node [valor=" + valor + "]";
	}

}
