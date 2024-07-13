package com.company;

class Circle1{
    int radius;
    Circle1(){
        System.out.println("I am non param of circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder2 extends Circle1{
    int height;
    Cylinder2(int r, int h){
        super(r); // If we donot use super keyword then they will execute the default constructor that is Circle1()
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

class Rectangle1{
    int length;
    int breadth;
    Rectangle1(){
        System.out.println("I am non param of Rectangle");
    }
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    Rectangle1(int l, int b){
        System.out.println("I am Rectangle parameterized constructor");
        this.length = l;
        this.breadth = b;
    }
    public double area(){
        return length*breadth;
    }

}

class Cuboid1 extends Rectangle1{
    int height;
    Cuboid1(int l, int b, int h){
        super(l, b);
        System.out.println("I am Cuboid parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return length*breadth*height;
    }

}
public class CWH_52_CH10_PS {
    public static void main(String[] args) {
        /*// Problem 1

        Circle1 objc = new Circle1(); // For default constructor
        Circle1 objv = new Circle1(3); // For parameterized constructor
        Cylinder2 obj = new Cylinder2(12, 4); //  For parameterized constructor

        // Problem 3
        // Area of circle
        System.out.println(objc.area()); // They gives 0.0 because they have no parameters they are default constructors
        System.out.println(objv.area());
        // Area and volume of cylinder
        System.out.println(obj.volume());
        System.out.println(obj.area());*/

        /*// Problem 2
        Rectangle1 objr = new Rectangle1();  // For default constructor
        Rectangle1 objn = new Rectangle1(3, 4); // For parameterized constructor
        Cuboid1 objcu = new Cuboid1(3, 5, 5); // For parameterized constructor

        // Problem 4
        // Part 1 -->
        System.out.println(objr.area()); // They gives 0.0 because they have no parameters they are default constructors
        System.out.println(objn.area());
        System.out.println(objcu.volume());
        System.out.println(objcu.area());

        // Part 2 -->
        objcu.setLength(3);
        objcu.setBreadth(4);
        // We donot set height because we not create a getter and setter function for height and we create getter and setter function in Rectangle1 not in Cuboid1
        System.out.println(objcu.getLength());
        System.out.println(objcu.getBreadth());

        // For default constructor
        objr.setBreadth(3);
        objr.setLength(3);
        System.out.println(objr.area()); // In default constructor upper side they gives zero but in we gives parameters as set length and set breadth via getter abnd setter method so they gives value as a 9*/

        // Problem 5
        // Order of execution is as follows-:
        // 1. Base
        // 2. Derived1
        // 3. Derived2
    }
}
