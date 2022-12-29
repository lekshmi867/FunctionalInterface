package practiceQuestion;

import java.util.Optional;
import java.util.stream.Stream;

public class streamException {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("A", "B", "C", "D");
		Optional<String> result1 = stringStream.findAny(); 
		System.out.println(result1); 
		Optional<String> result2 = stringStream.findFirst();
	}

}
