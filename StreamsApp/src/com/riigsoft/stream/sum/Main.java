package com.riigsoft.streamapi.sum;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        System.out.println("Stream Api");
        List<String> names = Arrays.asList("Abdallah", "Mahmoud", "Ahmed");
        names
                .stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);

        System.out.println();

        System.out.println(" Using Integer Numbers :");
        System.out.println("===================================");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        StreamSumByUsingPrimitive primitive = new StreamSumByUsingPrimitive();

        System.out.println("Reduce Method: " + primitive.getSumByUsingReduce(integers));
        System.out.println("Collect Method: " + primitive.getSumByUsingCollect(integers));
        System.out.println("MapToInt Method: " + primitive.getSumByUsingSum(integers));
        System.out.println("Java Accumulator: " + primitive.getSumByUsingJavaAccumulator(integers));
        System.out.println("Customized Accumulator: " + primitive.getSumByUsingCustomizedAccumulator(integers));

        Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        System.out.println("Using MapValue: " + primitive.getSumByUsingMapValues(map));

        String items = "item1 1 item2 2 item3 3 item4 4 item5 5";
        System.out.println("Using String: " + primitive.getSumByExtractingIntegersFromString(items));

        System.out.println();

        System.out.println("Using Objects");
        System.out.println("===================================");

        var item1 = new Product(1, 100);
        var item2 = new Product(1, 200);
        var item3 = new Product(1, 300);
        var item4 = new Product(1, 400);

        List<Product> products = List.of(item1, item2, item2, item3, item4);

        StreamSumByUsingObject object = new StreamSumByUsingObject();

        System.out.println("Reduce Method: " + object.getSumByUsingReduce(products));
        System.out.println("Reduce with Method Ref: " + object.getSumByUsingReduceWithMethodReference(products));
        System.out.println("Collect Method: " + object.getSumByUsingCollect(products));
        System.out.println("MapToInt Method: " + object.getSumByUsingSum(products));
        System.out.println("Java Accumulator: " + object.getSumByUsingJavaAccumulator(products));
        System.out.println("Customized Accumulator: " + object.getSumByUsingCustomizedAccumulator(products));

    }
}
