package com.mukesh.javaBasic.control_structure;

public class OddEven {
    public static void main(String[] args) {
        int number = 6;
        if (number % 2 == 0) {
            // This block will get executed if the if-condition is true
            System.out.println(number + " is an even number");
        } else {
            // This block will get executed if the if-condition is false
            System.out.println(number + " is an odd number");
        }
    }
}
