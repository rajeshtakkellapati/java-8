package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .filter(student -> student.getGpa() > 3.8)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("");
        filterStudents().forEach(System.out::println);
    }
}
