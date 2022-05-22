package com.learnJava.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println("Range Count " + intStream.count());

        IntStream.range(1, 50).forEach((value -> System.out.print(value + " ")));
        System.out.println();
        System.out.println("Range Closed Count " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + " ")));
        System.out.println();
        IntStream.range(1, 50).asDoubleStream().forEach((value -> System.out.print(value + " ")));
    }
}