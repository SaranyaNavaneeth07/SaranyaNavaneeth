package org.cts.testing;

public class LiteralString {
	public static void main(String[] args) {
		
		//Literal String
		String s = "Saranya";
		String S1 = "Saranya";
				System.out.println(System.identityHashCode(s));
				System.out.println(System.identityHashCode(S1));
				
				//Non Literal String
				String S = new String ("Saranya");
				String S2 = new String ("Saranya");
				System.out.println(System.identityHashCode(S));
				System.out.println(System.identityHashCode(S2));
				
				
	}

}
