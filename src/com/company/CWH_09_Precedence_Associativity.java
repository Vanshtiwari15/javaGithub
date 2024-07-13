package com.company;
public class CWH_09_Precedence_Associativity {
    public static void main(String[] args) {
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
               =38-34/2
               =38-17
               =13
         */
        //int b = 60/5-34*2;
        /*
           =12-34*2
           =12-68
           =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        //Quick Quiz
        // int x = 6;
        // int y = 1;
        // int k = x*y/2;

        // int b = 1;
        // int c = 4;
        // int a = 5;
        // int k = (b*b - 4*a*c)/(2*a);
        //System.out.println(k);

        //int v = 2;
        //int u = 3;
        //int k = (v*v)-(u*u); // in this with bracket or without bracket the result will be same that is -5
        //System.out.println(k);

        //int a = 1;
        //int b = 2;
        //int d = 3;
        //int k = (a*b)-(d); //  in this with bracket or without bracket the result will be same that is -1
        //System.out.println(k);


    }
}
