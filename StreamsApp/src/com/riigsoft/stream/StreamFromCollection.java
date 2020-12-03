package com.riigsoft.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamFromCollection {

	public static void main(String[] args) {
		
		System.out.println("==FROM COLLECTION==");
		Collection<String> collection = Arrays.asList("JAVA",
				"J2EE", "Spring", "Hibernate","Angular","ReactJs");
		Stream<String> colStrream = collection.stream();
		colStrream.forEach(System.out::println);
		
		
		System.out.println("==FROM LIST==");
		
		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring",
				"Hibernate","Angular","ReactJs");
		Stream<String> listStream = list.stream();
		listStream.forEach(System.out::println);
		
	
		System.out.println("==FROM SET==");
		Set<String> set = new HashSet<>(list);
		Stream<String> setStream = set.stream();
		setStream.forEach(System.out::println);

	}

}
