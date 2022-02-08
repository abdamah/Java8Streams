package com.riigsoft.streamapi.sum;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSumByUsingPrimitive {

    public Integer getSumByUsingReduce(
            List<Integer> integers) {
        return integers
                .stream()
                .reduce(0, (a, b) -> a + b);
    }

    public Integer getSumByUsingCollect(
            List<Integer> integers) {
        return integers
                .stream()
                .collect(Collectors
                        .summingInt(Integer::intValue));
    }

    public Integer getSumByUsingJavaAccumulator(
            List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum);
    }

    public Integer getSumByUsingCustomizedAccumulator(
            List<Integer> integers) {
        return integers
                .stream()
                .reduce(0, SumUtils::add);
    }

    public Integer getSumByUsingSum(
            List<Integer> integers) {
        return integers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public Integer getSumByUsingMapValues(
            Map<Integer, Integer> map) {
        return map
                .values()
                .stream()
                .mapToInt(Integer::valueOf).sum();
    }

    public Integer getSumByExtractingIntegersFromString(
            String str) {

        return Arrays.stream(str.split(" "))
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::valueOf)
                .sum();
    }
}

