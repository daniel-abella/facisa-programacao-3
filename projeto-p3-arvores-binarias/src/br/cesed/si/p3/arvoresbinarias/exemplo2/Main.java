package br.cesed.si.p3.arvoresbinarias.exemplo2;

import javax.swing.JOptionPane;

/**
 * Binary Tree
 * 
 * Forked from https://github.com/GustavoHeldt
 * 
 * @author GustavoHeldt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int digitado = 20;
		String resultado;
		Binaria arvore = new Binaria();
		
		
		while(digitado != 0 ){
		  
			resultado = exiberMenu();
			
		   if(resultado.equals("")){
			   JOptionPane.showMessageDialog(null,"Digite um valor numérico!");
			   resultado = exiberMenu();
		   }else{
			   digitado = Integer.parseInt(resultado);
			   
			   switch (digitado) {
				    case 1:
				    	String item = JOptionPane.showInputDialog("Digite um numero para inserir na arvore!");
				    	arvore.inserir(Integer.parseInt(item));
					break;
				    case 2:
				    	String vl = JOptionPane.showInputDialog("Digite o valor que você deseja Remover!");
				    	arvore.remover(arvore.getRaiz(),Integer.parseInt(vl));
					break;
				    case 3:
				    	JOptionPane.showMessageDialog(null,"Os valores Serão exibidos no console!");
				    	arvore.exibirRaiz();
				    	System.out.println("");
					break;
				    case 4:
				    	JOptionPane.showMessageDialog(null,"Os valores Serão exibidos no console!");
				    	System.out.println("Ordem simétrica:");
				    	arvore.emOrdem(arvore.getRaiz());
				    	System.out.println("");
					break;
				    case 5:
				    	JOptionPane.showMessageDialog(null,"Os valores Serão exibidos no console!");
				    	System.out.println("Pré-ordem:");
				    	arvore.preOrdem(arvore.getRaiz());
				    	System.out.println("");
					break;
				    case 6:
				    	JOptionPane.showMessageDialog(null,"Os valores Serão exibidos no console!");
				    	System.out.println("Pós-ordem:");
				    	arvore.posOrdem(arvore.getRaiz());
				    	System.out.println("");
					break;
			   }
	
			   
		   	}
		    
		}
		
	}
	
	public static String exiberMenu(){
		 String	resultado = JOptionPane.showInputDialog("" +
		 		"Digite:" +
		 		"\n 1: Para inserir " +
		 		"\n 2: para Remover" +
		 		"\n 3: Para Exibir a Raiz " +
		 		"\n 4: Para Exibir ordem simétrica " +
		 		"\n 5: Para Exibir pré-ordem " +
		 		"\n 6: Para Exibir pós-ordem " +
		 		"\n 0: Para Sair");
		 
		 if(resultado == null){
			 resultado = "";
		 }
		 
		 return resultado;
	}

}