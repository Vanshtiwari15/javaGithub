package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    // Field and method of the parent class
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

// inherit from Animal
class Dog extends Animal{

    // new method in subclass
    public void display(){
        System.out.println("My name is " + name);
    }
}
public class CWH_45_Inheritance {
    public static void main(String[] args) {
        // Creating an object of base class
        /*Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());*/

        // Quick Quiz
        // Create an object of the new subclass
        Dog labrador = new Dog();
        // Access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        // call method of superclass
        // using object of subclass
        labrador.eat();

    }
}
