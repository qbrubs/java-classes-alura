package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestCourseWithStudent {

	public static void main(String[] args) {
		
		Course javaCollections = new Course("Mastering Java Collection", "Paulo Silveira");

		javaCollections.add(new Class("Working with ArrayList", 21));
		javaCollections.add(new Class("Object Lists", 20));
		javaCollections.add(new Class("List and Object relationship", 15));
		
		Student s1 = new Student("Rodrigo Turini", 34672);
		Student s2 = new Student("Guilherme Silveira", 5617);
		Student s3 = new Student("Mauricio Aniche", 7645);
		
		javaCollections.register(s1);
		javaCollections.register(s2);
		javaCollections.register(s3);
		
		System.out.println("All students registered in this course: ");
//		javaCollections.getStudents().forEach(s -> {
//			System.out.println(s);
//		});
		
		Set<Student> students = javaCollections.getStudents();
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student next = iterator.next(); //is very common in old codes
			System.out.println(next);
		}
		
//		Vector<Student> vector = new Vector<>();
		
		System.out.println("The student " + s1 + " is registered?");
		System.out.println(javaCollections.isRegistered(s1));
		
		Student turini = new Student("Rodrigo Turini", 34672);
		System.out.println("And this Turini, is registered?");
		System.out.println(javaCollections.isRegistered(turini));
		
		System.out.println("Is s1 equals to Turini?");
		System.out.println(s1.equals(turini));
		
		//the following is necessarily true:
		
		System.out.println(s1.hashCode() == turini.hashCode());
	}
	
}
