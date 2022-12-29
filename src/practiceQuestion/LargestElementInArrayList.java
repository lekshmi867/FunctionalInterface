package practiceQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestElementInArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		Optional<Integer> largeNumber = numbers.stream().max(Integer::compare);
		System.out.println(largeNumber);
		

	}

}
