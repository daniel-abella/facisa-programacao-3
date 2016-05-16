package br.edu.facisa.p3.ed.queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue fila= new SimpleQueue();

		fila.enqueue("daniel");
		fila.enqueue("felipe");

		//senão tem nada, QueueEmptyException,
		String removido = (String) fila.dequeue();
	}
}
