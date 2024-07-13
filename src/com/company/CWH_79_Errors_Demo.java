package com.company;
import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class CWH_79_Errors_Demo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println(2*i+1); // In this they will print 9 but 9 is not a prime number so in logical error compiler not helped us we ourself understand the logical meaning of the code
        }

        // RUNTIME ERROR
        int k;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
