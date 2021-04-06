package com.mukesh.javaBasic.finalKeyword;

class DemoB {
    final int num; // blank final variable

    public DemoB() {
        num = 10;
    }

    public void displayNumber() {
        System.out.println(num);
    }
}

public class BlankfinalvariableTryout {
    public static void main(String args[]) {
        DemoB demo = new DemoB();
        demo.displayNumber();
    }
}
