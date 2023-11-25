package com.mohdajlal;

public class main_overloading {
    static class Test{

        public static void main(String[] args) {
            System.out.println("1");
//            by commenting line 9 and line 10 it will only return 1
            Test t = new Test();
            t.main(20);
        }

        public static void main(int a){
            System.out.println("2");
        }

    }
}
