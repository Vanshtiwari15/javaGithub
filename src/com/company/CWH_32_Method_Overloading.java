package com.company;

public class CWH_32_Method_Overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning" + a + "bro");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning" + a + "bro");
        System.out.println("Good Morning" + b + "bro");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good Morning" + a + "bro");
        System.out.println("Good Morning" + b + "bro");
        System.out.println("Good Morning" + c + "bro");
    }
    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    static void telljoke(){ // When we don't want our method to return anything, we use void as the return type
            System.out.println("I invented a new word!\n" + "Plagiarism!");
        }

        public static void main(String[] args) {
            // telljoke();

            // case 1: Changing the integer
            int x = 45;
            change(x);
            System.out.println("The value of x after running change is: " + x);

            // case 2: Changing the Array
            int [] marks = {52, 73, 77, 89, 98, 94};
            change2(marks); // array can change!
            System.out.println("The value of x after running change is: " + marks[0]);

            // Method Overloading
            foo();
            foo(3000);
            foo(3000, 4000);
            foo(3000, 4000, 5000);
            // Arguments are actual!
        }
}

