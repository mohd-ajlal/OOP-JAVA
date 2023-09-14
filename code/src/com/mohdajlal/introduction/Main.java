package com.mohdajlal.introduction;

public class Main {
    public static void main(String[] args) {
//        stores 5 roll no.
        int[] arr = new int[5];

//        stores 5 name
        String[] names = new String[5];

//        Data of 5 students {roll no., name, marks}
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
//        Student ajlal;
//        ajlal = new Student();

        Student ajlal = new Student(42, "Mohd Ajlal", 100);
        Student anas = new Student(1, "Mohd Anas", 100);

//        ajlal.changeName("Changed name");
//
//        ajlal.greeting();

//        ajlal.roll = 42;
//        ajlal.name = "Mohd Ajlal";
//        ajlal.marks = 100;

//        JAVA CONSTRUCTORS
//        Student ajlal = new Student(42, "Mohd Ajlal", 100.0);
        System.out.println(ajlal.name);
        System.out.println(ajlal.roll);
        System.out.println(ajlal.marks);

        Student random = new Student(ajlal);

        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one =   new Student();
        Student two = one;

        one.name = "Something Some";
        System.out.println(two.name);

    }


}
//    create a class
//for every single student
class Student{
    int roll;
    String name;
    float marks = 90;
    // Constructor
//    we need a way to add the value of the above
//    properties object by object

//    we need one word to access every object
    Student(){

//        this.roll = 42;
//        this.name = "Mohd Ajlal";
//        this.marks = 100;

//        calling a constructor from another constructor

//        internally: new Student()
        this(13, "default person", 100.0f);
    }

    Student(int roll, String name, float marks){

        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.roll = other.roll;
    }

    void greeting(){
//        System.out.println("Hello! My name is "+name);
        System.out.println("Hello! My name is "+this.name);
    }
    void changeName(String newName){
        this.name = newName;
    }
}
