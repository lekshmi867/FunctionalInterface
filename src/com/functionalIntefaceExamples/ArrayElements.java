package com.functionalIntefaceExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayElements {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>(List.of("ram","shyam","tom","peter","mani"));
		Predicate<String> pre= s->s.contains("a");
		stringList.removeIf(pre);
		
		
		stringList.sort(null);
		System.out.println(stringList);
		
		//Comparator<String> compare = 

	}

}
