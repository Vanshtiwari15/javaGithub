package com.company;
public class CWH_15_CH3_PS {
    public static void main(String[] args) {
        // Question 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Question 2
        //String text = "To lower case";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        //String text = "To my    friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Question 3
        /*String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);*/

        // Question 4
        /*String myString = "This string contains    double and triple spaces";
        System.out.println(myString.indexOf("  ")); // In which double space are present after 20 words
        System.out.println(myString.indexOf("   ")); // In which triple space are present after 20 words*/

        /*String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  ")); // In which double space are present after 31 words
        System.out.println(myString.indexOf("   ")); // In which there is no triple space is available then its gives (-1) // Hence they all are detect double and triple spaces in a string*/

        //Question 5
        String letter = "Dear Harry\n\tThis java course is nice\n\t\tThanks!";
        System.out.println(letter);




    }
}
