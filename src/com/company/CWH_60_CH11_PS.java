package com.company;

abstract  class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Write");
    }
    @Override
    void refill() {
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartphone extends TelePhone{
    @Override
    void ring() {
        System.out.println("Ringing The Phone...");
    }
    @Override
    void lift() {
        System.out.println("Lift The Phone...");
    }

    @Override
    void disconnect() {
        System.out.println("Phone Will Be Disconnected...");
    }
}

interface TVRemote{
    void GreenButton();
    void RedButton();
}
interface SmartTVRemote extends TVRemote{
        void NetflixButton();
        void AmazonPrimeButton();
}

class TV implements TVRemote{
    void on(){
        System.out.println("ON THE TV...");
    }
    void of(){
        System.out.println("OFF THE TV...");
    }
    @Override
    public void GreenButton() {
        System.out.println("Too On The TV...");
    }
    @Override
    public void RedButton() {
        System.out.println("Too Off The TV...");
    }
}
public class CWH_60_CH11_PS {
    public static void main(String[] args) {
        /*// Problem 1 and Problem 2
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();*/

        /*// Problem 3
        Human harry = new Human();
        harry.sleep();

        // Problem 5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        lovish.speak(); // --> error
        lovish.eat();
        lovish.sleep();*/

        /*// Problem 4
        TelePhone te = new Smartphone();
        te.ring();
        te.lift();
        te.disconnect();*/

        // Problem 6 and Problem 7
        /*TV tv = new TV();
        tv.GreenButton();
        tv.RedButton();
        tv.on(); // They donot gives error
        tv.of();*/

        // Problem 6 and Problem 7
        TVRemote tv = new TV();
        tv.GreenButton();
        tv.RedButton(); // If we implements TVRemote into Tv they do not execute the function of TV that is TV(class) like on and off they will only executed implements function
        // tv.on(); // They  gives error
        // tv.of(); // They  gives error
    }
}
