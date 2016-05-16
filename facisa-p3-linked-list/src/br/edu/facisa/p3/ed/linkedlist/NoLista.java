package br.edu.facisa.p3.ed.linkedlist;

public class NoLista {

	private String data;
	
	protected NoLista proximo;

	public NoLista(String data) {
		this.data = data;
		this.proximo = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public NoLista getProximo() {
		return proximo;
	}

	public void setProximo(NoLista proximo) {
		this.proximo = proximo;
	}
}
