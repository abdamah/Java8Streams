package com.riigsoft.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.riigsoft.filter.Product;

public class MethodReferenceByUsingStream {

	public static void main(String[] args) {
		List < Product > prodList = new ArrayList < Product > ();

        // Adding Products
        prodList.add(new Product(1, "HP Laptop", 25000f));
        prodList.add(new Product(2, "Dell Laptop", 30000f));
        prodList.add(new Product(3, "Lenevo Laptop", 28000f));
        prodList.add(new Product(4, "Sony Laptop", 28000f));
        prodList.add(new Product(5, "Apple Laptop", 90000f));

        //Print Price with method reference
        List < Float > productPriceList = prodList.stream()
        	.filter(p -> p.getPrice() > 30000) // filtering data 
            .map(Product::getPrice) // method reference
            .collect(Collectors.toList()); // collecting as list
        System.out.println("Price : "+productPriceList);
        
        System.out.println("====");
        //Print Names with method reference
        List < String > productNameList = prodList.stream()
        		.map(Product::getName) // method reference
        		.collect(Collectors.toList()); // collecting as list
        System.out.println("Names : "+productNameList);
    }
}


