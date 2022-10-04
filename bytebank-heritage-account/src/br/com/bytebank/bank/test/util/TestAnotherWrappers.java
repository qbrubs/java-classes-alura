package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestAnotherWrappers {

	public static void main(String[] args) {
		
		Integer ageRef = Integer.valueOf(29); //autoboxing
		System.out.println(ageRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE; //const is always in uppercase
		System.out.println(bRef.booleanValue());
		
		Number refNumber = Float.valueOf(29.9f);
		//RefNumber.floatValue();
		
		List<Number> list = new ArrayList<>();
		list.add(10);
		list.add(32.6);
		list.add(25.6f);
		
	}
	
}
