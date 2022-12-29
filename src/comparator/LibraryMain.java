package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LibraryMain {

	public static void main(String[] args) {

		Library book1 = new Library("Alchemist", "Paulo", 25);
		Library book2 = new Library("Two_States", "Chetan", 15);
		Library book3 = new Library("Harry_potter", "rowling", 35);
		Library book4 = new Library("wings_of_fire", "Kalam", 20);
		Library book5 = new Library("Java", "Balaguruswamy", 10);

		List<Library> bookList = Arrays.asList(book1, book2, book3, book4, book5);
		
		Comparator<Library> compTitle = Comparator.comparing(library -> library.getTitle());
		bookList.sort(compTitle);
		//System.out.println(bookList);
		bookList.forEach(library -> System.out.println(library.getTitle()));
		
		Comparator<Library> compPrice = Comparator.comparing(library -> library.getPrice());
		
		bookList.sort(compTitle.thenComparing(compPrice));
		bookList.sort(compPrice);
		bookList.forEach(library -> System.out.println(library.getTitle()));

	}
}
