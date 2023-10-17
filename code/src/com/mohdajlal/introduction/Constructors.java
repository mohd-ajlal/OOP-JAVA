package com.mohdajlal.introduction;

// Create a Main class
public class Constructors {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public Constructors() {
        x = 5;  // Set the initial value for the class attribute x
    }


    public static void main(String[] args) {
        Constructors myObj = new Constructors(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}

// Output

// 5