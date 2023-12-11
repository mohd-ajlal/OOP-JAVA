package com.mohdajlal;

public class Bond {
    private static int price = 5;
    public void sell() {
        if(price<10) {
            price++;
        }
        else if(price>=10) {
        }
    }
    public static void main(String[] cash) {
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();
        System.out.print(price);
    }
}
