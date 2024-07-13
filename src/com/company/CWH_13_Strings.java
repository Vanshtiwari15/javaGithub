package com.company;
import java.util.Scanner;

public class CWH_13_Strings {
    public static void main(String[] args) {
        //String name = new String ("Harry");

        //String name = "Harry";
        //System.out.println("The name is: ");
        //System.out.println(name);

        /*int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is 8.2%f, a, b"); // if we write simply f then they gives 5.645400 or if we write .2 then they gives only 5.64 or if we write 8.2f then they gives the space of 5 then start 5.64 only 5.64 beacause we write .2 the 8.2 they gives only 2 points decimal
        System.out.format("The value of a is %d and value of b is %f, a, b");*/ // format and printf both are same

        Scanner sc = new Scanner(System.in);
        //String st = sc.next(); // This gives only one letter that is first letter like i write my name is vansh tiwari they gives only my
        String st = sc.nextLine(); // but in this if we write my name is vansh tiwari they also gives the output like my name is vansh tiwari they gives whole line
        System.out.println(st);


    }
}
