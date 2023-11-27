package com.mohdajlal;

public class abstractExample {
    static abstract class Test{
        public abstract void Test1();
    }

    static class Test_C extends Test{
        @Override
        public void Test1() {
            System.out.println("Hello test");
        }
    }

    public static void main(String[] args) {
        Test_C t = new Test_C();
        t.Test1();
    }
}
