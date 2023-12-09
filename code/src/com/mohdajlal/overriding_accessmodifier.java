package com.mohdajlal;
public class overriding_accessmodifier {
    static class a1{
        void test(){
            System.out.println("1");
        }
    }
    public static class a2 extends a1{
        void test(){
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        overrding2.Test t = new overrding2.Test();
        t.show();

        overrding2.Test2 t2 = new overrding2.Test2();
        t2.show();
    }
}
