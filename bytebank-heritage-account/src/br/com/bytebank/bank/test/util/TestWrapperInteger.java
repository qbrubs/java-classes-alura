package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {

	public static void main(String[] args) {
	
//		int[] ages = new int[5];
//		String[] names = new String[5];
		
		int age = 29; //Integer
		Integer ageRef = Integer.valueOf(29); //autoboxing
		System.out.println(ageRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int value = ageRef.intValue(); //unboxing
		String s = args[0]; //"10" returns instring
		//to transform a string in a int:
		//Integer number = Integer.valueOf(s);
		int number = Integer.parseInt(s);
		System.out.println(number); // ---- parsing
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(29); //Autoboxing -- transformation from primitive to object
		
		//Primitive Type ---------------------- Wrapper
		//int -------------- autoboxing ------> java.lang.Integer
		//int <------------- unboxing --------- java.lang.Integer
		//double --flow
		//float -- flow
		//long  --int
		//short --int
		//byte --int
		//char --int
		//boolean
		
		//everything extends from the class number

	}

}
