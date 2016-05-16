package br.edu.facisa.p3.ed.performance;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Troque a ArrayList por um HashSet e verifique o tempo que vai demorar
 * Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um TreeSet. Como ficou seu código?
 */
public class CollectionsPerformanceGame {

	public static void main(String[] args) {

		System.out.println("Iniciando...");

		Collection<Integer> teste = new ArrayList<>();

		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long elapsedTime = fim - inicio;

		System.out.println("Tempo gasto: " + elapsedTime);
	}

}
