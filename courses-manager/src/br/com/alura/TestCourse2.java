package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCourse2 {

	public static void main(String[] args) {

		Course javaCollections = new Course("Mastering Java Collection", "Paulo Silveira");

		javaCollections.add(new Class("Working with ArrayList", 21));
		javaCollections.add(new Class("Object Lists", 20));
		javaCollections.add(new Class("List and Object relationship", 15));

		List<Class> immutableClasses = javaCollections.getClasses();
		System.out.println(immutableClasses);

		List<Class> classes = new ArrayList<>(immutableClasses);

		Collections.sort(classes);
		System.out.println(classes);
		System.out.println(javaCollections.getTotalTime());
		
		System.out.println(javaCollections);
		
		
	}
	
}