package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static List<String> namesList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String>
                .collect(Collectors.toList());
        return studentList;
    }

    public static Set<String> namesSet() {
        Set<String> studentSet= StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String>
                .collect(Collectors.toSet());
        return studentSet;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
