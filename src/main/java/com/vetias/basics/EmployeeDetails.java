package com.vetias.basics;

import java.util.Arrays;


public class EmployeeDetails{
    public static void main (String[]args){
        String [][] employees = new String [6] [2];
       employees[0][0] ="yuvaraj";
       employees[0][1] ="50000";
       employees[1][0] ="aadhav";
       employees[1][1] ="60000";
       employees[2][0] ="gokul";
       employees[2][1] ="70000";
       employees[3][0] ="mani";
       employees[3][1] ="80000";
       employees[4][0] ="harish";
       employees[4][1] ="90000";
       employees[5][0] ="bala";
       employees[5][1] ="100000";
       for (String[]  Employee : employees) {
          System.out.println(Arrays.toString(Employee));

       }

    }
}



     
