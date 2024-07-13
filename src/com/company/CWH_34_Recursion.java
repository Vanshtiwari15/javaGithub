package com.company;

public class CWH_34_Recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5* 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1); // This is also the answer of Quick Quiz
        }
    }

    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;

        }

    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("The value of factorial a is: " + factorial(x));
        System.out.println("The value of factorial a is: " + factorial_iterative(x));


        // Input a number from user
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The value of factorial a is: " + factorial(a));
        System.out.println("The value of factorial a is: " + factorial_iterative(a));*/
    }
}

