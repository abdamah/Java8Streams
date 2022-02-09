package com.riigsoft.test;

import java.util.ArrayList;
import java.util.List;

import com.riigsoft.filter.Product;

public class FilterTestWithIteration {
	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<Product>();
		// Adding Products
		prodList.add(new Product(1, "HP Laptop", 25000f));
		prodList.add(new Product(2, "Dell Laptop", 30000f));
		prodList.add(new Product(3, "Lenevo Laptop", 28000f));
		prodList.add(new Product(4, "Sony Laptop", 28000f));
		prodList.add(new Product(5, "Apple Laptop", 90000f));

		// This is more compact approach for filtering data
		prodList.stream().filter(product -> product.getPrice() != 30000)
				.forEach(product -> System.out.println(product.getPrice()));
	}
}
