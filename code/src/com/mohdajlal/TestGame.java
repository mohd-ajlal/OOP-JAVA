package com.mohdajlal;

public class TestGame {
    public String runTest(boolean spinner, boolean roller) {
        if( roller=spinner) return "up";
        else return roller ? "down" : "middle";
    }
    public static final void main(String pieces[]) {
        final TestGame tester = new TestGame();
        System.out.println(tester.runTest(false,true));
    }
}