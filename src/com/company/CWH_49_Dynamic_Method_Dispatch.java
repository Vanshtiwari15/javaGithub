package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class CWH_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.on

        Phone obj = new SmartPhone(); // Yes it is allowed  // In real life example - Phone = nokia1200 , SmartPhone = Samsung M12 then we say Smartphone will be Phone but we don't say Phone will not SmartPhone // Phone (super class) = Reference and SmartPhone (sub class) = object
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime(); // It means the obj of superclass is executed but the obj of sub class is not executed the obj of sub class is executed via SmartPhone smobj = new SmartPhone(); here Phone is super class and SmartPhone is sub class
        obj.on(); // If and only if the obj of sub class are present in super class then the obj of sub class is executed like in this program (on)
        // obj.music(); // Not allowed
    }
}
