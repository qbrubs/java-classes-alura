package br.com.alura;

public class Class implements Comparable<Class> {

	private String title;
	private int time;
	
	public Class(String title, int time) {
		this.title = title;
		this.time = time;
	} 
	
	public String getTitle() {
		return title;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return "[Class: " + this.title + ", " + this.time + " minutes]";
	}

	@Override
	public int compareTo(Class anotherClass) {
		return this.title.compareTo(anotherClass.title);
	}
	
	
}
