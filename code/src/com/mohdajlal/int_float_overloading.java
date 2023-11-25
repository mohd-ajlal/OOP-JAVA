package com.mohdajlal;

public class int_float_overloading {
    static class Test{
        void show(int a, float b){
            System.out.println("int float method");
        }
        void show(float a, int b){
            System.out.println("Float int method");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
//        t.show(3,33); throw error
//        t.show(3,44.3); throw error
//        t.show(33.4,2); throw error
        t.show(2, 33.4f);
        t.show(22.3f, 34);
//        t.show("abc", 45);
    }
}
