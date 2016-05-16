package br.edu.facisa.p3.ed.stack.vector;

public class StackVectorTest {

	public static void main(String[] args) {

		StackVector pilha = new StackVector(3);

		pilha.empilhar("a");
		pilha.empilhar("b");
		pilha.empilhar("c");
		
		String res = (String) pilha.verTopo();
		
		System.out.println(res);
		
		pilha.desempilhar();

		String res2 = (String) pilha.verTopo();

		System.out.println(res2);

	}

}
