import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenateStrings {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("Alura online");
		words.add("Code house editor");
		words.add("Caelum");

//		Comparator<String> comparator = new ComparatorForSize();
////		Collections.sort(words, comparator);
		
		
		// functional interface
//		words.sort((s1, s2) -> { 
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

//		words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		System.out.println(words);
		
		Function<String, Integer> function = s -> s.length();
		Comparator<String> comparator = Comparator.comparing(function);
		words.sort(comparator);

		words.sort(Comparator.comparing(s -> s.length()));
		
//		for (String w : words) {
//			System.out.println(w);
//		} 														//old format

//		Consumer<String> consumer = new Consumer<String>() { //anonymous class
//			@Override
//			public void accept(String s) {
//				System.out.println(s);	
//			}
//		};

//		words.forEach(consumer);                               //new format

		Consumer<String> printer = s -> System.out.println(s);
		words.forEach(printer);
		
		words.forEach(s -> System.out.println(s)); // lambda

	}

}
