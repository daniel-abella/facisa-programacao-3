package br.edu.facisa.p3.ed.stack.vector;

/*
 * Criação da nossa pilha com vetor.
 * Desta vez, não vamos usar a implementação do Java, vamos criar a nossa própria pilha.
 */
public class StackVector {

	public static final int total = 1000;

	private int capacidade;

	private Object pilha[];

	private int topo = -1;

	public StackVector() {
	}

	public StackVector(int tam) {
		capacidade = tam;
		pilha = new Object[capacidade];
	}

	// retorna a quantidade de elementos da // pilha
	public int tamanho() {
		return topo + 1;
	}

	public void empilhar(Object elemento) {
		if (tamanho() == capacidade)
			System.out.println("Pilha Cheia");
		else
			pilha[++topo] = elemento;
	}

	public boolean vazia() {
		return (topo < 0);
	}

	public Object desempilhar() {
		Object fora = null;
		if (vazia())
			System.out.println("Pilha Vazia");
		else {
			fora = pilha[topo];
			pilha[topo] = null;
			topo--;
		}
		return fora;
	}

	public Object verTopo() {
		if (!vazia())
			return pilha[topo];
		else
			return null;
	}
}
