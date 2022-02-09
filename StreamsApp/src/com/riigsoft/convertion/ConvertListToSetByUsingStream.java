package com.riigsoft.convertion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.riigsoft.model.Product;

public class ConvertListToSetByUsingStream {

	public static void main(String[] args) {
        List < Product > prodList = new ArrayList < Product > ();

        // Adding Products
        prodList.add(new Product(1, "HP Laptop", 25000f));
        prodList.add(new Product(2, "Dell Laptop", 30000f));
        prodList.add(new Product(3, "Lenevo Laptop", 28000f));
        prodList.add(new Product(4, "Sony Laptop", 28000f));
        prodList.add(new Product(5, "Apple Laptop", 90000f));

        // Printing product List
        List < Float > productPriceList 
        = prodList.stream()
        .filter(product -> product.getPrice() < 30000)
            .map(product -> product.getPrice())
            .collect(Collectors.toList());
        System.out.println("LIST : "+productPriceList);
        
        System.out.println("============");
        
        // Converting product List into List
        Set < Float > productPriceSet 
        = prodList.stream()
        .filter(product -> product.getPrice() < 30000)
        .map(product -> product.getPrice())
        .collect(Collectors.toSet());
        System.out.println("SET : "+productPriceSet);
    }

}
