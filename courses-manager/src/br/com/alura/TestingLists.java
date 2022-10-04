package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestingLists {

	public static void main(String[] args) {
		String class1 = "Knowing more about lists";
		String class2 = "Modelating the class";
		String class3 = "Working with Courses and Sets";
		
		ArrayList<String> classes = new ArrayList<>();
		classes.add(class1);
		classes.add(class2);
		classes.add(class3);
		
		System.out.println(classes);
		
		classes.remove(0);
		
		System.out.println(classes);
		
		for (String class0 : classes) {
			System.out.println("Class: " + class0);
		}
		
		String firstClass = classes.get(0);
		System.out.println("The first class is: " + firstClass);
		
		
		for(int i = 0; i < classes.size(); i++) {
			System.out.println("Class: " + classes.get(i));
		}
		
		System.out.println(classes.size());
		
		classes.forEach(class0 -> {
			System.out.println("Going through: ");
			System.out.println("Class " + class0);
		});
		
		classes.add("Improving our knowledge");
		System.out.println(classes);
		
		Collections.sort(classes);
		System.out.println("After sorted: ");
		System.out.println(classes);	
		
	}

}
