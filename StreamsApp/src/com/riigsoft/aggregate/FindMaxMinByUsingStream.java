package com.riigsoft.aggregate;

import java.util.ArrayList;
import java.util.List;

import com.riigsoft.filter.Product;

public class FindMaxMinByUsingStream {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<Product>();
	
		// Adding Products
		prodList.add(new Product(1, "HP Laptop", 25000f));
		prodList.add(new Product(2, "Dell Laptop", 30000f));
		prodList.add(new Product(3, "Lenevo Laptop", 28000f));
		prodList.add(new Product(4, "Sony Laptop", 28000f));
		prodList.add(new Product(5, "Apple Laptop", 90000f));
		
		// max() method to get max Product price
		Product productA = prodList.stream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

		System.out.println(productA.getPrice());
		
		System.out.println("---");
		// min() method to get min Product price
		Product productB = prodList.stream()
				.max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
		System.out.println(productB.getPrice());
	}

}
