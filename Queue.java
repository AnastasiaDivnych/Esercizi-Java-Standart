package pila;



public interface Queue<T> {
	

	T top() ;
	/*
	 * restiruisce l'oggetto senza rimuoverlo dalla pila
	 */
	
	T pop();
	/*
	 * restituisce l'oggetto in cima alla pila e lo rimuove
	 */
	
	void push(T value);
	/*
	 * inserisce l'oggetto in cima alla pila
	 */
	
	boolean isEmpty();
	/*
	 * restituisce true se la pila è vuota altrimenti restituisce false
	 */

	
	

	

	
}
