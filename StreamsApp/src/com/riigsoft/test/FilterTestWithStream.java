package com.riigsoft.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.riigsoft.filter.Product;

public class FilterTestWithStream {
	 private static List < Product > prodList = new ArrayList < Product > ();

	    public static void main(String[] args) {

	        // Adding Products
	        prodList.add(new Product(1, "HP Laptop", 25000f));
	        prodList.add(new Product(2, "Dell Laptop", 30000f));
	        prodList.add(new Product(3, "Lenevo Laptop", 28000f));
	        prodList.add(new Product(4, "Sony Laptop", 28000f));
	        prodList.add(new Product(5, "Apple Laptop", 90000f));
	        
	        // With Java 8 Stream API'S
	        withStreamAPI();
	    }

	    private static void withStreamAPI() {
	        // filtering data of list using LAMBDA EXPRESS
	        List < Float > productPriceList =
	        		prodList.stream().filter((product) 
	        		-> product.getPrice() > 25000)
	            .map((product) -> product.getPrice())
	            .collect(Collectors.toList());
	        // displaying data
	        productPriceList.forEach((price) 
	        		-> System.out.println(price));
	    }
	}

