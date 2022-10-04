package br.com.alura;

import java.util.List;

public class TestCourse {

	public static void main(String[] args) {
		
		Course javaCollections = new Course("Mastering Java Collection", "Paulo Silveira");
//		List<Class> classes = javaCollections.getClasses();
//		System.out.println(classes);
		
//		javaCollections.getClasses().add(new Class("Working with ArrayList", 21));
		javaCollections.add(new Class("Working with ArrayList", 21));
		javaCollections.add(new Class("Object Lists", 20));
		javaCollections.add(new Class("List and Object relationship", 15));
		System.out.println(javaCollections.getClasses());
		
		List<Class> classes = javaCollections.getClasses();
		
		
//		System.out.println("------------------------------------------------------------------");
//		classes.add(new Class("Working with ArrayList", 21));
//		System.out.println(classes);
//		System.out.println(classes == javaCollections.getClasses());
	}
}
