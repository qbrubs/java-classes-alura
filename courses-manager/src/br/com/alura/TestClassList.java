package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestClassList {

	public static void main(String[] args) {
		
		Class c1 = new Class("Searching ArrayLists", 21);
		Class c2 = new Class("Object Lists", 20);
		Class c3 = new Class("List and Object relationship", 15);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(c1);
		classes.add(c2);
		classes.add(c3);
		System.out.println(classes);
		
		Collections.sort(classes);
		System.out.println(classes);
		
		Collections.sort(classes, Comparator.comparing(Class::getTime)); //same effect than the other one
		System.out.println(classes);
		
		classes.sort(Comparator.comparing(Class::getTime));
		
	}

}
