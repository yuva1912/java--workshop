package com.vetias.java.workshop.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[] args) {
       List<String> names = new ArrayList<>();
       names.add("sree");
       names.add("krish");
       names.add("anada");
       names.add("dharan");
       names.add("tr");
       names.add("ranjith");
        names.add("ranjith");
       names.stream().filter(name -> name.startsWith("S")||name.startsWith("s")).distinct().map(String::toUpperCase).forEach(System.out::println);;
       
}
}

