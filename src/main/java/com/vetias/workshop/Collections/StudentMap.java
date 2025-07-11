package com.vetias.java.workshop.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer,String> students =new HashMap<>();
        students.put(1006,"mathan");
        students.put(1008,"math");
        students.put(10076,"matn");
        students.put(10706,"mahan");
        students.put(107706,"athan");
        System.out.println(students);
        String studentname=students.get(1006);
        System.out.println(studentname);
        String studentnae=students.get(1006);
        System.out.println(studentnae);
    }
    
}
