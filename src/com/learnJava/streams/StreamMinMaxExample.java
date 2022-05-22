package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable holds the max value for each element in the iteration
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable holds the max value for each element in the iteration
                .reduce((x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable holds the max value for each element in the iteration
                .reduce((x, y) -> x < y ? x : y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

        List<Integer> integerList1 = new ArrayList<>();

        int maxValue = findMaxValue(integerList);
        System.out.println("Max value is : " + maxValue);

        Optional<Integer> maxValueOptional= findMaxValueOptional(integerList1);
        if (maxValueOptional.isPresent()){
            System.out.println("MaxValue using Optional : " + maxValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }

        Optional<Integer> minValueOptional= findMinValueOptional(integerList);
        if (minValueOptional.isPresent()){
            System.out.println("MinValue using Optional : " + minValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }
    }
}
