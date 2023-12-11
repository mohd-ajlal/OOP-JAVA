package com.mohdajlal;

public class this_keyword {
    static class test{
        int i;
        void setValue(int i){
//            i = i  it will return 0 as int i; has no value so default value is 0
            this.i = i;
        }
        void show(){
            System.out.println(i);
        }
    }

    static class xyz{
        public static void main(String[] args) {
            test t = new test();
            t.setValue(10);
            t.show();
        }
    }
}
