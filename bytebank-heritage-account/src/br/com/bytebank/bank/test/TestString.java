package br.com.bytebank.bank.test;

public class TestString {
	
	public static void main(String[] args) {
		
		String empty = " Alura ";
		String anotherEmpty = empty.trim();
		
		System.out.println(empty.contains("Alu"));
		System.out.println(anotherEmpty.isEmpty());
	
		String name = "Alura"; //objects literal
		//String another = new String("Alura");
		
		System.out.println(name.length());
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
//		String sub = name.substring(1);
//		System.out.println(sub);
		
//		int pos = name.indexOf("ur");
//		System.out.println(pos);
		
//		char c = name.charAt(2);
//		System.out.println(c);
		
//		char c = 'A'; //one char only
//		char d = 'a';
//		
//		String another = name.replace(c, d);
		//String another = name.replace("Al", "aL");
		
		//String another = name.toLowerCase();
		//String another = name.toUpperCase();
		
		System.out.println(name);
		//System.out.println(another);
		
		
		
	}
}
