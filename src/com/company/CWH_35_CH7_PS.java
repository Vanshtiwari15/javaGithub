package com.company;
public class CWH_35_CH7_PS {
    static void multiplication(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) { // This for number of columns
            for (int j = 0; j < i + 1; j++) { // This is for print (*)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition of Recursion
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) { // This for number of columns
            for (int j = 1; j > i - 3; j--) { // This is for print (*)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2_rec(int n) {
        if (n < 0) {
            pattern1_rec(n + 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
        /*if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }*/
        if (n==1 || n==2){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }

    }
    public static void main(String[] args) {
        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(4);

        // Problem 3
        // int c = sumRec(4);
        // System.out.println(c);

        // Problem 4
        // pattern2(4);

        // Problem 5;
        // fabonacci series -0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fib(7);
        // System.out.println(result);

        // Problem 6
        /*int sum = 0;
        for(int i=0;i<args.length;i++){
            sum +=Integer.parseInt(args[i]);
        }
        int average = sum / args.length;
        System.out.println("Average of " + args.length + " command line arguments is " + average);*/

        // Problem 7
        pattern2_rec(9);

        // Problem 8
        // pattern1_rec(9);

        // Problem 9


    }
}
