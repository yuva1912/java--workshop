package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
       List<String> names = new ArrayList<>();
       names.add("sree");
       names.add("krish");
       names.add("anada");
       names.add("dharan");
       names.add("tr");
       names.add("ranjith");
       System.out.println(names);
      
       names.set(1,"ram");
      
       for(String name:names){
        System.out.println(name);   
       }
       
       System.out.println("another method:");
       
       for(int i=0;i<names.size();i++){
        System.out.println(names.get(i));   
       }
    
       names.forEach(System.out::println);
       names.sort(Comparator.reverseOrder());
       System.out.println(names);

    
}
}