package com.company;

class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
        this. a = a; // If we use a = a then intellij idea(compiler) get confused get gives 0 as a result otherwise shows some error. this is a way for us to reference an object of the class which is being created / referenced means this is a reference that the value is inside it means in this the value of a is in a
    }
    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class CWH_47_This_Super {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
