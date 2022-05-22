package com.learnJava.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
    public static int sequentialSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (x,y) -> x+y);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration in sequential : " + (endTime - startTime));
        return sum;
    }

    public static int parallelSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.parallelStream()
                .reduce(0, (x,y) -> x+y);// perform the unboxing from Integer to int
        long endTime = System.currentTimeMillis();
        System.out.println("Duration in parallel : " + (endTime - startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());

        sequentialSum(integerList);

        parallelSum(integerList);
    }
}
