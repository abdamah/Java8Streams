package com.riigsoft.streamapi.sum;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSumByUsingObject {
    public  Integer getSumByUsingReduce(
            List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice())
                .reduce(0, (a, b) -> a + b);
    }
    public  Integer getSumByUsingReduceWithMethodReference(
            List<Product> products) {
        return products.stream()
                .map(Product::getPrice)
                .reduce(0, (a, b) -> a + b);
    }

    public  Integer getSumByUsingCollect(
            List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice())
                .collect(Collectors
                        .summingInt(Integer::intValue));
    }

    public  Integer getSumByUsingJavaAccumulator(
            List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice())
                .reduce(0, Integer::sum);
    }

    public  Integer getSumByUsingCustomizedAccumulator(
            List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice())
                .reduce(0, SumUtils::add);
    }


    public  Integer getSumByUsingSum(List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice())
                .mapToInt(Integer::intValue).sum();
    }

}
