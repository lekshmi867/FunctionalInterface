package practiceQuestion;

import java.util.Arrays;
import java.util.List;

public class searchAnElementInList {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("lekshmi", "arya","nayana","aravind","netra", "revathy", "meenu","chinnu");
		
		String searchElement = "netra";
		boolean queryResult = strList.stream()
                .filter(value -> value.equalsIgnoreCase(searchElement))
                .findFirst().isPresent();
        System.out.println(queryResult);
	}

}
