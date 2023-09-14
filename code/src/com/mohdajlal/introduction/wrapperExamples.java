package com.mohdajlal.introduction;

public class wrapperExamples {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;
        System.out.println(num.compareTo(45));
        int b = 20;

        swap(a, b);
        System.out.println(a+" " + b);
        Integer num2 = 50;
        swap1(num, num2);
        System.out.println(num+ " " + num2);
        final A ajlal = new A("Mohd Ajlal");
        ajlal.name ="other name";

//        when a non-primitive is final, you can't reassign it.
//        ajlal = new A("new name");
    }

    static void swap(int a, int b){
        Integer temp = a;
        a = b;
        b = temp;

    }
    static void swap1(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;

    }


}

class A{
    final int NUM = 10; // always initialize while declaring
    String name;
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}