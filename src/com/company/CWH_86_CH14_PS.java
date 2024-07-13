package com.company;
import java.util.Scanner;

// Make a custom class for the error -->
class Exceptiononretry extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }
}

public class CWH_86_CH14_PS {
    public static void main(String[] args) {
        /*// Problem 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical Error
//        System.out.println(6/0);*/

        /*// Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }*/

        /*// Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }

        // Problem 4
        // In the main function->
        if(i>=5){
            try{
                throw new Exceptiononretry();
            }
            catch(Exceptiononretry e){
                System.out.println("\n"+e.getMessage());
            }
        }*/
    }
}
