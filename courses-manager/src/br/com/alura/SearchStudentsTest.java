package br.com.alura;

public class SearchStudentsTest {

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
		
		System.out.println("Who is the student with the registered number 5617?");
		Student student = javaCollections.searchRegistration(5617);
		System.out.println("Student: " + student);
		
		//The Map interface provides three collection views, which allow a map's contents
		//to be viewed as a set of keys, collection of values, or set of key-value mappings.
		
	}
	
}
