package com.company;

import java.util.Scanner;

public class CWH_06_Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Taking input from users");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the marks of 1st subject ");
        float a = S.nextFloat();
        System.out.println("Enter the marks of 2nd subject: ");
        float b = S.nextFloat();
        System.out.println("Enter the marks of 3rd subject: ");
        float c = S.nextFloat();
        System.out.println("Enter the marks of 4th subject: ");
        float d = S.nextFloat();
        System.out.println("Enter the marks of 5th subject: ");
        float e = S.nextFloat();
        float Marks_obtained = a + b + c + d + e;
        System.out.println("Marks_obtained is:");
        System.out.println(Marks_obtained);
        float Total_marks = 500;
        float percentage = (Marks_obtained/Total_marks)*100;
        System.out.println("Overall Percenatge is: ");
        System.out.println(percentage);
    }
}
