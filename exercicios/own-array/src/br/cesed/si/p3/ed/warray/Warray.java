package br.cesed.si.p3.ed.warray;

/**
 * Class that represents my own array.
 * 
 * Internally it's has internal limitations but
 * 
 * when the limits has been exausthed the intenal limit is dobled.
 * 
 * @author abella
 *
 */
public class Warray {

	/*
	 * Crie exceções para InvalidIndexException
	 * Aplicar InvalidValueException nos outros métodos
	 */
	private int tamanho;
	
	/**
	 * Constructor for my own array.
	 * 
	 * @param tamanho the initial size for my array
	 */
	public Warray(int tamanho) {
		this.tamanho = tamanho;
	}
	
	/**
	 * Add an element for my array 
	 * 
	 * @param o element to be added 
	 * @throws InvalidValueException 
	 */
	public void add(Object o) throws InvalidValueException {
		
		if(o == null) {
			throw new InvalidValueException();
		}
		
		
		//TODO implementação do método
	}
	
	/**
	 * Remove an element for my array 
	 * 
	 * @param o element to be removed 
	 */
	public void remove(Object o) {
		
	}
	
	/**
	 * Remove an element for my array by index
	 * 
	 * @param index the index of element that will be removed
	 */
	public void remove(int index) {
		
	}
	
	/**
	 * Size of array
	 * 
	 * @return size of array
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * Convert my own array to native array
	 * 
	 * @return the converted native array
	 */
	public Object[] toArray() {
		return null;
	}
	
	/**
	 * Prints all the elements
	 */
	public void listar() {
		//TODO imprimir todos os elementos da lista
	}
	
	/**
	 * Get the element by index 
	 * @param index index of element 
	 * @return searched element
	 */
	public Object get(int index) {
		return null;
	}
	
}
