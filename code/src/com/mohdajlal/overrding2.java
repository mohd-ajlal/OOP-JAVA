package com.mohdajlal;



public class overrding2 {
    static class Test{
        Object show(){
            System.out.println("1");
            return null;
        }
    }
    static class Test2 extends Test{
        String show(){
            System.out.println("2");
            return null;
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Test2 t2 = new Test2();
        t2.show();
    }
}
