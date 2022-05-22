package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static void main(String[] args) {
        System.out.println("printStudentActivities: " + getStudentActivities());
        System.out.println("printDistinctStudentActivities: " + getDistinctStudentActivities());
        System.out.println("printSortedDistinctStudentActivities: " + getSortedDistinctStudentActivities());
        System.out.println("printNoOfStudentActivities: " + getStudentActivitiesCount());
    }

    private static List<String> getStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return studentActivities;
    }

    private static List<String> getDistinctStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        return studentActivities;
    }

    private static List<String> getSortedDistinctStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    private static long getStudentActivitiesCount() {
        long noOfStudentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return noOfStudentActivities;
    }
}
