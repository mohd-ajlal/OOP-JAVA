package com.mohdajlal;

public class method_overrding {
    static class Test{
        void show(){
            System.out.println("1");
        }
    }
    static class Test2 extends Test{
        void show(){
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Test2 t2 = new Test2();
        t2.show();
    }
}
