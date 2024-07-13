package com.company;
import java.util.Scanner;

public class CWH_12_CH2_PS {
    public static void main(String[] args) {
        // Question 1
        //float a = 7/4 * 9/2; // if we write this they simply output gives 4.0 that is wrong they consider all are a int value but this is not true
        //float a = 7/4.0f * 9/2.0f; //hahaha they gives correct value that is 7.875 because we cnvert digits into float value so they consider all are in float value this is true
        //System.out.println(a);

        // Question 2
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        grade = (char) (grade - 8);
        System.out.println(grade);

        // Question 3
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //System.out.println(a>8);

        //Question 4
        /*float v = 1;
        float u = 2;
        float a = 3;
        float s = 4;
        float k = (v*v-u*u)/(2*a*s);
        System.out.println(k);*/

        // Question 5
        int x = 7;
        int a = 7 * 49/7 + 35/7; // if we find result in float then instead of int we will write float and instead of this we will write 7*49/7.00f+35/7.00f; and the result is (54.0)
        System.out.println(a);



    }
}
