package br.edu.facisa.p3.ed.linkedlist;

public class TesteLinkedList {

	public static void main(String[] args) {

		Lista l = new Lista();
		l.inserir("a");
		l.inserir("b");
		l.inserir("c");

		l.imprime();

		NoLista n = l.busca("b");// Busca
		if (n != null) {
			System.out.println("Encontrado:" + n.getData());
			l.retira(n.getData());
		}
		
		System.out.println("Configuracao da lista:");
		l.imprime();
		
		// Libera memoria
		l = null;
	}
}
