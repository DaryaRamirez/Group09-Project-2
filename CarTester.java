package com.syntax.Group09Project2;

public class CarTester {
    public static void main(String[] args) {
        Truck truck=new Truck(25000.00,"black",500);
        Sedan sedan=new Sedan(15000,"White",25.5);
        System.out.println(truck.getSalePrice());
        System.out.println(sedan.getSalePrice());

    }
}
