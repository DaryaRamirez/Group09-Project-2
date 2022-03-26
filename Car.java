package com.syntax.Group09Project2;

public class Car {
    /*
    Create a Class Car that would have the following fields:   carPrice   and   color   and   method
calculateSalePrice() which should be returning a price of the car. Create 2 sub classes:
 Sedan and Truck. The Truck class   has   field   as   weight and   has   its   own implementation
 of   calculateSalePrice()   method   in which   returned   price   calculated   as   following:
 if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
 The Sedan class has field as length and also does it is   own   implementation   of   calculateSalePrice():
 if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount.
     */
    double carPrice;
    String color;


    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;

    }

    public double getSalePrice() {
        return carPrice;
    }
}
class Truck extends Car{
    private int weight;
    public Truck(double carPrice,String color,int weight){
        super(carPrice,color);
        this.weight=weight;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice()*(weight>2000?0.9:0.8);
    }
}
 class Sedan extends Car{
 private double lenght;
 public Sedan(double carPrice, String color,double lenght){
     super(carPrice,color);
     this.lenght=lenght;
 }

     @Override
     public double getSalePrice() {
         return super.getSalePrice()*(lenght>20?0.95:0.9);
     }
 }
