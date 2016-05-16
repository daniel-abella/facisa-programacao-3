package br.edu.facisa.p3.ed.deque;

public class DequeTest {

	public static void main(String[] args) {

		Deque deque = new Deque();

		int valor = 10;
		int erro = 0;
		deque.criaDeque();
		deque.exibeDeque();
		
		erro = deque.incluiDequeEsquerda(valor);
		erro = deque.incluiDequeDireita(valor);
		erro = deque.excluiDequeEsquerda();
		erro = deque.excluiDequeDireita();
		erro = deque.consultaDequeEsquerda();
		erro = deque.consultaDequeDireita();
	}

}
