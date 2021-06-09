package com.mukesh.basicCodingQuestion;

import java.util.Scanner;

public class XPowerY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number1: ");
        int number1 = sc.nextInt();

        System.out.println("Enter The Number2: ");
        int number2 = sc.nextInt();

        int number3 = 1;

        for (int i = 0; i < number2; i++){
            number3 = number3 * number1;

        }
        System.out.println("Result: "+number3);
    }
}
