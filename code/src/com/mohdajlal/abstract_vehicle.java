package com.mohdajlal;

// we can or

public class abstract_vehicle {
    static abstract class vehicle{
        int no_tyres;
        abstract void start();
    }

    static class car extends vehicle{
//        @Override
        public void start(){
            System.out.println("Starts with push button");
        }
    }

    static class bike extends vehicle{
//        @Override
        public void start(){
            System.out.println("Starts with key");
        }
    }

    public static void main(String[] args) {
        bike b = new bike();
        b.start();

        car c = new car();
        c.start();
    }
}