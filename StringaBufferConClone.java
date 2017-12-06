package esArrayStringBuffer;

import java.util.Arrays;

public class StringaBufferConClone {
	public static void main (String[] args){
//		StringBuffer a = new StringBuffer().append("ciao");
//		StringBuffer b = new StringBuffer().append("amico");
		 
		StringBuffer[] a = new StringBuffer[] {
			new StringBuffer().append("ciao").append("ciao"),
			new StringBuffer().append("amico").append("amico")
		};
		
		StringBuffer[] b = new StringBuffer[] {};
		b.clone();
		if(b==a) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
			
//		for (int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		for(StringBuffer i : a) {
			System.out.println(i);
		}
		
//		for (int j=0; j<b.length;j++) {
//			System.out.println(b[j]);
//		}
		
		for(StringBuffer j : b ) {
			System.out.println(j);
		}
		
	}
}
