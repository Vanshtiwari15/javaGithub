package com.company;
import java.util.Random;
import java.util.Scanner;

public class CWH_20_Exercise_2 {
    public static void main(String[] args) {
        // O for Rock
        // 1 for Paper
        // 2 for Scissors

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int UserInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        if(ComputerInput==UserInput){
            System.out.println("Draw");
        }
        else if(UserInput == 0 && ComputerInput == 2 || UserInput == 1 && ComputerInput == 0 || UserInput == 2 && ComputerInput == 1){
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Win");
        }

        // System.out.println("Computer Choice: "+ ComputerInput);

        if(ComputerInput==0){
            System.out.println("Computer Choice: Rock");
        }
        if(ComputerInput==1){
            System.out.println("Computer Choice: Paper");
        }
        if(ComputerInput==2){
            System.out.println("Computer Choice: Scissors");
        }

    }
}