package com.vetias.java.workshop.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListMark {
    public static void main(String[] args) {
       List<String> Marks = new ArrayList<>();
       Marks.add("77");
       Marks.add("98");
       Marks.add("78");
       Marks.add("94");
       Marks.add("97");
       Marks.add("88");
        
       Collections.sort(Marks); 
       System.out.println(Marks);
       Collections.sort(Marks,Collections.reverseOrder()); 
       System.out.println(Marks);
       Collections.min(Marks);
       System.out.println("max mark "+Collections.max(Marks));
}
}