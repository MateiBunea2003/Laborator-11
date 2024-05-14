package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Ion");
        names.add("Vasile");


        List<String> filteredNames = names
                .stream()
                .filter(name -> name.length() >= 6)
                .toList();
        filteredNames.forEach(System.out::println);

        names
                .stream()
                .filter(name -> name.length() <= 4)
                .map(String::length)
                .forEach(System.out::println);

        String concatenatedNames = names
                .stream()
                .reduce((name1, name2) -> name1 + " " + name2)
                .get();
        System.out.println(concatenatedNames);
    }
}