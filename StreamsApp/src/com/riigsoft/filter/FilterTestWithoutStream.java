package com.riigsoft.test;

import java.util.ArrayList;
import java.util.List;

import com.riigsoft.filter.Product;

public class FilterTestWithoutStream {
	  private static List < Product > prodList = new ArrayList < Product > ();

	    public static void main(String[] args) {
	    	
	        // Adding Products
	        prodList.add(new Product(1, "HP Laptop", 25000f));
	        prodList.add(new Product(2, "Dell Laptop", 30000f));
	        prodList.add(new Product(3, "Lenevo Laptop", 28000f));
	        prodList.add(new Product(4, "Sony Laptop", 28000f));
	        prodList.add(new Product(5, "Apple Laptop", 90000f));
	        
	     // Without Java 8 Stream API'S
	        withoutStreamAPI();
	    }

	    private static void withoutStreamAPI() {
	        // without Stream API's
	        List < Float > productPriceList = new ArrayList < Float > ();
	        // filtering data of list
	        for (Product product: prodList) {
	            if (product.getPrice() > 25000) {
	                // adding price to a productPriceList
	                productPriceList.add(product.getPrice());
	            }
	        }

	        // displaying data
	        for (Float price: productPriceList) {
	            System.out.println(price);
	        }
	    }
	}