package com.mohdajlal;

public class overriding_super {
    static class test1{
        void t(){
            System.out.println("1");
        }
    }

    static class test2 extends test1{
        void t(){
            super.t();
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        test2 tt = new test2();
        tt.t();
    }
}
