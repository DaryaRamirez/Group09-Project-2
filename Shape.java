package com.syntax.Group09Project2;

interface Shape {
    void input();
    void calculateArea();
    void calculatePerimeter();
}
 class Circle implements Shape{
    int r=0;
    double pi=3.14, ar=0;
    @Override
    public void input(){
        r=6;
    }

    @Override
    public void calculateArea() {
       ar=pi*r*r;
        System.out.println("Area of circle is "+ar);
    }

    @Override
    public void calculatePerimeter() {
        double c=0;
        c=2*pi*r;
        System.out.println("Perimeter of circle is "+c);
    }
}
 class Square implements Shape{
    int a=0;
    int ar=0;
    @Override
    public void input(){
        a=5;
    }

    @Override
    public void calculateArea() {
        ar=a*a;
        System.out.println("Area of square is "+ar );
    }

    @Override
    public void calculatePerimeter() {
        int p=0;
        p=4*a;
        System.out.println("Perimeter of square is "+p);
    }
}
