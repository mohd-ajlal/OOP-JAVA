package com.mohdajlal.introduction;

public class constructor_revise {

    public static void main(String[] args) {
        constructor_r cr = new constructor_r(); // constructors executes automatically when we create an         object
        System.out.println(cr.x);
    }
}

class constructor_r{
    int x;
    public constructor_r(){
        System.out.println("Hello");
        x = 5;
    }
}