package com.vetias.workshop.beans;

public record Organization(String name,   
    String completeAddress,
    String website
    String email,
    String phoneNumber,
    String name,
    long registrationNumber,
    LocalDate registrationDate) {
    
}
