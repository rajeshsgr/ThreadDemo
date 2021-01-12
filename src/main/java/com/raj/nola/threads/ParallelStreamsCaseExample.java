package com.raj.nola.threads;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ParallelStreamsCaseExample {

    public static void main(String[] args) {
        List<String> stringList = List.of("Ananya", "Jocelyn", "Julia", "Laila", "Riddhima", "Trisha");

        List<String> upperCaseList=stringList.
                parallelStream().
                map(String::toUpperCase).
                collect(Collectors.toList());

        List<String> upperCaseCountList=stringList.
                parallelStream().
                map(String::toUpperCase).
                map(n->n.length()+" "+n).collect(Collectors.toList());

        System.out.println(upperCaseList);

        System.out.println(upperCaseCountList);


    }
}
