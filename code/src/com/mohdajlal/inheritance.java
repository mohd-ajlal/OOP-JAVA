package com.mohdajlal;

public class inheritance {
//    child class / sub-class
    static class dog extends Animal{
        public static void main(String[] args) {
            dog d = new dog();
            d.eat();
        }
    }
}
//parent class
class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}
