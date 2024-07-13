package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    // For Quick Quiz
    private int salary;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
        // For Quick Quiz
        salary = 10000;
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public MyMainEmployee(int myId){
        id = myId;
        name = "Harry";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    // Quick Quiz
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }
}
public class CWH_42_Constructors {
    public static void main(String[] args) {
        // MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12); // if we give name and id to the main method they give executed or else they take the value which is defined in upper side of function MyMainEmployee
        MyMainEmployee harry = new MyMainEmployee();
        // harry.setName("CodeWwithHarry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        // Quick Quiz
        System.out.println(harry.getSalary());


    }
}
