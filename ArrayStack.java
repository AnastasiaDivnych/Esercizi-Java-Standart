package pila;

import java.lang.reflect.Array;
import java.util.*;


public class ArrayStack<T> implements Queue<T> {
	int DEFAULT_SIZE = 2;
	
	T[] theArray = (T[ ]) new Object[DEFAULT_SIZE];
	int top = -1;
	/*
	 * Costruttore della pila
	 */
	public ArrayStack() {
	}
	
	/*
	 * Inserisce un oggetto in cima alla pila
	 * @param x --> l'oggetto da inserire
	 * @return --> l'oggetto inserito
	 */
	
	@Override
	public void push(T value) {
		if(top+1 == DEFAULT_SIZE) {
			int SIZE = DEFAULT_SIZE*2;
			T[] newArray = (T[])new Object[SIZE];
			System.arraycopy(theArray, 0, newArray, 0, DEFAULT_SIZE);
			DEFAULT_SIZE = SIZE;
			theArray = newArray;
		}
		theArray[++top] = value;
	}
	
	/*
	 * Restituisce l'oggetto in cima alla pila senza estrarlo
	 * @return --> l'oggetto in cima
	 * @exception --> NoSuchElementException con pila vuota
	 */
	
	@Override
	public T top()  {
		if(isEmpty()) throw new EmptyStackException();
		return (T) theArray[top];
	}
	
	/*
	 * Rimuove e restituisce l'oggetto in cima alla pila
	 * @return --> l'oggetto in cima
	 * @exception --> NoSuchElementException con pila vuota
	 */

	@Override
	public T pop() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException();
		return (T) theArray[top--];
	}
	
	/*
	 * Verifica che la pila sia logicamente vuota
	 * @return --> true se la pila è vuota
	 * 			   false altrimenti
	 */

	@Override
	public boolean isEmpty() {
		return top == -1;
	}
	
	/*
	 * Metodo interno per raddoppiare la dimensione di theArray
	 */

	private void doubleArray() {
		
		
	}	
}	


