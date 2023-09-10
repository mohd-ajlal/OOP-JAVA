package com.mohdajlal.introduction;

public class Stu {
    //instance variables of the class
    int id;
    String name;

    Stu(){
        System.out.println("this a default constructor");
    }

    Stu(int i, String n){
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        //object creation
        Stu s = new Stu();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);

        System.out.println("\nParameterized Constructor values: \n");
        Stu student = new Stu(10, "David");
        System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);
    }
}