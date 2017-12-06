package ArrayRandom;

import java.util.*;

import org.apache.commons.lang3.ArrayUtils;

import esArray.ArrayConUguale;

public class ArrayRandom {
	public static int[] generaArray(int dim , int max , int min) {
		
		int[] a = new int[dim];
		
		Random random = new Random();
		
		for(int i=0; i<a.length; i++) {
			a[i] = random.nextInt(max-min)+min;			
		}
		return a;
		
	}
	
	public static int[] SelectionSort(int[] a) {
		
		for (int i=0; i<a.length; i++) {
			int min = i;
			int temp = 0;
			for(int j=i+1; j<a.length; j++) {
				if(((Comparable<Integer>)a[j]).compareTo(a[min])<0) min = j;
				if(min!=i) {
				temp = a[min];
				a[min]=a[i];
				a[i]=temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] array = generaArray(100 , 10 , 1 );
		int[] copy = array.clone();
		int[] order = copy.clone();
		
		order=SelectionSort(order);
		int[] remove = new int[order.length-1];
		remove = ArrayUtils.remove(order, 5);
		
		for (int i=1; i<100; i++) {
	            if(i<array.length-1){
	            System.out.println(i+" "+" "+"Array: "+ array[i]+" "+"Copia: "+ copy[i]+" "+"Ordinato: "+ order[i]+" "+ "Senza: "+ remove[i]);
	            }
	            else{
	            System.out.println(i+" "+" "+"Array: "+ array[i]+" "+"Copia: "+ copy[i]+" "+"Ordinato: "+ order[i]+" "+ " ");    
	           }
	            }
	        }
		}
	
		
	

