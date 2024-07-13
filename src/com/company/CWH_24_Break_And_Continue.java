package com.company;
public class CWH_24_Break_And_Continue {
    public static void main(String[] args) {
        // Break and continue using loops!

        //Break for the for loops

//        for (int i =0;i<50;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

        // Break for the while loops

//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }

        // Break for the do-while loops

        /*int i = 0;
        do {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }while(i<5);*/


        // continue for the for loops

        /*for(int i=0;i<50;i++){
        if(i==2){
            System.out.println("Ending the loops");
            continue;
        }
            System.out.println(i);
            System.out.println("Java is great");
        }*/

        // continue for the while loops
        int i = 0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");

    }
}
