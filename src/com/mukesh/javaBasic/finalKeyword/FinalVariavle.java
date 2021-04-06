package com.mukesh.javaBasic.finalKeyword;

class Demo {
    final int num = 10; // final variable

    public void changeNumber() {
        int num = 20;
        System.out.println("The value of num is " + num);
    }
}

public class FinalVariavle {
    public static void main(String args[]) {
        Demo demo = new Demo();
        demo.changeNumber();
    }
}
