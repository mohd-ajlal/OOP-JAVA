package com.mohdajlal;

public class association {
    static class engine{
        int cc= 1500;
        String fuel = "diesel";
    }
    static class car{
        static engine e = new engine();

        public static void main(String[] args) {
            System.out.println(e.cc);
        }
    }
}
