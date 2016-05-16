package br.edu.facisa.p3.ed.deque;

public class Deque {
	final int m = 9;
	final int SUCESSO = 0;
	final int DEQUE_ESQUERDO_CHEIO = 1;
	final int DEQUE_DIREITO_CHEIO = 2;
	final int DEQUE_VAZIO = 3;
	int esq;
	int dir;
	int[] v = new int[m];

	public void criaDeque() {
		esq = -1;
		dir = -1;
	}

	public int incluiDequeEsquerda(int dado) {
		if (esq == 0) {
			return (DEQUE_ESQUERDO_CHEIO);
		} else {
			if (esq == -1) {
				esq = m / 2;
				dir = esq;
			} else {
				esq = esq - 1;
			}
			v[esq] = dado;
			return (SUCESSO);
		}
	}

	public int incluiDequeDireita(int dado) {
		if (dir == m - 1) {
			return (DEQUE_DIREITO_CHEIO);
		} else {
			if (dir == -1) {
				dir = m / 2;
				esq = dir;
			} else {
				dir = dir + 1;
			}
			v[dir] = dado;
			return (SUCESSO);
		}
	}

	public int excluiDequeEsquerda() {
		if (esq == -1) {
			return (DEQUE_VAZIO);
		} else {
			System.out.println("Dado Removido à Esquerda: " + v[esq]);
			esq = esq + 1;
			if (esq > dir) {
				criaDeque();
			}
			return (SUCESSO);
		}
	}

	public int excluiDequeDireita() {
		if (dir == -1) {
			return (DEQUE_VAZIO);
		} else {
			System.out.println("Dado excluído Direita do Deque:" + v[dir]);
			dir = dir - 1;
			if (dir < esq) {
				criaDeque();
			}
			return (SUCESSO);
		}
	}

	public int consultaDequeDireita() {
		if (dir == -1) {
			return (DEQUE_VAZIO);
		} else {
			System.out.println("Valor Consultado Direita Deque: " + v[dir]);
			return (SUCESSO);
		}
	}

	public int consultaDequeEsquerda() {
		if (esq == -1) {
			return (DEQUE_VAZIO);
		} else {
			System.out.println("Valor Consultado Esquerda Deque: " + v[esq]);
			return (SUCESSO);
		}
	}

	public void exibeDeque() {
		System.out.print("Deque: ");
		if (esq == -1) {
			System.out.print("Vazio");
		} else {
			for (int i = esq; i <= dir; i++) {
				System.out.print(v[i] + " ");
			}
		}
		System.out.println();
	}

	public void imprimeErro(int erro) {
		switch (erro) {
		case DEQUE_ESQUERDO_CHEIO:
			System.out.println("ERRO: Deque Cheio à Esquerda");
			break;
		case DEQUE_DIREITO_CHEIO:
			System.out.println("ERRO: Deque Cheio à Direita");
			break;
		case DEQUE_VAZIO:
			System.out.println("ERRO: Deque Vazio");
			break;
		}
	}
}
