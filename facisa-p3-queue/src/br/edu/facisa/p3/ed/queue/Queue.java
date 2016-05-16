package br.edu.facisa.p3.ed.queue;

public interface Queue {

	    void enqueue(Object item);

	    Object dequeue();

	    Object peek();

	    int size();

	    boolean isEmpty();
}
