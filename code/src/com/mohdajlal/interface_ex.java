package com.mohdajlal;

public class interface_ex {
    interface I1{
        void show();
    }

     static class test implements I1{
        public void show(){
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        test t = new test();
        t.show();
    }
}
