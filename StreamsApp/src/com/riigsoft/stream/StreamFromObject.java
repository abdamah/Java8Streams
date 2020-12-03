package com.riigsoft.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromObject {

	public static void main(String[] args) {

        // ARRAY CAN  BE A SOURCE OF A STREAM
        Stream<String> streamOfArray = Stream.of("A", "B", "C");
        streamOfArray.forEach(System.out::println);
        System.out.println("------");
        
        // CREATING STREAM FROM EXISTING ARRAY :
        String[] arr = new String[] { "A", "B", "C" };
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::println);
        
        System.out.println("-----");
        // CREATING STREAM FROM A PART OF AN ARRAY :
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 2);
        streamOfArrayPart.forEach(System.out::println);
	}

}
