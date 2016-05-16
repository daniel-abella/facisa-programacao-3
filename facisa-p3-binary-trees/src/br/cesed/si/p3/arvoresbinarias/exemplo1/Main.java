package br.cesed.si.p3.arvoresbinarias.exemplo1;

public class Main {

	public static void main(String[] args) {

		BinaryTree arvoreBinaria = new BinaryTree();
		
		System.out.println(arvoreBinaria.getQtdNode());
		
		Node root = new Node(1);
		
		arvoreBinaria.inserir(1);
		arvoreBinaria.inserir(2);	
		arvoreBinaria.inserir(3);
		arvoreBinaria.inserir(4);
		arvoreBinaria.inserir(5);
		
		arvoreBinaria.imprimirArvore();
	}

}
