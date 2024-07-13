package com.company;

// Abstract -: existing in thought or as an idea but not having a physical or concrete existence

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }

    abstract class Child3 extends Parent2 {
        public void th() {
            System.out.println("I am good");
        }
    }
}
public class CWH_53_Abstract {
    public static void main(String[] args) {
        // Parent2 p = new Parent2(); --> Error
        // Child3 c3 = new Child3(); --> Error
        Child2 c = new Child2(); // The object of abstract class is not created
        c.greet();
        c.greet2();
    }
}