package pila;

public class Stack {
	
	
	public static void main(String[] args) {
		Queue<Character> pila = new ArrayStack<Character>();
		Queue<Character> pila2 = new ArrayStack<Character>();
		
		Character ch4 = new Character('a');
		Character ch3 = new Character ('l');
		Character ch2 = new Character ('l');
		Character ch = new Character('a');
		
		
		pila.push(ch);
//		System.out.print(pila.top());
		pila.push(ch2);
//		System.out.print(pila.top());
		pila.push(ch3);
//		System.out.print(pila.top());
		pila.push(ch4);
//		System.out.print(pila.top());
		
		System.out.println();
		
		pila2.push(ch4);
//		System.out.print(pila2.top());
		pila2.push(ch3);
//		System.out.print(pila2.top());
		pila2.push(ch2);
//		System.out.print(pila2.top());
		pila2.push(ch);
//		System.out.print(pila2.top());
		
		Stack.Stampa(pila);
		System.out.println();
//		Stack.Stampa(pila2);
		System.out.println(IsPalindrom(pila , pila2));	
	}
	public static void Stampa(Queue<Character> stack) {
		Queue<Character> copy = new ArrayStack<Character>();
//		System.out.println();
//		System.out.println("----------");
		while (!stack.isEmpty()) {
			copy.push(stack.pop());
			System.out.print(copy.top());
		}
		
//		System.out.println("----------");
		while(!copy.isEmpty()) {
			stack.push(copy.pop());
//			System.out.print(stack.top());
		}	
	}
	public static boolean IsPalindrom(Queue<Character> pila , Queue<Character> pila2 ) {
		
			  if (pila.isEmpty() !=pila2.isEmpty()) return false; // check if one is empty
			  if (pila.isEmpty() && pila2.isEmpty()) return true; // check if both are empty
			  Character element_a = pila.pop(); // grab elements and compare them
			  Character element_b = pila2.pop();
			  if (((element_a==null) && (element_b!=null)) || !element_a.equals(element_b)) {
			    return false;
			  }
			  boolean result = IsPalindrom(pila, pila2); // compare shortened stacks recursively
			  pila.push(element_a); // restore elements
			  pila.push(element_b);
			  return result; // return result from recursive call
			}
}	

	
