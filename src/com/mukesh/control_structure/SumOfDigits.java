package com.mukesh.control_structure;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        int inputNumber;
        int sumOfDigits = 0;
        int temp = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        inputNumber = s.nextInt();

        while (inputNumber > 0) {
            temp = inputNumber % 10;
            sumOfDigits += temp;
            inputNumber = inputNumber / 10;
        }

        System.out.println("Sum of digits are : " + sumOfDigits);
    }
}
