package com.company;

/*interface Bicycle {
    void applybrake (int decrement );
    void speedup ( int increment );
}

class AvonCycle implements Bicycle {
    int speed = 7;

    void applybrake(int decrement) {
        speed = speed - decrement;
    }

    void speedup(int increment) {
        speed = speed + increment;
    }
}*/

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    // public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    @Override
    public void blowHornk3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    @Override
    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleharry = new AvonCycle();
        cycleharry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleharry.a);
        System.out.println(cycleharry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleharry.a = 454;
        // System.out.println(cycleharry.a);

        cycleharry.blowHornk3g();
        cycleharry.blowHornmhn();

    }
}
