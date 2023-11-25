package com.mohdajlal;

public class stringBufferOverloading {
    static class Test{
        void show(StringBuffer a){
            System.out.println("Buffer");
        }
        void show(String a){
            System.out.println("String");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show("a");
        t.show(new StringBuffer("abc"));
//        t.show(null); shows an error
    }
}
