package br.edu.facisa.p3.ed.stack.tda;

public class TestStackTda {

	public static void main(String[] args) {

		Pilha<Integer> p = new Pilha();
		
		p.empilhar(1);
		p.verTopo();
		
		p.empilhar(2);
		p.verTopo();
		
		Integer res = p.desempilhar();
		System.out.println("Retirado: " + res.toString());
		
		p.verTopo();
		
		res = p.desempilhar();
		
		System.out.println("Retirado: " + res.toString());
		p.verTopo();
	}
}
