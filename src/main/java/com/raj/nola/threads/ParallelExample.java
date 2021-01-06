package com.raj.nola.threads;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelExample {

    public static void main(String[] args) {

        List<String> stringList = List.of("Ananya", "Jocelyn", "Julia", "Laila", "Riddhima", "Trisha");


        System.out.println("With || ism");

        stringList.parallelStream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("Without || ism");
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);


    }



}
