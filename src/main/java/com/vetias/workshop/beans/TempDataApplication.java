package com.vetias.workshop.beans;

public class TempDataApplication {
    public static void main(String[] args) {
        Organization org = new Organization(
             "Thindal, Erode, India",
            "www.vetiasworkshop.com",
            "Vetias Workshop",
            "Yuvaraj",
            "6381918712",
            "24AID66",
            
            LocalDate.of(2023, 10, 1)
        )
        System.out.println(org);
    }

}
