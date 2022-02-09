package com.riigsoft.convertion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.riigsoft.model.Product;

public class ConvertListToMapByUsingStream {
	public static void main(String[] args) {
        List < Product > prodList = new ArrayList < Product > ();

        // Adding Products
        prodList.add(new Product(1, "HP Laptop", 25000f));
        prodList.add(new Product(2, "Dell Laptop", 30000f));
        prodList.add(new Product(3, "Lenevo Laptop", 28000f));
        prodList.add(new Product(4, "Sony Laptop", 28000f));
        prodList.add(new Product(5, "Apple Laptop", 90000f));

        //Printing Product List
        List <String > productPriceList = prodList.stream()
        		
                .map(product -> product.getName())
                .collect(Collectors.toList());
            System.out.println("List : "+productPriceList);
            
            System.out.println("======");
            
        // Converting Product List into a Map
        Map < Integer, String > productPriceMap = prodList.stream()
            .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
        System.out.println("Map : "+productPriceMap);
    }
}
