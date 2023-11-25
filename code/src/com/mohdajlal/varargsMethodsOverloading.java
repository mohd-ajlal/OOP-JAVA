package com.mohdajlal;

public class varargsMethodsOverloading {
    static class Test{
        void show(int a){
            System.out.println("int method");
        }
        void show(int... a){
            System.out.println("varArgs method");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.show(1);
        t.show(1,2);
        t.show(1,2,3,4,5);
    }
}
