package com.company;
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}

class TommyViceCity {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("firing on the enemy");
    }
}

class Circle{
    float pi;
    int radius;
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}
public class CWH_39_CH8_PS {
    public static void main(String[] args) {
        // Problem 1
        /*Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());*/

        // Problem 2
        /*CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();*/

        // Problem 3
        /*Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/

        // Problem 4
        /*Rectangle re = new Rectangle();
        re.length = 3;
        re.width = 3;
        System.out.println(re.area());
        System.out.println(re.perimeter());*/

        // Problem 5
        /*TommyViceCity player1 = new TommyViceCity();
        player1.fire();
        player1.run();
        player1.hit();*/

        // Problem 6
        Circle cr = new Circle();
        cr.pi = 3.14f;
        cr.radius = 3;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());






    }
}
