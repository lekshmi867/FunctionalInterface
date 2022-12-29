package practiceQuestion;

import java.util.Arrays;
import java.util.List;

public class EvenOrOdd {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		numbers.stream().filter(x ->!(x % 2 == 0)).forEach(s -> System.out.println(s));

	}

}
