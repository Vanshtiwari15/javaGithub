package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }

}
public class CWH_40_CH9_Getters_And_Setters {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; -->  --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234); // Also this is the answer of Quick Quiz
        System.out.println(harry.getId());


    }
}
