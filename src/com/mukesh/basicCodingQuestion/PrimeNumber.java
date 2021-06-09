package com.mukesh.basicCodingQuestion;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i*i <= number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (number < 2) {
            isPrime =false;
        }

        System.out.println("isPrime: "+ isPrime);
    }
}
