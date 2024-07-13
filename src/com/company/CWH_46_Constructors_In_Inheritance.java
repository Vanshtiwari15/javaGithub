package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor"); // This is a constructor of base class
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        // super(0);
        System.out.println("I am a derived class constructor"); // This is a constructor of derived class
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor"); // This is a constructor of ChildOfDerived class
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class CWH_46_Constructors_In_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1(); // If there is no parameters in the Derived1 like () then they will call constructor of derived class as well as base class
        // Derived1 d = new Derived1(14, 9); // If we gives parameters in the Derived1 like (14, 9) them they will cal overloaded constructor and execute there values
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 14);

    }
}
