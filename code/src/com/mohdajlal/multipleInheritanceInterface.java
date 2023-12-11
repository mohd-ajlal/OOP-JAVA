package com.mohdajlal;

public class multipleInheritanceInterface {
    interface I{
        void show();
    }

    interface I2{
        void display();
    }

    static class te implements I, I2 {
        public void show(){
            System.out.println("1");
        }

        public void display(){
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        te t = new te();
        t.show();
        t.display();
    }
}
