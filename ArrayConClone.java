package esArray;
/*Esercizio : dato un array fare una copia cosi che si modifichi 
quello originale nel caso di cambiamento della copia*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConClone {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		int[] res = null;

		System.out.println("L'array:" + Arrays.toString(array));
		
		int[] array2 = array.clone();
		res = array2; 
		System.out.println("La copia e':" + Arrays.toString(res));
		boolean ris = Prova.CopiaUguale(array2 , array);
		System.out.println(ris);
	}
}