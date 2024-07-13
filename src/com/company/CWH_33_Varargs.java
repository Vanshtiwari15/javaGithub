package com.company;
public class CWH_33_Varargs {
//    static int sum(int a){
//        return a;
//    }
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    public static int sum(int ...arr) {
        int result = 0;
        //public static int sum(int x, int ...arr){
        //int result = x; // if we write x here or in upper int x this means we say that we needed (x) in every time means any 1 digit is compulsory the ans will not zero in any situation or if we don't write x here so we write result = 0 and in upper only x = ...arr we can write only this to perform the result like zero (0) and everything in this we do not write simple sum() we write some value in this because we write (int x)
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of Nothing is: " + sum());
        System.out.println("The sum of 1 is: " + sum(1));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5, 6));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(2, 4, 3, 5));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(1, 2, 4, 3, 5));


    }
}
