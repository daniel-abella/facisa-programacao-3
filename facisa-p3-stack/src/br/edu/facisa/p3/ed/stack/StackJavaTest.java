package br.edu.facisa.p3.ed.stack;

import java.util.Stack;

/**
 * Exemplo de Pilha em Java
 * 
 * @author daniel
 *
 */
public class StackJavaTest {

	public static void main(String[] args) {

		//criação da pilha fornecida pelo Java
		Stack<String> pilha = new Stack<String>();
		
		//empilhando os elementos "a" e "b"
		pilha.push("a");
		pilha.push("b");
		
		//função que exibe (não desempilha) quem está no topo
		//se a pilha estiver vazia, pode lançar StackEmptyException
		System.out.println(pilha.peek());
		
		//desempilha o objeto
		//se a pilha estiver vazia, pode lançar StackEmptyException
		String elementoDesempilhado = pilha.pop();
		System.out.println(elementoDesempilhado);

		//agora que desempilhamos "b", o elemento "a" está no topo
		System.out.println(pilha.peek());
		
		
		
	}
	

}
