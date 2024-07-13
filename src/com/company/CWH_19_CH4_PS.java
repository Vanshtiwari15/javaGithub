package com.company;

public class CWH_19_CH4_PS {
    public static void main(String[] args) {
        // Question 1
        // This will make error because in if(a=11) we do not put (=) means assigned operator in a=11 we will put only relational operator like (==)

        // Question 2
        //Scanner sc = new Scanner(System.in);
        /*byte m1, m2, m3;
        System.out.println("Enter Your Marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter Your Marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter Your Marks in Physics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall Percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>= 33){
            System.out.println("Congratulations, You have been promoted!");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }*/

        // QUESTION 3
        /*System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax payed by the empolyee is: " + tax);*/

        // Question 4
        /*Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/

        // Question 6
        /*Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organization website");
        }
         else if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }*/


    }
}
