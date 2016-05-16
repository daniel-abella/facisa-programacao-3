package br.edu.facisa.p3.ed.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Um mapa é composto por um conjunto de associações entre um objeto chave a um objeto valor.
 * 
 * Usado para "indexar" objetos de acordo com determinado critério.
 * 
 * Suas principais implementações são o HashMap, o TreeMap e o Hashtable.
 * 
 * método keySet() retorna um Set com as chaves daquele mapa 
 * método values() retorna a Collection com todos os valores 
 * 
 * @author Daniel Abella
 *
 */
public class HashMapExample {

	public static void main(String[] args) {
	
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor", new ContaCorrente());
		mapaDeContas.put("gerente", new ContaCorrente());

		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");

	}

}
