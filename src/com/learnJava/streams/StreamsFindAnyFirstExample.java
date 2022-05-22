package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static void main(String[] args) {
        if(findAnyStudent().isPresent()){
            System.out.println(" Found the student: " + findAnyStudent().get());
        } else {
            System.out.println("Student not found!");
        }

        if(findFirstStudent().isPresent()){
            System.out.println(" Found the student: " + findFirstStudent().get());
        } else {
            System.out.println("Student not found!");
        }
    }
}
