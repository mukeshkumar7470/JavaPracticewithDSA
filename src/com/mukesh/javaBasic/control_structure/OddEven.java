package com.mukesh.javaBasic.control_structure;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Odd Even Program in java");
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();


        if (number % 2 == 0) {
            // This block will get executed if the if-condition is true
            System.out.println(number + " is an even number");
        } else {
            // This block will get executed if the if-condition is false
            System.out.println(number + " is an odd number");
        }


    }
}
