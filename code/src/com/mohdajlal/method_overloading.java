package com.mohdajlal;

public class method_overloading {
    static class Test{
        void show(int a, int b){
            System.out.println(a);
            System.out.println(b);
        }

        void show(int b){
//            System.out.println(a);
            System.out.println(b);
        }

        void show(int a, int b, int c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        void show(){
            System.out.println("abc");
        }
        void show(int a, String b){
            System.out.println("Sequence");
        }
        void show(String a, int b){
            System.out.println("Sequence");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(1,2);
        t.show(1);
        t.show(1,2,3);
    }
}
