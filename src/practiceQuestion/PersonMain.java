package practiceQuestion;

import java.util.List;


public class PersonMain {

	public static void main(String[] args) {
		List<Person> personList = List.of(new Person("swaroop", "Vijayan", 34), new Person("Lavanya", "Vijayan", 42),
						new Person("swaroop", "krishna", 21), new Person("Isha", "Krishna", 5),
						new Person("meenu", "naveen", 11), new Person("geetha", "kumari", 60));
		System.out.println("List of person objects :");
		personList.forEach(s->System.out.println(s.firstName));
		String searchName = "swaroop";

		System.out.println("\nSearch objects having firstName = " + searchName);
		personList.stream().filter(person -> person.firstName.equalsIgnoreCase(searchName)).forEach(s->System.out.println(s));
	}

}
