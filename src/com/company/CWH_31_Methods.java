package com.company;
public class CWH_31_Methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y) * 5;
        }
        //x = 566; // Thus even if we modify the values a and b inside the method, the values in the main method will not change
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        // CWH_31_Methods obj = new CWH_31_Methods();
        // c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        // c1 = obj.logic(a1, b1);
        System.out.println(a1 + " "+ b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
