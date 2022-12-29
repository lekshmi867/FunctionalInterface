package practiceQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStream {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("lekshmi", "","nayana","","netra", "", "meenu","chinnu");
		long count = strList.stream().filter(x->x.isEmpty()).count();
		System.out.println(count);
		
		long numberOfString = strList.stream().filter(x->x.length()>5).count();
		System.out.println(numberOfString);
		
		long strContainsA= strList.stream().filter(x->x.contains("a")).count();
		System.out.println(strContainsA);

		List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()).collect(Collectors.toList());
		filtered.forEach(s->System.out.println(s));
		
		List<String> countryList = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String countries = countryList.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
		System.out.println(countries);
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> squares = numbers.stream() .map( i -> i*i) .distinct() .collect(Collectors.toList());
		squares.forEach(d->System.out.println(d));
		
		
		
			
		}
		
	
		
	}


