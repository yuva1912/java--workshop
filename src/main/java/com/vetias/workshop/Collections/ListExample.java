package com.vetias.workshop.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("Aadhav");
        names.add("Yuva");
        names.add("Mani");
        names.add("Sudha");
        System.out.println(names);
        for(int i = 0;i< names.size();i++){
            System.out.println(names.get(i));
        }
    }

}
