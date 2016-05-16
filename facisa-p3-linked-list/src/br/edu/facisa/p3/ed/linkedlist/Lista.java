package br.edu.facisa.p3.ed.linkedlist;

public class Lista {

	private NoLista inicio;

	public Lista() {
		this.inicio = null;
	}

	public void inserir(String valor) {

		if (this.inicio == null) { // lista vazia, então só é preciso criar o nó
			this.inicio = new NoLista(valor);
		} else {
			// cria-se novo no e atualiza o NoLista inicio
			NoLista novoNo = new NoLista(valor);
			novoNo.proximo = this.inicio;
			this.inicio = novoNo;
		}
	}

	public void inserirNoFim(String valor) {
		if (this.inicio == null) {
			// lista vazia
			this.inicio = new NoLista(valor);
		} else {

			// procura pelo fim da lista
			NoLista atual = this.inicio;

			while (atual.proximo != null)
				atual = atual.proximo;

			// insere o nó no fim da lista
			atual.proximo = new NoLista(valor);
		}
	}

	void retira(String v) {// Em qualquer posicao

		NoLista ant = null;
		NoLista p = this.inicio;

		while (p != null && !p.getData().equals(v)) {
			ant = p;
			p = p.proximo;
		}

		if (p != null) {
			if (ant == null) {
				this.inicio = p.proximo;
			} else {
				ant.proximo = p.proximo;
			}
		}
	}

	NoLista busca(String v) {

		int i = 0;

		for (NoLista p = this.inicio; p != null; p = p.proximo) {

			if (p.getData().equals(v)) {
				System.out.println("\n\nachou " + i + "\n\n");
				return p;
			}

			i++;
		}

		return null;
	}

	void imprime() {
		for (NoLista q = this.inicio; q != null; q = q.proximo)
			System.out.println(q.getData());
	}
}
