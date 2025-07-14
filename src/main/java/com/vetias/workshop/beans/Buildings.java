package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime openDateTime;
    private LocalDateTime closeDateTime;

    public Building(String name, double area, int floors, LocalDateTime openDateTime, LocalDateTime closeDateTime) {
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.openDateTime = openDateTime;
        this.closeDateTime = closeDateTime;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }

    public LocalDateTime getOpenDateTime() {
        return openDateTime;
    }
    public void setOpenDateTime(LocalDateTime openDateTime) {
        this.openDateTime = openDateTime;
    }

    public LocalDateTime getCloseDateTime() {
        return closeDateTime;
    }
    public void setCloseDateTime(LocalDateTime closeDateTime) {
        this.closeDateTime = closeDateTime;
    }

    public void printDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Number of Floors: " + floors);
        System.out.println("Open Time: " + openDateTime);
        System.out.println("Close Time: " + closeDateTime);
    }
}