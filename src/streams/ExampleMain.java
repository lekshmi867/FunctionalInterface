package streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ExampleMain {

	public static void main(String[] args) {

		List<Product> myProductsList = ExampleData.getProducts();
		// System.out.println(myProductsList);

		for (Product product : myProductsList) {
			if (product.getName().equalsIgnoreCase("Plates")) {
				System.out.println(product.getPrice());
			}
		}

		myProductsList.stream().filter(p -> p.getName().equalsIgnoreCase("plates"))
				.forEach(p -> System.out.println(p.getPrice()));

		// creating stream object with list
		Stream<Product> sp = myProductsList.stream();

		//creating stream from specified value
		Stream<String> sp1 = Stream.of("one", "two", "three");
		sp1.sorted().forEach(s->System.out.println(s));
		
		//creating stream from array
		Stream<String> streamOfArray= Arrays.stream(new String[] { "lek", "isha", "meenu" });
		streamOfArray.sorted().forEach(s->System.out.println(s));
		
		//creating empty stream
		 Stream<String> emptyStream= Stream.empty();
		 
		// create a sequential stream from the collection
	       Stream<Product> stream = myProductsList.stream();
	       stream.forEach(s->System.out.println(s));
		
		// Difference from collection iteration

		// Find First
		Optional<Product> findFirstProduct = myProductsList.stream().findFirst();

		System.out.println(findFirstProduct.get().getName());

		// Find Any
		Optional<Product> findAnyProduct = myProductsList.stream().parallel().findAny();

		System.out.println(findAnyProduct.get().getName());
		
		myProductsList.stream().filter(Product->Product.getCategory()==Category.OFFICE).forEach(p->System.out.println(p));
		myProductsList.stream().filter(Product->Product.getName().startsWith("A")).forEach(p->System.out.println(p));
		

	}

	public static Optional<String> getName() {
		return Optional.empty();
	}

	public static String getName2() {
		return null;
	}

}