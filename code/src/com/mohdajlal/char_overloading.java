package com.mohdajlal;

public class char_overloading {
    static class Test{
        void show(int a){
            System.out.println("int method");
        }
        void show(String a){
            System.out.println("String method");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show('a');
//        automatic promotion
    }
}
