package com.mohdajlal;

/*

Method overriding
1. Same name
2. Different class
3. Same argument
    No. of argument
    Type of argument
    Seq. of argument
4. Inheritance
    (IS-A Relationship)

 */

public class method_overrding {
    static class Test{
        void show(){
            System.out.println("1");
        }
    }
    static class Test2 extends Test{

        void show(){
            System.out.println("2");
            super.show();
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Test2 t2 = new Test2();
        t2.show();
    }
}
