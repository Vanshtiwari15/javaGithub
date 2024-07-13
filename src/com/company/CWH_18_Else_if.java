package com.company;
import java.util.Scanner;
public class CWH_18_Else_if {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();

        /*if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi-experienced!");
        }
        else if (age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are unexperienced!");
        }
        if (age>2){
            System.out.println("You are not a baby!"); // this if case is out of upper if-clause ladder because this is use after else statement
        }*/


        // Switch Case
        switch(age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");


            // if we don't use break statement they execute all the statement included default case
            // instead of age we write char int float any of these in switch case


        }


    }
}
