package com.mohdajlal;

public class method_overriding_revision {
    static class t1{
        void show(){
            System.out.println("T1");
        }
    }

    static class t2{
        void show(){

            System.out.println("T2");
        }
    }

    public static void main(String[] args) {
        t1 t = new t1();
        t.show();
        t2 tt = new t2();
        tt.show();
    }
}
