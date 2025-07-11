package com.vetias.java.workshop.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesStartWithSCount {
     public static void main(String[] args) {
       List<String> names = new ArrayList<>();
       names.add("sree");
       names.add("krish");
       names.add("anada");
       names.add("dharan");
       names.add("tr");
       names.add("ranjith");
       long nameCount=names.stream().filter(name -> name.startsWith("S")||name.startsWith("s")).distinct().count();
       System.out.println(nameCount);
}
}