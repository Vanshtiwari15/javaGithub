package com.company;
public class CWH_26_Arrays {
    public static void main(String[] args) {
       /*Classroom of 500 students - You have to store marks of these 500 students
       You have 2 options:
       1. Create 500 variables
       2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in java

//        1. Declaration and then memory allocation
//        int [] marks;
//        marks = new int [5];
          // Initialization
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 80;
//        marks[3] = 70;
//        marks[4] = 90;
//        marks[5] = 96 - throws an error
//        System.out.println(marks[4]);


        // 2. Declaration and memory allocation
//        int [] marks = new int[5];
        // Initialization
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 80;
//        marks[3] = 70;
//        marks[4] = 90;
//        marks[5] = 96 - throws an error
//        System.out.println(marks[4]);

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};
        System.out.println(marks[4]);

        // Array indices starts from 0 and goes till (n-1) where n is the size of the array



    }
}
