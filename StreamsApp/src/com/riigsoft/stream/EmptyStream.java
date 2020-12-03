package com.riigsoft.stream;

import java.util.List;
import java.util.stream.Stream;

public class EmptyStream {
	public static void main(String[] args) {
		//creating empty stream.
		Stream<String>stream = Stream.empty();
		//nothing will printed
		stream.forEach(System.out::println);
		
		//Equivalent code to empty stream
	
		System.out.println(streamOf(null));
	}
	public static Stream<String>streamOf(List<String>list){
		return list==null || list.isEmpty()?Stream.empty():list.stream();
	}
}
