package com.riigsoft.aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.riigsoft.filter.Product;

public class FindSumByUsingStream {
	public static void main(String[] args) {
        List < Product > prodList = new ArrayList < Product > ();
        //Adding Products  
        prodList.add(new Product(1, "HP Laptop", 25000f));
        prodList.add(new Product(2, "Dell Laptop", 30000f));
        prodList.add(new Product(3, "Lenevo Laptop", 28000f));
        prodList.add(new Product(4, "Sony Laptop", 28000f));
        prodList.add(new Product(5, "Apple Laptop", 90000f));
        
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = prodList.stream()
            .collect(Collectors.summingDouble(product -> product.getPrice()));
        System.out.println(totalPrice3);

    }
}