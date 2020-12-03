package com.riigsoft.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListByUsingStream {

	public static void main(String[] args) {

        List < String > students = new ArrayList < String > ();
        students.add("Omer");
        students.add("Abdallah");
        students.add("Mosh");
        students.add("Bashe");
        
        // ASCENDING ORDER
        List < String > sortedList1 = students
        		.stream()
        		.sorted(Comparator.naturalOrder()) //naturalOrder method
        		.collect(Collectors.toList());
        System.out.println(sortedList1);

        List < String > sortedList2 = students.
        		stream().
        		sorted((o1, o2) -> o1.compareTo(o2)) // comparator interface
        		.collect(Collectors.toList());
        System.out.println(sortedList2);

        List < String > sortedList3 = students
        		.stream().sorted() // simple sorting
        		.collect(Collectors.toList());
        System.out.println(sortedList3);

        System.out.println("----------------");
        
        //DESCENDING ORDER
        List < String > sortedList4 = students
        		.stream()
        		.sorted(Comparator.reverseOrder()) //reverseOrder method
        		.collect(Collectors.toList());
        System.out.println(sortedList4);

        List < String > sortedList5 = students
        		.stream()
        		.sorted((o1, o2) -> o2.compareTo(o1)) // comparator interface
        		.collect(Collectors.toList());
        System.out.println(sortedList5);
        
	}

}
