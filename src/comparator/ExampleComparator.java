package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ExampleComparator {

	public static void main(String[] args) {
		String name1 = "lekshmi";
		String name2 = "Swaroop";
		
		System.out.println(name1.compareTo(name2));
		
		List<String> mylist = Arrays.asList("one","two","three","four","five");
		
		Comparator<String> compareLexo = (s1, s2)-> s1.compareTo(s2);
		mylist.sort(compareLexo);
		System.out.println(mylist);
		
		Comparator<String> compareLength =(s1, s2)-> Integer.compare(s1.length(), s2.length());
		mylist.sort(compareLength);
		System.out.println(mylist);
		
		Function<String, Integer> function = s->s.length();
		Comparator<String> compareLength1 = Comparator.comparing(function);
		mylist.sort(compareLength1);
		System.out.println(mylist);
		
		User manvir = new User("Manvir", 34);
		User Swaroop = new User("Swaroop", 35);
		User sanil = new User("Sanil", 36);
		User sahib = new User("Sahib", 30);
		User navjot = new User("Navjot", 25);

		List<User> userList = Arrays.asList(manvir, Swaroop, sanil, sahib, navjot);

		// Comparison based upon Name
		Comparator<User> compName = Comparator.comparing(user -> user.getName());

		userList.sort(compName);
		userList.forEach(user -> System.out.println(user.getName()));

		// Comparison based upon Age
		Comparator<User> compAge = Comparator.comparing(user -> user.getAge());

		userList.sort(compAge);
		userList.forEach(user -> System.out.println(user.getName()));

		userList.sort(compName.thenComparing(compAge));
		userList.sort(compAge);
		userList.forEach(user -> System.out.println(user.getName()));

	}

}
