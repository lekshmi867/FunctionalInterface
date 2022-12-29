package practiceQuestion;

import java.util.Arrays;
import java.util.List;


public class ArraysStreamExample {
	
	public static void main(String[] args) {

		int[] num= {1,-2,-3,4,5,6,-7,8,9};
		
		Arrays.stream(num).filter(n->n%3==0).forEach(n->System.out.println(n));
		
		Arrays.stream(num).filter(n->n<0).forEach(n->System.out.println("negative numbers"+n));
		
		List<String> strList = Arrays.asList("lekshmi", "arya","nayana","aravind","netra", "revathy", "meenu","chinnu");
		
		strList.stream().forEach(n->System.out.println(n.indexOf("i")) );

	}

}
